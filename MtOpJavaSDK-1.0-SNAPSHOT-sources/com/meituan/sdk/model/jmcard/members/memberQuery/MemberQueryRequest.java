package com.meituan.sdk.model.jmcard.members.memberQuery;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询用户会员卡信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/jmcard/members/query",
    businessId = 15,
    apiVersion = "10001",
    apiName = "member_query",
    needAuth = true
)
public class MemberQueryRequest implements MeituanRequest<MemberQueryResponse> {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">商户唯一标识，领卡事件中的userOpenId</font></span></p>
    */
    @NotBlank(message = "userOpenId不能为空")
    @SerializedName("userOpenId")
    private String userOpenId;

    public String getUserOpenId() {
        return userOpenId;
    }
    public void setUserOpenId(String userOpenId) {
        this.userOpenId = userOpenId;
    }


    @Override
    public MeituanResponse<MemberQueryResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<MemberQueryResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "MemberQueryRequest{" + "userOpenId=" + userOpenId + "}";
    }
}
