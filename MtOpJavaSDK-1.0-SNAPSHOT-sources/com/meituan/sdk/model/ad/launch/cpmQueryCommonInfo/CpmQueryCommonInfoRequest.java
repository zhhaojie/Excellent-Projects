package com.meituan.sdk.model.ad.launch.cpmQueryCommonInfo;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;
import javax.validation.constraints.NotEmpty;

/**
* cpm查询常用信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/cpm/queryCommonInfo",
    businessId = 22,
    apiVersion = "10035",
    apiName = "cpm_query_common_info",
    needAuth = true
)
public class CpmQueryCommonInfoRequest implements MeituanRequest<CpmQueryCommonInfoResponse> {
    /**
    * <p data-diff-id="ct-diff-id-d381d065-7927-4515-980a-7d547eb3eede"><span style="color: rgba(0, 0, 0, 0.65)">实体状态类型</span></p>
    */
    @NotNull(message = "entityType不能为空")
    @SerializedName("entityType")
    private Integer entityType;
    /**
    * <p data-diff-id="ct-diff-id-00504ede-cc25-4df1-9efb-deb9b445209b"><span style="color: rgba(0, 0, 0, 0.65)">门店id列表，最多支持50个</span></p>
    */
    @NotEmpty(message = "shopIdList不能为空")
    @SerializedName("shopIdList")
    private List<Long> shopIdList;
    /**
    * <p data-diff-id="ct-diff-id-4796931f-e75c-4c5b-aaa2-66d4b9da16ae"><span style="color: rgba(0, 0, 0, 0.65)">展位ID列表</span></p>
    */
    @NotEmpty(message = "tagIds不能为空")
    @SerializedName("tagIds")
    private List<Boolean> tagIds;

    public Integer getEntityType() {
        return entityType;
    }
    public void setEntityType(Integer entityType) {
        this.entityType = entityType;
    }
    public List<Long> getShopIdList() {
        return shopIdList;
    }
    public void setShopIdList(List<Long> shopIdList) {
        this.shopIdList = shopIdList;
    }
    public List<Boolean> getTagIds() {
        return tagIds;
    }
    public void setTagIds(List<Boolean> tagIds) {
        this.tagIds = tagIds;
    }


    @Override
    public MeituanResponse<CpmQueryCommonInfoResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<CpmQueryCommonInfoResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CpmQueryCommonInfoRequest{" + "entityType=" + entityType + "," + "shopIdList=" + shopIdList + "," + "tagIds=" + tagIds + "}";
    }
}
