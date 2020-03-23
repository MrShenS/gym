package com.sz.gym.web.controller;

import com.sz.gym.model.entity.FileInfo;
import com.sz.gym.model.enums.ConstantEnum;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.service.FileService;
import com.sz.gym.utils.Utils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @ClassNamefileController
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1618:49
 * @Version 1.0
 */
@RestController
@RequestMapping("/api/File")
@Slf4j
@CrossOrigin
public class FileController {



    @Autowired
    public FileService fileService;

//    @Value("${filePath}")
    String path;

    /**
     * 实现文件上传
     * */
    @PostMapping("/fileUpload")
    @CrossOrigin
    public BaseVO<String> fileUpload(@RequestParam("multipartfiles") MultipartFile file) throws IOException {
        BaseVO<String> uploadMassage=null;
        try {
            uploadMassage= fileService.upload(file);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseVO<String>(ConstantEnum.lower.toString(),e.getMessage(),"文件上传失败");
        }
       return uploadMassage;

    }

    @GetMapping("/getValue")
    public String getValue(){
        BeanUtils.copyProperties("","");
        return path;
    }

    @GetMapping("/getAllFileName")
    public BaseVO<List<FileInfo>> getAllFileName(){
        return fileService.getAllFileName();
    }



    //文件下载

    /**
     * http://localhost:8080/file/download?fileName=新建文本文档.txt
     * @param fileName
     * @param response
     * @param request
     * @return
     */
    @GetMapping("/download")
    public void downloadFile(@RequestParam("fileName") String fileName, HttpServletResponse response, HttpServletRequest request){
        OutputStream os = null;
        InputStream is= null;
        try {
            // 取得输出流
            os = response.getOutputStream();
            // 清空输出流
            response.reset();
            response.setContentType("application/vnd.ms-excel;charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            response.setHeader("content-disposition","attachment;filename=" + URLEncoder.encode(fileName,"UTF-8"));
            //读取流
            File f = new File("D://Git/MrshenS/graduationProject/image/"+fileName);
            is = new FileInputStream(f);
            if (is == null) {
                log.error("下载附件失败，请检查文件“" + fileName + "”是否存在");
            }
            //复制
            IOUtils.copy(is, response.getOutputStream());
            response.getOutputStream().flush();
        } catch (IOException e) {
        }
        //文件的关闭放在finally中
        finally
        {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
            }
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
            }
        }
    }



    /**
     * 	文件下载，某个角色的id用户所对应的文件
     * 	/download/student/100000/score.docx
     * @param request
     * @param name
     * @param sub
     * @return
     * @throws IOException
     */
//	RequiresAuthentication 已經進行了登錄驗證
//    @RequiresAuthentication
    @RequestMapping(value= {"/download//{roleName:student}/{userId:[1-9][0-9]{9}}/{fielName}.{sub}",
            "/download//{roleName:teacher}/{userId:[1-9][0-9]{3}}/{fielName}.{sub}", "/download/{fielName}.{sub}"}, method=RequestMethod.GET)
    public ResponseEntity<byte[]> download(HttpServletRequest request, @PathVariable(value="roleName", required=false)String roleName,
                                           @PathVariable(value="userId", required=false)Integer userId, @PathVariable("fielName")String name, @PathVariable("sub")String sub) throws IOException {
        if (roleName != null) {
            return export(roleName, userId, name, sub);
        } else {
            return export(null, null, name, sub);
        }
    }
    /**
     *	文件下载逻辑
     * @param fileName
     * @return
     * @throws IOException
     */
    public ResponseEntity<byte[]> export(String roleName, Integer userId, String fileName, String fileSuffix) throws IOException {
        StringBuffer url = new StringBuffer();
        if (userId == null || roleName == null) {
            // 基础文件下载
            url.append(Utils.getFileByNameInFiles(fileName + "." + fileSuffix));
        } else {
            url.append(Utils.getFilesSaveRootPath()).append(roleName).append("/").append(userId).append("/")
                    .append(fileName).append(".").append(fileSuffix);
        }
        HttpHeaders headers = new HttpHeaders();
        File file = new File(url.toString());
        try {
            fileName = fileName + "." + fileSuffix;
            fileName = new String(fileName.getBytes("UTF-8"),"iso-8859-1");//为了解决中文名称乱码问题
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment", fileName);

        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
                headers, HttpStatus.CREATED);
    }



    @PostMapping("/downloadTemplate")
    public void downloadTemplate(@RequestParam("fileName") String fileName,HttpServletRequest request, HttpServletResponse response){
        File file = new File("D://Git/MrshenS/graduationProject/image/"+fileName);
        byte[] buffer = new byte[1024];
        BufferedInputStream bis = null;
        OutputStream os = null; //输出流
        try {
            //判断文件父目录是否存在
            if (file.exists()) {
                //设置返回文件信息
                response.setContentType("application/vnd.ms-excel;charset=UTF-8");
                response.setCharacterEncoding("UTF-8");
                response.setHeader("Content-Disposition", "attachment;fileName=" + java.net.URLEncoder.encode("userTemplate.xls","UTF-8"));
                os = response.getOutputStream();
                bis = new BufferedInputStream(new FileInputStream(file));
                while(bis.read(buffer) != -1){
                    os.write(buffer);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(bis != null) {
                    bis.close();
                }
                if(os != null) {
                    os.flush();
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


