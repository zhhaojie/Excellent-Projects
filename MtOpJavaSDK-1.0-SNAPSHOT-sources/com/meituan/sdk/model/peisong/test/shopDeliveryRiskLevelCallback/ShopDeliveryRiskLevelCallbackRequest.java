package com.meituan.sdk.model.peisong.test.shopDeliveryRiskLevelCallback;

import com.meituan.sdk.annotations.ApiMeta;
import java.lang.Void;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 模拟门店配送风险等级变更
* This file was automatically generated.
*/
@ApiMeta(
    path = "/peisong/test/shop/deliveryRiskLevel/callback",
    businessId = 19,
    apiVersion = "10005",
    apiName = "shop_delivery_risk_level_callback",
    needAuth = false
)
public class ShopDeliveryRiskLevelCallbackRequest implements MeituanRequest<Void> {
    /**
    * 取货门店id，即合作方向美团提供的门店id  注：测试门店的shop_id固定为 test_0001 ，仅用于对接时联调测试。
    */
    @NotBlank(message = "shopId不能为空")
    @SerializedName("shop_id")
    private String shopId;

    public String getShopId() {
        return shopId;
    }
    public void setShopId(String shopId) {
        this.shopId = shopId;
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
        return "ShopDeliveryRiskLevelCallbackRequest{" + "shopId=" + shopId + "}";
    }
}
