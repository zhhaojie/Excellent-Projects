package com.meituan.sdk.model.waimaiNg.decoration.deleteShopPoster;

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
    path = "/waimai/ng/decoration/deleteShopPoster",
    businessId = 2,
    apiVersion = "10001",
    apiName = "delete_shop_poster",
    needAuth = false
)
public class DeleteShopPosterRequest implements MeituanRequest<String> {
    /**
    * <p>海报id</p>
    */
    @NotNull(message = "posterId不能为空")
    @SerializedName("posterId")
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
        return "DeleteShopPosterRequest{" + "posterId=" + posterId + "}";
    }
}
