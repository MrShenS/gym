package com.sz.gym.web.controller;

import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.dto.HeaderNumberDTO;
import com.sz.gym.service.DashboardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassNameEmployeeController
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/912:19
 * @Version 1.0
 */
@RestController
@CrossOrigin
@Slf4j
@RequestMapping("/dashboard")
public class DashboardController {

    @Autowired
    public DashboardService dashboardService;

    @GetMapping("/headerNumber")
    public BaseVO<HeaderNumberDTO> headerNumber(){
        log.info("接收请求获取首页的员工 器械 和顾客 数量信息");
        return dashboardService.getHeaderNumber();
    }

}
