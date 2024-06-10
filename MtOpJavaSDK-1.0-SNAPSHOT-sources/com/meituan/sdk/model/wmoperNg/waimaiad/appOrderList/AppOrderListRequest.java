package com.meituan.sdk.model.wmoperNg.waimaiad.appOrderList;

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
* 应用购买记录
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/waimaiad/app/order/list",
    businessId = 16,
    apiVersion = "10014",
    apiName = "app_order_list",
    needAuth = false
)
public class AppOrderListRequest implements MeituanRequest<AppOrderListResponse> {
    /**
    * <p>应用id</p>
    */
    @NotNull(message = "appId不能为空")
    @SerializedName("appId")
    private Long appId;
    /**
    * <p>数据的时间(以下单时间为准)范围，开始时间</p>
    */
    @NotNull(message = "startTime不能为空")
    @SerializedName("startTime")
    private Integer startTime;
    /**
    * <p>数据的时间(以下单时间为准)范围，结束时间</p>
    */
    @NotNull(message = "endTime不能为空")
    @SerializedName("endTime")
    private Integer endTime;
    /**
    * <p>页码</p>
    */
    @NotNull(message = "pageNum不能为空")
    @SerializedName("pageNum")
    private Integer pageNum;
    /**
    * <p>每页记录数</p>
    */
    @NotNull(message = "pageSize不能为空")
    @SerializedName("pageSize")
    private Integer pageSize;

    public Long getAppId() {
        return appId;
    }
    public void setAppId(Long appId) {
        this.appId = appId;
    }
    public Integer getStartTime() {
        return startTime;
    }
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }
    public Integer getEndTime() {
        return endTime;
    }
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
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
    public MeituanResponse<AppOrderListResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<AppOrderListResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "AppOrderListRequest{" + "appId=" + appId + "," + "startTime=" + startTime + "," + "endTime=" + endTime + "," + "pageNum=" + pageNum + "," + "pageSize=" + pageSize + "}";
    }
}
