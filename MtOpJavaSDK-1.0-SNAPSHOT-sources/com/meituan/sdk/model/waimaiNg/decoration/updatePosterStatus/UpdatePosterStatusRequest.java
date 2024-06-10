package com.meituan.sdk.model.waimaiNg.decoration.updatePosterStatus;

import com.meituan.sdk.annotations.ApiMeta;
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
    path = "/waimai/ng/decoration/updatePosterStatus",
    businessId = 2,
    apiVersion = "10001",
    apiName = "update_poster_status",
    needAuth = false
)
public class UpdatePosterStatusRequest implements MeituanRequest<Boolean> {
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
    public MeituanResponse<Boolean> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<Boolean>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "UpdatePosterStatusRequest{" + "posterId=" + posterId + "," + "valid=" + valid + "}";
    }
}
