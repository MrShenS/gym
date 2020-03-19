package com.sz.gym.service;

import com.sz.gym.model.entity.FileInfo;
import com.sz.gym.model.vo.BaseVO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @ClassNameFileService
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1717:25
 * @Version 1.0
 */
@Service
public interface FileService {


    BaseVO<String> upload(MultipartFile file);

    BaseVO<List<FileInfo>> getAllFileName();

}
