package com.meituan.sdk.model.wmoperNg.im.cancelBlockUser;

import com.meituan.sdk.annotations.ApiMeta;
import java.lang.Void;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 商家解除屏蔽顾客
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/im/cancelBlockUser",
    businessId = 16,
    apiVersion = "10017",
    apiName = "cancel_block_user",
    needAuth = true
)
public class CancelBlockUserRequest implements MeituanRequest<Void> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">用户id</font></span></p>
    */
    @NotBlank(message = "openUserId不能为空")
    @SerializedName("open_user_id")
    private String openUserId;

    public String getOpenUserId() {
        return openUserId;
    }
    public void setOpenUserId(String openUserId) {
        this.openUserId = openUserId;
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
        return "CancelBlockUserRequest{" + "openUserId=" + openUserId + "}";
    }
}
