package com.meituan.sdk.model.waimaiNg.im.sendImMsgWaimai;

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
* 发送IM消息（接单）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/im/msg/send",
    businessId = 2,
    apiVersion = "10055",
    apiName = "send_im_msg_waimai",
    needAuth = true
)
public class SendImMsgWaimaiRequest implements MeituanRequest<Void> {
    /**
    * <p>业务类型字段，1两方会话，4评价匿名群聊，5粉丝群聊，<font style="font-size:15px;line-height:23px" data-size="15">6三方群聊</font></p>
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
    * <p>扩展字段</p>
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
        return "SendImMsgWaimaiRequest{" + "bizType=" + bizType + "," + "pushContent=" + pushContent + "," + "extendedField=" + extendedField + "}";
    }
}
