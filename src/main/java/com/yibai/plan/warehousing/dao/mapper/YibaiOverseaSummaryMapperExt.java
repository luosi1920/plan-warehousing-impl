package com.yibai.plan.warehousing.dao.mapper;

import com.yibai.plan.warehousing.dao.entity.YibaiOverseaSummary;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface YibaiOverseaSummaryMapperExt extends  YibaiOverseaSummaryMapper{
    List<YibaiOverseaSummary> queryOverseaSummaryList(YibaiOverseaSummary dto);
    void addOverseaSummary(YibaiOverseaSummary dto);
}
