package com.meituan.sdk.model.peisong.shop.areaQuery;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询合作方配送范围
* This file was automatically generated.
*/
@ApiMeta(
    path = "/peisong/shop/area/query",
    businessId = 19,
    apiVersion = "10004",
    apiName = "area_query",
    needAuth = false
)
public class AreaQueryRequest implements MeituanRequest<AreaQueryResponse> {
    /**
    * 配送服务代码
    */
    @NotNull(message = "deliveryServiceCode不能为空")
    @SerializedName("delivery_service_code")
    private Integer deliveryServiceCode;
    /**
    * 取货门店id
    */
    @NotBlank(message = "shopId不能为空")
    @SerializedName("shop_id")
    private String shopId;

    public Integer getDeliveryServiceCode() {
        return deliveryServiceCode;
    }
    public void setDeliveryServiceCode(Integer deliveryServiceCode) {
        this.deliveryServiceCode = deliveryServiceCode;
    }
    public String getShopId() {
        return shopId;
    }
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }


    @Override
    public MeituanResponse<AreaQueryResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<AreaQueryResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "AreaQueryRequest{" + "deliveryServiceCode=" + deliveryServiceCode + "," + "shopId=" + shopId + "}";
    }
}
