package com.meituan.sdk.model.wmoperNg.waimaiad.authAntiForceTry;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 增值平台接口校验
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/waimaiad/marketplace/app/auth",
    businessId = 16,
    apiVersion = "10016",
    apiName = "auth_anti_force_try",
    needAuth = true
)
public class AuthAntiForceTryRequest implements MeituanRequest<AuthAntiForceTryResponse> {
    @NotBlank(message = "developerId不能为空")
    @SerializedName("developerId")
    private String developerId;
    @NotBlank(message = "opBizCode不能为空")
    @SerializedName("opBizCode")
    private String opBizCode;
    @NotBlank(message = "bizToken不能为空")
    @SerializedName("bizToken")
    private String bizToken;

    public String getDeveloperId() {
        return developerId;
    }
    public void setDeveloperId(String developerId) {
        this.developerId = developerId;
    }
    public String getOpBizCode() {
        return opBizCode;
    }
    public void setOpBizCode(String opBizCode) {
        this.opBizCode = opBizCode;
    }
    public String getBizToken() {
        return bizToken;
    }
    public void setBizToken(String bizToken) {
        this.bizToken = bizToken;
    }


    @Override
    public MeituanResponse<AuthAntiForceTryResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<AuthAntiForceTryResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "AuthAntiForceTryRequest{" + "developerId=" + developerId + "," + "opBizCode=" + opBizCode + "," + "bizToken=" + bizToken + "}";
    }
}
