package com.meituan.sdk.model.foodmop.shop.serveStatusUpdate;

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
* “线上点”门店营业状态批量变更（必接）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/shop/serve/status/update",
    businessId = 51,
    apiVersion = "10005",
    apiName = "serve_status_update",
    needAuth = true
)
public class ServeStatusUpdateRequest implements MeituanRequest<ServeStatusUpdateResponse> {
    /**
    * <p data-diff-id="ct-diff-id-607d31a3-cf50-4700-89b2-5dacb2fd2ea8">厂商配置列表，单次请求批量限制20</p>
    */
    @NotEmpty(message = "vendorServiceConfigDTOS不能为空")
    @SerializedName("data")
    private List<VendorServiceConfigRequest> data;

    public List<VendorServiceConfigRequest> getData() {
        return data;
    }
    public void setData(List<VendorServiceConfigRequest> data) {
        this.data = data;
    }


    @Override
    public MeituanResponse<ServeStatusUpdateResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<ServeStatusUpdateResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this.data);
    }


    @Override
    public String toString() {
        return "ServeStatusUpdateRequest{" + "data=" + data + "}";
    }
}
