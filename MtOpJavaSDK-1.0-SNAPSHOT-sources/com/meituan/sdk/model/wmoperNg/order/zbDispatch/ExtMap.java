package com.meituan.sdk.model.wmoperNg.order.zbDispatch;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotEmpty;

/**
* 
* This file was automatically generated.
*/
public class ExtMap {
    /**
    * <p data-diff-id="ct-diff-id-bb56ebea-ea2b-4c78-b142-bc2e117cadd0">title背景颜色</p>
    */
    @SerializedName("orderPageTitleBgColor")
    private String orderPageTitleBgColor;
    /**
    * <p data-diff-id="ct-diff-id-1b93b716-cf55-4fc6-aa2b-c0121e66336e">按钮图案</p>
    */
    @SerializedName("buttonImg")
    private String buttonImg;
    /**
    * <p data-diff-id="ct-diff-id-13858567-d528-4eaa-8cb2-6ecb7359c781">订单图标</p>
    */
    @SerializedName("orderIcon")
    private String orderIcon;
    /**
    * <p data-diff-id="ct-diff-id-877c5190-2f03-4280-ad28-9fa352a3d129">订单页面标题颜色</p>
    */
    @SerializedName("orderPageTitleColor")
    private String orderPageTitleColor;
    /**
    * <p data-diff-id="ct-diff-id-68d8296c-853c-4036-ae20-66fd128e14de">权益token</p>
    */
    @NotBlank(message = "rightDisToken不能为空")
    @SerializedName("rightDisToken")
    private String rightDisToken;
    /**
    * <p data-diff-id="ct-diff-id-47f06f4b-87c8-4ff6-868c-2c1d596536ce">提示内容</p>
    */
    @SerializedName("tipsContent")
    private String tipsContent;
    /**
    * <p data-diff-id="ct-diff-id-66e0a962-8f3e-4b5e-8549-6b4ec3a4c521">活动Id</p>
    */
    @SerializedName("activityId")
    private String activityId;
    /**
    * <p data-diff-id="ct-diff-id-6a766b9a-11b9-473b-b7a5-aaf99d4c460f">提示内容</p>
    */
    @SerializedName("tipsComment")
    private String tipsComment;
    /**
    * <p data-diff-id="ct-diff-id-e64bc589-2b5d-433f-93b9-b5a8f1623821">提示颜色</p>
    */
    @SerializedName("tipsColor")
    private String tipsColor;
    /**
    * <p data-diff-id="ct-diff-id-e25994e6-cfe9-40bc-90f7-880342151b50">费用详细信息</p>
    */
    @NotEmpty(message = "feeDetails不能为空")
    @SerializedName("feeDetails")
    private List<FeeDetails> feeDetails;
    /**
    * <p data-diff-id="ct-diff-id-30b933d9-c344-480c-85f3-637ae61db3ec">权益类型code</p>
    */
    @SerializedName("rightTypeCode")
    private String rightTypeCode;
    /**
    * <p data-diff-id="ct-diff-id-1cb30fbb-b4f1-4610-a10c-d17d24c501e5">提示背景颜色</p>
    */
    @SerializedName("tipsBgColor")
    private String tipsBgColor;
    /**
    * <p data-diff-id="ct-diff-id-cbf0f25f-abf4-497c-aeb0-8d9692686beb">提示图标</p>
    */
    @SerializedName("tipsIcon")
    private String tipsIcon;

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
    public List<FeeDetails> getFeeDetails() {
        return feeDetails;
    }
    public void setFeeDetails(List<FeeDetails> feeDetails) {
        this.feeDetails = feeDetails;
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




    @Override
    public String toString() {
        return "ExtMap{" + "orderPageTitleBgColor=" + orderPageTitleBgColor + "," + "buttonImg=" + buttonImg + "," + "orderIcon=" + orderIcon + "," + "orderPageTitleColor=" + orderPageTitleColor + "," + "rightDisToken=" + rightDisToken + "," + "tipsContent=" + tipsContent + "," + "activityId=" + activityId + "," + "tipsComment=" + tipsComment + "," + "tipsColor=" + tipsColor + "," + "feeDetails=" + feeDetails + "," + "rightTypeCode=" + rightTypeCode + "," + "tipsBgColor=" + tipsBgColor + "," + "tipsIcon=" + tipsIcon + "}";
    }
}
