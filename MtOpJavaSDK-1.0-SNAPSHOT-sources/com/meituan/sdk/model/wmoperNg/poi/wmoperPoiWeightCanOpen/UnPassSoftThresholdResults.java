package com.meituan.sdk.model.wmoperNg.poi.wmoperPoiWeightCanOpen;

import com.google.gson.annotations.SerializedName;

/**
* 未通过软性门槛
* This file was automatically generated.
*/
public class UnPassSoftThresholdResults {
    /**
    * 未通过的软性门槛code（-1是否配置了门店活动）
    */
    @SerializedName("code")
    private Integer code;
    /**
    * 未通过的软性门槛描述文案（对于code只有是/否两种取值范围的，如-1，没有描述文案）
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
        return "UnPassSoftThresholdResults{" + "code=" + code + "," + "remark=" + remark + "}";
    }
}
