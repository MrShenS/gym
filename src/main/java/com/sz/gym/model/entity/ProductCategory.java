package com.sz.gym.model.entity;

public class ProductCategory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_category.id
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_category.produce_id
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    private Integer produceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_category.category_id
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    private Integer categoryId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.id
     *
     * @return the value of product_category.id
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.id
     *
     * @param id the value for product_category.id
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.produce_id
     *
     * @return the value of product_category.produce_id
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public Integer getProduceId() {
        return produceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.produce_id
     *
     * @param produceId the value for product_category.produce_id
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public void setProduceId(Integer produceId) {
        this.produceId = produceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.category_id
     *
     * @return the value of product_category.category_id
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.category_id
     *
     * @param categoryId the value for product_category.category_id
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}