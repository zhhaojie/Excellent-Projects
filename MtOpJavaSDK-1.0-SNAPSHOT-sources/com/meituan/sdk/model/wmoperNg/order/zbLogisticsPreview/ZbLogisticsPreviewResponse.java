package com.meituan.sdk.model.wmoperNg.order.zbLogisticsPreview;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 查询众包配送费
* This file was automatically generated.
*/
public class ZbLogisticsPreviewResponse {
    /**
    * 订单id
    */
    @SerializedName("wm_order_id")
    private Long wmOrderId;
    /**
    * 配送费（基础+临时）
    */
    @SerializedName("shipping_fee")
    private Double shippingFee;
    /**
    * 配送费备注，浮动价格XX元
    */
    @SerializedName("shipping_tips")
    private String shippingTips;
    /**
    * 实付金额（基础-优惠-活动+临时加价+小费）
    */
    @SerializedName("pay_amount")
    private Double payAmount;
    /**
    * 配送费优惠券id
    */
    @SerializedName("coupon_view_id")
    private String couponViewId;
    /**
    * 优惠券名称
    */
    @SerializedName("coupon_name")
    private String couponName;
    /**
    * 优惠券金额
    */
    @SerializedName("coupon_amount")
    private Double couponAmount;
    /**
    * 配送距离
    */
    @SerializedName("distance")
    private Integer distance;
    @NotNull(message = "couponSource不能为空")
    @SerializedName("coupon_source")
    private Long couponSource;
    @SerializedName("reduce_detail")
    private WmUserTaskBMLDetail reduceDetail;
    /**
    * 跑腿溢价权益列表 请求参数recommendRights传true返回
    */
    @SerializedName("rights_detail_list")
    private List<RightsDetail> rightsDetailList;

    public Long getWmOrderId() {
        return wmOrderId;
    }
    public void setWmOrderId(Long wmOrderId) {
        this.wmOrderId = wmOrderId;
    }
    public Double getShippingFee() {
        return shippingFee;
    }
    public void setShippingFee(Double shippingFee) {
        this.shippingFee = shippingFee;
    }
    public String getShippingTips() {
        return shippingTips;
    }
    public void setShippingTips(String shippingTips) {
        this.shippingTips = shippingTips;
    }
    public Double getPayAmount() {
        return payAmount;
    }
    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }
    public String getCouponViewId() {
        return couponViewId;
    }
    public void setCouponViewId(String couponViewId) {
        this.couponViewId = couponViewId;
    }
    public String getCouponName() {
        return couponName;
    }
    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }
    public Double getCouponAmount() {
        return couponAmount;
    }
    public void setCouponAmount(Double couponAmount) {
        this.couponAmount = couponAmount;
    }
    public Integer getDistance() {
        return distance;
    }
    public void setDistance(Integer distance) {
        this.distance = distance;
    }
    public Long getCouponSource() {
        return couponSource;
    }
    public void setCouponSource(Long couponSource) {
        this.couponSource = couponSource;
    }
    public WmUserTaskBMLDetail getReduceDetail() {
        return reduceDetail;
    }
    public void setReduceDetail(WmUserTaskBMLDetail reduceDetail) {
        this.reduceDetail = reduceDetail;
    }
    public List<RightsDetail> getRightsDetailList() {
        return rightsDetailList;
    }
    public void setRightsDetailList(List<RightsDetail> rightsDetailList) {
        this.rightsDetailList = rightsDetailList;
    }




    @Override
    public String toString() {
        return "ZbLogisticsPreviewResponse{" + "wmOrderId=" + wmOrderId + "," + "shippingFee=" + shippingFee + "," + "shippingTips=" + shippingTips + "," + "payAmount=" + payAmount + "," + "couponViewId=" + couponViewId + "," + "couponName=" + couponName + "," + "couponAmount=" + couponAmount + "," + "distance=" + distance + "," + "couponSource=" + couponSource + "," + "reduceDetail=" + reduceDetail + "," + "rightsDetailList=" + rightsDetailList + "}";
    }
}
