package com.yibai.plan.warehousing.service.local;

import com.yibai.plan.warehousing.dao.entity.Tracker;
import com.yibai.plan.warehousing.dao.mapper.TrackerMapperExt;
import com.yibai.plan.warehousing.dto.request.TrackerDTO;
import com.yibai.plan.warehousing.dto.request.TrackerQueryDTO;
import com.yibai.plan.warehousing.dto.response.TrackerRespDTO;
import com.yibai.plan.warehousing.service.util.ConvertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: plan-warehousing
 * @author: lx
 * @create: 2019-03-11 16:15
 **/

@Service
public class TrackerLocalServiceImpl {

    @Autowired
    TrackerMapperExt trackerMapperExt;

    //获取需求跟踪列表
    public List<TrackerRespDTO> selectList(TrackerQueryDTO trackerQueryDTO){
        List<Tracker> trackers=trackerMapperExt.selectList(trackerQueryDTO);
       // Integer total=trackerMapper.selectListTotal(trackerQueryDTO);
        List<TrackerRespDTO> trackerRespDTOS = ConvertUtils.convert(trackers, TrackerRespDTO.class);
        //PageResponseDTO<TrackerRespDTO> pageResponseDTO=new PageResponseDTO();
        //pageResponseDTO.measureTotalPage(total,trackerQueryDTO.getPageSize());
       // pageResponseDTO.setItems(trackerRespDTOS);
        return  trackerRespDTOS;
    }

    //获取需求跟踪总记录数
    public Integer selectTotal(TrackerQueryDTO trackerQueryDTO){
        Integer total=trackerMapperExt.selectListTotal(trackerQueryDTO);
        return  total;
    }

    //获取单条需求跟踪记录
    public TrackerRespDTO slelctOne(TrackerDTO trackerDTO) {
        Tracker tracker=trackerMapperExt.selectOne(trackerDTO);
        TrackerRespDTO trackerRespDTO = ConvertUtils.convert(tracker, TrackerRespDTO.class);
        return trackerRespDTO;
    }
}
