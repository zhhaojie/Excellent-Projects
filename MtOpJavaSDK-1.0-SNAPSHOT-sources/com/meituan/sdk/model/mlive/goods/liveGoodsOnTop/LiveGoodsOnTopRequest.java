package com.meituan.sdk.model.mlive.goods.liveGoodsOnTop;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 直播间商品置顶
* This file was automatically generated.
*/
@ApiMeta(
    path = "/mlive/goods/onTop",
    businessId = 50,
    apiVersion = "10002",
    apiName = "live_goods_on_top",
    needAuth = true
)
public class LiveGoodsOnTopRequest implements MeituanRequest<Boolean> {
    /**
    * <p data-diff-id="ct-diff-id-89886f4a-0a36-43ee-9010-e3b23643bb98">业务商品id</p>
    */
    @SerializedName("outGoodsId")
    private String outGoodsId;
    /**
    * <p data-diff-id="ct-diff-id-525ccb07-7d22-4259-85fa-fa0f01e97930">商品id，与outGoodsId传任意一个，goodsId优先</p>
    */
    @SerializedName("goodsId")
    private String goodsId;
    /**
    * <p data-diff-id="ct-diff-id-6b4d800e-7cc6-4872-aecf-d667fb8071a1">数字人形象id</p>
    */
    @SerializedName("digitalImageId")
    private String digitalImageId;
    /**
    * <p data-diff-id="ct-diff-id-65268f2b-3902-43a5-bce6-88532fb2304a">直播场次id</p>
    */
    @SerializedName("liveId")
    private Long liveId;
    /**
    * <p data-diff-id="ct-diff-id-4b84dabc-b682-4f66-97d8-af9c0f1d446d">商品类型</p>
    */
    @SerializedName("goodsType")
    private Long goodsType;

    public String getOutGoodsId() {
        return outGoodsId;
    }
    public void setOutGoodsId(String outGoodsId) {
        this.outGoodsId = outGoodsId;
    }
    public String getGoodsId() {
        return goodsId;
    }
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }
    public String getDigitalImageId() {
        return digitalImageId;
    }
    public void setDigitalImageId(String digitalImageId) {
        this.digitalImageId = digitalImageId;
    }
    public Long getLiveId() {
        return liveId;
    }
    public void setLiveId(Long liveId) {
        this.liveId = liveId;
    }
    public Long getGoodsType() {
        return goodsType;
    }
    public void setGoodsType(Long goodsType) {
        this.goodsType = goodsType;
    }


    @Override
    public MeituanResponse<Boolean> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<Boolean>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "LiveGoodsOnTopRequest{" + "outGoodsId=" + outGoodsId + "," + "goodsId=" + goodsId + "," + "digitalImageId=" + digitalImageId + "," + "liveId=" + liveId + "," + "goodsType=" + goodsType + "}";
    }
}
