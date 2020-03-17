package com.sz.gym.service.impl;

import com.sz.gym.exception.FileServiceException;
import com.sz.gym.model.entity.Facilities;
import com.sz.gym.model.enums.ConstantEnum;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @ClassNameFileServiceImpl
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1717:33
 * @Version 1.0
 */
@Service
@Slf4j
public class FileServiceImpl implements FileService {

    @Value("${uploadPath}")
    String path;
    @Override
    public BaseVO<String> upload(MultipartFile file) {
        if(file.isEmpty()){
            return new BaseVO<String>(ConstantEnum.lower.toString(),"参数为空","");
        }
        String fileName = file.getOriginalFilename();
        int size = (int) file.getSize();
        System.out.println(fileName + "-->" + size);
        File dest = new File(path+fileName);
        //D:\Git\MrshenS\graduationProject\gym
        if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try {
            log.info("文件本地地址:"+dest.getPath());
            file.transferTo(dest); //保存文件
            log.warn("保存文件:"+file.getOriginalFilename());

        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
           throw new FileServiceException("文件上传过程中的参数错误");
        } catch (IOException e) {
            // TODO Auto-generated catch block
           throw new FileServiceException("文件上传过程中发生Io异常");
        }
        return new BaseVO<String>(ConstantEnum.lower.toString(),"保存成功：",dest.getPath());
    }
}
