package com.meituan.sdk.model.ad.launch.batchCreateCpcLaunchs;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 新建推广
* This file was automatically generated.
*/
public class BatchCreateCpcLaunchsResponse {
    /**
    * 成功的门店列表
    */
    @SerializedName("successShops")
    private List<Long> successShops;
    /**
    * 创建失败的门店map，key为原因，value为门店列表
    */
    @SerializedName("failShops")
    private FailShop failShops;

    public List<Long> getSuccessShops() {
        return successShops;
    }
    public void setSuccessShops(List<Long> successShops) {
        this.successShops = successShops;
    }
    public FailShop getFailShops() {
        return failShops;
    }
    public void setFailShops(FailShop failShops) {
        this.failShops = failShops;
    }




    @Override
    public String toString() {
        return "BatchCreateCpcLaunchsResponse{" + "successShops=" + successShops + "," + "failShops=" + failShops + "}";
    }
}
