package com.meituan.sdk.model.wmoperNg.im.createEnterCouponActivity;

import com.meituan.sdk.annotations.ApiMeta;
import java.lang.Void;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 创建进群领券活动
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/im/createEnterCouponActivity",
    businessId = 16,
    apiVersion = "10039",
    apiName = "create_enter_coupon_activity",
    needAuth = true
)
public class CreateEnterCouponActivityRequest implements MeituanRequest<Void> {
    /**
    * <p>群ID</p>
    */
    @SerializedName("groupId")
    private Long groupId;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">优惠券金额 单位元</font></span></p>
    */
    @SerializedName("price")
    private Integer price;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">优惠券门槛 单位元</font></span></p>
    */
    @SerializedName("limitPrice")
    private Integer limitPrice;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">券有效期</font></span></p>
    */
    @SerializedName("validity")
    private Integer validity;

    public Long getGroupId() {
        return groupId;
    }
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getLimitPrice() {
        return limitPrice;
    }
    public void setLimitPrice(Integer limitPrice) {
        this.limitPrice = limitPrice;
    }
    public Integer getValidity() {
        return validity;
    }
    public void setValidity(Integer validity) {
        this.validity = validity;
    }


    @Override
    public MeituanResponse<Void> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<Void>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CreateEnterCouponActivityRequest{" + "groupId=" + groupId + "," + "price=" + price + "," + "limitPrice=" + limitPrice + "," + "validity=" + validity + "}";
    }
}
