package com.meituan.sdk.model.foodmop.shop.tagQuery;

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
* 品牌门店标签查询
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/shop/tag/query",
    businessId = 51,
    apiVersion = "10005",
    apiName = "tag_query",
    needAuth = true
)
public class TagQueryRequest implements MeituanRequest<TagQueryResponse> {
    /**
    * <p data-diff-id="ct-diff-id-428371ec-6f03-43ef-b7d6-f4661415d2a4">品牌门店 id 列表 最多 100 个</p>
    */
    @NotEmpty(message = "vendorShopIdList不能为空")
    @SerializedName("vendorShopIdList")
    private List<String> vendorShopIdList;

    public List<String> getVendorShopIdList() {
        return vendorShopIdList;
    }
    public void setVendorShopIdList(List<String> vendorShopIdList) {
        this.vendorShopIdList = vendorShopIdList;
    }


    @Override
    public MeituanResponse<TagQueryResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<TagQueryResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "TagQueryRequest{" + "vendorShopIdList=" + vendorShopIdList + "}";
    }
}
