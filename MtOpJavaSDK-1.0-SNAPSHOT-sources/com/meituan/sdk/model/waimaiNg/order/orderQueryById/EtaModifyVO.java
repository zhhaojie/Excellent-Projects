package com.meituan.sdk.model.waimaiNg.order.orderQueryById;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class EtaModifyVO {
    /**
    * 发起申请时间
    */
    @SerializedName("ueta_ctime")
    private Integer uetaCtime;
    /**
    * 用户申请修改eta时间
    */
    @SerializedName("ueta_time")
    private Integer uetaTime;
    /**
    * 截止时间
    */
    @SerializedName("ueta_expire")
    private Integer uetaExpire;
    /**
    * 审核状态ueta_status 1.申请，2.通过，3.商家拒绝，4.超时未处理，5.订单完成或取消自动拒绝 6.订单处于退款中自动拒绝 7.商家点击平台原因拒绝（骑手已接单、骑手已到店、骑手已取餐、骑手已送达）8.商家点击平台原因拒绝（跑腿自动锁单状态）9.商家点击平台原因拒绝（专人直送）)
    */
    @SerializedName("ueta_status")
    private Integer uetaStatus;

    public Integer getUetaCtime() {
        return uetaCtime;
    }
    public void setUetaCtime(Integer uetaCtime) {
        this.uetaCtime = uetaCtime;
    }
    public Integer getUetaTime() {
        return uetaTime;
    }
    public void setUetaTime(Integer uetaTime) {
        this.uetaTime = uetaTime;
    }
    public Integer getUetaExpire() {
        return uetaExpire;
    }
    public void setUetaExpire(Integer uetaExpire) {
        this.uetaExpire = uetaExpire;
    }
    public Integer getUetaStatus() {
        return uetaStatus;
    }
    public void setUetaStatus(Integer uetaStatus) {
        this.uetaStatus = uetaStatus;
    }




    @Override
    public String toString() {
        return "EtaModifyVO{" + "uetaCtime=" + uetaCtime + "," + "uetaTime=" + uetaTime + "," + "uetaExpire=" + uetaExpire + "," + "uetaStatus=" + uetaStatus + "}";
    }
}
