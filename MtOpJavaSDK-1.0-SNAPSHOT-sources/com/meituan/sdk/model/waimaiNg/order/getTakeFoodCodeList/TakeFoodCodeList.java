package com.meituan.sdk.model.waimaiNg.order.getTakeFoodCodeList;

import com.google.gson.annotations.SerializedName;

/**
* 取餐码标签列表
* This file was automatically generated.
*/
public class TakeFoodCodeList {
    /**
    * 取餐码
    */
    @SerializedName("takeFoodCode")
    private String takeFoodCode;
    /**
    * 识别码
    */
    @SerializedName("identCode")
    private String identCode;
    /**
    * 收餐人姓名
    */
    @SerializedName("recipientName")
    private String recipientName;
    /**
    * 收餐电话
    */
    @SerializedName("recipientPhone")
    private String recipientPhone;
    /**
    * 菜品名称
    */
    @SerializedName("foodName")
    private String foodName;
    /**
    * 商家名称
    */
    @SerializedName("poiName")
    private String poiName;
    /**
    * 收餐地址
    */
    @SerializedName("recipientAddress")
    private String recipientAddress;
    /**
    * 送达时间
    */
    @SerializedName("estimatedDeliveryTime")
    private String estimatedDeliveryTime;

    public String getTakeFoodCode() {
        return takeFoodCode;
    }
    public void setTakeFoodCode(String takeFoodCode) {
        this.takeFoodCode = takeFoodCode;
    }
    public String getIdentCode() {
        return identCode;
    }
    public void setIdentCode(String identCode) {
        this.identCode = identCode;
    }
    public String getRecipientName() {
        return recipientName;
    }
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }
    public String getRecipientPhone() {
        return recipientPhone;
    }
    public void setRecipientPhone(String recipientPhone) {
        this.recipientPhone = recipientPhone;
    }
    public String getFoodName() {
        return foodName;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public String getPoiName() {
        return poiName;
    }
    public void setPoiName(String poiName) {
        this.poiName = poiName;
    }
    public String getRecipientAddress() {
        return recipientAddress;
    }
    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }
    public String getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }
    public void setEstimatedDeliveryTime(String estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }




    @Override
    public String toString() {
        return "TakeFoodCodeList{" + "takeFoodCode=" + takeFoodCode + "," + "identCode=" + identCode + "," + "recipientName=" + recipientName + "," + "recipientPhone=" + recipientPhone + "," + "foodName=" + foodName + "," + "poiName=" + poiName + "," + "recipientAddress=" + recipientAddress + "," + "estimatedDeliveryTime=" + estimatedDeliveryTime + "}";
    }
}
