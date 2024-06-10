package com.meituan.sdk.model.wmoperNg.govern.governWarningListQuery;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 预警列表查询
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/govern/warning/list/query",
    businessId = 16,
    apiVersion = "10001",
    apiName = "govern_warning_list_query",
    needAuth = true
)
public class GovernWarningListQueryRequest implements MeituanRequest<GovernWarningListQueryResponse> {
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
    public MeituanResponse<GovernWarningListQueryResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GovernWarningListQueryResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GovernWarningListQueryRequest{" + "pageNum=" + pageNum + "," + "pageSize=" + pageSize + "}";
    }
}
