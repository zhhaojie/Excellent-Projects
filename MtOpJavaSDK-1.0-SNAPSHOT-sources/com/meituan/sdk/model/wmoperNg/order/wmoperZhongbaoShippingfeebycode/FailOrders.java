package com.meituan.sdk.model.wmoperNg.order.wmoperZhongbaoShippingfeebycode;

import com.google.gson.annotations.SerializedName;

/**
* 失败列表
* This file was automatically generated.
*/
public class FailOrders {
    /**
    * 订单ID
    */
    @SerializedName("wm_order_id")
    private Long wmOrderId;
    /**
    * 错误原因
    */
    @SerializedName("error_msg")
    private String errorMsg;

    public Long getWmOrderId() {
        return wmOrderId;
    }
    public void setWmOrderId(Long wmOrderId) {
        this.wmOrderId = wmOrderId;
    }
    public String getErrorMsg() {
        return errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }




    @Override
    public String toString() {
        return "FailOrders{" + "wmOrderId=" + wmOrderId + "," + "errorMsg=" + errorMsg + "}";
    }
}
