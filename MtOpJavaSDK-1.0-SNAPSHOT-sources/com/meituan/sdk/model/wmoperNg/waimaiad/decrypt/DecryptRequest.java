package com.meituan.sdk.model.wmoperNg.waimaiad.decrypt;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 针对加密字段解密
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/waimaiad/common/decrypt",
    businessId = 16,
    apiVersion = "10001",
    apiName = "decrypt",
    needAuth = false
)
public class DecryptRequest implements MeituanRequest<DecryptResponse> {
    /**
    * 加密后的字符串，英文逗号分隔，最多传入10个密文
    */
    @NotBlank(message = "encryptedValue不能为空")
    @SerializedName("encryptedValue")
    private String encryptedValue;

    public String getEncryptedValue() {
        return encryptedValue;
    }
    public void setEncryptedValue(String encryptedValue) {
        this.encryptedValue = encryptedValue;
    }


    @Override
    public MeituanResponse<DecryptResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<DecryptResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "DecryptRequest{" + "encryptedValue=" + encryptedValue + "}";
    }
}
