package com.meituan.sdk.model.wmoperNg.order.getBatchOrderRefundInfo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 全部或部分退款信息列表
* This file was automatically generated.
*/
public class OrderRefundInfo {
    /**
    * 订单id
    */
    @SerializedName("order_id")
    private Long orderId;
    /**
    * 1-部分退款；2-全部退款
    */
    @SerializedName("refund_type")
    private String refundType;
    /**
    * 退款申请时间
    */
    @SerializedName("refund_apply_time")
    private Long refundApplyTime;
    /**
    * 退款原因
    */
    @SerializedName("reason")
    private String reason;
    /**
    * 0：未处理；1：商家驳回退款请求；2、商家同意退款；3、客服驳回退款请求；4、客服帮商家同意退款；5、超过3小时自动同意；6、系统自动确认；7：用户取消退款申请；8：用户取消退款申诉
    */
    @SerializedName("res_type")
    private Integer resType;
    /**
    * 是否申诉退款：0-否；1-是
    */
    @SerializedName("is_appeal")
    private Integer isAppeal;
    /**
    * 退款图片：Json数组；用户在申请退款时上传的退款图片；上限为9张图片；
    */
    @SerializedName("pictures")
    private String pictures;
    /**
    * 退款金额，refund_type=2（全部退款）无该金额
    */
    @SerializedName("money")
    private String money;
    /**
    * 订单业务打标枚举，即业务身份
    */
    @SerializedName("order_tag_list")
    private String orderTagList;
    /**
    * 售后发起人角色：  * 1-用户发起售后  * 2-客服帮助用户发起售后  * 3-重复支付自动发起退款  * 6-用户发起申诉  * 7-商家发起售后  * 0-其他
    */
    @SerializedName("apply_role")
    private Integer applyRole;
    /**
    * 退款申请单唯一标识（申诉入参 after_sale_id等价）
    */
    @SerializedName("refund_id")
    private Long refundId;
    /**
    * 商家是否可以申诉，1-可以、0 -不可以
    */
    @SerializedName("poi_can_appeal")
    private Integer poiCanAppeal;
    /**
    * 用户申请退款类型，1-用户申请 、2-用户第一次申诉 、3-用户第二次申诉
    */
    @SerializedName("user_apply_type")
    private Integer userApplyType;
    /**
    * 退款商品信息（仅部分退款有该字段）
    */
    @SerializedName("food")
    private List<WmOrderPartRefundFoodInfo> food;

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public String getRefundType() {
        return refundType;
    }
    public void setRefundType(String refundType) {
        this.refundType = refundType;
    }
    public Long getRefundApplyTime() {
        return refundApplyTime;
    }
    public void setRefundApplyTime(Long refundApplyTime) {
        this.refundApplyTime = refundApplyTime;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public Integer getResType() {
        return resType;
    }
    public void setResType(Integer resType) {
        this.resType = resType;
    }
    public Integer getIsAppeal() {
        return isAppeal;
    }
    public void setIsAppeal(Integer isAppeal) {
        this.isAppeal = isAppeal;
    }
    public String getPictures() {
        return pictures;
    }
    public void setPictures(String pictures) {
        this.pictures = pictures;
    }
    public String getMoney() {
        return money;
    }
    public void setMoney(String money) {
        this.money = money;
    }
    public String getOrderTagList() {
        return orderTagList;
    }
    public void setOrderTagList(String orderTagList) {
        this.orderTagList = orderTagList;
    }
    public Integer getApplyRole() {
        return applyRole;
    }
    public void setApplyRole(Integer applyRole) {
        this.applyRole = applyRole;
    }
    public Long getRefundId() {
        return refundId;
    }
    public void setRefundId(Long refundId) {
        this.refundId = refundId;
    }
    public Integer getPoiCanAppeal() {
        return poiCanAppeal;
    }
    public void setPoiCanAppeal(Integer poiCanAppeal) {
        this.poiCanAppeal = poiCanAppeal;
    }
    public Integer getUserApplyType() {
        return userApplyType;
    }
    public void setUserApplyType(Integer userApplyType) {
        this.userApplyType = userApplyType;
    }
    public List<WmOrderPartRefundFoodInfo> getFood() {
        return food;
    }
    public void setFood(List<WmOrderPartRefundFoodInfo> food) {
        this.food = food;
    }




    @Override
    public String toString() {
        return "OrderRefundInfo{" + "orderId=" + orderId + "," + "refundType=" + refundType + "," + "refundApplyTime=" + refundApplyTime + "," + "reason=" + reason + "," + "resType=" + resType + "," + "isAppeal=" + isAppeal + "," + "pictures=" + pictures + "," + "money=" + money + "," + "orderTagList=" + orderTagList + "," + "applyRole=" + applyRole + "," + "refundId=" + refundId + "," + "poiCanAppeal=" + poiCanAppeal + "," + "userApplyType=" + userApplyType + "," + "food=" + food + "}";
    }
}
