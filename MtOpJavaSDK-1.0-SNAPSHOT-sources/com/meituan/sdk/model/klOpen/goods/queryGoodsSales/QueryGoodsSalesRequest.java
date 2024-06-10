package com.meituan.sdk.model.klOpen.goods.queryGoodsSales;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;
import javax.validation.constraints.NotEmpty;

/**
* 查询sku售卖信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/kl/open/goods/sku/sales",
    businessId = 27,
    apiVersion = "10001",
    apiName = "query_goods_sales",
    needAuth = true
)
public class QueryGoodsSalesRequest implements MeituanRequest<QueryGoodsSalesResponse> {
    @NotBlank(message = "merchantCode不能为空")
    @SerializedName("merchantCode")
    private String merchantCode;
    @NotEmpty(message = "skuCodeList不能为空")
    @SerializedName("skuCodeList")
    private List<Integer> skuCodeList;
    /**
    * <p data-diff-id="ct-diff-id-a63bbfef-106d-47b4-9b5d-5d6741e93606">品牌标识，除华住外其他服务商必传</p>
    */
    @SerializedName("brandIdentify")
    private String brandIdentify;

    public String getMerchantCode() {
        return merchantCode;
    }
    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }
    public List<Integer> getSkuCodeList() {
        return skuCodeList;
    }
    public void setSkuCodeList(List<Integer> skuCodeList) {
        this.skuCodeList = skuCodeList;
    }
    public String getBrandIdentify() {
        return brandIdentify;
    }
    public void setBrandIdentify(String brandIdentify) {
        this.brandIdentify = brandIdentify;
    }


    @Override
    public MeituanResponse<QueryGoodsSalesResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryGoodsSalesResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryGoodsSalesRequest{" + "merchantCode=" + merchantCode + "," + "skuCodeList=" + skuCodeList + "," + "brandIdentify=" + brandIdentify + "}";
    }
}
