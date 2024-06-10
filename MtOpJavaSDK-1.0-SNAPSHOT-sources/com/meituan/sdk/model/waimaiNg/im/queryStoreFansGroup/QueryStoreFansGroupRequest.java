package com.meituan.sdk.model.waimaiNg.im.queryStoreFansGroup;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询门店的粉丝群
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/im/queryStoreFansGroup",
    businessId = 2,
    apiVersion = "10040",
    apiName = "query_store_fans_group",
    needAuth = true
)
public class QueryStoreFansGroupRequest implements MeituanRequest<QueryStoreFansGroupResponse> {
    /**
    * <p><span style="color: rgb(0, 0, 0)"><font style="font-size:14px;line-height:22px" data-size="14">页码 从 1 开始</font></span></p>
    */
    @SerializedName("page")
    private Integer page;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">页数据条数</font></span></p>
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
    public MeituanResponse<QueryStoreFansGroupResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryStoreFansGroupResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryStoreFansGroupRequest{" + "page=" + page + "," + "pageSize=" + pageSize + "}";
    }
}
