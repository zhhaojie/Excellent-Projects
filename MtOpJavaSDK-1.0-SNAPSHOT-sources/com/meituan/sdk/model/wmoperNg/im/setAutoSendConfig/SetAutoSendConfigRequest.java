package com.meituan.sdk.model.wmoperNg.im.setAutoSendConfig;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 自动回复设置
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/im/setAutoSendConfig",
    businessId = 16,
    apiVersion = "10019",
    apiName = "set_auto_send_config",
    needAuth = true
)
public class SetAutoSendConfigRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">本次只有18，邀请顾客评价</font></span></p>
    */
    @NotNull(message = "autoSendType不能为空")
    @SerializedName("auto_send_type")
    private Integer autoSendType;
    /**
    * <p>当auto_send_type为18时，传0</p><p style="text-align: center;">UPDATE_STATUS(0),<br>UPDATE_CONTENT(1),<br>UPDATE_CONTENT_ONLY(2);</p>
    */
    @NotNull(message = "opType不能为空")
    @SerializedName("op_type")
    private Integer opType;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">权益开关状态 0 关闭 1 打开;</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">op_type为0、1时必填;</font></p>
    */
    @SerializedName("status")
    private Integer status;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">op_type为1、2时必填</font></span></p>
    */
    @SerializedName("content")
    private String content;

    public Integer getAutoSendType() {
        return autoSendType;
    }
    public void setAutoSendType(Integer autoSendType) {
        this.autoSendType = autoSendType;
    }
    public Integer getOpType() {
        return opType;
    }
    public void setOpType(Integer opType) {
        this.opType = opType;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
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
        return "SetAutoSendConfigRequest{" + "autoSendType=" + autoSendType + "," + "opType=" + opType + "," + "status=" + status + "," + "content=" + content + "}";
    }
}
