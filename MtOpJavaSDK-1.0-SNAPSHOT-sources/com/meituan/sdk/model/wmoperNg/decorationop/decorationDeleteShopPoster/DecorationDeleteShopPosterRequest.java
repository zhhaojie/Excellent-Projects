package com.meituan.sdk.model.wmoperNg.decorationop.decorationDeleteShopPoster;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 商家开放平台删除海报
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/decorationop/deleteShopPoster",
    businessId = 16,
    apiVersion = "10000",
    apiName = "decoration_delete_shop_poster",
    needAuth = true
)
public class DecorationDeleteShopPosterRequest implements MeituanRequest<String> {
    /**
    * <p>海报id</p>
    */
    @NotNull(message = "posterId不能为空")
    @SerializedName("poster_id")
    private Long posterId;

    public Long getPosterId() {
        return posterId;
    }
    public void setPosterId(Long posterId) {
        this.posterId = posterId;
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
        return "DecorationDeleteShopPosterRequest{" + "posterId=" + posterId + "}";
    }
}
