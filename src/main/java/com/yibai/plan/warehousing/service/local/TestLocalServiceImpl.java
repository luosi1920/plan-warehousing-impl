package com.yibai.plan.warehousing.service.local;

import com.yibai.crown.provider.exception.BizException;
import com.yibai.crown.service.component.SnowflakeIdWorker;
import com.yibai.plan.warehousing.configuration.datasource.TargetDataSource;
import com.yibai.plan.warehousing.dao.entity.TestData;
import com.yibai.plan.warehousing.dao.mapper.TestDataMapperExt;
import com.yibai.plan.warehousing.dto.response.TestDataRespDTO;
import com.yibai.plan.warehousing.service.util.ConvertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestLocalServiceImpl {


    @Autowired
    private TestDataMapperExt testDataMapperExt;

    @Autowired
    private SnowflakeIdWorker snowflakeIdWorker;


    public String hello(){
        return "hello";
    }

    @TargetDataSource(name ="ds1")
    public List<TestDataRespDTO> queryTestDataAll(){
        System.out.println(snowflakeIdWorker.nextId());
        List<TestData> testDatas = null;
        if(1==1){
            throw  new BizException("I0001");
        }
        try {
            testDatas = testDataMapperExt.selectAll();
        } catch (Exception e) {
//            e.printStackTrace();
            throw  new BizException("I0001");
        }

        return ConvertUtils.convert(testDatas, TestDataRespDTO.class);
    }

}
