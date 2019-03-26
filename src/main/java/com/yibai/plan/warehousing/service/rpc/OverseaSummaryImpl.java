package com.yibai.plan.warehousing.service.rpc;

import com.yibai.plan.warehousing.dao.entity.YibaiOverseaSummary;
import com.yibai.plan.warehousing.dto.response.OverseaSummaryDTO;
import com.yibai.plan.warehousing.service.IOverseaSummaryService;
import com.yibai.plan.warehousing.service.local.OverseaLocalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: codeplan
 * @author: zxf
 * @create: 2019-03-12 16:04
 **/
@RestController
public class OverseaSummaryImpl implements IOverseaSummaryService {
    @Autowired
    private OverseaLocalServiceImpl localService;
    @Override
    public List<OverseaSummaryDTO> queryOverseaSummaryList(OverseaSummaryDTO dto) {
        YibaiOverseaSummary yibaiOverseaSummary=new YibaiOverseaSummary();
        localService.queryOverseaSummaryList(dto);
        return null;
    }

    @Override
    public void addOverseaSummary(OverseaSummaryDTO dto) {

        localService.addOverseaSummary(dto);
    }
}
