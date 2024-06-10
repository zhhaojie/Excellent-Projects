package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiService;

import com.google.gson.annotations.SerializedName;

/**
* 团购配送门店服务接口，用于获取门店信息
* This file was automatically generated.
*/
public class GroupDeliveryPoiServiceResponse {
    /**
    * 授权实体标识
    */
    @SerializedName("opBizCode")
    private String opBizCode;
    /**
    * 授权实体名称
    */
    @SerializedName("name")
    private String name;

    public String getOpBizCode() {
        return opBizCode;
    }
    public void setOpBizCode(String opBizCode) {
        this.opBizCode = opBizCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }




    @Override
    public String toString() {
        return "GroupDeliveryPoiServiceResponse{" + "opBizCode=" + opBizCode + "," + "name=" + name + "}";
    }
}
