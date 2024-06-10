package com.meituan.sdk.model.waimaiNg.order.batchPullPhoneNumber;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class PhoneNumberInfo {
    /**
    * 门店下的订单流水号
    */
    @SerializedName("daySeq")
    private Integer daySeq;
    /**
    * ERP门店ID 请求参数不传appAuthToken信息，默认拉取开发者下所有未完成订单时，会返回该字段
    */
    @SerializedName("ePoiId")
    private String ePoiId;
    /**
    * 订单号
    */
    @SerializedName("orderId")
    private Long orderId;
    /**
    * 订单展示号
    */
    @SerializedName("orderIdView")
    private Long orderIdView;
    /**
    * 真实手机号
    */
    @SerializedName("realPhoneNumber")
    private String realPhoneNumber;
    /**
    * 骑手名字
    */
    @SerializedName("riderName")
    private String riderName;

    public Integer getDaySeq() {
        return daySeq;
    }
    public void setDaySeq(Integer daySeq) {
        this.daySeq = daySeq;
    }
    public String getEPoiId() {
        return ePoiId;
    }
    public void setEPoiId(String ePoiId) {
        this.ePoiId = ePoiId;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Long getOrderIdView() {
        return orderIdView;
    }
    public void setOrderIdView(Long orderIdView) {
        this.orderIdView = orderIdView;
    }
    public String getRealPhoneNumber() {
        return realPhoneNumber;
    }
    public void setRealPhoneNumber(String realPhoneNumber) {
        this.realPhoneNumber = realPhoneNumber;
    }
    public String getRiderName() {
        return riderName;
    }
    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }




    @Override
    public String toString() {
        return "PhoneNumberInfo{" + "daySeq=" + daySeq + "," + "ePoiId=" + ePoiId + "," + "orderId=" + orderId + "," + "orderIdView=" + orderIdView + "," + "realPhoneNumber=" + realPhoneNumber + "," + "riderName=" + riderName + "}";
    }
}
