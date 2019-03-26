package com.yibai.plan.warehousing.dao.mapper;

import com.yibai.plan.warehousing.dao.entity.YibaiOverseaPrList;

public interface YibaiOverseaPrListMapper {
    int deleteByPrimaryKey(String gid);

    int insert(YibaiOverseaPrList record);

    int insertSelective(YibaiOverseaPrList record);

    YibaiOverseaPrList selectByPrimaryKey(String gid);

    int updateByPrimaryKeySelective(YibaiOverseaPrList record);

    int updateByPrimaryKey(YibaiOverseaPrList record);
}