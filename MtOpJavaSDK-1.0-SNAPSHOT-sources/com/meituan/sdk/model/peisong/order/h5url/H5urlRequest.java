package com.meituan.sdk.model.peisong.order.h5url;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 获取骑手位置H5
* This file was automatically generated.
*/
@ApiMeta(
    path = "/peisong/order/rider/location/h5url",
    businessId = 19,
    apiVersion = "10021",
    apiName = "h5url",
    needAuth = true
)
public class H5urlRequest implements MeituanRequest<H5urlResponse> {
    /**
    * <p><span style="color: rgb(42, 42, 42)"><font style="font-size:14px;line-height:22px" data-size="14">美团配送内部订单id，最长不超过32个字符</font></span></p>
    */
    @NotBlank(message = "mtPeisongId不能为空")
    @SerializedName("mt_peisong_id")
    private String mtPeisongId;

    public String getMtPeisongId() {
        return mtPeisongId;
    }
    public void setMtPeisongId(String mtPeisongId) {
        this.mtPeisongId = mtPeisongId;
    }


    @Override
    public MeituanResponse<H5urlResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<H5urlResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "H5urlRequest{" + "mtPeisongId=" + mtPeisongId + "}";
    }
}
