package com.sz.gym.model.entity;

import java.util.Date;

public class Customer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.customer_id
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private Integer customerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.customer_name
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private String customerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.customer_phone
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private String customerPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.customer_type
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private String customerType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.customer_residueTime
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private String customerResiduetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.create_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.update_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.birthday
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private Date birthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.customer_address
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private String customerAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.customer_description
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    private String customerDescription;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.customer_id
     *
     * @return the value of customer.customer_id
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.customer_id
     *
     * @param customerId the value for customer.customer_id
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.customer_name
     *
     * @return the value of customer.customer_name
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.customer_name
     *
     * @param customerName the value for customer.customer_name
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.customer_phone
     *
     * @return the value of customer.customer_phone
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.customer_phone
     *
     * @param customerPhone the value for customer.customer_phone
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.customer_type
     *
     * @return the value of customer.customer_type
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.customer_type
     *
     * @param customerType the value for customer.customer_type
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setCustomerType(String customerType) {
        this.customerType = customerType == null ? null : customerType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.customer_residueTime
     *
     * @return the value of customer.customer_residueTime
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public String getCustomerResiduetime() {
        return customerResiduetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.customer_residueTime
     *
     * @param customerResiduetime the value for customer.customer_residueTime
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setCustomerResiduetime(String customerResiduetime) {
        this.customerResiduetime = customerResiduetime == null ? null : customerResiduetime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.create_time
     *
     * @return the value of customer.create_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.create_time
     *
     * @param createTime the value for customer.create_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.update_time
     *
     * @return the value of customer.update_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.update_time
     *
     * @param updateTime the value for customer.update_time
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.birthday
     *
     * @return the value of customer.birthday
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.birthday
     *
     * @param birthday the value for customer.birthday
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.customer_address
     *
     * @return the value of customer.customer_address
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.customer_address
     *
     * @param customerAddress the value for customer.customer_address
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress == null ? null : customerAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.customer_description
     *
     * @return the value of customer.customer_description
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public String getCustomerDescription() {
        return customerDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.customer_description
     *
     * @param customerDescription the value for customer.customer_description
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    public void setCustomerDescription(String customerDescription) {
        this.customerDescription = customerDescription == null ? null : customerDescription.trim();
    }
}