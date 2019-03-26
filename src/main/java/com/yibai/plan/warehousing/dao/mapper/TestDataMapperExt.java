package com.yibai.plan.warehousing.dao.mapper;

import com.yibai.plan.warehousing.dao.entity.TestData;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface TestDataMapperExt extends TestDataMapper{


   List<TestData> selectAll();
}
