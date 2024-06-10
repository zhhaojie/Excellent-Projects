package com.meituan.sdk.model.dcps.fulfill.groupbuyOrderDetail;

import com.google.gson.annotations.SerializedName;

/**
* 套餐配送-订单详情
* This file was automatically generated.
*/
public class GroupbuyOrderDetailResponse {
    @SerializedName("status")
    private Integer status;
    @SerializedName("quantity")
    private Integer quantity;

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }




    @Override
    public String toString() {
        return "GroupbuyOrderDetailResponse{" + "status=" + status + "," + "quantity=" + quantity + "}";
    }
}
