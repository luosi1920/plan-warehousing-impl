package com.yibai.plan.warehousing.dao.entity;

import java.util.Date;

public class YibaiOverseaLogistics {
    private Integer id;

    private String sku;

    private String stationCode;

    private String skuName;

    private Integer skuState;

    private Integer logisticsId;

    private Integer approveState;

    private String approveUid;

    private Date approveAt;

    private String updatedUid;

    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getSkuState() {
        return skuState;
    }

    public void setSkuState(Integer skuState) {
        this.skuState = skuState;
    }

    public Integer getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(Integer logisticsId) {
        this.logisticsId = logisticsId;
    }

    public Integer getApproveState() {
        return approveState;
    }

    public void setApproveState(Integer approveState) {
        this.approveState = approveState;
    }

    public String getApproveUid() {
        return approveUid;
    }

    public void setApproveUid(String approveUid) {
        this.approveUid = approveUid;
    }

    public Date getApproveAt() {
        return approveAt;
    }

    public void setApproveAt(Date approveAt) {
        this.approveAt = approveAt;
    }

    public String getUpdatedUid() {
        return updatedUid;
    }

    public void setUpdatedUid(String updatedUid) {
        this.updatedUid = updatedUid;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}