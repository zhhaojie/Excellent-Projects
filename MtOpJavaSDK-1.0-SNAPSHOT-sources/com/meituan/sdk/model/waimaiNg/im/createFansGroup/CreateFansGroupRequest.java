package com.meituan.sdk.model.waimaiNg.im.createFansGroup;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 创建粉丝群
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/im/createFansGroup",
    businessId = 2,
    apiVersion = "10040",
    apiName = "create_fans_group",
    needAuth = true
)
public class CreateFansGroupRequest implements MeituanRequest<CreateFansGroupResponse> {
    /**
    * <p><span style="color: rgb(0, 0, 0)"><font style="font-size:14px;line-height:22px" data-size="14">入群引导语</font></span></p>
    */
    @NotBlank(message = "groupIntro不能为空")
    @SerializedName("groupIntro")
    private String groupIntro;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">用户入群欢迎语</font></span><br></p>
    */
    @NotBlank(message = "groupWelcomeMsg不能为空")
    @SerializedName("groupWelcomeMsg")
    private String groupWelcomeMsg;
    @SerializedName("groupEnterCoupon")
    private GroupEnterCoupon groupEnterCoupon;

    public String getGroupIntro() {
        return groupIntro;
    }
    public void setGroupIntro(String groupIntro) {
        this.groupIntro = groupIntro;
    }
    public String getGroupWelcomeMsg() {
        return groupWelcomeMsg;
    }
    public void setGroupWelcomeMsg(String groupWelcomeMsg) {
        this.groupWelcomeMsg = groupWelcomeMsg;
    }
    public GroupEnterCoupon getGroupEnterCoupon() {
        return groupEnterCoupon;
    }
    public void setGroupEnterCoupon(GroupEnterCoupon groupEnterCoupon) {
        this.groupEnterCoupon = groupEnterCoupon;
    }


    @Override
    public MeituanResponse<CreateFansGroupResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<CreateFansGroupResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CreateFansGroupRequest{" + "groupIntro=" + groupIntro + "," + "groupWelcomeMsg=" + groupWelcomeMsg + "," + "groupEnterCoupon=" + groupEnterCoupon + "}";
    }
}
