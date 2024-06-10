package com.meituan.sdk.model.waimaiNg.order.zbDispatch;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-e25994e6-cfe9-40bc-90f7-880342151b50">费用详细信息</p>
* This file was automatically generated.
*/
public class FeeDetails {
    /**
    * <p data-diff-id="ct-diff-id-1d758ba7-44a5-4c50-880a-a524207aeaeb">折扣金额</p>
    */
    @NotNull(message = "discountValue不能为空")
    @SerializedName("discountValue")
    private Double discountValue;
    /**
    * <p data-diff-id="ct-diff-id-5a7bea35-4d44-41fa-aa7a-6108a0454d76">费用项类型</p>
    */
    @NotBlank(message = "feeType不能为空")
    @SerializedName("feeType")
    private String feeType;
    /**
    * <p data-diff-id="ct-diff-id-fab14e81-bcb2-4d8a-9209-16331041c9c9">费用项价值</p>
    */
    @NotNull(message = "feeValue不能为空")
    @SerializedName("feeValue")
    private Double feeValue;
    /**
    * <p data-diff-id="ct-diff-id-68ff98f2-3f0c-4ecb-a483-46d4c9486475">设置抵扣金额</p>
    */
    @SerializedName("setDiscountValue")
    private Boolean setDiscountValue;
    /**
    * <p data-diff-id="ct-diff-id-31ff1556-df81-4564-92d7-b16a04b3d2c7">设置费用类型</p>
    */
    @SerializedName("setFeeType")
    private Boolean setFeeType;
    /**
    * <p data-diff-id="ct-diff-id-32baa15d-7781-4a3e-960d-9fcc3cce36b1">设置费用值</p>
    */
    @SerializedName("setFeeValue")
    private Boolean setFeeValue;

    public Double getDiscountValue() {
        return discountValue;
    }
    public void setDiscountValue(Double discountValue) {
        this.discountValue = discountValue;
    }
    public String getFeeType() {
        return feeType;
    }
    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }
    public Double getFeeValue() {
        return feeValue;
    }
    public void setFeeValue(Double feeValue) {
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
        return "FeeDetails{" + "discountValue=" + discountValue + "," + "feeType=" + feeType + "," + "feeValue=" + feeValue + "," + "setDiscountValue=" + setDiscountValue + "," + "setFeeType=" + setFeeType + "," + "setFeeValue=" + setFeeValue + "}";
    }
}
