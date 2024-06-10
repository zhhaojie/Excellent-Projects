package com.meituan.sdk.model.foodmop.sku.saleattrCreate;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;
import javax.validation.constraints.NotEmpty;

/**
* 创建或更新售卖属性（必接）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/saleattr/create",
    businessId = 51,
    apiVersion = "10013",
    apiName = "saleattr_create",
    needAuth = true
)
public class SaleattrCreateRequest implements MeituanRequest<SaleattrCreateResponse> {
    /**
    * <p data-diff-id="ct-diff-id-a2988d31-ce27-44da-876f-2c46f1d5772d"><span style="color: ">商品售卖属性列表</span></p>
    */
    @NotEmpty(message = "spuSaleAttributeBasicList不能为空")
    @SerializedName("spuSaleAttributeBasicList")
    private List<SpuSaleAttributeBasicDTO> spuSaleAttributeBasicList;

    public List<SpuSaleAttributeBasicDTO> getSpuSaleAttributeBasicList() {
        return spuSaleAttributeBasicList;
    }
    public void setSpuSaleAttributeBasicList(List<SpuSaleAttributeBasicDTO> spuSaleAttributeBasicList) {
        this.spuSaleAttributeBasicList = spuSaleAttributeBasicList;
    }


    @Override
    public MeituanResponse<SaleattrCreateResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<SaleattrCreateResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "SaleattrCreateRequest{" + "spuSaleAttributeBasicList=" + spuSaleAttributeBasicList + "}";
    }
}
