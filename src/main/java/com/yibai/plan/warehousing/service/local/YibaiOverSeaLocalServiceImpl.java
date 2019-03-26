package com.yibai.plan.warehousing.service.local;

import com.yibai.crown.provider.dto.response.PageResponseDTO;
import com.yibai.plan.warehousing.dao.entity.YibaiOverseaPrList;
import com.yibai.plan.warehousing.dao.mapper.YibaiOverseaPrListMapper;
import com.yibai.plan.warehousing.dto.request.CriteriaDTO;
import com.yibai.plan.warehousing.dto.request.UpdateReqDTO;
import com.yibai.plan.warehousing.dto.response.YibaiOverseaPrListDto;
import com.yibai.plan.warehousing.service.util.ConvertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: plan-warehousing
 * @author: lhy
 * @create: 2019-03-10 11:42
 **/
@Service
public class YibaiOverSeaLocalServiceImpl {

    @Autowired
    private YibaiOverseaPrListMapper yibaiOverseaPrListMapper;


    public PageResponseDTO<YibaiOverseaPrListDto> queryByCriteria(CriteriaDTO criteriaDto) {
        PageResponseDTO pageBean = new PageResponseDTO();
        int totalCount = yibaiOverseaPrListMapper.selectTotalCount(criteriaDto);
        pageBean.measureTotalPage(totalCount, criteriaDto.getPageSize());
        int index = criteriaDto.getOffset();
        List<YibaiOverseaPrList> yibaiOverseaPrLists = yibaiOverseaPrListMapper.findProductListForPageBean(criteriaDto, index, criteriaDto.getPageSize());
        List<YibaiOverseaPrListDto> yibaiOverseaPrListDtos = ConvertUtils.convert(yibaiOverseaPrLists, YibaiOverseaPrListDto.class);
        pageBean.setItems(yibaiOverseaPrListDtos);
        pageBean.setTotalCount(totalCount);

        return pageBean;
    }

    public String updateByGid(UpdateReqDTO dto) {
        Integer bd = dto.getBd();
        String gid = dto.getGid();
        YibaiOverseaPrList yibaiOverseaPrList = yibaiOverseaPrListMapper.selectByPrimaryKey(gid);
        Byte isTriggerPr = yibaiOverseaPrList.getIsTriggerPr();
        //只有无需审核的，待一级审核的，审核失败的可以修改bd
        if (yibaiOverseaPrList.getCheckAttrState() == 1 || yibaiOverseaPrList.getCheckAttrState() == 0 || yibaiOverseaPrList.getCheckAttrState() == 5) {
            if (bd > 0) {
                //isTriggerPr是否触发需求 1是 2否
                if (isTriggerPr == 1) {
                    //bd>0&&isTriggerPr==1更改计划审核状态为1  1是2否
                    yibaiOverseaPrListMapper.updateIsPlanApprove(gid);
                    //1代表待一级待审核 2代表待二级待审核 3代表待三级待审核 0代表审核失败 4代表审核成功 5代表无需审核
                    //更改审核状态为待一级审核状态    1
                    yibaiOverseaPrListMapper.updateCheckAttrState(gid);
                    //更改bd数量
                    yibaiOverseaPrListMapper.updateBd(gid, bd);
                    return "更新状态并修改bd成功";
                }
                if (isTriggerPr == 2) {
                    yibaiOverseaPrListMapper.updateBd(gid, bd);
                    return "修改bd成功";
                }
            } else {
                yibaiOverseaPrListMapper.updateBd(gid, bd);
                return "修改bd成功";
            }
        }
        return "审核状态不正确,无法修改bd";
    }

    public YibaiOverseaPrList queryByGid(String gid) {
        return yibaiOverseaPrListMapper.queryByGid(gid);
    }
}
