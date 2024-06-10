package com.meituan.sdk.model.foodmop.shop.reserveConfigUpdate;

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
* 门店“线上点”预约配置（非必接）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/shop/reserve/config/update",
    businessId = 51,
    apiVersion = "10005",
    apiName = "reserve_config_update",
    needAuth = true
)
public class ReserveConfigUpdateRequest implements MeituanRequest<ReserveConfigUpdateResponse> {
    /**
    * <p data-diff-id="ct-diff-id-d223544c-7456-4739-aa18-3cb341b28afb">厂商配置列表，批量限制20</p>
    */
    @NotEmpty(message = "vendorReserveConfigDTOS不能为空")
    @SerializedName("data")
    private List<VendorReserveConfigRequest> data;

    public List<VendorReserveConfigRequest> getData() {
        return data;
    }
    public void setData(List<VendorReserveConfigRequest> data) {
        this.data = data;
    }


    @Override
    public MeituanResponse<ReserveConfigUpdateResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<ReserveConfigUpdateResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this.data);
    }


    @Override
    public String toString() {
        return "ReserveConfigUpdateRequest{" + "data=" + data + "}";
    }
}
