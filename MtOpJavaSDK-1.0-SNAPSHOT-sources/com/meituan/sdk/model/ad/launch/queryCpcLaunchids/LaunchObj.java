package com.meituan.sdk.model.ad.launch.queryCpcLaunchids;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class LaunchObj {
    /**
    * 推广id
    */
    @SerializedName("launchid")
    private Integer launchid;
    /**
    * 推广名称
    */
    @SerializedName("launchName")
    private String launchName;
    /**
    * 门店名称
    */
    @SerializedName("shopName")
    private String shopName;
    /**
    * 投放状态
    */
    @SerializedName("status")
    private Integer status;
    /**
    * 投放状态描述
    */
    @SerializedName("statusDesc")
    private String statusDesc;
    /**
    * 门店信息
    */
    @SerializedName("shopId")
    private Long shopId;

    public Integer getLaunchid() {
        return launchid;
    }
    public void setLaunchid(Integer launchid) {
        this.launchid = launchid;
    }
    public String getLaunchName() {
        return launchName;
    }
    public void setLaunchName(String launchName) {
        this.launchName = launchName;
    }
    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getStatusDesc() {
        return statusDesc;
    }
    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }
    public Long getShopId() {
        return shopId;
    }
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }




    @Override
    public String toString() {
        return "LaunchObj{" + "launchid=" + launchid + "," + "launchName=" + launchName + "," + "shopName=" + shopName + "," + "status=" + status + "," + "statusDesc=" + statusDesc + "," + "shopId=" + shopId + "}";
    }
}
