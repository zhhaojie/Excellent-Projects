package com.meituan.sdk.model.wmoperNg.order.wmoperngQueryOrderDetail;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class EtaModifyVO {
    /**
    * 发起申请时间
    */
    @SerializedName("uetaCtime")
    private Integer uetaCtime;
    /**
    * 用户申请修改eta时间
    */
    @SerializedName("uetaTime")
    private Integer uetaTime;
    /**
    * 截止时间
    */
    @SerializedName("uetaExpire")
    private Integer uetaExpire;
    /**
    * 审核状态ueta_status
    */
    @SerializedName("uetaStatus")
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
