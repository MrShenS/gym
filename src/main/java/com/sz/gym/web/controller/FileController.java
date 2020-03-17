package com.sz.gym.web.controller;

import com.sz.gym.model.enums.ConstantEnum;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.service.FileService;
import com.sz.gym.utils.UuidUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @ClassNamefileController
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1618:49
 * @Version 1.0
 */
@RestController
@RequestMapping("/File")
@CrossOrigin
@Slf4j
public class FileController {



    @Autowired
    public FileService fileService;

//    @Value("${filePath}")
    String path;

    /**
     * 实现文件上传
     * */
    @PostMapping("/fileUpload")
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
        return path;
    }


}

