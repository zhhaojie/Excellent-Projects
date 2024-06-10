package com.meituan.sdk.model.waimaiNg.order.queryOrderReceiptActivityInfo;

import com.google.gson.annotations.SerializedName;

/**
* 该sku参与的所有活动情况
* This file was automatically generated.
*/
public class Activities {
    /**
    * 活动名称
    */
    @SerializedName("name")
    private String name;
    /**
    * 活动类型id
    */
    @SerializedName("type")
    private Integer type;
    /**
    * 该活动上非商家承担
    */
    @SerializedName("mt_charge")
    private Double mtCharge;
    /**
    * 该活动上商家承担
    */
    @SerializedName("poi_charge")
    private Double poiCharge;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
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




    @Override
    public String toString() {
        return "Activities{" + "name=" + name + "," + "type=" + type + "," + "mtCharge=" + mtCharge + "," + "poiCharge=" + poiCharge + "}";
    }
}
