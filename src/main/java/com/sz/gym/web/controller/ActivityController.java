package com.sz.gym.web.controller;

import com.sz.gym.model.param.ActivityParam;
import com.sz.gym.model.vo.ActivityStatusVO;
import com.sz.gym.model.vo.ActivityUpdateStatusVO;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.dto.DashboardActivityDTO;
import com.sz.gym.model.entity.Activity;
import com.sz.gym.model.vo.TableShowVO;
import com.sz.gym.service.ActivityService;
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
@RequestMapping("api//activity")
public class ActivityController {

    @Autowired
    public ActivityService activityService;

    @PostMapping
    public BaseVO<Activity> saveActivity(@RequestBody Activity activity){
        return activityService.saveActivity(activity);
    }
    @GetMapping("/OfDashboard")
    public BaseVO<List<DashboardActivityDTO>> getActivityOfDashboard(){
        return activityService.selectActivityOfDashboard();
    }
    @GetMapping
    public BaseVO<TableShowVO<Activity>> selectActivity(){
        return activityService.selectActivity();
    }

    @PutMapping
    public BaseVO<Activity> updateActivity(@RequestBody Activity activity){
        return activityService.updateActivity(activity);
    }

    @DeleteMapping
    public  BaseVO<Activity> deleteActivity(@RequestBody Activity activity){
        return activityService.deleteActivity(activity);
    }

    @PostMapping("/ByParam")
    public BaseVO<TableShowVO<Activity>> getActivityByParam(@RequestBody ActivityParam activityParam){
        return activityService.selectActivityByParam(activityParam);
    }

    @GetMapping("/UpdateStatus")
    public BaseVO<ActivityUpdateStatusVO<ActivityStatusVO>> getActivityByStatus(){
        return activityService.getActivityByStatus();
    }

    @PutMapping("/UpdateStatus")
    public BaseVO<ActivityUpdateStatusVO<ActivityStatusVO>> UpdateActivityByStatus(
            @RequestBody ActivityUpdateStatusVO<ActivityStatusVO> statusVO){
        return activityService.updateActivityByStatus(statusVO);
    }



}
