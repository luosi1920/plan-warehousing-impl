package com.yibai.plan.warehousing.dao.mapper;

import com.yibai.plan.warehousing.dao.entity.YibaiOverseaPrList;
import com.yibai.plan.warehousing.dto.request.CriteriaDTO;
import com.yibai.plan.warehousing.dto.response.YibaiOverseaPrListDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YibaiOverseaPrListMapper {
    int deleteByPrimaryKey(String gid);

    int insert(YibaiOverseaPrListDto record);

    int insertSelective(YibaiOverseaPrList record);

    YibaiOverseaPrList selectByPrimaryKey(String gid);

    int updateByPrimaryKeySelective(YibaiOverseaPrList record);

    int updateByPrimaryKey(YibaiOverseaPrList record);

    int selectTotalCount(@Param("criteriaDto") CriteriaDTO criteriaDto);

    List<YibaiOverseaPrList> findProductListForPageBean(@Param("criteriaDto") CriteriaDTO criteriaDto, @Param("index") Integer index, @Param("pageSize") Integer pageSize);

    YibaiOverseaPrList queryByGid(@Param("gid") String gid);

    void updateIsPlanApprove(@Param("gid") String gid);

    boolean updateBd(@Param("gid") String gid, @Param("bd") Integer bd);

    void updateCheckAttrState(@Param("gid") String gid);

}