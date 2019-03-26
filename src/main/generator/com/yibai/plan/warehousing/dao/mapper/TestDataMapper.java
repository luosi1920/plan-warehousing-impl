package com.yibai.plan.warehousing.dao.mapper;

import com.yibai.plan.warehousing.dao.entity.TestData;

public interface TestDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestData record);

    int insertSelective(TestData record);

    TestData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestData record);

    int updateByPrimaryKey(TestData record);
}