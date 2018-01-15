package com.jwebcoder.emailsystem.dao;

import com.jwebcoder.emailsystem.entity.ContentTemplate;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentTemplateDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTENT_TEMPLATE
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTENT_TEMPLATE
     *
     * @mbg.generated
     */
    int insert(ContentTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTENT_TEMPLATE
     *
     * @mbg.generated
     */
    int insertSelective(ContentTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTENT_TEMPLATE
     *
     * @mbg.generated
     */
    ContentTemplate selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTENT_TEMPLATE
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ContentTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTENT_TEMPLATE
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(ContentTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTENT_TEMPLATE
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ContentTemplate record);
}