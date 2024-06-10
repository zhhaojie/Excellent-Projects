package com.meituan.sdk.model.wmoperNg.waimaiad.peerAdBidprice;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 竞价推广-附近商家平均出价
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/waimaiad/peer/bidprice",
    businessId = 16,
    apiVersion = "10008",
    apiName = "peer_ad_bidprice",
    needAuth = false
)
public class PeerAdBidpriceRequest implements MeituanRequest<PeerAdBidpriceResponse> {



    @Override
    public MeituanResponse<PeerAdBidpriceResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<PeerAdBidpriceResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
