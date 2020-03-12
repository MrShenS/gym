package com.sz.gym.service;


import com.sz.gym.model.VO.BaseVO;
import com.sz.gym.model.dto.DashboardActivityDTO;
import com.sz.gym.model.entity.Activity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zhen.shen
 * @Description //TODO 活动管理的增删改查
 * @Date 11:05 2020/3/11
 * @Param 
 * @return 
 **/
@Service
public interface ActivityService {
    public BaseVO<Activity> saveActivity(Activity activity);
    public BaseVO<Activity> updateActivity(Activity activity);
    public BaseVO<Activity> deleteActivity(Activity activity);
    public BaseVO<List<Activity>> selectActivity();
    public BaseVO<List<DashboardActivityDTO>> selectActivityOfDashboard();

}
