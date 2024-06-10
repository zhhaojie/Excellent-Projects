package com.meituan.sdk.model.wmoperNg.im.getPoiImStatus;

import com.google.gson.annotations.SerializedName;

/**
* 查询门店IM状态
* This file was automatically generated.
*/
public class GetPoiImStatusResponse {
    /**
    * ERP 应用标识
    */
    @SerializedName("app_id")
    private Long appId;
    /**
    * ERP 商户门店id
    */
    @SerializedName("epoiId")
    private String epoiId;
    /**
    * 0:关闭, 1:开启
    */
    @SerializedName("im_status")
    private Integer imStatus;

    public Long getAppId() {
        return appId;
    }
    public void setAppId(Long appId) {
        this.appId = appId;
    }
    public String getEpoiId() {
        return epoiId;
    }
    public void setEpoiId(String epoiId) {
        this.epoiId = epoiId;
    }
    public Integer getImStatus() {
        return imStatus;
    }
    public void setImStatus(Integer imStatus) {
        this.imStatus = imStatus;
    }




    @Override
    public String toString() {
        return "GetPoiImStatusResponse{" + "appId=" + appId + "," + "epoiId=" + epoiId + "," + "imStatus=" + imStatus + "}";
    }
}
