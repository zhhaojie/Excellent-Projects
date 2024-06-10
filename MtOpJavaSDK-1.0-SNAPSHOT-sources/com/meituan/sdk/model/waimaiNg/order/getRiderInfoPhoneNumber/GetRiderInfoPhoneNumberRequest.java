package com.meituan.sdk.model.waimaiNg.order.getRiderInfoPhoneNumber;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 隐私号-批量拉取骑手手机号
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/order/getRiderInfoPhoneNumber",
    businessId = 2,
    apiVersion = "10053",
    apiName = "get_rider_info_phone_number",
    needAuth = true
)
public class GetRiderInfoPhoneNumberRequest implements MeituanRequest<List<RiderPhoneNumberInfo>> {
    @SerializedName("developerId")
    private Long developerId;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">分页查询的偏移量</font></span></p>
    */
    @NotNull(message = "degradOffset不能为空")
    @SerializedName("degradOffset")
    private Integer degradOffset;
    /**
    * <p>每页条数，需小于等于1000</p>
    */
    @NotNull(message = "degradLimit不能为空")
    @SerializedName("degradLimit")
    private Integer degradLimit;

    public Long getDeveloperId() {
        return developerId;
    }
    public void setDeveloperId(Long developerId) {
        this.developerId = developerId;
    }
    public Integer getDegradOffset() {
        return degradOffset;
    }
    public void setDegradOffset(Integer degradOffset) {
        this.degradOffset = degradOffset;
    }
    public Integer getDegradLimit() {
        return degradLimit;
    }
    public void setDegradLimit(Integer degradLimit) {
        this.degradLimit = degradLimit;
    }


    @Override
    public MeituanResponse<List<RiderPhoneNumberInfo>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<RiderPhoneNumberInfo>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GetRiderInfoPhoneNumberRequest{" + "developerId=" + developerId + "," + "degradOffset=" + degradOffset + "," + "degradLimit=" + degradLimit + "}";
    }
}
