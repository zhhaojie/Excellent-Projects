package com.meituan.sdk.model.tuangouNg.coupon.queryReceiptsByReceiptIds;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 根据id批量查询团购券
* This file was automatically generated.
*/
public class QueryReceiptsByReceiptIdsResponse {
    /**
    * 团购券查询状态
    */
    @SerializedName("status")
    private ReceiptQueryStatusDTO status;
    /**
    * 团购券id
    */
    @SerializedName("receiptId")
    private Long receiptId;
    /**
    * 团购券状态
    */
    @SerializedName("couponStatus")
    private Integer couponStatus;
    /**
    * 使用时间
    */
    @SerializedName("couponUseTime")
    private Long couponUseTime;
    /**
    * 验证类型
    */
    @SerializedName("verifyType")
    private String verifyType;
    /**
    * 项目id
    */
    @SerializedName("dealId")
    private Integer dealId;
    /**
    * 项目名称
    */
    @SerializedName("dealTitle")
    private String dealTitle;
    /**
    * 市场价
    */
    @SerializedName("dealValue")
    private Double dealValue;
    /**
    * 项目价格
    */
    @SerializedName("dealPrice")
    private Double dealPrice;
    /**
    * 是否代金券
    */
    @SerializedName("isVoucher")
    private Boolean isVoucher;
    /**
    * 是否量贩
    */
    @SerializedName("volume")
    private Integer volume;
    /**
    * 量贩项目的单张券原价
    */
    @SerializedName("singleValue")
    private BigDecimal singleValue;
    /**
    * 团购券购买价格
    */
    @SerializedName("couponBuyPrice")
    private Double couponBuyPrice;
    @SerializedName("totalBizReduce")
    private Double totalBizReduce;
    @SerializedName("oldBiz")
    private Boolean oldBiz;
    /**
    * 团购券优惠
    */
    @SerializedName("receiptPromotions")
    private List<ReceiptPromotionDTO> receiptPromotions;

    public ReceiptQueryStatusDTO getStatus() {
        return status;
    }
    public void setStatus(ReceiptQueryStatusDTO status) {
        this.status = status;
    }
    public Long getReceiptId() {
        return receiptId;
    }
    public void setReceiptId(Long receiptId) {
        this.receiptId = receiptId;
    }
    public Integer getCouponStatus() {
        return couponStatus;
    }
    public void setCouponStatus(Integer couponStatus) {
        this.couponStatus = couponStatus;
    }
    public Long getCouponUseTime() {
        return couponUseTime;
    }
    public void setCouponUseTime(Long couponUseTime) {
        this.couponUseTime = couponUseTime;
    }
    public String getVerifyType() {
        return verifyType;
    }
    public void setVerifyType(String verifyType) {
        this.verifyType = verifyType;
    }
    public Integer getDealId() {
        return dealId;
    }
    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }
    public String getDealTitle() {
        return dealTitle;
    }
    public void setDealTitle(String dealTitle) {
        this.dealTitle = dealTitle;
    }
    public Double getDealValue() {
        return dealValue;
    }
    public void setDealValue(Double dealValue) {
        this.dealValue = dealValue;
    }
    public Double getDealPrice() {
        return dealPrice;
    }
    public void setDealPrice(Double dealPrice) {
        this.dealPrice = dealPrice;
    }
    public Boolean getIsVoucher() {
        return isVoucher;
    }
    public void setIsVoucher(Boolean isVoucher) {
        this.isVoucher = isVoucher;
    }
    public Integer getVolume() {
        return volume;
    }
    public void setVolume(Integer volume) {
        this.volume = volume;
    }
    public BigDecimal getSingleValue() {
        return singleValue;
    }
    public void setSingleValue(BigDecimal singleValue) {
        this.singleValue = singleValue;
    }
    public Double getCouponBuyPrice() {
        return couponBuyPrice;
    }
    public void setCouponBuyPrice(Double couponBuyPrice) {
        this.couponBuyPrice = couponBuyPrice;
    }
    public Double getTotalBizReduce() {
        return totalBizReduce;
    }
    public void setTotalBizReduce(Double totalBizReduce) {
        this.totalBizReduce = totalBizReduce;
    }
    public Boolean getOldBiz() {
        return oldBiz;
    }
    public void setOldBiz(Boolean oldBiz) {
        this.oldBiz = oldBiz;
    }
    public List<ReceiptPromotionDTO> getReceiptPromotions() {
        return receiptPromotions;
    }
    public void setReceiptPromotions(List<ReceiptPromotionDTO> receiptPromotions) {
        this.receiptPromotions = receiptPromotions;
    }




    @Override
    public String toString() {
        return "QueryReceiptsByReceiptIdsResponse{" + "status=" + status + "," + "receiptId=" + receiptId + "," + "couponStatus=" + couponStatus + "," + "couponUseTime=" + couponUseTime + "," + "verifyType=" + verifyType + "," + "dealId=" + dealId + "," + "dealTitle=" + dealTitle + "," + "dealValue=" + dealValue + "," + "dealPrice=" + dealPrice + "," + "isVoucher=" + isVoucher + "," + "volume=" + volume + "," + "singleValue=" + singleValue + "," + "couponBuyPrice=" + couponBuyPrice + "," + "totalBizReduce=" + totalBizReduce + "," + "oldBiz=" + oldBiz + "," + "receiptPromotions=" + receiptPromotions + "}";
    }
}
