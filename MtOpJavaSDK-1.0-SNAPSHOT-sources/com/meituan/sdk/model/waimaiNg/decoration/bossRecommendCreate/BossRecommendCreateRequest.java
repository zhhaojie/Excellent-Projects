package com.meituan.sdk.model.waimaiNg.decoration.bossRecommendCreate;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 商家开放平台创建、修改、删除老板推荐
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/decoration/bossRecommendCreate",
    businessId = 2,
    apiVersion = "10001",
    apiName = "boss_recommend_create",
    needAuth = false
)
public class BossRecommendCreateRequest implements MeituanRequest<String> {
    /**
    * <p>ERP自定义商品ID列表，英文逗号分隔</p>
    */
    @SerializedName("appFoodCodes")
    private String appFoodCodes;
    /**
    * <p>老板推荐是否开启 </p><p>0：关闭 </p><p>1：自定义 </p><p>2：智能推荐</p>
    */
    @SerializedName("state")
    private Integer state;

    public String getAppFoodCodes() {
        return appFoodCodes;
    }
    public void setAppFoodCodes(String appFoodCodes) {
        this.appFoodCodes = appFoodCodes;
    }
    public Integer getState() {
        return state;
    }
    public void setState(Integer state) {
        this.state = state;
    }


    @Override
    public MeituanResponse<String> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<String>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "BossRecommendCreateRequest{" + "appFoodCodes=" + appFoodCodes + "," + "state=" + state + "}";
    }
}
