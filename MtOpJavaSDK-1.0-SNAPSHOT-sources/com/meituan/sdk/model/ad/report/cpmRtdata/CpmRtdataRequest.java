package com.meituan.sdk.model.ad.report.cpmRtdata;

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
* getCpmRtData
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/report/getCpmRtData",
    businessId = 22,
    apiVersion = "10015",
    apiName = "cpm_rtdata",
    needAuth = false
)
public class CpmRtdataRequest implements MeituanRequest<List<LaunchInfo>> {
    /**
    * 对应查询元素的id列表,单次最多支持50个
    */
    @SerializedName("ids")
    private List<Long> ids;
    /**
    * 0账户，1计划，2品牌，3推广 4 创意
    */
    @NotNull(message = "dimension不能为空")
    @SerializedName("dimension")
    private Integer dimension;
    /**
    * 子账户
    */
    @SerializedName("accountId")
    private Integer accountId;

    public List<Long> getIds() {
        return ids;
    }
    public void setIds(List<Long> ids) {
        this.ids = ids;
    }
    public Integer getDimension() {
        return dimension;
    }
    public void setDimension(Integer dimension) {
        this.dimension = dimension;
    }
    public Integer getAccountId() {
        return accountId;
    }
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
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
        return "CpmRtdataRequest{" + "ids=" + ids + "," + "dimension=" + dimension + "," + "accountId=" + accountId + "}";
    }
}
