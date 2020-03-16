package com.sz.gym.test;

import com.sz.gym.model.dto.FacilitiesRatioDTO;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.service.impl.DashboardServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * @ClassNametest
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1512:21
 * @Version 1.0
 */
@Component
public class test {


    @Value("${filePath}")
    String path;

    public static void main(String[] args) {
        System.out.println(new test().path);
    }
}
