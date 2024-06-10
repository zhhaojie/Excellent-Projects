package com.meituan.sdk.model.wmoperNg.order.wmoperOrderQueryOrderDetail;

import com.google.gson.annotations.SerializedName;

/**
* 活动信息
* This file was automatically generated.
*/
public class Activity {
    /**
    * 活动ID
    */
    @SerializedName("act_detail_id")
    private Integer actDetailId;
    /**
    * 优惠金额中美团承担的部分
    */
    @SerializedName("mt_charge")
    private Double mtCharge;
    /**
    * 优惠金额中商家承担的部分
    */
    @SerializedName("poi_charge")
    private Double poiCharge;
    /**
    * 该活动用户实际享受优惠金额
    */
    @SerializedName("reduce_fee")
    private Double reduceFee;
    /**
    * 优惠说明
    */
    @SerializedName("remark")
    private String remark;
    /**
    * 活动类型
    */
    @SerializedName("type")
    private Integer type;

    public Integer getActDetailId() {
        return actDetailId;
    }
    public void setActDetailId(Integer actDetailId) {
        this.actDetailId = actDetailId;
    }
    public Double getMtCharge() {
        return mtCharge;
    }
    public void setMtCharge(Double mtCharge) {
        this.mtCharge = mtCharge;
    }
    public Double getPoiCharge() {
        return poiCharge;
    }
    public void setPoiCharge(Double poiCharge) {
        this.poiCharge = poiCharge;
    }
    public Double getReduceFee() {
        return reduceFee;
    }
    public void setReduceFee(Double reduceFee) {
        this.reduceFee = reduceFee;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }




    @Override
    public String toString() {
        return "Activity{" + "actDetailId=" + actDetailId + "," + "mtCharge=" + mtCharge + "," + "poiCharge=" + poiCharge + "," + "reduceFee=" + reduceFee + "," + "remark=" + remark + "," + "type=" + type + "}";
    }
}
