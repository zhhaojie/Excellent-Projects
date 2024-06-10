package com.meituan.sdk.model.waimaiNg.poi.getPoiScoreDetail;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询店铺分数据
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/poi/getPoiScoreDetail",
    businessId = 2,
    apiVersion = "10004",
    apiName = "get_poi_score_detail",
    needAuth = true
)
public class GetPoiScoreDetailRequest implements MeituanRequest<GetPoiScoreDetailResponse> {



    @Override
    public MeituanResponse<GetPoiScoreDetailResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GetPoiScoreDetailResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
