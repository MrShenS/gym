package com.sz.gym.web.controller;

import com.sz.gym.model.dto.DashboardSchartDTO;
import com.sz.gym.model.dto.FacilitiesRatioDTO;
import com.sz.gym.model.enums.ConstantEnum;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.dto.HeaderNumberDTO;
import com.sz.gym.service.DashboardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.text.ParseException;
import java.util.List;

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
@RequestMapping("/api/dashboard")
public class DashboardController {

    @Autowired
    public DashboardService dashboardService;

    @GetMapping("/headerNumber")
    public BaseVO<HeaderNumberDTO> headerNumber(){
        log.info("接收请求获取首页的员工 器械 和顾客 数量信息");
        
        return dashboardService.getHeaderNumber();
    }
    @GetMapping("/facilitiesRatio")
    public BaseVO<List<FacilitiesRatioDTO>> getFacilitiesRatios(){
        log.info("====================接收请求获取首页器械比例============================");
        return dashboardService.getFacilitiesRatio();
    }
    @GetMapping("/GetOptions")
    public BaseVO<DashboardSchartDTO> getDashboardSchartOfOptions(){
        BaseVO<DashboardSchartDTO> baseVO=null;
        try {
            baseVO=dashboardService.getDashboardSchartOfOptions();
        } catch (ParseException e) {
            e.printStackTrace();
            baseVO.setStatus(ConstantEnum.lower.toString());
            baseVO.setMessage(e.getMessage());
           return baseVO;
        }
        return baseVO;
    }
}
