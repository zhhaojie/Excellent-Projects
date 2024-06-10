package com.meituan.sdk.model.tuangouNg.coupon.receiptsByReceiptIds;

import com.meituan.sdk.annotations.ApiMeta;
import java.lang.Void;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询券结算信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/tuangou/coupon/queryReceiptsByReceiptIds",
    businessId = 1,
    apiVersion = "10000",
    apiName = "receipts_by_receipt_ids",
    needAuth = true
)
public class ReceiptsByReceiptIdsRequest implements MeituanRequest<Void> {



    @Override
    public MeituanResponse<Void> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<Void>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
