package com.meituan.sdk.model.foodmop.shop.statusUpdate;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;
import javax.validation.constraints.NotEmpty;

/**
* 品牌同步门店线上点业务开通状态变更
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/shop/status/update",
    businessId = 51,
    apiVersion = "10005",
    apiName = "status_update",
    needAuth = true
)
public class StatusUpdateRequest implements MeituanRequest<StatusUpdateResponse> {
    @NotEmpty(message = "biz不能为空")
    @SerializedName("data")
    private List<VendorBizConfigRequest> data;

    public List<VendorBizConfigRequest> getData() {
        return data;
    }
    public void setData(List<VendorBizConfigRequest> data) {
        this.data = data;
    }


    @Override
    public MeituanResponse<StatusUpdateResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<StatusUpdateResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this.data);
    }


    @Override
    public String toString() {
        return "StatusUpdateRequest{" + "data=" + data + "}";
    }
}
