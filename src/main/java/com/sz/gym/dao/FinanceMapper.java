package com.sz.gym.dao;

import com.sz.gym.model.entity.Finance;
import com.sz.gym.model.entity.FinanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FinanceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    int countByExample(FinanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    int deleteByExample(FinanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    int deleteByPrimaryKey(Integer financeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    int insert(Finance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    int insertSelective(Finance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    List<Finance> selectByExample(FinanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    Finance selectByPrimaryKey(Integer financeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    int updateByExampleSelective(@Param("record") Finance record, @Param("example") FinanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    int updateByExample(@Param("record") Finance record, @Param("example") FinanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    int updateByPrimaryKeySelective(Finance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance
     *
     * @mbggenerated Wed Mar 18 09:45:36 CST 2020
     */
    int updateByPrimaryKey(Finance record);
}