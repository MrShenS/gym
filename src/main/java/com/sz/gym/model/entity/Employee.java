package com.sz.gym.model.entity;

import java.util.Date;

public class Employee {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.employee_id
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    private Integer employeeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.employee_name
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    private String employeeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.employee_password
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    private String employeePassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.employee_post
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    private String employeePost;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.CREATE_TIME
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.update_time
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.salary
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    private Double salary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.employee_relname
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    private String employeeRelname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.employee_phone
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    private String employeePhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.employee_email
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    private String employeeEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.employee_address
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    private String employeeAddress;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.employee_id
     *
     * @return the value of employee.employee_id
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public Integer getEmployeeId() {
        return employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.employee_id
     *
     * @param employeeId the value for employee.employee_id
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.employee_name
     *
     * @return the value of employee.employee_name
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.employee_name
     *
     * @param employeeName the value for employee.employee_name
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.employee_password
     *
     * @return the value of employee.employee_password
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public String getEmployeePassword() {
        return employeePassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.employee_password
     *
     * @param employeePassword the value for employee.employee_password
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword == null ? null : employeePassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.employee_post
     *
     * @return the value of employee.employee_post
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public String getEmployeePost() {
        return employeePost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.employee_post
     *
     * @param employeePost the value for employee.employee_post
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public void setEmployeePost(String employeePost) {
        this.employeePost = employeePost == null ? null : employeePost.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.CREATE_TIME
     *
     * @return the value of employee.CREATE_TIME
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.CREATE_TIME
     *
     * @param createTime the value for employee.CREATE_TIME
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.update_time
     *
     * @return the value of employee.update_time
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.update_time
     *
     * @param updateTime the value for employee.update_time
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.salary
     *
     * @return the value of employee.salary
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.salary
     *
     * @param salary the value for employee.salary
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.employee_relname
     *
     * @return the value of employee.employee_relname
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public String getEmployeeRelname() {
        return employeeRelname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.employee_relname
     *
     * @param employeeRelname the value for employee.employee_relname
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public void setEmployeeRelname(String employeeRelname) {
        this.employeeRelname = employeeRelname == null ? null : employeeRelname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.employee_phone
     *
     * @return the value of employee.employee_phone
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public String getEmployeePhone() {
        return employeePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.employee_phone
     *
     * @param employeePhone the value for employee.employee_phone
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone == null ? null : employeePhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.employee_email
     *
     * @return the value of employee.employee_email
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public String getEmployeeEmail() {
        return employeeEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.employee_email
     *
     * @param employeeEmail the value for employee.employee_email
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail == null ? null : employeeEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.employee_address
     *
     * @return the value of employee.employee_address
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public String getEmployeeAddress() {
        return employeeAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.employee_address
     *
     * @param employeeAddress the value for employee.employee_address
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress == null ? null : employeeAddress.trim();
    }
}