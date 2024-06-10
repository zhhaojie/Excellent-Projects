package com.meituan.sdk.model.tuangouNg.groupVoucher.groupvoucherShopManage;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class Data {
    /**
    * 时间戳
    */
    @SerializedName("timeStamp")
    private Long timeStamp;
    /**
    * 是否成功：true成功 false失败
    */
    @SerializedName("result")
    private Boolean result;
    /**
    * 厂商ID
    */
    @SerializedName("vendorId")
    private String vendorId;
    /**
    * 美团门店ID
    */
    @SerializedName("mtShopId")
    private Long mtShopId;
    /**
    * 开通状态:0未合作1开通2关闭
    */
    @SerializedName("status")
    private Long status;

    public Long getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }
    public Boolean getResult() {
        return result;
    }
    public void setResult(Boolean result) {
        this.result = result;
    }
    public String getVendorId() {
        return vendorId;
    }
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }
    public Long getMtShopId() {
        return mtShopId;
    }
    public void setMtShopId(Long mtShopId) {
        this.mtShopId = mtShopId;
    }
    public Long getStatus() {
        return status;
    }
    public void setStatus(Long status) {
        this.status = status;
    }




    @Override
    public String toString() {
        return "Data{" + "timeStamp=" + timeStamp + "," + "result=" + result + "," + "vendorId=" + vendorId + "," + "mtShopId=" + mtShopId + "," + "status=" + status + "}";
    }
}
