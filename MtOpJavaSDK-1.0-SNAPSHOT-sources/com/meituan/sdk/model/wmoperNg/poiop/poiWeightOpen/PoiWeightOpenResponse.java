package com.meituan.sdk.model.wmoperNg.poiop.poiWeightOpen;

import com.google.gson.annotations.SerializedName;

/**
* 门店开启加权
* This file was automatically generated.
*/
public class PoiWeightOpenResponse {
    /**
    * 开启是否成功
    */
    @SerializedName("status")
    private Boolean status;
    /**
    * 开启失败文案
    */
    @SerializedName("remark")
    private String remark;

    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }




    @Override
    public String toString() {
        return "PoiWeightOpenResponse{" + "status=" + status + "," + "remark=" + remark + "}";
    }
}
