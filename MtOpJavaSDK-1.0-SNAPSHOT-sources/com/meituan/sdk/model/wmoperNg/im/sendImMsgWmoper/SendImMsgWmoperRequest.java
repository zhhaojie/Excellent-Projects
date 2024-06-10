package com.meituan.sdk.model.wmoperNg.im.sendImMsgWmoper;

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
* 发送IM消息（非接单）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/im/msg/send",
    businessId = 16,
    apiVersion = "10053",
    apiName = "send_im_msg_wmoper",
    needAuth = true
)
public class SendImMsgWmoperRequest implements MeituanRequest<Void> {
    /**
    * <p>业务类型字段，1两方会话，4评价匿名群聊，5粉丝群聊，6三方群聊</p>
    */
    @NotNull(message = "bizType不能为空")
    @SerializedName("biz_type")
    private Integer bizType;
    /**
    * <p>json格式的消息体，不同bizType时，字段不同，解析方式也不同。</p>
    */
    @NotNull(message = "pushContent不能为空")
    @SerializedName("push_content")
    private PushContent pushContent;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">扩展字段</font></span></p>
    */
    @SerializedName("extended_field")
    private String extendedField;

    public Integer getBizType() {
        return bizType;
    }
    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }
    public PushContent getPushContent() {
        return pushContent;
    }
    public void setPushContent(PushContent pushContent) {
        this.pushContent = pushContent;
    }
    public String getExtendedField() {
        return extendedField;
    }
    public void setExtendedField(String extendedField) {
        this.extendedField = extendedField;
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
        return "SendImMsgWmoperRequest{" + "bizType=" + bizType + "," + "pushContent=" + pushContent + "," + "extendedField=" + extendedField + "}";
    }
}
