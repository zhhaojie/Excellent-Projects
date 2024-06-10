package com.meituan.sdk.model.wmoperNg.waimaiad.waimaiPoiInfo;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 获取商家基本信息
* This file was automatically generated.
*/
public class WaimaiPoiInfoResponse {
    @NotNull(message = "result不能为空")
    @SerializedName("result")
    private Result result;
    @NotNull(message = "wmPoiInfo不能为空")
    @SerializedName("wmPoiInfo")
    private WmPoiInfo wmPoiInfo;

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }
    public WmPoiInfo getWmPoiInfo() {
        return wmPoiInfo;
    }
    public void setWmPoiInfo(WmPoiInfo wmPoiInfo) {
        this.wmPoiInfo = wmPoiInfo;
    }




    @Override
    public String toString() {
        return "WaimaiPoiInfoResponse{" + "result=" + result + "," + "wmPoiInfo=" + wmPoiInfo + "}";
    }
}
