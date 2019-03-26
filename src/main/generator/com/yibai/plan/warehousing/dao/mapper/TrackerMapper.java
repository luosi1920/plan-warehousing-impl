package com.yibai.plan.warehousing.dao.mapper;

import com.yibai.plan.warehousing.dao.entity.Tracker;

public interface TrackerMapper {
    int deleteByPrimaryKey(String gid);

    int insert(Tracker record);

    int insertSelective(Tracker record);

    Tracker selectByPrimaryKey(String gid);

    int updateByPrimaryKeySelective(Tracker record);

    int updateByPrimaryKey(Tracker record);
}