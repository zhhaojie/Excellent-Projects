package com.meituan.sdk.model.peisong.order.h5url;

import com.google.gson.annotations.SerializedName;

/**
* 获取骑手位置H5
* This file was automatically generated.
*/
public class H5urlResponse {
    /**
    * 骑手位置 H5 URL。跑腿帮送服务包返回的H5链接中，订单完成8小时后则不再展示骑手位置信息，其他服务包返回的H5链接中，订单完成24小时后则不再展示骑手位置信息；美配会根据访问流量进行时段控制。
    */
    @SerializedName("riderLocationUrl")
    private String riderLocationUrl;

    public String getRiderLocationUrl() {
        return riderLocationUrl;
    }
    public void setRiderLocationUrl(String riderLocationUrl) {
        this.riderLocationUrl = riderLocationUrl;
    }




    @Override
    public String toString() {
        return "H5urlResponse{" + "riderLocationUrl=" + riderLocationUrl + "}";
    }
}
