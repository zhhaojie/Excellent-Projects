package com.meituan.sdk.model.wmoperNg.poi.wmoperngQueryPoiDetail;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 获取门店详情信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/poi/detail",
    businessId = 16,
    apiVersion = "10003",
    apiName = "wmoperng_query_poi_detail",
    needAuth = true
)
public class WmoperngQueryPoiDetailRequest implements MeituanRequest<List<Data>> {
    @NotBlank(message = "biz不能为空")
    @SerializedName("data")
    private String data;

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }


    @Override
    public MeituanResponse<List<Data>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<Data>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this.data);
    }


    @Override
    public String toString() {
        return "WmoperngQueryPoiDetailRequest{" + "data=" + data + "}";
    }
}
