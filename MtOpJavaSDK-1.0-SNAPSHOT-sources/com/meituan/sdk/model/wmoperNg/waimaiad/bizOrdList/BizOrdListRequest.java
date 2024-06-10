package com.meituan.sdk.model.wmoperNg.waimaiad.bizOrdList;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 经营分析-订单列表
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/waimaiad/biz/ordlist",
    businessId = 16,
    apiVersion = "10005",
    apiName = "biz_ord_list",
    needAuth = false
)
public class BizOrdListRequest implements MeituanRequest<BizOrdListResponse> {
    /**
    * 日期，yyyyMMdd格式
    */
    @NotBlank(message = "dt不能为空")
    @SerializedName("dt")
    private String dt;
    /**
    * 页数，从1开始
    */
    @NotNull(message = "pageNum不能为空")
    @SerializedName("pageNum")
    private Integer pageNum;
    /**
    * 一页数量，不能超过200
    */
    @NotNull(message = "pageSize不能为空")
    @SerializedName("pageSize")
    private Integer pageSize;

    public String getDt() {
        return dt;
    }
    public void setDt(String dt) {
        this.dt = dt;
    }
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
    public MeituanResponse<BizOrdListResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<BizOrdListResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "BizOrdListRequest{" + "dt=" + dt + "," + "pageNum=" + pageNum + "," + "pageSize=" + pageSize + "}";
    }
}
