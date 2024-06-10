package com.meituan.sdk.model.wmoperNg.govern.governViolationQuery;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 违规列表查询
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/govern/violation/list/query",
    businessId = 16,
    apiVersion = "10001",
    apiName = "govern_violation_query",
    needAuth = true
)
public class GovernViolationQueryRequest implements MeituanRequest<GovernViolationQueryResponse> {
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">页数，从1开始</font></p>
    */
    @SerializedName("pageNum")
    private Integer pageNum;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">页大小，最多20</font></p>
    */
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
    public MeituanResponse<GovernViolationQueryResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GovernViolationQueryResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GovernViolationQueryRequest{" + "pageNum=" + pageNum + "," + "pageSize=" + pageSize + "}";
    }
}
