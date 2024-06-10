package com.meituan.sdk.model.tuangouNg.coupon.queryReceiptsByReceiptIds;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 根据id批量查询团购券
* This file was automatically generated.
*/
@ApiMeta(
    path = "/tuangou/coupon/queryReceiptsByReceiptIds",
    businessId = 1,
    apiVersion = "10010",
    apiName = "query_receipts_by_receipt_ids",
    needAuth = true
)
public class QueryReceiptsByReceiptIdsRequest implements MeituanRequest<QueryReceiptsByReceiptIdsResponse> {
    @NotNull(message = "dealId不能为空")
    @SerializedName("dealId")
    private Integer dealId;
    /**
    * <p data-diff-id="ct-diff-id-0000a81a-e108-40d2-98d1-feba185dee25">逗号分割receiptId列表字符串</p>
    */
    @NotBlank(message = "receiptIds不能为空")
    @SerializedName("receiptIds")
    private String receiptIds;

    public Integer getDealId() {
        return dealId;
    }
    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }
    public String getReceiptIds() {
        return receiptIds;
    }
    public void setReceiptIds(String receiptIds) {
        this.receiptIds = receiptIds;
    }


    @Override
    public MeituanResponse<QueryReceiptsByReceiptIdsResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryReceiptsByReceiptIdsResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryReceiptsByReceiptIdsRequest{" + "dealId=" + dealId + "," + "receiptIds=" + receiptIds + "}";
    }
}
