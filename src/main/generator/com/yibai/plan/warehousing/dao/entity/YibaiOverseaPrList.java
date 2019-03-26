package com.yibai.plan.warehousing.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class YibaiOverseaPrList {
    private String gid;

    private String jid;

    private String prSn;

    private Integer salesman;

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

    private Date expectExhaustDate;

    private Short bd;

    private Integer requireQty;

    private Byte isTriggerPr;

    private Byte isPlanApprove;

    private Byte approveState;

    private Integer approveUid;

    private Date approvedAt;

    private String remark;

    private Byte expired;

    private Date updatedAt;

    private Boolean checkAttrState;

    private Integer checkAttrUid;

    private String checkAttrTime;

    private Integer estimatedStockQuantity;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }

    public String getPrSn() {
        return prSn;
    }

    public void setPrSn(String prSn) {
        this.prSn = prSn;
    }

    public Integer getSalesman() {
        return salesman;
    }

    public void setSalesman(Integer salesman) {
        this.salesman = salesman;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Byte getSkuState() {
        return skuState;
    }

    public void setSkuState(Byte skuState) {
        this.skuState = skuState;
    }

    public Byte getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(Byte logisticsId) {
        this.logisticsId = logisticsId;
    }

    public Integer getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(Integer availableQty) {
        this.availableQty = availableQty;
    }

    public Integer getOverseaUpQty() {
        return overseaUpQty;
    }

    public void setOverseaUpQty(Integer overseaUpQty) {
        this.overseaUpQty = overseaUpQty;
    }

    public Integer getOverseaShipQty() {
        return overseaShipQty;
    }

    public void setOverseaShipQty(Integer overseaShipQty) {
        this.overseaShipQty = overseaShipQty;
    }

    public Short getScDay() {
        return scDay;
    }

    public void setScDay(Short scDay) {
        this.scDay = scDay;
    }

    public Short getDeviatePcs() {
        return deviatePcs;
    }

    public void setDeviatePcs(Short deviatePcs) {
        this.deviatePcs = deviatePcs;
    }

    public Short getAvgWeightSalePcs() {
        return avgWeightSalePcs;
    }

    public void setAvgWeightSalePcs(Short avgWeightSalePcs) {
        this.avgWeightSalePcs = avgWeightSalePcs;
    }

    public Short getAvgDeliverDay() {
        return avgDeliverDay;
    }

    public void setAvgDeliverDay(Short avgDeliverDay) {
        this.avgDeliverDay = avgDeliverDay;
    }

    public BigDecimal getZ() {
        return z;
    }

    public void setZ(BigDecimal z) {
        this.z = z;
    }

    public Short getSafeStockPcs() {
        return safeStockPcs;
    }

    public void setSafeStockPcs(Short safeStockPcs) {
        this.safeStockPcs = safeStockPcs;
    }

    public Short getWeightSalePcs() {
        return weightSalePcs;
    }

    public void setWeightSalePcs(Short weightSalePcs) {
        this.weightSalePcs = weightSalePcs;
    }

    public Short getPreDay() {
        return preDay;
    }

    public void setPreDay(Short preDay) {
        this.preDay = preDay;
    }

    public Short getPointPcs() {
        return pointPcs;
    }

    public void setPointPcs(Short pointPcs) {
        this.pointPcs = pointPcs;
    }

    public Short getSupplyDay() {
        return supplyDay;
    }

    public void setSupplyDay(Short supplyDay) {
        this.supplyDay = supplyDay;
    }

    public Integer getPurchaseQty() {
        return purchaseQty;
    }

    public void setPurchaseQty(Integer purchaseQty) {
        this.purchaseQty = purchaseQty;
    }

    public Date getExpectExhaustDate() {
        return expectExhaustDate;
    }

    public void setExpectExhaustDate(Date expectExhaustDate) {
        this.expectExhaustDate = expectExhaustDate;
    }

    public Short getBd() {
        return bd;
    }

    public void setBd(Short bd) {
        this.bd = bd;
    }

    public Integer getRequireQty() {
        return requireQty;
    }

    public void setRequireQty(Integer requireQty) {
        this.requireQty = requireQty;
    }

    public Byte getIsTriggerPr() {
        return isTriggerPr;
    }

    public void setIsTriggerPr(Byte isTriggerPr) {
        this.isTriggerPr = isTriggerPr;
    }

    public Byte getIsPlanApprove() {
        return isPlanApprove;
    }

    public void setIsPlanApprove(Byte isPlanApprove) {
        this.isPlanApprove = isPlanApprove;
    }

    public Byte getApproveState() {
        return approveState;
    }

    public void setApproveState(Byte approveState) {
        this.approveState = approveState;
    }

    public Integer getApproveUid() {
        return approveUid;
    }

    public void setApproveUid(Integer approveUid) {
        this.approveUid = approveUid;
    }

    public Date getApprovedAt() {
        return approvedAt;
    }

    public void setApprovedAt(Date approvedAt) {
        this.approvedAt = approvedAt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getExpired() {
        return expired;
    }

    public void setExpired(Byte expired) {
        this.expired = expired;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getCheckAttrState() {
        return checkAttrState;
    }

    public void setCheckAttrState(Boolean checkAttrState) {
        this.checkAttrState = checkAttrState;
    }

    public Integer getCheckAttrUid() {
        return checkAttrUid;
    }

    public void setCheckAttrUid(Integer checkAttrUid) {
        this.checkAttrUid = checkAttrUid;
    }

    public String getCheckAttrTime() {
        return checkAttrTime;
    }

    public void setCheckAttrTime(String checkAttrTime) {
        this.checkAttrTime = checkAttrTime;
    }

    public Integer getEstimatedStockQuantity() {
        return estimatedStockQuantity;
    }

    public void setEstimatedStockQuantity(Integer estimatedStockQuantity) {
        this.estimatedStockQuantity = estimatedStockQuantity;
    }
}