package com.meituan.sdk.model.wmoperNg.food.wmoperFoodQueryList;

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
    path = "/wmoper/ng/food/queryFoodList",
    businessId = 16,
    apiVersion = "10027",
    apiName = "wmoper_food_query_list",
    needAuth = false
)
public class WmoperFoodQueryListRequest implements MeituanRequest<List<WmoperFoodQueryListResponse>> {
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


    @Override
    public MeituanResponse<List<WmoperFoodQueryListResponse>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<WmoperFoodQueryListResponse>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "WmoperFoodQueryListRequest{" + "offset=" + offset + "," + "limit=" + limit + "}";
    }
}
