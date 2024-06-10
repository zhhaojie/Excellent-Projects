package com.meituan.sdk.model.wmoperNg.im.queryCoupon;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询粉丝群发券信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/im/queryCoupon",
    businessId = 16,
    apiVersion = "10039",
    apiName = "query_coupon",
    needAuth = true
)
public class QueryCouponRequest implements MeituanRequest<QueryCouponResponse> {
    /**
    * <p><span style="color: rgb(0, 0, 0)"><font style="font-size:14px;line-height:22px" data-size="14">页码 从 1 开始</font></span></p>
    */
    @SerializedName("page")
    private Integer page;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">页数据条数</font></span></p>
    */
    @SerializedName("pageSize")
    private Integer pageSize;

    public Integer getPage() {
        return page;
    }
    public void setPage(Integer page) {
        this.page = page;
    }
    public Integer getPageSize() {
        return pageSize;
    }
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    @Override
    public MeituanResponse<QueryCouponResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryCouponResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryCouponRequest{" + "page=" + page + "," + "pageSize=" + pageSize + "}";
    }
}
