package com.sz.gym.model.entity;

public class ProductCustomer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_customer.id
     *
     * @mbggenerated Sat Mar 14 10:59:39 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_customer.produce_id
     *
     * @mbggenerated Sat Mar 14 10:59:39 CST 2020
     */
    private Integer produceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_customer.customer_id
     *
     * @mbggenerated Sat Mar 14 10:59:39 CST 2020
     */
    private Integer customerId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_customer.id
     *
     * @return the value of product_customer.id
     *
     * @mbggenerated Sat Mar 14 10:59:39 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_customer.id
     *
     * @param id the value for product_customer.id
     *
     * @mbggenerated Sat Mar 14 10:59:39 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_customer.produce_id
     *
     * @return the value of product_customer.produce_id
     *
     * @mbggenerated Sat Mar 14 10:59:39 CST 2020
     */
    public Integer getProduceId() {
        return produceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_customer.produce_id
     *
     * @param produceId the value for product_customer.produce_id
     *
     * @mbggenerated Sat Mar 14 10:59:39 CST 2020
     */
    public void setProduceId(Integer produceId) {
        this.produceId = produceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_customer.customer_id
     *
     * @return the value of product_customer.customer_id
     *
     * @mbggenerated Sat Mar 14 10:59:39 CST 2020
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_customer.customer_id
     *
     * @param customerId the value for product_customer.customer_id
     *
     * @mbggenerated Sat Mar 14 10:59:39 CST 2020
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}