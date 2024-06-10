package com.meituan.sdk.model.foodmop.sku.create;

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
* 创建或更新商品（必接）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/create",
    businessId = 51,
    apiVersion = "10015",
    apiName = "create",
    needAuth = true
)
public class CreateRequest implements MeituanRequest<CreateResponse> {
    /**
    * <p data-diff-id="ct-diff-id-da44a776-a3cc-498f-85e5-60ba091c427c">商品信息</p><p data-diff-id="ct-diff-id-e795dbc7-af25-41fe-9252-bfbb1ff5af19">不为空，每次最多传 1 个</p>
    */
    @NotEmpty(message = "vendorSpuList不能为空")
    @SerializedName("vendorSpuList")
    private List<VendorSpuDTO> vendorSpuList;

    public List<VendorSpuDTO> getVendorSpuList() {
        return vendorSpuList;
    }
    public void setVendorSpuList(List<VendorSpuDTO> vendorSpuList) {
        this.vendorSpuList = vendorSpuList;
    }


    @Override
    public MeituanResponse<CreateResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<CreateResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CreateRequest{" + "vendorSpuList=" + vendorSpuList + "}";
    }
}
