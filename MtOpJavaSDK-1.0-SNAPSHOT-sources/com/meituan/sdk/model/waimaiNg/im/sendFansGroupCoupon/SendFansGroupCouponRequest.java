package com.meituan.sdk.model.waimaiNg.im.sendFansGroupCoupon;

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
    path = "/waimai/ng/im/sendFansGroupCoupon",
    businessId = 2,
    apiVersion = "10043",
    apiName = "send_fans_group_coupon",
    needAuth = true
)
public class SendFansGroupCouponRequest implements MeituanRequest<SendFansGroupCouponResponse> {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">群ID </font></span><span style="color: rgb(245, 35, 45)"><font style="font-size:14px;line-height:22px" data-size="14">偏移</font></span></p>
    */
    @NotNull(message = "groupId不能为空")
    @SerializedName("groupId")
    private Long groupId;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">券领取后有效期，单位秒</font></p>
    */
    @NotNull(message = "validTime不能为空")
    @SerializedName("validTime")
    private Integer validTime;
    /**
    * <p>门槛 <span style="color: rgb(115, 45, 209)">满减券必传</span></p>
    */
    @SerializedName("limitPrice")
    private Integer limitPrice;
    /**
    * <p>满减券优惠金额，<span style="color: rgb(0, 0, 0)">满减金额需要在使用门槛的3-50%  </span><span style="color: rgb(115, 45, 209)">满减券必传</span></p>
    */
    @SerializedName("price")
    private Integer price;
    /**
    * <p>三方商品ID  <span style="color: rgb(115, 45, 209)">商品券必传</span></p>
    */
    @SerializedName("app_food_code")
    private String appFoodCode;
    /**
    * <p>商品折扣，0到98，98代表0.98折  <span style="color: rgb(115, 45, 209)">商品券必传</span></p>
    */
    @SerializedName("discount")
    private Integer discount;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">券数量，1到9999</font></span></p>
    */
    @NotNull(message = "count不能为空")
    @SerializedName("count")
    private Integer count;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">券类型，1：门店满减券，2:商品券</font></span></p>
    */
    @NotNull(message = "actType不能为空")
    @SerializedName("actType")
    private Integer actType;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">活动有效期，秒</font></span></p>
    */
    @NotNull(message = "activityValidTime不能为空")
    @SerializedName("activityValidTime")
    private Integer activityValidTime;
    /**
    * <p>商品ID</p><p style="text-align: start;"><span style="color: rgb(115, 45, 209)">商品券（和app_food_code至少传一个</span> </p>
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
    public String getAppFoodCode() {
        return appFoodCode;
    }
    public void setAppFoodCode(String appFoodCode) {
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
