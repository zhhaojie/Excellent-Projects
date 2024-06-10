package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDealQuery;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 2.1.8.查询门店团购配送套餐列表
* This file was automatically generated.
*/
@ApiMeta(
    path = "/dcps/fulfill/poi/deal/query",
    businessId = 46,
    apiVersion = "10034",
    apiName = "group_delivery_poi_deal_query",
    needAuth = true
)
public class GroupDeliveryPoiDealQueryRequest implements MeituanRequest<List<Data>> {
    /**
    * <p data-diff-id="ct-diff-id-4eeb43dd-d50a-45bc-8707-703e7a6a0e58">团单状态，默认查询1/正在售卖状态团单</p><p data-diff-id="ct-diff-id-938a1fbe-83e3-43eb-9c70-dc78a14d6c93">-1 / 全部状态（含以下所有）</p><p data-diff-id="ct-diff-id-0c14cbe8-4106-4a7a-a31e-187e156f2c28">0 / 结束售卖</p><p data-diff-id="ct-diff-id-da33f8b7-743c-474e-8faa-eaaf62900a17">1 / 正在售卖</p><p data-diff-id="ct-diff-id-58c46226-0430-4583-9a9b-4f94e908a528">2 / 隐藏单，前台通过POI列表及deal列表都不可见，但是通过收藏或url可以直接访问并购买</p><p data-diff-id="ct-diff-id-973eb004-0726-49f7-a7e4-410f1322fa99">4 / 未开始售卖</p><p data-diff-id="ct-diff-id-170bc0a2-8478-48c7-a605-012ea131c286">5 / 不可购买</p>
    */
    @SerializedName("dealStatus")
    private Integer dealStatus;
    /**
    * <p data-diff-id="ct-diff-id-621487db-55cc-4304-8dcb-ff3f70ef6fea">一次查询不超过50个，偏移量（&lt;=50）</p>
    */
    @SerializedName("limit")
    private Integer limit;
    /**
    * <p data-diff-id="ct-diff-id-456a9582-68bd-402e-8072-5adf6b4b1ff6">起始点</p>
    */
    @SerializedName("offset")
    private Integer offset;

    public Integer getDealStatus() {
        return dealStatus;
    }
    public void setDealStatus(Integer dealStatus) {
        this.dealStatus = dealStatus;
    }
    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    public Integer getOffset() {
        return offset;
    }
    public void setOffset(Integer offset) {
        this.offset = offset;
    }


    @Override
    public MeituanResponse<List<Data>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<Data>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GroupDeliveryPoiDealQueryRequest{" + "dealStatus=" + dealStatus + "," + "limit=" + limit + "," + "offset=" + offset + "}";
    }
}
