package com.meituan.sdk.model.tuangouNg.groupVoucher.groupvoucherOrderQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class GroupVoucherOrderDTO {
    /**
    * 用户订单号
    */
    @SerializedName("serialNumber")
    private String serialNumber;
    /**
    * 消息类型 （1：createOrder订单创建成功 2：payOrderSuccess订单支付成功 3：payOrderError订单支付失败 4：refundingOrder订单退款中 5：refundOrderSuccess订单退款成功 6：refundOrderError订单退款失败）
    */
    @SerializedName("msgType")
    private String msgType;
    /**
    * 商品ID
    */
    @SerializedName("productId")
    private Long productId;
    /**
    * 系统订单ID
    */
    @SerializedName("orderId")
    private Long orderId;
    /**
    * 支付时间
    */
    @SerializedName("payTime")
    private Long payTime;
    /**
    * 美团城市ID
    */
    @SerializedName("mtCityId")
    private Long mtCityId;
    /**
    * 订单状态
    */
    @SerializedName("orderStatus")
    private Long orderStatus;
    /**
    * 用户手机号
    */
    @SerializedName("mobileNo")
    private String mobileNo;
    /**
    * 用户ID
    */
    @SerializedName("userId")
    private Long userId;
    /**
    * 用户支付金额
    */
    @SerializedName("userPayAmount")
    private Long userPayAmount;
    /**
    * 不享优惠金额
    */
    @SerializedName("noDiscountAmount")
    private Long noDiscountAmount;
    /**
    * 订单消息体（非结构化）
    */
    @SerializedName("msgContent")
    private String msgContent;
    /**
    * 订单金额
    */
    @SerializedName("orderAmount")
    private Long orderAmount;
    /**
    * 订单更新时间
    */
    @SerializedName("orderUpdateTime")
    private Long orderUpdateTime;
    /**
    * 订单创建时间
    */
    @SerializedName("orderAddTime")
    private Long orderAddTime;
    /**
    * 代金券抵扣金额
    */
    @SerializedName("groupVoucherDiscountAmount")
    private Long groupVoucherDiscountAmount;
    /**
    * 退款详情
    */
    @SerializedName("refundInfo")
    private RefundInfo refundInfo;
    /**
    * 美团门店ID
    */
    @SerializedName("mtShopId")
    private Long mtShopId;
    /**
    * 用户类型
    */
    @SerializedName("userType")
    private Long userType;
    /**
    * 优惠详情
    */
    @SerializedName("couponInfoList")
    private List<CouponInfoListSub> couponInfoList;
    /**
    * 扩展信息
    */
    @SerializedName("extraInfo")
    private Map extraInfo;

    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getMsgType() {
        return msgType;
    }
    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }
    public Long getProductId() {
        return productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Long getPayTime() {
        return payTime;
    }
    public void setPayTime(Long payTime) {
        this.payTime = payTime;
    }
    public Long getMtCityId() {
        return mtCityId;
    }
    public void setMtCityId(Long mtCityId) {
        this.mtCityId = mtCityId;
    }
    public Long getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(Long orderStatus) {
        this.orderStatus = orderStatus;
    }
    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Long getUserPayAmount() {
        return userPayAmount;
    }
    public void setUserPayAmount(Long userPayAmount) {
        this.userPayAmount = userPayAmount;
    }
    public Long getNoDiscountAmount() {
        return noDiscountAmount;
    }
    public void setNoDiscountAmount(Long noDiscountAmount) {
        this.noDiscountAmount = noDiscountAmount;
    }
    public String getMsgContent() {
        return msgContent;
    }
    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }
    public Long getOrderAmount() {
        return orderAmount;
    }
    public void setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
    }
    public Long getOrderUpdateTime() {
        return orderUpdateTime;
    }
    public void setOrderUpdateTime(Long orderUpdateTime) {
        this.orderUpdateTime = orderUpdateTime;
    }
    public Long getOrderAddTime() {
        return orderAddTime;
    }
    public void setOrderAddTime(Long orderAddTime) {
        this.orderAddTime = orderAddTime;
    }
    public Long getGroupVoucherDiscountAmount() {
        return groupVoucherDiscountAmount;
    }
    public void setGroupVoucherDiscountAmount(Long groupVoucherDiscountAmount) {
        this.groupVoucherDiscountAmount = groupVoucherDiscountAmount;
    }
    public RefundInfo getRefundInfo() {
        return refundInfo;
    }
    public void setRefundInfo(RefundInfo refundInfo) {
        this.refundInfo = refundInfo;
    }
    public Long getMtShopId() {
        return mtShopId;
    }
    public void setMtShopId(Long mtShopId) {
        this.mtShopId = mtShopId;
    }
    public Long getUserType() {
        return userType;
    }
    public void setUserType(Long userType) {
        this.userType = userType;
    }
    public List<CouponInfoListSub> getCouponInfoList() {
        return couponInfoList;
    }
    public void setCouponInfoList(List<CouponInfoListSub> couponInfoList) {
        this.couponInfoList = couponInfoList;
    }
    public Map getExtraInfo() {
        return extraInfo;
    }
    public void setExtraInfo(Map extraInfo) {
        this.extraInfo = extraInfo;
    }




    @Override
    public String toString() {
        return "GroupVoucherOrderDTO{" + "serialNumber=" + serialNumber + "," + "msgType=" + msgType + "," + "productId=" + productId + "," + "orderId=" + orderId + "," + "payTime=" + payTime + "," + "mtCityId=" + mtCityId + "," + "orderStatus=" + orderStatus + "," + "mobileNo=" + mobileNo + "," + "userId=" + userId + "," + "userPayAmount=" + userPayAmount + "," + "noDiscountAmount=" + noDiscountAmount + "," + "msgContent=" + msgContent + "," + "orderAmount=" + orderAmount + "," + "orderUpdateTime=" + orderUpdateTime + "," + "orderAddTime=" + orderAddTime + "," + "groupVoucherDiscountAmount=" + groupVoucherDiscountAmount + "," + "refundInfo=" + refundInfo + "," + "mtShopId=" + mtShopId + "," + "userType=" + userType + "," + "couponInfoList=" + couponInfoList + "," + "extraInfo=" + extraInfo + "}";
    }
}
