package com.meituan.sdk.model.waimaiNg.order.zhongbaoShippingfeebycode;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 批量查询跑腿配送费
* This file was automatically generated.
*/
public class ZhongbaoShippingfeebycodeResponse {
    /**
    * 成功列表
    */
    @SerializedName("success_orders")
    private List<ResultData> successOrders;
    /**
    * 失败列表
    */
    @SerializedName("fail_orders")
    private List<FailOrders> failOrders;

    public List<ResultData> getSuccessOrders() {
        return successOrders;
    }
    public void setSuccessOrders(List<ResultData> successOrders) {
        this.successOrders = successOrders;
    }
    public List<FailOrders> getFailOrders() {
        return failOrders;
    }
    public void setFailOrders(List<FailOrders> failOrders) {
        this.failOrders = failOrders;
    }




    @Override
    public String toString() {
        return "ZhongbaoShippingfeebycodeResponse{" + "successOrders=" + successOrders + "," + "failOrders=" + failOrders + "}";
    }
}
