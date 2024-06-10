package com.meituan.sdk.model.moses.dialog.trigger;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 摩西机器人会话接口
* This file was automatically generated.
*/
@ApiMeta(
    path = "/moses/dialog/trigger",
    businessId = 28,
    apiVersion = "10004",
    apiName = "trigger",
    needAuth = false
)
public class TriggerRequest implements MeituanRequest<TriggerResponse> {
    /**
    * <p>版本，当前固定2.0.0</p>
    */
    @NotBlank(message = "version不能为空")
    @SerializedName("version")
    private String version;
    /**
    * <p>请求文本内容</p>
    */
    @NotBlank(message = "query不能为空")
    @SerializedName("query")
    private String query;
    /**
    * <p>消息id，接入方自己生成传入，保证<span style="color: null"><font style="font-size:14px;line-height:22px" data-size="14">每次不一样，全局唯一</font></span></p>
    */
    @NotBlank(message = "messageId不能为空")
    @SerializedName("messageId")
    private String messageId;
    /**
    * <p>会话id，根据机器人相关配置进行传入</p>
    */
    @NotBlank(message = "sessionId不能为空")
    @SerializedName("sessionId")
    private String sessionId;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">消息类型，客服场景固定为TEXT</font></span></p>
    */
    @NotBlank(message = "messageType不能为空")
    @SerializedName("messageType")
    private String messageType;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">当前固定为MOSES</font></span></p>
    */
    @NotBlank(message = "source不能为空")
    @SerializedName("source")
    private String source;
    /**
    * <p>应用信息</p>
    */
    @NotNull(message = "appInfo不能为空")
    @SerializedName("appInfo")
    private AppInfo appInfo;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">用户信息，json字符串形式</font></span></p>
    */
    @NotBlank(message = "userInfo不能为空")
    @SerializedName("userInfo")
    private String userInfo;
    /**
    * <p>json字符串形式，内部传入随路的<span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">额外字段。</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">是否需要传入、需要传入哪些是与机器人配置相关，请与相关配置人员沟通</font></span></p>
    */
    @SerializedName("deviceContext")
    private String deviceContext;

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }
    public String getMessageId() {
        return messageId;
    }
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
    public String getSessionId() {
        return sessionId;
    }
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
    public String getMessageType() {
        return messageType;
    }
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public AppInfo getAppInfo() {
        return appInfo;
    }
    public void setAppInfo(AppInfo appInfo) {
        this.appInfo = appInfo;
    }
    public String getUserInfo() {
        return userInfo;
    }
    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }
    public String getDeviceContext() {
        return deviceContext;
    }
    public void setDeviceContext(String deviceContext) {
        this.deviceContext = deviceContext;
    }


    @Override
    public MeituanResponse<TriggerResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<TriggerResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "TriggerRequest{" + "version=" + version + "," + "query=" + query + "," + "messageId=" + messageId + "," + "sessionId=" + sessionId + "," + "messageType=" + messageType + "," + "source=" + source + "," + "appInfo=" + appInfo + "," + "userInfo=" + userInfo + "," + "deviceContext=" + deviceContext + "}";
    }
}
