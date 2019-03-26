package com.yibai.plan.warehousing.dao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;


/**
 *  需求跟踪列表实体类
 */
public class Tracker implements Serializable {
    private static final long serialVersionUID = 3254297929154173065L;
    private String gid;

    private String prSn;

    private String sku;

    private String stationCode;

    private String skuName;

    private Integer purchaseOrderQty;

    private Short bd;

    private Integer requireQty;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date expectExhaustDate;

    private Byte approveState;

    private String purSn;

    private String isActualPurchase;

    private Integer purchaseQty;

    private Integer surplusQty;

    private Byte purState;

    private String remark;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updatedAt;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdAt;

    public Tracker() {
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getPrSn() {
        return prSn;
    }

    public void setPrSn(String prSn) {
        this.prSn = prSn;
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

    public Integer getPurchaseOrderQty() {
        return purchaseOrderQty;
    }

    public void setPurchaseOrderQty(Integer purchaseOrderQty) {
        this.purchaseOrderQty = purchaseOrderQty;
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

    public Date getExpectExhaustDate() {
        return expectExhaustDate;
    }

    public void setExpectExhaustDate(Date expectExhaustDate) {
        this.expectExhaustDate = expectExhaustDate;
    }

    public Byte getApproveState() {
        return approveState;
    }

    public void setApproveState(Byte approveState) {
        this.approveState = approveState;
    }

    public String getPurSn() {
        return purSn;
    }

    public void setPurSn(String purSn) {
        this.purSn = purSn;
    }

    public String getIsActualPurchase() {
        return isActualPurchase;
    }

    public void setIsActualPurchase(String isActualPurchase) {
        this.isActualPurchase = isActualPurchase;
    }

    public Integer getPurchaseQty() {
        return purchaseQty;
    }

    public void setPurchaseQty(Integer purchaseQty) {
        this.purchaseQty = purchaseQty;
    }

    public Integer getSurplusQty() {
        return surplusQty;
    }

    public void setSurplusQty(Integer surplusQty) {
        this.surplusQty = surplusQty;
    }

    public Byte getPurState() {
        return purState;
    }

    public void setPurState(Byte purState) {
        this.purState = purState;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}