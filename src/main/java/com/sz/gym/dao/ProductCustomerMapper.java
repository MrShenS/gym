package com.sz.gym.dao;

import com.sz.gym.model.entity.ProductCustomer;
import com.sz.gym.model.entity.ProductCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCustomerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_customer
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    int countByExample(ProductCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_customer
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    int deleteByExample(ProductCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_customer
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_customer
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    int insert(ProductCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_customer
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    int insertSelective(ProductCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_customer
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    List<ProductCustomer> selectByExample(ProductCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_customer
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    ProductCustomer selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_customer
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    int updateByExampleSelective(@Param("record") ProductCustomer record, @Param("example") ProductCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_customer
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    int updateByExample(@Param("record") ProductCustomer record, @Param("example") ProductCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_customer
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    int updateByPrimaryKeySelective(ProductCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_customer
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    int updateByPrimaryKey(ProductCustomer record);
}