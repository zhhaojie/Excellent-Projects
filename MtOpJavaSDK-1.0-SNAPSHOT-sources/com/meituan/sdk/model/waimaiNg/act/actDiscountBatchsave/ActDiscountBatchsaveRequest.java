package com.meituan.sdk.model.waimaiNg.act.actDiscountBatchsave;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 批量创建或更新折扣商品
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/act/discount/batchsave",
    businessId = 2,
    apiVersion = "10000",
    apiName = "act_discount_batchsave",
    needAuth = true
)
public class ActDiscountBatchsaveRequest implements MeituanRequest<String> {
    @NotBlank(message = "actData不能为空")
    @SerializedName("actData")
    private String actData;

    public String getActData() {
        return actData;
    }
    public void setActData(String actData) {
        this.actData = actData;
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
        return "ActDiscountBatchsaveRequest{" + "actData=" + actData + "}";
    }
}
