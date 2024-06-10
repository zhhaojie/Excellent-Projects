package com.meituan.sdk.model.wmoperNg.decoration.decorationQueryPoster;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 商家开放平台海报查询
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/decoration/queryPoster",
    businessId = 16,
    apiVersion = "10000",
    apiName = "decoration_query_poster",
    needAuth = true
)
public class DecorationQueryPosterRequest implements MeituanRequest<DecorationQueryPosterResponse> {
    /**
    * <p>页码</p>
    */
    @NotNull(message = "pageNum不能为空")
    @SerializedName("pageNum")
    private Integer pageNum;
    /**
    * <p>每页数量</p>
    */
    @NotNull(message = "pageSize不能为空")
    @SerializedName("pageSize")
    private Integer pageSize;

    public Integer getPageNum() {
        return pageNum;
    }
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
    public Integer getPageSize() {
        return pageSize;
    }
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    @Override
    public MeituanResponse<DecorationQueryPosterResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<DecorationQueryPosterResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "DecorationQueryPosterRequest{" + "pageNum=" + pageNum + "," + "pageSize=" + pageSize + "}";
    }
}
