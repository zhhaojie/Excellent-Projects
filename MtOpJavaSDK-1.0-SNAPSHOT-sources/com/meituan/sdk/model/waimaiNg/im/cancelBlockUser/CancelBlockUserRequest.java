package com.meituan.sdk.model.waimaiNg.im.cancelBlockUser;

import com.meituan.sdk.annotations.ApiMeta;
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
    path = "/waimai/ng/im/cancelBlockUser",
    businessId = 2,
    apiVersion = "10021",
    apiName = "cancel_block_user",
    needAuth = true
)
public class CancelBlockUserRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">多个用户id，以,分割，</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">eg: 123456,654321</font></span></p>
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
        return "CancelBlockUserRequest{" + "openUserId=" + openUserId + "}";
    }
}
