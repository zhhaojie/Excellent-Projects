package com.meituan.sdk.model.foodmop.shop.tagBind;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 品牌门店打标签
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/shop/tag/bind",
    businessId = 51,
    apiVersion = "10005",
    apiName = "tag_bind",
    needAuth = true
)
public class TagBindRequest implements MeituanRequest<TagBindResponse> {
    /**
    * <p data-diff-id="ct-diff-id-4058ad3d-9ff2-4230-8c6e-a76722bee4f0"><strong><span style="color: rgb(81, 90, 110)">Map&lt;String, List&lt;String&gt;&gt;</span></strong></p><p data-diff-id="ct-diff-id-27f55f64-08d1-450e-9231-b7a6e6309a50">key：厂商门店ID</p><p data-diff-id="ct-diff-id-1f3a4d91-1ca1-4537-91ab-1cd1d01a0c06">value：标签Code列表</p><p data-diff-id="ct-diff-id-96eea3df-a463-478d-ab1c-f704388e9130"><strong><span style="color: rgb(81, 90, 110)">{"1234"&nbsp;: [&nbsp;"1",&nbsp;"2"]}</span></strong></p>
    */
    @SerializedName("map")
    private DataMap map;

    public DataMap getMap() {
        return map;
    }
    public void setMap(DataMap map) {
        this.map = map;
    }


    @Override
    public MeituanResponse<TagBindResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<TagBindResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "TagBindRequest{" + "map=" + map + "}";
    }
}
