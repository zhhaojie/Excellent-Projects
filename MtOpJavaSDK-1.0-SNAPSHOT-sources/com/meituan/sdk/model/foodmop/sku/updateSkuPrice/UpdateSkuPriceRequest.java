package com.meituan.sdk.model.foodmop.sku.updateSkuPrice;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 更新门店维度 SKU 价格
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/updateSkuPrice",
    businessId = 51,
    apiVersion = "10013",
    apiName = "update_sku_price",
    needAuth = true
)
public class UpdateSkuPriceRequest implements MeituanRequest<UpdateSkuPriceResponse> {
    /**
    * <p data-diff-id="ct-diff-id-9a6d1bc7-e578-490f-8fa1-954f935573fa">SKU 价格</p>
    */
    @NotNull(message = "vendorSkuPriceDTO不能为空")
    @SerializedName("vendorSkuPriceDTO")
    private VendorSkuPriceDTO vendorSkuPriceDTO;

    public VendorSkuPriceDTO getVendorSkuPriceDTO() {
        return vendorSkuPriceDTO;
    }
    public void setVendorSkuPriceDTO(VendorSkuPriceDTO vendorSkuPriceDTO) {
        this.vendorSkuPriceDTO = vendorSkuPriceDTO;
    }


    @Override
    public MeituanResponse<UpdateSkuPriceResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<UpdateSkuPriceResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "UpdateSkuPriceRequest{" + "vendorSkuPriceDTO=" + vendorSkuPriceDTO + "}";
    }
}
