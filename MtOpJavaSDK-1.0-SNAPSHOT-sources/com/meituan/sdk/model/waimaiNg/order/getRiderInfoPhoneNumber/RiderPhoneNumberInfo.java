package com.meituan.sdk.model.waimaiNg.order.getRiderInfoPhoneNumber;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class RiderPhoneNumberInfo {
    /**
    * ERP门店ID
    */
    @NotBlank(message = "ePoiId不能为空")
    @SerializedName("ePoiId")
    private String ePoiId;
    /**
    * 订单Id
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    /**
    * 订单展示Id
    */
    @NotNull(message = "orderIdView不能为空")
    @SerializedName("orderIdView")
    private Long orderIdView;
    /**
    * 骑手名字
    */
    @NotBlank(message = "riderName不能为空")
    @SerializedName("riderName")
    private String riderName;
    /**
    * 骑手真实手机号
    */
    @NotBlank(message = "riderRealPhoneNumber不能为空")
    @SerializedName("riderRealPhoneNumber")
    private String riderRealPhoneNumber;

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
    public String getRiderName() {
        return riderName;
    }
    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }
    public String getRiderRealPhoneNumber() {
        return riderRealPhoneNumber;
    }
    public void setRiderRealPhoneNumber(String riderRealPhoneNumber) {
        this.riderRealPhoneNumber = riderRealPhoneNumber;
    }




    @Override
    public String toString() {
        return "RiderPhoneNumberInfo{" + "ePoiId=" + ePoiId + "," + "orderId=" + orderId + "," + "orderIdView=" + orderIdView + "," + "riderName=" + riderName + "," + "riderRealPhoneNumber=" + riderRealPhoneNumber + "}";
    }
}
