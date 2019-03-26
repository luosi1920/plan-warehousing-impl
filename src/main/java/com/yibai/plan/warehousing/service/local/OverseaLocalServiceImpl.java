//package com.yibai.plan.warehousing.service.local;
//
//import com.alibaba.fastjson.JSON;
//import com.yibai.crown.service.component.SnowflakeIdWorker;
//import com.yibai.plan.warehousing.configuration.datasource.TargetDataSource;
//import com.yibai.plan.warehousing.dao.entity.YibaiOverseaSummary;
//import com.yibai.plan.warehousing.dao.mapper.YibaiOverseaSummaryMapperExt;
//import com.yibai.plan.warehousing.dto.response.OverseaSummaryDTO;
//import com.yibai.plan.warehousing.service.util.ConvertUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @description: codeplan
// * @author: zxf
// * @create: 2019-03-12 21:55
// **/
//@Service
//public class OverseaLocalServiceImpl {
//    @Autowired
//    private SnowflakeIdWorker snowflakeIdWorker;
//
//    @Autowired
//    private YibaiOverseaSummaryMapperExt yibaiOverseaSummaryMapperExt ;
//
//    @TargetDataSource(name ="ds1")
//    public List<YibaiOverseaSummary> queryOverseaSummaryList(OverseaSummaryDTO dto){
//        List<YibaiOverseaSummary> list = new ArrayList<>();
//        YibaiOverseaSummary yibaiOverseaSummary = yibaiOverseaSummaryMapperExt.selectByPrimaryKey("1");
//        System.out.println(JSON.toJSONString(yibaiOverseaSummary));
//        return list;
//    }
//    @TargetDataSource(name ="ds1")
//    public void addOverseaSummary(OverseaSummaryDTO dto){
//        YibaiOverseaSummary yibaiOverseaSummary = ConvertUtils.convert(dto,YibaiOverseaSummary.class);
//        yibaiOverseaSummaryMapperExt.addOverseaSummary(yibaiOverseaSummary);
//
//    }
//}
