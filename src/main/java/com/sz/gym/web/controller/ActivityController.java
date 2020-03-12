package com.sz.gym.web.controller;

import com.sz.gym.model.VO.BaseVO;
import com.sz.gym.model.dto.DashboardActivityDTO;
import com.sz.gym.model.dto.HeaderNumberDTO;
import com.sz.gym.model.entity.Activity;
import com.sz.gym.service.ActivityService;
import com.sz.gym.service.DashboardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author zhen.shen
 * @Description //TODO 操作活动相关数据
 * @Date 11:02 2020/3/11
 * @Param
 * @return
 **/
@RestController
@CrossOrigin
@Slf4j
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    public ActivityService activityService;

    @PostMapping
    public BaseVO<Activity> saveActivity(@RequestBody Activity activity){
        return activityService.saveActivity(activity);
    }
    @GetMapping
    public BaseVO<List<DashboardActivityDTO>> getActivityOfDashboard(){
        return activityService.selectActivityOfDashboard();
    }

}
