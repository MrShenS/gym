package com.sz.gym.model.entity;

import java.util.Date;

public class Earning {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column earning.earning_id
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private Integer earningId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column earning.earning_source
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private String earningSource;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column earning.earning_description
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private Integer earningDescription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column earning.earning_money
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private Double earningMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column earning.earning_user
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private String earningUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column earning.create_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column earning.update_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column earning.earning_id
     *
     * @return the value of earning.earning_id
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public Integer getEarningId() {
        return earningId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column earning.earning_id
     *
     * @param earningId the value for earning.earning_id
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setEarningId(Integer earningId) {
        this.earningId = earningId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column earning.earning_source
     *
     * @return the value of earning.earning_source
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public String getEarningSource() {
        return earningSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column earning.earning_source
     *
     * @param earningSource the value for earning.earning_source
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setEarningSource(String earningSource) {
        this.earningSource = earningSource == null ? null : earningSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column earning.earning_description
     *
     * @return the value of earning.earning_description
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public Integer getEarningDescription() {
        return earningDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column earning.earning_description
     *
     * @param earningDescription the value for earning.earning_description
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setEarningDescription(Integer earningDescription) {
        this.earningDescription = earningDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column earning.earning_money
     *
     * @return the value of earning.earning_money
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public Double getEarningMoney() {
        return earningMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column earning.earning_money
     *
     * @param earningMoney the value for earning.earning_money
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setEarningMoney(Double earningMoney) {
        this.earningMoney = earningMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column earning.earning_user
     *
     * @return the value of earning.earning_user
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public String getEarningUser() {
        return earningUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column earning.earning_user
     *
     * @param earningUser the value for earning.earning_user
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setEarningUser(String earningUser) {
        this.earningUser = earningUser == null ? null : earningUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column earning.create_time
     *
     * @return the value of earning.create_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column earning.create_time
     *
     * @param createTime the value for earning.create_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column earning.update_time
     *
     * @return the value of earning.update_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column earning.update_time
     *
     * @param updateTime the value for earning.update_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}