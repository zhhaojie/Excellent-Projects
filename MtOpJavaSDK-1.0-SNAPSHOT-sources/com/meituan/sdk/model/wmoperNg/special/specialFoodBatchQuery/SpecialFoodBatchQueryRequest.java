package com.meituan.sdk.model.wmoperNg.special.specialFoodBatchQuery;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 批量查询商品(拼好饭)
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/special/food/batchQuery",
    businessId = 16,
    apiVersion = "10007",
    apiName = "special_food_batch_query",
    needAuth = true
)
public class SpecialFoodBatchQueryRequest implements MeituanRequest<SpecialFoodBatchQueryResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">业务标识，1-拼好饭</font></span></p>
    */
    @NotNull(message = "businessIdentify不能为空")
    @SerializedName("businessIdentify")
    private Integer businessIdentify;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">每页展示数，每页展示20，最大20</font></span></p>
    */
    @SerializedName("pageSize")
    private Integer pageSize;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">页码，默认 1</font></span></p>
    */
    @SerializedName("pageNum")
    private Integer pageNum;

    public Integer getBusinessIdentify() {
        return businessIdentify;
    }
    public void setBusinessIdentify(Integer businessIdentify) {
        this.businessIdentify = businessIdentify;
    }
    public Integer getPageSize() {
        return pageSize;
    }
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
    public Integer getPageNum() {
        return pageNum;
    }
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }


    @Override
    public MeituanResponse<SpecialFoodBatchQueryResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<SpecialFoodBatchQueryResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "SpecialFoodBatchQueryRequest{" + "businessIdentify=" + businessIdentify + "," + "pageSize=" + pageSize + "," + "pageNum=" + pageNum + "}";
    }
}
