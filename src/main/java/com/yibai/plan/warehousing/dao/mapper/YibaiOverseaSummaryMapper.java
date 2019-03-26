package com.yibai.plan.warehousing.dao.mapper;

import com.yibai.plan.warehousing.dao.entity.YibaiOverseaSummary;

public interface YibaiOverseaSummaryMapper {
    int deleteByPrimaryKey(String gid);

    int insert(YibaiOverseaSummary record);

    int insertSelective(YibaiOverseaSummary record);

    YibaiOverseaSummary selectByPrimaryKey(String gid);

    int updateByPrimaryKeySelective(YibaiOverseaSummary record);

    int updateByPrimaryKey(YibaiOverseaSummary record);
}