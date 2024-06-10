package com.meituan.sdk.model.waimaiNg.act.actDiscountActivityOrderLimit;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 更新折扣商品外卖门店维度每单限购数量
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/act/discount/activityOrderLimit",
    businessId = 2,
    apiVersion = "10005",
    apiName = "act_discount_activity_order_limit",
    needAuth = true
)
public class ActDiscountActivityOrderLimitRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:13px;line-height:21px" data-size="13">本门店每单可购买的折扣商品数量</font></span></p>
    */
    @NotNull(message = "activityOrderLimit不能为空")
    @SerializedName("activityOrderLimit")
    private Integer activityOrderLimit;

    public Integer getActivityOrderLimit() {
        return activityOrderLimit;
    }
    public void setActivityOrderLimit(Integer activityOrderLimit) {
        this.activityOrderLimit = activityOrderLimit;
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
        return "ActDiscountActivityOrderLimitRequest{" + "activityOrderLimit=" + activityOrderLimit + "}";
    }
}
