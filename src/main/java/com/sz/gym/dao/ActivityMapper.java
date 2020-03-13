package com.sz.gym.dao;

import com.sz.gym.model.entity.Activity;
import com.sz.gym.model.entity.ActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    int countByExample(ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    int deleteByExample(ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    int deleteByPrimaryKey(Integer activityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    int insert(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    int insertSelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    List<Activity> selectByExample(ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    Activity selectByPrimaryKey(Integer activityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    int updateByExampleSelective(@Param("record") Activity record, @Param("example") ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    int updateByExample(@Param("record") Activity record, @Param("example") ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    int updateByPrimaryKeySelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    int updateByPrimaryKey(Activity record);
}