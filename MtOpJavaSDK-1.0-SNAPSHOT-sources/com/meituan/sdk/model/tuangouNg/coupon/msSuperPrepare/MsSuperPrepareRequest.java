package com.meituan.sdk.model.tuangouNg.coupon.msSuperPrepare;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 提供开放平台的预验券接口，聚合商品数据信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/tuangou/ng/coupon/msprepare",
    businessId = 1,
    apiVersion = "10017",
    apiName = "ms_super_prepare",
    needAuth = true
)
public class MsSuperPrepareRequest implements MeituanRequest<MsSuperPrepareResponse> {
    /**
    * <p data-diff-id="ct-diff-id-8ae98d45-098c-4093-8808-cce3c71d03e1"><span style="color: rgba(0, 0, 0, 0.87)">券码</span></p>
    */
    @SerializedName("code")
    private String code;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }


    @Override
    public MeituanResponse<MsSuperPrepareResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<MsSuperPrepareResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "MsSuperPrepareRequest{" + "code=" + code + "}";
    }
}
