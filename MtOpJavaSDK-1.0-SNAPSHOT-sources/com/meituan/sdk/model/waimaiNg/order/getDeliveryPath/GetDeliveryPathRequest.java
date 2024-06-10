package com.meituan.sdk.model.waimaiNg.order.getDeliveryPath;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询众包骑手坐标
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/order/getDeliveryPath",
    businessId = 2,
    apiVersion = "10013",
    apiName = "get_delivery_path",
    needAuth = true
)
public class GetDeliveryPathRequest implements MeituanRequest<List<GetDeliveryPathResponse>> {
    @SerializedName("data")
    private String data;

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }


    @Override
    public MeituanResponse<List<GetDeliveryPathResponse>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<GetDeliveryPathResponse>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this.data);
    }


    @Override
    public String toString() {
        return "GetDeliveryPathRequest{" + "data=" + data + "}";
    }
}
