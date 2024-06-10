package com.meituan.sdk.model.waimaiNg.dish.dishQueryListByEpoiid;

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
* 根据ERP的门店id查询门店下的菜品【不包含美团的菜品Id】
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/dish/queryListByEPoiId",
    businessId = 2,
    apiVersion = "10100",
    apiName = "dish_query_list_by_epoiid",
    needAuth = true
)
public class DishQueryListByEpoiidRequest implements MeituanRequest<List<DishInfo>> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">起始条目数</font></span></p>
    */
    @NotNull(message = "offset不能为空")
    @SerializedName("offset")
    private Integer offset;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">每页大小，须小于200</font></span></p>
    */
    @NotNull(message = "limit不能为空")
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
    public MeituanResponse<List<DishInfo>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<DishInfo>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "DishQueryListByEpoiidRequest{" + "offset=" + offset + "," + "limit=" + limit + "}";
    }
}
