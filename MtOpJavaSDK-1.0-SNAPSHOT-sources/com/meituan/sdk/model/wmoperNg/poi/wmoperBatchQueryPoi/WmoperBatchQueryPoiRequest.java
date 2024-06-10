package com.meituan.sdk.model.wmoperNg.poi.wmoperBatchQueryPoi;

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
* 批量获取门店详情信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/poi/mget",
    businessId = 16,
    apiVersion = "10009",
    apiName = "wmoper_batch_query_poi",
    needAuth = false
)
public class WmoperBatchQueryPoiRequest implements MeituanRequest<List<WmoperBatchQueryPoiResponse>> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">epoiId集合(半角逗号分隔)</font></span></p>
    */
    @NotBlank(message = "epoiIds不能为空")
    @SerializedName("epoiIds")
    private String epoiIds;

    public String getEpoiIds() {
        return epoiIds;
    }
    public void setEpoiIds(String epoiIds) {
        this.epoiIds = epoiIds;
    }


    @Override
    public MeituanResponse<List<WmoperBatchQueryPoiResponse>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<WmoperBatchQueryPoiResponse>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "WmoperBatchQueryPoiRequest{" + "epoiIds=" + epoiIds + "}";
    }
}
