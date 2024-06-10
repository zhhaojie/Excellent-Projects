package com.meituan.sdk.model.mlive.goods.queryLiveGoodsInfo;

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
* 查询直播间商品
* This file was automatically generated.
*/
@ApiMeta(
    path = "/mlive/goods/query",
    businessId = 50,
    apiVersion = "10003",
    apiName = "query_live_goods_info",
    needAuth = true
)
public class QueryLiveGoodsInfoRequest implements MeituanRequest<List<LiveRoomGoodsDTO>> {
    /**
    * <p data-diff-id="ct-diff-id-cd1a4334-e36a-47a0-92e3-c9e42d9e728f">直播场次Id</p>
    */
    @NotNull(message = "liveId不能为空")
    @SerializedName("liveId")
    private Long liveId;

    public Long getLiveId() {
        return liveId;
    }
    public void setLiveId(Long liveId) {
        this.liveId = liveId;
    }


    @Override
    public MeituanResponse<List<LiveRoomGoodsDTO>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<LiveRoomGoodsDTO>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryLiveGoodsInfoRequest{" + "liveId=" + liveId + "}";
    }
}
