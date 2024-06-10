package com.meituan.sdk.model.waimaiNg.order.queryZbCancelDeliveryReason;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 获取订单可以取消跑腿的原因
* This file was automatically generated.
*/
public class QueryZbCancelDeliveryReasonResponse {
    /**
    * 状态码
    */
    @SerializedName("code")
    private String code;
    /**
    * 配送状态
    */
    @SerializedName("deliveryStatus")
    private Integer deliveryStatus;
    /**
    * 消息
    */
    @SerializedName("msg")
    private String msg;
    /**
    * 原因列表
    */
    @SerializedName("reasonList")
    private List<ReasonList> reasonList;
    /**
    * 返回原因标题
    */
    @SerializedName("title")
    private String title;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Integer getDeliveryStatus() {
        return deliveryStatus;
    }
    public void setDeliveryStatus(Integer deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public List<ReasonList> getReasonList() {
        return reasonList;
    }
    public void setReasonList(List<ReasonList> reasonList) {
        this.reasonList = reasonList;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }




    @Override
    public String toString() {
        return "QueryZbCancelDeliveryReasonResponse{" + "code=" + code + "," + "deliveryStatus=" + deliveryStatus + "," + "msg=" + msg + "," + "reasonList=" + reasonList + "," + "title=" + title + "}";
    }
}
