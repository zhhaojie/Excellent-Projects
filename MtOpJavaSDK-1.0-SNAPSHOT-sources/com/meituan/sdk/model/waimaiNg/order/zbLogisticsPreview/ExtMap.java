package com.meituan.sdk.model.waimaiNg.order.zbLogisticsPreview;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class ExtMap {
    /**
    * title背景颜色
    */
    @SerializedName("orderPageTitleBgColor")
    private String orderPageTitleBgColor;
    /**
    * 按钮图案
    */
    @SerializedName("buttonImg")
    private String buttonImg;
    /**
    * 订单图标
    */
    @SerializedName("orderIcon")
    private String orderIcon;
    /**
    * 订单页面标题颜色
    */
    @SerializedName("orderPageTitleColor")
    private String orderPageTitleColor;
    /**
    * 权益token
    */
    @SerializedName("rightDisToken")
    private String rightDisToken;
    /**
    * 提示内容
    */
    @SerializedName("tipsContent")
    private String tipsContent;
    /**
    * 活动ID
    */
    @SerializedName("activityId")
    private String activityId;
    /**
    * 提示注释
    */
    @SerializedName("tipsComment")
    private String tipsComment;
    /**
    * 提示颜色
    */
    @SerializedName("tipsColor")
    private String tipsColor;
    /**
    * 权益类型code
    */
    @SerializedName("rightTypeCode")
    private String rightTypeCode;
    /**
    * 提示背景颜色
    */
    @SerializedName("tipsBgColor")
    private String tipsBgColor;
    /**
    * 提示图标
    */
    @SerializedName("tipsIcon")
    private String tipsIcon;
    /**
    * 费用详细信息
    */
    @SerializedName("feeDetails")
    private List<FeeDetail> feeDetails;

    public String getOrderPageTitleBgColor() {
        return orderPageTitleBgColor;
    }
    public void setOrderPageTitleBgColor(String orderPageTitleBgColor) {
        this.orderPageTitleBgColor = orderPageTitleBgColor;
    }
    public String getButtonImg() {
        return buttonImg;
    }
    public void setButtonImg(String buttonImg) {
        this.buttonImg = buttonImg;
    }
    public String getOrderIcon() {
        return orderIcon;
    }
    public void setOrderIcon(String orderIcon) {
        this.orderIcon = orderIcon;
    }
    public String getOrderPageTitleColor() {
        return orderPageTitleColor;
    }
    public void setOrderPageTitleColor(String orderPageTitleColor) {
        this.orderPageTitleColor = orderPageTitleColor;
    }
    public String getRightDisToken() {
        return rightDisToken;
    }
    public void setRightDisToken(String rightDisToken) {
        this.rightDisToken = rightDisToken;
    }
    public String getTipsContent() {
        return tipsContent;
    }
    public void setTipsContent(String tipsContent) {
        this.tipsContent = tipsContent;
    }
    public String getActivityId() {
        return activityId;
    }
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }
    public String getTipsComment() {
        return tipsComment;
    }
    public void setTipsComment(String tipsComment) {
        this.tipsComment = tipsComment;
    }
    public String getTipsColor() {
        return tipsColor;
    }
    public void setTipsColor(String tipsColor) {
        this.tipsColor = tipsColor;
    }
    public String getRightTypeCode() {
        return rightTypeCode;
    }
    public void setRightTypeCode(String rightTypeCode) {
        this.rightTypeCode = rightTypeCode;
    }
    public String getTipsBgColor() {
        return tipsBgColor;
    }
    public void setTipsBgColor(String tipsBgColor) {
        this.tipsBgColor = tipsBgColor;
    }
    public String getTipsIcon() {
        return tipsIcon;
    }
    public void setTipsIcon(String tipsIcon) {
        this.tipsIcon = tipsIcon;
    }
    public List<FeeDetail> getFeeDetails() {
        return feeDetails;
    }
    public void setFeeDetails(List<FeeDetail> feeDetails) {
        this.feeDetails = feeDetails;
    }




    @Override
    public String toString() {
        return "ExtMap{" + "orderPageTitleBgColor=" + orderPageTitleBgColor + "," + "buttonImg=" + buttonImg + "," + "orderIcon=" + orderIcon + "," + "orderPageTitleColor=" + orderPageTitleColor + "," + "rightDisToken=" + rightDisToken + "," + "tipsContent=" + tipsContent + "," + "activityId=" + activityId + "," + "tipsComment=" + tipsComment + "," + "tipsColor=" + tipsColor + "," + "rightTypeCode=" + rightTypeCode + "," + "tipsBgColor=" + tipsBgColor + "," + "tipsIcon=" + tipsIcon + "," + "feeDetails=" + feeDetails + "}";
    }
}
