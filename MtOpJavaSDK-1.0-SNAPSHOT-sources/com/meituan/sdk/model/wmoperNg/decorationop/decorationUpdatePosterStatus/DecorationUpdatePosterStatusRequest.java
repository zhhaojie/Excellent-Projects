package com.meituan.sdk.model.wmoperNg.decorationop.decorationUpdatePosterStatus;

import com.meituan.sdk.annotations.ApiMeta;
import java.lang.Void;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 商家开放平台使用海报
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/decorationop/updatePosterStatus",
    businessId = 16,
    apiVersion = "10009",
    apiName = "decoration_update_poster_status",
    needAuth = true
)
public class DecorationUpdatePosterStatusRequest implements MeituanRequest<Void> {
    /**
    * <p>海报id</p>
    */
    @NotNull(message = "posterId不能为空")
    @SerializedName("posterId")
    private Long posterId;
    /**
    * <p>展示状态 0：不展示 1：展示</p>
    */
    @NotNull(message = "valid不能为空")
    @SerializedName("valid")
    private Integer valid;

    public Long getPosterId() {
        return posterId;
    }
    public void setPosterId(Long posterId) {
        this.posterId = posterId;
    }
    public Integer getValid() {
        return valid;
    }
    public void setValid(Integer valid) {
        this.valid = valid;
    }


    @Override
    public MeituanResponse<Void> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<Void>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "DecorationUpdatePosterStatusRequest{" + "posterId=" + posterId + "," + "valid=" + valid + "}";
    }
}
