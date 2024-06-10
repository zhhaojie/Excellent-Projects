package com.meituan.sdk.model.wmoperNg.waimaiad.adDmpQueryCrowdBid;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 获取三方人群包出价
* This file was automatically generated.
*/
public class AdDmpQueryCrowdBidResponse {
    @SerializedName("result")
    private Result result;
    /**
    * 出价信息
    */
    @SerializedName("orientInfoList")
    private List<ADOrientInfo> orientInfoList;

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }
    public List<ADOrientInfo> getOrientInfoList() {
        return orientInfoList;
    }
    public void setOrientInfoList(List<ADOrientInfo> orientInfoList) {
        this.orientInfoList = orientInfoList;
    }




    @Override
    public String toString() {
        return "AdDmpQueryCrowdBidResponse{" + "result=" + result + "," + "orientInfoList=" + orientInfoList + "}";
    }
}
