package com.meituan.sdk.model.ad.launch.batchEditCpcBidprice;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 修改推广出价
* This file was automatically generated.
*/
public class BatchEditCpcBidpriceResponse {
    /**
    * 成功的推广列表
    */
    @SerializedName("successLaunchs")
    private List<Long> successLaunchs;
    /**
    * 创建失败的推广map，key为原因，value为推广列表
    */
    @SerializedName("failLaunchs")
    private FailLaunch failLaunchs;

    public List<Long> getSuccessLaunchs() {
        return successLaunchs;
    }
    public void setSuccessLaunchs(List<Long> successLaunchs) {
        this.successLaunchs = successLaunchs;
    }
    public FailLaunch getFailLaunchs() {
        return failLaunchs;
    }
    public void setFailLaunchs(FailLaunch failLaunchs) {
        this.failLaunchs = failLaunchs;
    }




    @Override
    public String toString() {
        return "BatchEditCpcBidpriceResponse{" + "successLaunchs=" + successLaunchs + "," + "failLaunchs=" + failLaunchs + "}";
    }
}
