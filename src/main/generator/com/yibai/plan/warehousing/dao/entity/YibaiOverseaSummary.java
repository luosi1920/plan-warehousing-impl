package com.yibai.plan.warehousing.dao.entity;

import java.util.Date;

public class YibaiOverseaSummary {
    private String gid;

    private String sku;

    private String skuName;

    private Integer totalRequiredQty;

    private Date earliestExhaustDate;

    private String remark;

    private Date createdAt;

    private Date updatedAt;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Integer getTotalRequiredQty() {
        return totalRequiredQty;
    }

    public void setTotalRequiredQty(Integer totalRequiredQty) {
        this.totalRequiredQty = totalRequiredQty;
    }

    public Date getEarliestExhaustDate() {
        return earliestExhaustDate;
    }

    public void setEarliestExhaustDate(Date earliestExhaustDate) {
        this.earliestExhaustDate = earliestExhaustDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}