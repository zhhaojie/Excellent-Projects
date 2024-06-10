package com.meituan.sdk.model.wmoperNg.im.msgRead;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 设置设置消息已读状态
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/im/msgRead",
    businessId = 16,
    apiVersion = "10008",
    apiName = "msg_read",
    needAuth = false
)
public class MsgReadRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">用户ID</font></span></p>
    */
    @NotNull(message = "openUserId不能为空")
    @SerializedName("openUserId")
    private Long openUserId;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">消息ID</font></span></p>
    */
    @NotNull(message = "msgId不能为空")
    @SerializedName("msgId")
    private Long msgId;

    public Long getOpenUserId() {
        return openUserId;
    }
    public void setOpenUserId(Long openUserId) {
        this.openUserId = openUserId;
    }
    public Long getMsgId() {
        return msgId;
    }
    public void setMsgId(Long msgId) {
        this.msgId = msgId;
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
        return "MsgReadRequest{" + "openUserId=" + openUserId + "," + "msgId=" + msgId + "}";
    }
}
