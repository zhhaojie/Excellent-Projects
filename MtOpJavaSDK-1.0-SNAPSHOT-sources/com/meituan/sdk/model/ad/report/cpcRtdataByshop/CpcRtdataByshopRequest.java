package com.meituan.sdk.model.ad.report.cpcRtdataByshop;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* cpc门店实时天数据
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/report/getCpcRtDataByShop",
    businessId = 22,
    apiVersion = "10018",
    apiName = "cpc_rtdata_byshop",
    needAuth = false
)
public class CpcRtdataByshopRequest implements MeituanRequest<List<LaunchInfo>> {
    /**
    * 子账号id
    */
    @SerializedName("accountId")
    private Integer accountId;
    /**
    * 门店列表,单次最多支持50个
    */
    @SerializedName("shopIds")
    private List<Long> shopIds;
    /**
    * 点评门店id还是美团门店id，默认点评
    */
    @SerializedName("shopType")
    private Integer shopType;

    public Integer getAccountId() {
        return accountId;
    }
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
    public List<Long> getShopIds() {
        return shopIds;
    }
    public void setShopIds(List<Long> shopIds) {
        this.shopIds = shopIds;
    }
    public Integer getShopType() {
        return shopType;
    }
    public void setShopType(Integer shopType) {
        this.shopType = shopType;
    }


    @Override
    public MeituanResponse<List<LaunchInfo>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<LaunchInfo>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CpcRtdataByshopRequest{" + "accountId=" + accountId + "," + "shopIds=" + shopIds + "," + "shopType=" + shopType + "}";
    }
}
