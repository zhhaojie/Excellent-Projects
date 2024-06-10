package com.meituan.sdk.model.wmoperNg.order.wmoperngQueryOrderDetail;

import com.google.gson.annotations.SerializedName;

/**
* 活动信息 List类型
* This file was automatically generated.
*/
public class Activity {
    /**
    * 优惠金额中美团承担的部分
    */
    @SerializedName("mtCharge")
    private Double mtCharge;
    /**
    * 说明
    */
    @SerializedName("remark")
    private String remark;
    /**
    * 优惠金额中商家承担的部分
    */
    @SerializedName("poiCharge")
    private Double poiCharge;
    /**
    * 活动ID
    */
    @SerializedName("actDetailId")
    private Long actDetailId;
    /**
    * 活动类型
    */
    @SerializedName("type")
    private Integer type;
    /**
    * 该活动用户实际享受优惠金额
    */
    @SerializedName("reduceFee")
    private Double reduceFee;
    /**
    * 顾客预先支付金额，顾客已经提前支付的神抢手券
    */
    @SerializedName("consumer_prepay")
    private Float consumerPrepay;

    public Double getMtCharge() {
        return mtCharge;
    }
    public void setMtCharge(Double mtCharge) {
        this.mtCharge = mtCharge;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Double getPoiCharge() {
        return poiCharge;
    }
    public void setPoiCharge(Double poiCharge) {
        this.poiCharge = poiCharge;
    }
    public Long getActDetailId() {
        return actDetailId;
    }
    public void setActDetailId(Long actDetailId) {
        this.actDetailId = actDetailId;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public Double getReduceFee() {
        return reduceFee;
    }
    public void setReduceFee(Double reduceFee) {
        this.reduceFee = reduceFee;
    }
    public Float getConsumerPrepay() {
        return consumerPrepay;
    }
    public void setConsumerPrepay(Float consumerPrepay) {
        this.consumerPrepay = consumerPrepay;
    }




    @Override
    public String toString() {
        return "Activity{" + "mtCharge=" + mtCharge + "," + "remark=" + remark + "," + "poiCharge=" + poiCharge + "," + "actDetailId=" + actDetailId + "," + "type=" + type + "," + "reduceFee=" + reduceFee + "," + "consumerPrepay=" + consumerPrepay + "}";
    }
}
