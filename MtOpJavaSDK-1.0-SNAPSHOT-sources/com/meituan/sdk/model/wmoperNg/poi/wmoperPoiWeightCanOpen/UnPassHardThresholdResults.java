package com.meituan.sdk.model.wmoperNg.poi.wmoperPoiWeightCanOpen;

import com.google.gson.annotations.SerializedName;

/**
* 未通过硬性门槛
* This file was automatically generated.
*/
public class UnPassHardThresholdResults {
    /**
    * 未通过的硬性门槛code（1商品信息 2是否支持在线支付 3是否营业 4营业时长 5是否有完整资质）
    */
    @SerializedName("code")
    private Integer code;
    /**
    * 未通过的硬性门槛描述文案（对于code只有是/否两种取值范围的，如2、3、5，没有描述文案）
    */
    @SerializedName("remark")
    private String remark;

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }




    @Override
    public String toString() {
        return "UnPassHardThresholdResults{" + "code=" + code + "," + "remark=" + remark + "}";
    }
}
