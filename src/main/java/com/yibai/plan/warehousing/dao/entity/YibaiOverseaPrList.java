package com.yibai.plan.warehousing.dao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class YibaiOverseaPrList {
    private String gid;

    private String jid;

    private String prSn;

    private Integer salesman;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdAt;

    private String sku;

    private String stationCode;

    private String skuName;

    private Byte skuState;

    private Byte logisticsId;

    private Integer availableQty;

    private Integer overseaUpQty;

    private Integer overseaShipQty;

    private Short scDay;

    private Short deviatePcs;

    private Short avgWeightSalePcs;

    private Short avgDeliverDay;

    private BigDecimal z;

    private Short safeStockPcs;

    private Short weightSalePcs;

    private Short preDay;

    private Short pointPcs;

    private Short supplyDay;

    private Integer purchaseQty;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date expectExhaustDate;

    private Short bd;

    private Integer requireQty;

    private Byte isTriggerPr;

    private Byte isPlanApprove;

    private Byte approveState;

    private Integer approveUid;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")

    private Date approvedAt;

    private String remark;

    private Byte expired;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updatedAt;

    private Integer checkAttrState;

    private Integer checkAttrUid;

    private String checkAttrTime;

    private Integer estimatedStockQuantity;
}