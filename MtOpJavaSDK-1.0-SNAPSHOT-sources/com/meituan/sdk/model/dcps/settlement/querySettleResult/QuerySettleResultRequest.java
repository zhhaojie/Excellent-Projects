package com.meituan.sdk.model.dcps.settlement.querySettleResult;

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
* 查询结算结果
* This file was automatically generated.
*/
@ApiMeta(
    path = "/dcps/settlement/querySettleResultForTGDeliver",
    businessId = 46,
    apiVersion = "10000",
    apiName = "query_settle_result",
    needAuth = true
)
public class QuerySettleResultRequest implements MeituanRequest<List<SettleDTO>> {
    /**
    * <p>订单ID</p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("data")
    private Long data;

    public Long getData() {
        return data;
    }
    public void setData(Long data) {
        this.data = data;
    }


    @Override
    public MeituanResponse<List<SettleDTO>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<SettleDTO>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this.data);
    }


    @Override
    public String toString() {
        return "QuerySettleResultRequest{" + "data=" + data + "}";
    }
}
