package com.yibai.plan.warehousing.dao.mapper;

import com.yibai.plan.warehousing.dao.entity.Tracker;
import com.yibai.plan.warehousing.dto.request.TrackerDTO;
import com.yibai.plan.warehousing.dto.request.TrackerQueryDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TrackerMapper {
    int deleteByPrimaryKey(String gid);

    int insert(Tracker record);

    int insertSelective(Tracker record);

    Tracker selectByPrimaryKey(String gid);

    int updateByPrimaryKeySelective(Tracker record);

    int updateByPrimaryKey(Tracker record);

}