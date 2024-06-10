package com.meituan.sdk.model.wmoperNg.waimaiad.bizPoiFood;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 经营分析-菜品信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/waimaiad/biz/foodlist",
    businessId = 16,
    apiVersion = "10005",
    apiName = "biz_poi_food",
    needAuth = false
)
public class BizPoiFoodRequest implements MeituanRequest<BizPoiFoodResponse> {
    /**
    * 日期，yyyyMMdd格式
    */
    @NotBlank(message = "dt不能为空")
    @SerializedName("dt")
    private String dt;

    public String getDt() {
        return dt;
    }
    public void setDt(String dt) {
        this.dt = dt;
    }


    @Override
    public MeituanResponse<BizPoiFoodResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<BizPoiFoodResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "BizPoiFoodRequest{" + "dt=" + dt + "}";
    }
}
