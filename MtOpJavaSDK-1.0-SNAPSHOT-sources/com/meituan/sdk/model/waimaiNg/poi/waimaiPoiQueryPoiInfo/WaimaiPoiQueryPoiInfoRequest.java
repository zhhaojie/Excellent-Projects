package com.meituan.sdk.model.waimaiNg.poi.waimaiPoiQueryPoiInfo;

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
* 查询门店信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/poi/queryPoiInfo",
    businessId = 2,
    apiVersion = "10023",
    apiName = "waimai_poi_query_poi_info",
    needAuth = true
)
public class WaimaiPoiQueryPoiInfoRequest implements MeituanRequest<List<PoiInfo>> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">ERP方门店id，英文逗号分隔</font></span></p>
    */
    @NotBlank(message = "ePoiIds不能为空")
    @SerializedName("ePoiIds")
    private String ePoiIds;

    public String getEPoiIds() {
        return ePoiIds;
    }
    public void setEPoiIds(String ePoiIds) {
        this.ePoiIds = ePoiIds;
    }


    @Override
    public MeituanResponse<List<PoiInfo>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<PoiInfo>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "WaimaiPoiQueryPoiInfoRequest{" + "ePoiIds=" + ePoiIds + "}";
    }
}
