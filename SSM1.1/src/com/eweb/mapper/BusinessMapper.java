package com.eweb.mapper;

import com.eweb.model.Business;

public interface BusinessMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business
     *
     * @mbg.generated Wed Aug 08 09:50:05 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business
     *
     * @mbg.generated Wed Aug 08 09:50:05 CST 2018
     */
    int insert(Business record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business
     *
     * @mbg.generated Wed Aug 08 09:50:05 CST 2018
     */
    int insertSelective(Business record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business
     *
     * @mbg.generated Wed Aug 08 09:50:05 CST 2018
     */
    Business selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business
     *
     * @mbg.generated Wed Aug 08 09:50:05 CST 2018
     */
    int updateByPrimaryKeySelective(Business record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business
     *
     * @mbg.generated Wed Aug 08 09:50:05 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Business record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business
     *
     * @mbg.generated Wed Aug 08 09:50:05 CST 2018
     */
    int updateByPrimaryKey(Business record);
}