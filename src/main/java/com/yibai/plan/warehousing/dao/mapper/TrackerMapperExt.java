package com.yibai.plan.warehousing.dao.mapper;

import com.yibai.plan.warehousing.dao.entity.Tracker;
import com.yibai.plan.warehousing.dto.request.TrackerDTO;
import com.yibai.plan.warehousing.dto.request.TrackerQueryDTO;

import java.util.List;

public interface TrackerMapperExt extends TrackerMapper {

    List<Tracker> selectList(TrackerQueryDTO trackerQueryDTO);

    Integer selectListTotal(TrackerQueryDTO trackerQueryDTO);

    Tracker selectOne(TrackerDTO trackerDTO);
}
