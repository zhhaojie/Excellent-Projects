package com.meituan.sdk.model.waimaiNg.dish.foodQueryList;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询门店菜品列表
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/dish/queryFoodList",
    businessId = 2,
    apiVersion = "10100",
    apiName = "food_query_list",
    needAuth = true
)
public class FoodQueryListRequest implements MeituanRequest<List<FoodInfo>> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">分页查询偏移量</font></span></p>
    */
    @SerializedName("offset")
    private Integer offset;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">分页查询每页查询的数量,须小于200</font></span></p>
    */
    @SerializedName("limit")
    private Integer limit;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">1：团餐定制菜单；0或空：外卖菜单</font></span></p>
    */
    @SerializedName("orderEntranceType")
    private Integer orderEntranceType;

    public Integer getOffset() {
        return offset;
    }
    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    public Integer getOrderEntranceType() {
        return orderEntranceType;
    }
    public void setOrderEntranceType(Integer orderEntranceType) {
        this.orderEntranceType = orderEntranceType;
    }


    @Override
    public MeituanResponse<List<FoodInfo>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<FoodInfo>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "FoodQueryListRequest{" + "offset=" + offset + "," + "limit=" + limit + "," + "orderEntranceType=" + orderEntranceType + "}";
    }
}
