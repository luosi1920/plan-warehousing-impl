package com.yibai.plan.warehousing.dao.mapper;

import com.yibai.plan.warehousing.dao.entity.YibaiOverseaLogistics;

public interface YibaiOverseaLogisticsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YibaiOverseaLogistics record);

    int insertSelective(YibaiOverseaLogistics record);

    YibaiOverseaLogistics selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YibaiOverseaLogistics record);

    int updateByPrimaryKey(YibaiOverseaLogistics record);
}