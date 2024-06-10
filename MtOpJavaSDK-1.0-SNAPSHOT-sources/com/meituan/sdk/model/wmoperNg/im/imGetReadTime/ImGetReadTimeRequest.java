package com.meituan.sdk.model.wmoperNg.im.imGetReadTime;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询会话最新已读时间戳
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/im/userReadTime",
    businessId = 16,
    apiVersion = "10008",
    apiName = "im_get_read_time",
    needAuth = true
)
public class ImGetReadTimeRequest implements MeituanRequest<ImGetReadTimeResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">用户ID</font></span></p>
    */
    @NotNull(message = "openUserId不能为空")
    @SerializedName("openUserId")
    private Long openUserId;

    public Long getOpenUserId() {
        return openUserId;
    }
    public void setOpenUserId(Long openUserId) {
        this.openUserId = openUserId;
    }


    @Override
    public MeituanResponse<ImGetReadTimeResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<ImGetReadTimeResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "ImGetReadTimeRequest{" + "openUserId=" + openUserId + "}";
    }
}
