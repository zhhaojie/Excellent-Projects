package com.meituan.sdk.model.tuangouself.coupon.couponQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class CouponResponse {
    /**
    * 项目ID
    */
    @SerializedName("dealId")
    private Integer dealId;
    /**
    * 项目名称
    */
    @SerializedName("dealTitle")
    private String dealTitle;
    /**
    * 项目类型，0套餐，1代金券
    */
    @SerializedName("dealType")
    private Integer dealType;
    /**
    * 券码
    */
    @SerializedName("code")
    private String code;
    /**
    * 券有效期开始时间，单位秒
    */
    @SerializedName("couponStartTime")
    private Long couponStartTime;
    /**
    * 券有效期结束时间，单位秒
    */
    @SerializedName("couponEndTime")
    private Long couponEndTime;
    /**
    * 券对应的订单id
    */
    @SerializedName("orderId")
    private Long orderId;
    /**
    * 项目的市场价，用于展示
    */
    @SerializedName("buyPrice")
    private String buyPrice;
    /**
    * 下单时团购券售卖价格
    */
    @SerializedName("salePrice")
    private String salePrice;
    /**
    * 用户购买价
    */
    @SerializedName("settlePrice")
    private String settlePrice;
    /**
    * 券码购买平台（0美团、1点评）
    */
    @SerializedName("platform")
    private Integer platform;
    /**
    * 券使用规则
    */
    @SerializedName("useRule")
    private UserRule useRule;
    /**
    * deal对应的菜品信息
    */
    @SerializedName("menuInfo")
    private List<DealMenu> menuInfo;
    /**
    * 是否可用
    */
    @SerializedName("canUse")
    private Boolean canUse;
    /**
    * 非使用时间是否可以验券。true:是；false:否
    */
    @SerializedName("canUseAnyTime")
    private Boolean canUseAnyTime;
    /**
    * 不可用原因
    */
    @SerializedName("unavailableReason")
    private String unavailableReason;
    /**
    * 开店宝上单商家录入的项目名称，仅套餐券使用
    */
    @SerializedName("rawTitle")
    private String rawTitle;

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
    public Integer getDealType() {
        return dealType;
    }
    public void setDealType(Integer dealType) {
        this.dealType = dealType;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Long getCouponStartTime() {
        return couponStartTime;
    }
    public void setCouponStartTime(Long couponStartTime) {
        this.couponStartTime = couponStartTime;
    }
    public Long getCouponEndTime() {
        return couponEndTime;
    }
    public void setCouponEndTime(Long couponEndTime) {
        this.couponEndTime = couponEndTime;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public String getBuyPrice() {
        return buyPrice;
    }
    public void setBuyPrice(String buyPrice) {
        this.buyPrice = buyPrice;
    }
    public String getSalePrice() {
        return salePrice;
    }
    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }
    public String getSettlePrice() {
        return settlePrice;
    }
    public void setSettlePrice(String settlePrice) {
        this.settlePrice = settlePrice;
    }
    public Integer getPlatform() {
        return platform;
    }
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }
    public UserRule getUseRule() {
        return useRule;
    }
    public void setUseRule(UserRule useRule) {
        this.useRule = useRule;
    }
    public List<DealMenu> getMenuInfo() {
        return menuInfo;
    }
    public void setMenuInfo(List<DealMenu> menuInfo) {
        this.menuInfo = menuInfo;
    }
    public Boolean getCanUse() {
        return canUse;
    }
    public void setCanUse(Boolean canUse) {
        this.canUse = canUse;
    }
    public Boolean getCanUseAnyTime() {
        return canUseAnyTime;
    }
    public void setCanUseAnyTime(Boolean canUseAnyTime) {
        this.canUseAnyTime = canUseAnyTime;
    }
    public String getUnavailableReason() {
        return unavailableReason;
    }
    public void setUnavailableReason(String unavailableReason) {
        this.unavailableReason = unavailableReason;
    }
    public String getRawTitle() {
        return rawTitle;
    }
    public void setRawTitle(String rawTitle) {
        this.rawTitle = rawTitle;
    }




    @Override
    public String toString() {
        return "CouponResponse{" + "dealId=" + dealId + "," + "dealTitle=" + dealTitle + "," + "dealType=" + dealType + "," + "code=" + code + "," + "couponStartTime=" + couponStartTime + "," + "couponEndTime=" + couponEndTime + "," + "orderId=" + orderId + "," + "buyPrice=" + buyPrice + "," + "salePrice=" + salePrice + "," + "settlePrice=" + settlePrice + "," + "platform=" + platform + "," + "useRule=" + useRule + "," + "menuInfo=" + menuInfo + "," + "canUse=" + canUse + "," + "canUseAnyTime=" + canUseAnyTime + "," + "unavailableReason=" + unavailableReason + "," + "rawTitle=" + rawTitle + "}";
    }
}
