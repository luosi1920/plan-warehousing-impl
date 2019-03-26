package com.yibai.plan.warehousing.service.rpc;

import com.yibai.crown.provider.dto.response.PageResponseDTO;
import com.yibai.plan.warehousing.dao.entity.YibaiOverseaPrList;
import com.yibai.plan.warehousing.dto.request.CriteriaDTO;
import com.yibai.plan.warehousing.dto.request.UpdateReqDTO;
import com.yibai.plan.warehousing.dto.response.YibaiOverseaPrListDto;
import com.yibai.plan.warehousing.service.YiBaiOverSeaRemoteService;
import com.yibai.plan.warehousing.service.local.YibaiOverSeaLocalServiceImpl;
import com.yibai.plan.warehousing.service.util.ConvertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: plan-warehousing
 * @author: lhy
 * @create: 2019-03-10 11:40
 **/
@RestController
public class YiBaiOverSeaRemoteServiceImpl implements YiBaiOverSeaRemoteService {

    @Autowired
    private YibaiOverSeaLocalServiceImpl yibaiOverSeaLocalService;


    @Override
    public PageResponseDTO<YibaiOverseaPrListDto> queryByCriteria(@RequestBody CriteriaDTO criteriaDto) {
        PageResponseDTO<YibaiOverseaPrListDto> pageBean = yibaiOverSeaLocalService.queryByCriteria(criteriaDto);
        return pageBean;
    }

    @Override
    public String updateByGid(@RequestBody UpdateReqDTO dto) {
        return yibaiOverSeaLocalService.updateByGid(dto);
    }

    @Override
    public YibaiOverseaPrListDto queryByGid(String gid) {
        YibaiOverseaPrList yibaiOverseaPrList = yibaiOverSeaLocalService.queryByGid(gid);
        YibaiOverseaPrListDto yibaiOverseaPrListDto = ConvertUtils.convert(yibaiOverseaPrList, YibaiOverseaPrListDto.class);
        return yibaiOverseaPrListDto;
    }
}
