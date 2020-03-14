package com.sz.gym.service.impl;

import com.alibaba.fastjson.support.odps.udf.CodecCheck;
import com.sz.gym.dao.ActivityMapper;
import com.sz.gym.model.enums.ConstantEnum;
import com.sz.gym.model.param.ActivityParam;
import com.sz.gym.model.vo.ActivityStatusVO;
import com.sz.gym.model.vo.ActivityUpdateStatusVO;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.dto.DashboardActivityDTO;
import com.sz.gym.model.entity.Activity;
import com.sz.gym.model.entity.ActivityExample;
import com.sz.gym.model.vo.TableShowVO;
import com.sz.gym.service.ActivityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        List<Activity> activities = selectActivityByName(activity);
        if(activities.size()==0){
            log.info("活动不存在 不可以更改");
            return new BaseVO<Activity>(LOSER,"活动不存在",activity);
        }
        activityMapper.updateByPrimaryKey(activity);
        return new BaseVO<Activity>(SUCCESS,"修改成功",activity);
    }

    @Override
    public BaseVO<Activity> deleteActivity(Activity activity) {
        activityMapper.deleteByPrimaryKey(activity.getActivityId());
        return new BaseVO<Activity>(SUCCESS,"删除成功",activity);
    }

    @Override
    public BaseVO<TableShowVO<Activity>> selectActivity() {
        List<Activity> activities = activityMapper.selectByExample(new ActivityExample());
        return new BaseVO<TableShowVO<Activity>>(ConstantEnum.success.toString(),"成功",
                new TableShowVO<Activity>(activities,activities.size()));
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

    @Override
    public BaseVO<TableShowVO<Activity>> selectActivityByParam(ActivityParam activityParam) {
        ActivityExample activityExample = new ActivityExample();
        activityExample.createCriteria().andActivityNameLike("%"+activityParam.getName()+"%")
                .andActivityUserEqualTo(activityParam.getUser());
        List<Activity> activities = activityMapper.selectByExample(activityExample);
        return new BaseVO<TableShowVO<Activity>>(SUCCESS,"成功",
                new TableShowVO<Activity>(activities,activities.size()));
    }

    @Override
    public BaseVO<ActivityUpdateStatusVO<ActivityStatusVO>> getActivityByStatus() {
        ActivityStatusVO activityStatusVO=null;
        ActivityUpdateStatusVO<ActivityStatusVO> statusVO = new ActivityUpdateStatusVO<>();
        try {
            ArrayList<ActivityStatusVO> doings = new ArrayList<>();
            ArrayList<ActivityStatusVO> todos = new ArrayList<>();
            ArrayList<ActivityStatusVO> dones = new ArrayList<>();
            List<Activity> activities = activityMapper.selectByExample(new ActivityExample());
            for (Activity activity :
                    activities) {
                activityStatusVO =  new ActivityStatusVO(activity.getActivityId(),activity.getActivityName());
                switch (activity.getActivityStatus()){
                    case "false": todos.add(activityStatusVO);break;
                    case "true": doings.add(activityStatusVO);break;
                    default: dones.add(activityStatusVO);break;
                }
            }
            statusVO.setDoings(doings);
            statusVO.setTodDoing(todos);
            statusVO.setDone(dones);
        }catch ( Exception e){
            log.error("=======================报错了 快来看啊===========================");
            e.printStackTrace();
            return new BaseVO<ActivityUpdateStatusVO<ActivityStatusVO>>(SUCCESS,"成功",statusVO);
        }

        return new BaseVO<ActivityUpdateStatusVO<ActivityStatusVO>>(SUCCESS,"成功",statusVO);
    }

    @Override
    @Transactional
    public BaseVO<ActivityUpdateStatusVO<ActivityStatusVO>> updateActivityByStatus(
            ActivityUpdateStatusVO<ActivityStatusVO> statusVO) {
        List<ActivityStatusVO> doings = statusVO.getDoings();
        List<ActivityStatusVO> todDoing = statusVO.getTodDoing();
        List<ActivityStatusVO> done = statusVO.getDone();
        this.updateActivityByList(doings,"true");
        this.updateActivityByList(todDoing,"false");
        this.updateActivityByList(done,"done");
        return new BaseVO<ActivityUpdateStatusVO<ActivityStatusVO>>(SUCCESS,"成功",statusVO);
    }

    private void updateActivityByList(List<ActivityStatusVO> list, String flag) {
        for (ActivityStatusVO statusVO: list) {
            Activity activity = activityMapper.selectByPrimaryKey(statusVO.getId());
            activity.setActivityStatus(flag);
            int i = activityMapper.updateByPrimaryKey(activity);
        }
    }


    //更新活动状态




    public List<Activity> selectActivityByName( Activity activity){
        ActivityExample activityExample = new ActivityExample();
        activityExample.createCriteria().andActivityNameEqualTo(activity.getActivityName());
        return activityMapper.selectByExample(activityExample);
    }
}
