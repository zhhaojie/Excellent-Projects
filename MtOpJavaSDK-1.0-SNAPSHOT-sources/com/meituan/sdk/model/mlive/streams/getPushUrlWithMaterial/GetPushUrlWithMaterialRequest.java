package com.meituan.sdk.model.mlive.streams.getPushUrlWithMaterial;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 用直播物料获取推流地址
* This file was automatically generated.
*/
@ApiMeta(
    path = "/mlive/streams/getPushUrlWithLiveMaterial",
    businessId = 50,
    apiVersion = "10006",
    apiName = "get_push_url_with_material",
    needAuth = true
)
public class GetPushUrlWithMaterialRequest implements MeituanRequest<List<LiveStreamDTO>> {
    /**
    * <p data-diff-id="ct-diff-id-f85b6f13-7e09-4815-a45b-f8772fb6e2b2"><span style="color: rgb(51, 51, 51)">必传，直播推流相关参数</span></p>
    */
    @SerializedName("streamParam")
    private StreamParam streamParam;
    /**
    * <p data-diff-id="ct-diff-id-4be1b55d-2931-41b2-a7f1-078aff38bdb6"><span style="color: rgb(51, 51, 51)">直播物料。</span></p><p data-diff-id="ct-diff-id-7f03ba5b-4477-469b-813a-40cea03b82e2"><span style="color: rgb(51, 51, 51)">同一个liveid首次必传，重复获取推流地址时，非必传</span></p>
    */
    @SerializedName("liveMateria")
    private LiveMateria liveMateria;
    /**
    * <p data-diff-id="ct-diff-id-6678fef0-591f-4c98-8c00-2a1c8e24d256"><span style="color: rgb(51, 51, 51)">必传，直播id</span></p>
    */
    @SerializedName("liveId")
    private Long liveId;

    public StreamParam getStreamParam() {
        return streamParam;
    }
    public void setStreamParam(StreamParam streamParam) {
        this.streamParam = streamParam;
    }
    public LiveMateria getLiveMateria() {
        return liveMateria;
    }
    public void setLiveMateria(LiveMateria liveMateria) {
        this.liveMateria = liveMateria;
    }
    public Long getLiveId() {
        return liveId;
    }
    public void setLiveId(Long liveId) {
        this.liveId = liveId;
    }


    @Override
    public MeituanResponse<List<LiveStreamDTO>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<LiveStreamDTO>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GetPushUrlWithMaterialRequest{" + "streamParam=" + streamParam + "," + "liveMateria=" + liveMateria + "," + "liveId=" + liveId + "}";
    }
}
