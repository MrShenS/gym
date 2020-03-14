package com.sz.gym.dao;

import com.sz.gym.model.entity.Facilities;
import com.sz.gym.model.entity.FacilitiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FacilitiesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facilities
     *
     * @mbggenerated Sat Mar 14 10:59:39 CST 2020
     */
    int countByExample(FacilitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facilities
     *
     * @mbggenerated Sat Mar 14 10:59:39 CST 2020
     */
    int deleteByExample(FacilitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facilities
     *
     * @mbggenerated Sat Mar 14 10:59:39 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facilities
     *
     * @mbggenerated Sat Mar 14 10:59:39 CST 2020
     */
    int insert(Facilities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facilities
     *
     * @mbggenerated Sat Mar 14 10:59:39 CST 2020
     */
    int insertSelective(Facilities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facilities
     *
     * @mbggenerated Sat Mar 14 10:59:39 CST 2020
     */
    List<Facilities> selectByExample(FacilitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facilities
     *
     * @mbggenerated Sat Mar 14 10:59:39 CST 2020
     */
    Facilities selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facilities
     *
     * @mbggenerated Sat Mar 14 10:59:39 CST 2020
     */
    int updateByExampleSelective(@Param("record") Facilities record, @Param("example") FacilitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facilities
     *
     * @mbggenerated Sat Mar 14 10:59:39 CST 2020
     */
    int updateByExample(@Param("record") Facilities record, @Param("example") FacilitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facilities
     *
     * @mbggenerated Sat Mar 14 10:59:39 CST 2020
     */
    int updateByPrimaryKeySelective(Facilities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facilities
     *
     * @mbggenerated Sat Mar 14 10:59:39 CST 2020
     */
    int updateByPrimaryKey(Facilities record);
}