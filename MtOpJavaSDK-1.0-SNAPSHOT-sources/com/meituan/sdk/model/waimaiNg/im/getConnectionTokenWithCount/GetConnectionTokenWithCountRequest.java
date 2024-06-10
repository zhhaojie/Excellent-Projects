package com.meituan.sdk.model.waimaiNg.im.getConnectionTokenWithCount;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 获取多个长连接
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/im/getConnectionTokenWithCount",
    businessId = 2,
    apiVersion = "10048",
    apiName = "get_connection_token_with_count",
    needAuth = true
)
public class GetConnectionTokenWithCountRequest implements MeituanRequest<GetConnectionTokenWithCountResponse> {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">token数量，推荐3，最多为5</font></span></p>
    */
    @NotNull(message = "requiredTokenCount不能为空")
    @SerializedName("required_token_count")
    private Integer requiredTokenCount;

    public Integer getRequiredTokenCount() {
        return requiredTokenCount;
    }
    public void setRequiredTokenCount(Integer requiredTokenCount) {
        this.requiredTokenCount = requiredTokenCount;
    }


    @Override
    public MeituanResponse<GetConnectionTokenWithCountResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GetConnectionTokenWithCountResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GetConnectionTokenWithCountRequest{" + "requiredTokenCount=" + requiredTokenCount + "}";
    }
}
