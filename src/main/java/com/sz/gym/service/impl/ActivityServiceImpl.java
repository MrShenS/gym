package com.sz.gym.service.impl;

import com.sz.gym.dao.ActivityMapper;
import com.sz.gym.model.VO.BaseVO;
import com.sz.gym.model.dto.DashboardActivityDTO;
import com.sz.gym.model.entity.Activity;
import com.sz.gym.model.entity.ActivityExample;
import com.sz.gym.service.ActivityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassNameActivityServiceImpl
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1111:08
 * @Version 1.0
 */
@Slf4j
@Service
public class ActivityServiceImpl implements ActivityService {

    static final String SUCCESS="success";

    static final String LOSER="loser";

    @Autowired
    public ActivityMapper activityMapper;

    @Override
    public BaseVO<Activity> saveActivity(Activity activity) {
        activity.setCreateTime(new Date());
        activity.setUpdateTime(new Date());
        activity.setActivityStatus("false");
        List<Activity> activities = selectActivityByName(activity);
        if(activities.size()!=0){
            log.info("活动已存在 不需要创建了");
            return new BaseVO<Activity>(LOSER,"活动已存在",activity);
        }
        int insert = activityMapper.insert(activity);
        if (insert!=0) log.info("保存成功");
        return new BaseVO<Activity>(SUCCESS,"保存成功",activity);
    }

    @Override
    public BaseVO<Activity> updateActivity(Activity activity) {

        return null;
    }

    @Override
    public BaseVO<Activity> deleteActivity(Activity activity) {
        return null;
    }

    @Override
    public BaseVO<List<Activity>> selectActivity() {
        return null;
    }

    @Override
    public BaseVO<List<DashboardActivityDTO>> selectActivityOfDashboard() {
        List<Activity> activities = activityMapper.selectByExample(new ActivityExample());
        ArrayList<DashboardActivityDTO> list = new ArrayList<>();
        for (Activity activity: activities) {
            list.add(new DashboardActivityDTO(activity.getActivityName(),activity.getActivityStatus()));
        }

        return new BaseVO<List<DashboardActivityDTO>>(SUCCESS,"查找成功",list);
    }


    public List<Activity> selectActivityByName( Activity activity){
        ActivityExample activityExample = new ActivityExample();
        activityExample.createCriteria().andActivityNameEqualTo(activity.getActivityName());
        return activityMapper.selectByExample(activityExample);
    }
}
