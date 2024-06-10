package com.meituan.sdk.model.foodmop.shop.baseInfoQuery;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 门店信息查询（选接）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/shop/baseInfo/query",
    businessId = 51,
    apiVersion = "10003",
    apiName = "base_info_query",
    needAuth = true
)
public class BaseInfoQueryRequest implements MeituanRequest<BaseInfoQueryResponse> {
    /**
    * <p data-diff-id="ct-diff-id-ef318e9f-adee-455f-841d-92ad97bf21db">商家ERP门店编码，最长30个字符</p>
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
    public MeituanResponse<BaseInfoQueryResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<BaseInfoQueryResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "BaseInfoQueryRequest{" + "erpShopId=" + erpShopId + "}";
    }
}
