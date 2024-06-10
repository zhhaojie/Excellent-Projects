package com.meituan.sdk.model.wmoperNg.im.sendFansGroupCoupon;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 在粉丝群内主动建券并发券
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/im/sendFansGroupCoupon",
    businessId = 16,
    apiVersion = "10042",
    apiName = "send_fans_group_coupon",
    needAuth = true
)
public class SendFansGroupCouponRequest implements MeituanRequest<SendFansGroupCouponResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">群ID&nbsp;</font></span><span style="color: rgb(245, 35, 45)"><font style="font-size:14px;line-height:22px" data-size="14">偏移</font></span></p>
    */
    @NotNull(message = "groupId不能为空")
    @SerializedName("groupId")
    private Long groupId;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">券领取后有效期，单位秒</font></span></p>
    */
    @NotNull(message = "validTime不能为空")
    @SerializedName("validTime")
    private Integer validTime;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">门槛&nbsp;</font></span><span style="color: rgb(115, 45, 209)"><font style="font-size:14px;line-height:22px" data-size="14">满减券必传</font></span></p>
    */
    @SerializedName("limitPrice")
    private Integer limitPrice;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">满减券优惠金额，</font></span><span style="color: rgb(0, 0, 0)"><font style="font-size:14px;line-height:22px" data-size="14">满减金额需要在使用门槛的3-50%&nbsp;</font></span><span style="color: rgb(115, 45, 209)"><font style="font-size:14px;line-height:22px" data-size="14">满减券必传</font></span></p>
    */
    @SerializedName("price")
    private Integer price;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">三方商品ID&nbsp;</font></span><span style="color: rgb(115, 45, 209)"><font style="font-size:14px;line-height:22px" data-size="14">商品券必传</font></span></p>
    */
    @SerializedName("app_food_code")
    private Integer appFoodCode;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">商品折扣，0到98，98代表0.98折&nbsp;</font></span><span style="color: rgb(115, 45, 209)"><font style="font-size:14px;line-height:22px" data-size="14">商品券必传</font></span></p>
    */
    @SerializedName("discount")
    private Integer discount;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">券数量，1到9999</font></span></p>
    */
    @NotNull(message = "count不能为空")
    @SerializedName("count")
    private Integer count;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">券类型，1：门店满减券，2:商品券</font></span></p>
    */
    @NotNull(message = "actType不能为空")
    @SerializedName("actType")
    private Integer actType;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">活动有效期，秒</font></span></p>
    */
    @NotNull(message = "activityValidTime不能为空")
    @SerializedName("activityValidTime")
    private Integer activityValidTime;
    /**
    * <p>商品ID</p><p><span style="color: rgb(115, 45, 209)">商品券（和app_food_code至少传一个</span> <span style="color: rgb(115, 45, 209)">）</span></p>
    */
    @SerializedName("spuId")
    private Long spuId;

    public Long getGroupId() {
        return groupId;
    }
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
    public Integer getValidTime() {
        return validTime;
    }
    public void setValidTime(Integer validTime) {
        this.validTime = validTime;
    }
    public Integer getLimitPrice() {
        return limitPrice;
    }
    public void setLimitPrice(Integer limitPrice) {
        this.limitPrice = limitPrice;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getAppFoodCode() {
        return appFoodCode;
    }
    public void setAppFoodCode(Integer appFoodCode) {
        this.appFoodCode = appFoodCode;
    }
    public Integer getDiscount() {
        return discount;
    }
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
    public Integer getActType() {
        return actType;
    }
    public void setActType(Integer actType) {
        this.actType = actType;
    }
    public Integer getActivityValidTime() {
        return activityValidTime;
    }
    public void setActivityValidTime(Integer activityValidTime) {
        this.activityValidTime = activityValidTime;
    }
    public Long getSpuId() {
        return spuId;
    }
    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }


    @Override
    public MeituanResponse<SendFansGroupCouponResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<SendFansGroupCouponResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "SendFansGroupCouponRequest{" + "groupId=" + groupId + "," + "validTime=" + validTime + "," + "limitPrice=" + limitPrice + "," + "price=" + price + "," + "appFoodCode=" + appFoodCode + "," + "discount=" + discount + "," + "count=" + count + "," + "actType=" + actType + "," + "activityValidTime=" + activityValidTime + "," + "spuId=" + spuId + "}";
    }
}
