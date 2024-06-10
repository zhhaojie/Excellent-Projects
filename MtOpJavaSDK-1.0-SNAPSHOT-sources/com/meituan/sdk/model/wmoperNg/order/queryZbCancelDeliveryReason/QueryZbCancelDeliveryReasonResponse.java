package com.meituan.sdk.model.wmoperNg.order.queryZbCancelDeliveryReason;

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
    * 消息
    */
    @SerializedName("msg")
    private String msg;
    /**
    * 返回原因标题
    */
    @SerializedName("title")
    private String title;
    /**
    * 配送状态
    */
    @SerializedName("deliveryStatus")
    private Integer deliveryStatus;
    @SerializedName("reasonList")
    private List<Reasonlist> reasonList;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getDeliveryStatus() {
        return deliveryStatus;
    }
    public void setDeliveryStatus(Integer deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
    public List<Reasonlist> getReasonList() {
        return reasonList;
    }
    public void setReasonList(List<Reasonlist> reasonList) {
        this.reasonList = reasonList;
    }




    @Override
    public String toString() {
        return "QueryZbCancelDeliveryReasonResponse{" + "code=" + code + "," + "msg=" + msg + "," + "title=" + title + "," + "deliveryStatus=" + deliveryStatus + "," + "reasonList=" + reasonList + "}";
    }
}
