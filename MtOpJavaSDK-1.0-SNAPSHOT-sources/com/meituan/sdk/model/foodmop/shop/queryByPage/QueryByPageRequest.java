package com.meituan.sdk.model.foodmop.shop.queryByPage;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 品牌查询全量门店Id列表（非必接）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/shop/queryByPage",
    businessId = 51,
    apiVersion = "10004",
    apiName = "query_by_page",
    needAuth = true
)
public class QueryByPageRequest implements MeituanRequest<QueryByPageResponse> {
    /**
    * <p data-diff-id="ct-diff-id-94f208e1-a0cb-470f-88e0-90132a4a338a">查询起始位置（批量限制20）</p>
    */
    @NotNull(message = "offset不能为空")
    @SerializedName("offset")
    private Integer offset;
    /**
    * <p data-diff-id="ct-diff-id-16cd96e8-fc6f-4598-bce2-87dac5d7d328">默认500</p><p data-diff-id="ct-diff-id-4dd0c579-8956-4dc3-9535-e8321dd8785a">查询单页大小（单次查询最大500）</p>
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
    public MeituanResponse<QueryByPageResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryByPageResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryByPageRequest{" + "offset=" + offset + "," + "limit=" + limit + "}";
    }
}
