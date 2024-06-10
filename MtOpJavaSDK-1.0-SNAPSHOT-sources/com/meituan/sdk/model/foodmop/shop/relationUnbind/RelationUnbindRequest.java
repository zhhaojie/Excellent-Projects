package com.meituan.sdk.model.foodmop.shop.relationUnbind;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 解绑门店（必接）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/shop/relation/unbind",
    businessId = 51,
    apiVersion = "10005",
    apiName = "relation_unbind",
    needAuth = true
)
public class RelationUnbindRequest implements MeituanRequest<Boolean> {
    /**
    * <p data-diff-id="ct-diff-id-8c97b1eb-9b2f-4e2a-beb9-b312faf6b715">商家ERP上门店编码</p>
    */
    @NotBlank(message = "erpShopId不能为空")
    @SerializedName("erpShopId")
    private String erpShopId;

    public String getErpShopId() {
        return erpShopId;
    }
    public void setErpShopId(String erpShopId) {
        this.erpShopId = erpShopId;
    }


    @Override
    public MeituanResponse<Boolean> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<Boolean>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "RelationUnbindRequest{" + "erpShopId=" + erpShopId + "}";
    }
}
