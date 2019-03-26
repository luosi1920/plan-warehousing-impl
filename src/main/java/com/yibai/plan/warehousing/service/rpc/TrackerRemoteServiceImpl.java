package com.yibai.plan.warehousing.service.rpc;

import com.yibai.crown.provider.dto.response.PageResponseDTO;
import com.yibai.plan.warehousing.dto.request.TrackerDTO;
import com.yibai.plan.warehousing.dto.request.TrackerQueryDTO;
import com.yibai.plan.warehousing.dto.response.TrackerRespDTO;
import com.yibai.plan.warehousing.service.TrackerRemoteService;
import com.yibai.plan.warehousing.service.local.TrackerLocalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @description: plan-warehousing
 * @author: lx
 * @create: 2019-03-11 16:14
 **/
//该类实现TrackerRemoteService接口
@RestController
public class TrackerRemoteServiceImpl implements TrackerRemoteService {

    @Autowired
    TrackerLocalServiceImpl trackerLocalServiceImpl;

    //获取需求跟踪列表
    @Override
    public  List<TrackerRespDTO> trackerList(@RequestBody TrackerQueryDTO trackerQueryDTO) {
        List<TrackerRespDTO> trackerRespDTOS=trackerLocalServiceImpl.selectList(trackerQueryDTO);
        System.out.println(trackerQueryDTO);
        return trackerRespDTOS;
    }

    //获取需求跟踪总记录数
    @Override
    public Integer trackerTotal(@RequestBody TrackerQueryDTO trackerQueryDTO) {
        Integer total=trackerLocalServiceImpl.selectTotal(trackerQueryDTO);
        return total;
    }

    //获取单条需求跟踪记录
    @Override
    public TrackerRespDTO selectOne(@RequestBody TrackerDTO trackerDTO) {
        if(trackerDTO.getPrSn()==null){
            return null;
        }
        return trackerLocalServiceImpl.slelctOne(trackerDTO);
    }
}
