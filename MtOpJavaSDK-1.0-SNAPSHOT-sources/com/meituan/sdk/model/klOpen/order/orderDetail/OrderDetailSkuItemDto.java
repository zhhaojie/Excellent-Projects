package com.meituan.sdk.model.klOpen.order.orderDetail;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class OrderDetailSkuItemDto {
    @SerializedName("orderId")
    private String orderId;
    @SerializedName("skuCode")
    private Integer skuCode;
    @SerializedName("skuName")
    private String skuName;
    @SerializedName("specificationsDes")
    private String specificationsDes;
    @SerializedName("unit")
    private String unit;
    @SerializedName("price")
    private String price;
    @SerializedName("quantity")
    private Integer quantity;
    @SerializedName("deliveryQuantity")
    private Integer deliveryQuantity;
    @SerializedName("differenceAmount")
    private String differenceAmount;
    @SerializedName("differenceWeight")
    private String differenceWeight;
    @SerializedName("signWeight")
    private String signWeight;
    @SerializedName("estimateWeight")
    private String estimateWeight;
    @SerializedName("skuTicketDetailDtoList")
    private List<SkuTicketDetailDto> skuTicketDetailDtoList;

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public Integer getSkuCode() {
        return skuCode;
    }
    public void setSkuCode(Integer skuCode) {
        this.skuCode = skuCode;
    }
    public String getSkuName() {
        return skuName;
    }
    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }
    public String getSpecificationsDes() {
        return specificationsDes;
    }
    public void setSpecificationsDes(String specificationsDes) {
        this.specificationsDes = specificationsDes;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Integer getDeliveryQuantity() {
        return deliveryQuantity;
    }
    public void setDeliveryQuantity(Integer deliveryQuantity) {
        this.deliveryQuantity = deliveryQuantity;
    }
    public String getDifferenceAmount() {
        return differenceAmount;
    }
    public void setDifferenceAmount(String differenceAmount) {
        this.differenceAmount = differenceAmount;
    }
    public String getDifferenceWeight() {
        return differenceWeight;
    }
    public void setDifferenceWeight(String differenceWeight) {
        this.differenceWeight = differenceWeight;
    }
    public String getSignWeight() {
        return signWeight;
    }
    public void setSignWeight(String signWeight) {
        this.signWeight = signWeight;
    }
    public String getEstimateWeight() {
        return estimateWeight;
    }
    public void setEstimateWeight(String estimateWeight) {
        this.estimateWeight = estimateWeight;
    }
    public List<SkuTicketDetailDto> getSkuTicketDetailDtoList() {
        return skuTicketDetailDtoList;
    }
    public void setSkuTicketDetailDtoList(List<SkuTicketDetailDto> skuTicketDetailDtoList) {
        this.skuTicketDetailDtoList = skuTicketDetailDtoList;
    }




    @Override
    public String toString() {
        return "OrderDetailSkuItemDto{" + "orderId=" + orderId + "," + "skuCode=" + skuCode + "," + "skuName=" + skuName + "," + "specificationsDes=" + specificationsDes + "," + "unit=" + unit + "," + "price=" + price + "," + "quantity=" + quantity + "," + "deliveryQuantity=" + deliveryQuantity + "," + "differenceAmount=" + differenceAmount + "," + "differenceWeight=" + differenceWeight + "," + "signWeight=" + signWeight + "," + "estimateWeight=" + estimateWeight + "," + "skuTicketDetailDtoList=" + skuTicketDetailDtoList + "}";
    }
}
