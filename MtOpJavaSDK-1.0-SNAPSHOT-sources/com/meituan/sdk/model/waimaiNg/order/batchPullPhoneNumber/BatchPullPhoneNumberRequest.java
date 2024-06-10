package com.meituan.sdk.model.waimaiNg.order.batchPullPhoneNumber;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 隐私号-批量拉取用户手机号
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/order/batchPullPhoneNumber",
    businessId = 2,
    apiVersion = "10056",
    apiName = "batch_pull_phone_number",
    needAuth = true
)
public class BatchPullPhoneNumberRequest implements MeituanRequest<List<PhoneNumberInfo>> {
    /**
    * <p>分页查询的偏移量</p>
    */
    @NotNull(message = "degradOffset不能为空")
    @SerializedName("degradOffset")
    private Integer degradOffset;
    @SerializedName("developerId")
    private Long developerId;
    /**
    * <p>每页条数，需小于等于1000</p>
    */
    @NotBlank(message = "degradLimit不能为空")
    @SerializedName("degradLimit")
    private String degradLimit;

    public Integer getDegradOffset() {
        return degradOffset;
    }
    public void setDegradOffset(Integer degradOffset) {
        this.degradOffset = degradOffset;
    }
    public Long getDeveloperId() {
        return developerId;
    }
    public void setDeveloperId(Long developerId) {
        this.developerId = developerId;
    }
    public String getDegradLimit() {
        return degradLimit;
    }
    public void setDegradLimit(String degradLimit) {
        this.degradLimit = degradLimit;
    }


    @Override
    public MeituanResponse<List<PhoneNumberInfo>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<PhoneNumberInfo>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "BatchPullPhoneNumberRequest{" + "degradOffset=" + degradOffset + "," + "developerId=" + developerId + "," + "degradLimit=" + degradLimit + "}";
    }
}
