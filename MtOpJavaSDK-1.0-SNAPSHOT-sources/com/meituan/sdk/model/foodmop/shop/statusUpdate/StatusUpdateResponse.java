package com.meituan.sdk.model.foodmop.shop.statusUpdate;

import com.google.gson.annotations.SerializedName;

/**
* 品牌同步门店线上点业务开通状态变更
* This file was automatically generated.
*/
public class StatusUpdateResponse {
    /**
    * Key：vendorShopId（品牌门店Id） Value：OperateResulst（数据校验结果）
    */
    @SerializedName("data")
    private DataMap data;

    public DataMap getData() {
        return data;
    }
    public void setData(DataMap data) {
        this.data = data;
    }




    @Override
    public String toString() {
        return "StatusUpdateResponse{" + "data=" + data + "}";
    }
}
