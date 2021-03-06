package com.sz.gym.model.entity;

import java.util.Date;

public class Product {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.product_id
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private Integer productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.product_name
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private String productName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.product_type
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private String productType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.create_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.update_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.number
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private Integer number;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.price
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private Double price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.discription
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private String discription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.product_status
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private String productStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_id
     *
     * @return the value of product.product_id
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_id
     *
     * @param productId the value for product.product_id
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_name
     *
     * @return the value of product.product_name
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_name
     *
     * @param productName the value for product.product_name
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_type
     *
     * @return the value of product.product_type
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public String getProductType() {
        return productType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_type
     *
     * @param productType the value for product.product_type
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.create_time
     *
     * @return the value of product.create_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.create_time
     *
     * @param createTime the value for product.create_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.update_time
     *
     * @return the value of product.update_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.update_time
     *
     * @param updateTime the value for product.update_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.number
     *
     * @return the value of product.number
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.number
     *
     * @param number the value for product.number
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.price
     *
     * @return the value of product.price
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.price
     *
     * @param price the value for product.price
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.discription
     *
     * @return the value of product.discription
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public String getDiscription() {
        return discription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.discription
     *
     * @param discription the value for product.discription
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setDiscription(String discription) {
        this.discription = discription == null ? null : discription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_status
     *
     * @return the value of product.product_status
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public String getProductStatus() {
        return productStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_status
     *
     * @param productStatus the value for product.product_status
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus == null ? null : productStatus.trim();
    }
}