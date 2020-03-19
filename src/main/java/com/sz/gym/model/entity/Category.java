package com.sz.gym.model.entity;

import java.util.Date;

public class Category {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category_id
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private Integer categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category_name
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private String categoryName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category_type
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private String categoryType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.create_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.update_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category_id
     *
     * @return the value of category.category_id
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category_id
     *
     * @param categoryId the value for category.category_id
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category_name
     *
     * @return the value of category.category_name
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category_name
     *
     * @param categoryName the value for category.category_name
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category_type
     *
     * @return the value of category.category_type
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public String getCategoryType() {
        return categoryType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category_type
     *
     * @param categoryType the value for category.category_type
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType == null ? null : categoryType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.create_time
     *
     * @return the value of category.create_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.create_time
     *
     * @param createTime the value for category.create_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.update_time
     *
     * @return the value of category.update_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.update_time
     *
     * @param updateTime the value for category.update_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}