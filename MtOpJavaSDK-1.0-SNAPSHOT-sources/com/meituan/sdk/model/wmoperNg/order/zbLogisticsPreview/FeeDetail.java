package com.meituan.sdk.model.wmoperNg.order.zbLogisticsPreview;

import com.google.gson.annotations.SerializedName;

/**
* 费用详细信息
* This file was automatically generated.
*/
public class FeeDetail {
    /**
    * 抵扣金额
    */
    @SerializedName("discountValue")
    private Integer discountValue;
    /**
    * 费用项类型
    */
    @SerializedName("feeType")
    private String feeType;
    /**
    * 费用项价值
    */
    @SerializedName("feeValue")
    private Integer feeValue;
    /**
    * 设置抵扣金额
    */
    @SerializedName("setDiscountValue")
    private Boolean setDiscountValue;
    /**
    * 设置费用类型
    */
    @SerializedName("setFeeType")
    private Boolean setFeeType;
    /**
    * 设置费用值
    */
    @SerializedName("setFeeValue")
    private Boolean setFeeValue;

    public Integer getDiscountValue() {
        return discountValue;
    }
    public void setDiscountValue(Integer discountValue) {
        this.discountValue = discountValue;
    }
    public String getFeeType() {
        return feeType;
    }
    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }
    public Integer getFeeValue() {
        return feeValue;
    }
    public void setFeeValue(Integer feeValue) {
        this.feeValue = feeValue;
    }
    public Boolean getSetDiscountValue() {
        return setDiscountValue;
    }
    public void setSetDiscountValue(Boolean setDiscountValue) {
        this.setDiscountValue = setDiscountValue;
    }
    public Boolean getSetFeeType() {
        return setFeeType;
    }
    public void setSetFeeType(Boolean setFeeType) {
        this.setFeeType = setFeeType;
    }
    public Boolean getSetFeeValue() {
        return setFeeValue;
    }
    public void setSetFeeValue(Boolean setFeeValue) {
        this.setFeeValue = setFeeValue;
    }




    @Override
    public String toString() {
        return "FeeDetail{" + "discountValue=" + discountValue + "," + "feeType=" + feeType + "," + "feeValue=" + feeValue + "," + "setDiscountValue=" + setDiscountValue + "," + "setFeeType=" + setFeeType + "," + "setFeeValue=" + setFeeValue + "}";
    }
}
