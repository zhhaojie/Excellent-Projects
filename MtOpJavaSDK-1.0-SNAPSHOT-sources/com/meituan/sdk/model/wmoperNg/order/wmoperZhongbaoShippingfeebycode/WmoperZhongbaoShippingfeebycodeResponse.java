package com.meituan.sdk.model.wmoperNg.order.wmoperZhongbaoShippingfeebycode;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 批量查询跑腿配送费
* This file was automatically generated.
*/
public class WmoperZhongbaoShippingfeebycodeResponse {
    /**
    * 成功列表
    */
    @SerializedName("success_orders")
    private List<SuccessOrders> successOrders;
    /**
    * 失败列表
    */
    @SerializedName("fail_orders")
    private List<FailOrders> failOrders;

    public List<SuccessOrders> getSuccessOrders() {
        return successOrders;
    }
    public void setSuccessOrders(List<SuccessOrders> successOrders) {
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
        return "WmoperZhongbaoShippingfeebycodeResponse{" + "successOrders=" + successOrders + "," + "failOrders=" + failOrders + "}";
    }
}
