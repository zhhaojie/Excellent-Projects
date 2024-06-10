package com.meituan.sdk.model.jmcard.members.memberUpdate;

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
* 更新会员信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/jmcard/members/update",
    businessId = 15,
    apiVersion = "10001",
    apiName = "member_update",
    needAuth = true
)
public class MemberUpdateRequest implements MeituanRequest<MemberUpdateResponse> {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">商户唯一标识，领卡事件中的userOpenId</font></span></p>
    */
    @NotBlank(message = "userOpenId不能为空")
    @SerializedName("userOpenId")
    private String userOpenId;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">该用户使用的卡模板key，应该能对应到一张唯一的卡模板，否则报错</font></span></p>
    */
    @SerializedName("defaultTemplateKey")
    private String defaultTemplateKey;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">会员卡更新内容</font></span></p>
    */
    @NotNull(message = "externalData不能为空")
    @SerializedName("externalData")
    private ExternalData externalData;

    public String getUserOpenId() {
        return userOpenId;
    }
    public void setUserOpenId(String userOpenId) {
        this.userOpenId = userOpenId;
    }
    public String getDefaultTemplateKey() {
        return defaultTemplateKey;
    }
    public void setDefaultTemplateKey(String defaultTemplateKey) {
        this.defaultTemplateKey = defaultTemplateKey;
    }
    public ExternalData getExternalData() {
        return externalData;
    }
    public void setExternalData(ExternalData externalData) {
        this.externalData = externalData;
    }


    @Override
    public MeituanResponse<MemberUpdateResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<MemberUpdateResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "MemberUpdateRequest{" + "userOpenId=" + userOpenId + "," + "defaultTemplateKey=" + defaultTemplateKey + "," + "externalData=" + externalData + "}";
    }
}
