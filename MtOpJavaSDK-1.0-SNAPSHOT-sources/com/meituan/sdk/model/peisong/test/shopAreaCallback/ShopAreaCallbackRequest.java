package com.meituan.sdk.model.peisong.test.shopAreaCallback;

import com.meituan.sdk.annotations.ApiMeta;
import java.lang.Void;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 模拟门店配送范围变更
* This file was automatically generated.
*/
@ApiMeta(
    path = "/peisong/test/shop/area/callback",
    businessId = 19,
    apiVersion = "10004",
    apiName = "shop_area_callback",
    needAuth = false
)
public class ShopAreaCallbackRequest implements MeituanRequest<Void> {
    /**
    * 取货门店id，即合作方向美团提供的门店id  注：测试门店的shop_id固定为 test_0001 ，仅用于对接时联调测试。
    */
    @NotBlank(message = "shopId不能为空")
    @SerializedName("shop_id")
    private String shopId;
    /**
    * 配送服务代码，详情见合同  飞速达:4002  快速达:4011  及时达:4012  集中送:4013
    */
    @NotNull(message = "deliveryServiceCode不能为空")
    @SerializedName("delivery_service_code")
    private Integer deliveryServiceCode;

    public String getShopId() {
        return shopId;
    }
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
    public Integer getDeliveryServiceCode() {
        return deliveryServiceCode;
    }
    public void setDeliveryServiceCode(Integer deliveryServiceCode) {
        this.deliveryServiceCode = deliveryServiceCode;
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
        return "ShopAreaCallbackRequest{" + "shopId=" + shopId + "," + "deliveryServiceCode=" + deliveryServiceCode + "}";
    }
}
