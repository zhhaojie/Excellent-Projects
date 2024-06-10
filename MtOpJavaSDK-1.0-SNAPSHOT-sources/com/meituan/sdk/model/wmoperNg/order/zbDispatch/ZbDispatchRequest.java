package com.meituan.sdk.model.wmoperNg.order.zbDispatch;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 众包配送-发配送
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/order/zbDispatch",
    businessId = 16,
    apiVersion = "10045",
    apiName = "zb_dispatch",
    needAuth = true
)
public class ZbDispatchRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">订单号</font></span></p>
    */
    @NotBlank(message = "orderId不能为空")
    @SerializedName("orderId")
    private String orderId;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">配送费</font></span></p>
    */
    @NotNull(message = "shippingFee不能为空")
    @SerializedName("shippingFee")
    private Double shippingFee;
    /**
    * <p>小费</p>
    */
    @NotNull(message = "tipAmount不能为空")
    @SerializedName("tipAmount")
    private Double tipAmount;
    /**
    * <p>配送优惠券id</p>
    */
    @SerializedName("couponViewId")
    private String couponViewId;
    /**
    * <p>惊喜立减字段</p>
    */
    @SerializedName("reduceDetail")
    private String reduceDetail;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">跑腿配送服务品牌</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">1003-美团跑腿经济送；2011-美团跑腿蛋糕送</font></span>，默认为1003</p>
    */
    @SerializedName("logisticsCode")
    private String logisticsCode;
    /**
    * <p data-diff-id="ct-diff-id-677057d7-63cd-4410-adb3-9cfdd2d80c81">使用权益列表</p><p data-diff-id="ct-diff-id-a6b5cc2d-9d0b-4cc9-a42c-7fb201903bef">众包发配送接口查询返回字段rights_detail_List</p>
    */
    @SerializedName("rightsDetailList")
    private List<RightsDetail> rightsDetailList;

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public Double getShippingFee() {
        return shippingFee;
    }
    public void setShippingFee(Double shippingFee) {
        this.shippingFee = shippingFee;
    }
    public Double getTipAmount() {
        return tipAmount;
    }
    public void setTipAmount(Double tipAmount) {
        this.tipAmount = tipAmount;
    }
    public String getCouponViewId() {
        return couponViewId;
    }
    public void setCouponViewId(String couponViewId) {
        this.couponViewId = couponViewId;
    }
    public String getReduceDetail() {
        return reduceDetail;
    }
    public void setReduceDetail(String reduceDetail) {
        this.reduceDetail = reduceDetail;
    }
    public String getLogisticsCode() {
        return logisticsCode;
    }
    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }
    public List<RightsDetail> getRightsDetailList() {
        return rightsDetailList;
    }
    public void setRightsDetailList(List<RightsDetail> rightsDetailList) {
        this.rightsDetailList = rightsDetailList;
    }


    @Override
    public MeituanResponse<String> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<String>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "ZbDispatchRequest{" + "orderId=" + orderId + "," + "shippingFee=" + shippingFee + "," + "tipAmount=" + tipAmount + "," + "couponViewId=" + couponViewId + "," + "reduceDetail=" + reduceDetail + "," + "logisticsCode=" + logisticsCode + "," + "rightsDetailList=" + rightsDetailList + "}";
    }
}
