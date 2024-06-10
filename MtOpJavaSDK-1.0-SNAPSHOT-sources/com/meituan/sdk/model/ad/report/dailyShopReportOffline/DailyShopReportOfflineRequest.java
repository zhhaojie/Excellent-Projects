package com.meituan.sdk.model.ad.report.dailyShopReportOffline;

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
* 门店分日报告
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/report/getDailyDataByShopOffline",
    businessId = 22,
    apiVersion = "10020",
    apiName = "daily_shop_report_offline",
    needAuth = false
)
public class DailyShopReportOfflineRequest implements MeituanRequest<List<LaunchInfo>> {
    /**
    * 门店id列表,单次最多支持50个
    */
    @SerializedName("shopIds")
    private List<Long> shopIds;
    /**
    * 点评门店id还是美团门店id，默认点评
    */
    @NotNull(message = "shopType不能为空")
    @SerializedName("shopType")
    private Integer shopType;
    /**
    * 查询开始时间
    */
    @NotBlank(message = "beginTime不能为空")
    @SerializedName("beginTime")
    private String beginTime;
    /**
    * 查询截止时间
    */
    @NotBlank(message = "endTime不能为空")
    @SerializedName("endTime")
    private String endTime;

    public List<Long> getShopIds() {
        return shopIds;
    }
    public void setShopIds(List<Long> shopIds) {
        this.shopIds = shopIds;
    }
    public Integer getShopType() {
        return shopType;
    }
    public void setShopType(Integer shopType) {
        this.shopType = shopType;
    }
    public String getBeginTime() {
        return beginTime;
    }
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }
    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    @Override
    public MeituanResponse<List<LaunchInfo>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<LaunchInfo>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "DailyShopReportOfflineRequest{" + "shopIds=" + shopIds + "," + "shopType=" + shopType + "," + "beginTime=" + beginTime + "," + "endTime=" + endTime + "}";
    }
}
