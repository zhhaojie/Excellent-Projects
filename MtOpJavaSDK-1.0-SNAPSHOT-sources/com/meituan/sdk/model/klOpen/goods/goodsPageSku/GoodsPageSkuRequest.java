package com.meituan.sdk.model.klOpen.goods.goodsPageSku;

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
* 分页查询sku
* This file was automatically generated.
*/
@ApiMeta(
    path = "/kl/open/goods/page/sku",
    businessId = 27,
    apiVersion = "10002",
    apiName = "goods_page_sku",
    needAuth = true
)
public class GoodsPageSkuRequest implements MeituanRequest<GoodsPageSkuResponse> {
    @NotNull(message = "minIdNotInclude不能为空")
    @SerializedName("minIdNotInclude")
    private Long minIdNotInclude;
    @NotNull(message = "size不能为空")
    @SerializedName("size")
    private Integer size;
    @NotBlank(message = "brandIdentify不能为空")
    @SerializedName("brandIdentify")
    private String brandIdentify;

    public Long getMinIdNotInclude() {
        return minIdNotInclude;
    }
    public void setMinIdNotInclude(Long minIdNotInclude) {
        this.minIdNotInclude = minIdNotInclude;
    }
    public Integer getSize() {
        return size;
    }
    public void setSize(Integer size) {
        this.size = size;
    }
    public String getBrandIdentify() {
        return brandIdentify;
    }
    public void setBrandIdentify(String brandIdentify) {
        this.brandIdentify = brandIdentify;
    }


    @Override
    public MeituanResponse<GoodsPageSkuResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GoodsPageSkuResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GoodsPageSkuRequest{" + "minIdNotInclude=" + minIdNotInclude + "," + "size=" + size + "," + "brandIdentify=" + brandIdentify + "}";
    }
}
