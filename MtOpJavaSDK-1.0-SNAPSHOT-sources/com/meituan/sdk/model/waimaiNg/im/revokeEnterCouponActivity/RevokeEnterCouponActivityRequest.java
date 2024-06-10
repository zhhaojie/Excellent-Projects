package com.meituan.sdk.model.waimaiNg.im.revokeEnterCouponActivity;

import com.meituan.sdk.annotations.ApiMeta;
import java.lang.Void;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 停止当前的进群领券活动
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/im/revokeEnterCouponActivity",
    businessId = 2,
    apiVersion = "10040",
    apiName = "revoke_enter_coupon_activity",
    needAuth = true
)
public class RevokeEnterCouponActivityRequest implements MeituanRequest<Void> {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">群ID</font></span></p>
    */
    @SerializedName("groupId")
    private Long groupId;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">活动ID</font></span></p>
    */
    @SerializedName("activityId")
    private Integer activityId;

    public Long getGroupId() {
        return groupId;
    }
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
    public Integer getActivityId() {
        return activityId;
    }
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
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
        return "RevokeEnterCouponActivityRequest{" + "groupId=" + groupId + "," + "activityId=" + activityId + "}";
    }
}
