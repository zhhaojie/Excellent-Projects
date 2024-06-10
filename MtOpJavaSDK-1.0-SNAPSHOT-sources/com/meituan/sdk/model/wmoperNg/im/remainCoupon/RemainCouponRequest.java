package com.meituan.sdk.model.wmoperNg.im.remainCoupon;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询门店剩余发券数
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/im/remainCoupon",
    businessId = 16,
    apiVersion = "10055",
    apiName = "remain_coupon",
    needAuth = true
)
public class RemainCouponRequest implements MeituanRequest<RemainCouponResponse> {
    /**
    * <p>粉丝群Id</p>
    */
    @NotNull(message = "groupId不能为空")
    @SerializedName("groupId")
    private Long groupId;

    public Long getGroupId() {
        return groupId;
    }
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }


    @Override
    public MeituanResponse<RemainCouponResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<RemainCouponResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "RemainCouponRequest{" + "groupId=" + groupId + "}";
    }
}
