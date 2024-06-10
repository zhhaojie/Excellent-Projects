package com.meituan.sdk.model.waimaiNg.dish.waimaiSaveBoxPriceTypeAndDetail;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 设置门店打包费
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/dish/saveBoxPriceTypeAndDetail",
    businessId = 2,
    apiVersion = "10105",
    apiName = "waimai_save_box_price_type_and_detail",
    needAuth = true
)
public class WaimaiSaveBoxPriceTypeAndDetailRequest implements MeituanRequest<String> {
    /**
    * <p data-diff-id="ct-diff-id-46a480fa-d853-4a62-8bc9-e0c7add91d07"><span style="color: #333">打包费信息 (boxPriceType为0时该字段可不传)</span></p>
    */
    @SerializedName("boxPriceDetail")
    private BoxPriceDetail boxPriceDetail;
    /**
    * <p data-diff-id="ct-diff-id-be1333d2-ad4e-44fc-a212-182e153117ce"><span style="color: rgba(0, 0, 0, 0.87)">打包费类型, 0为按商品收费, 1 为按订单收费, 2为按口袋收费</span></p>
    */
    @NotNull(message = "boxPriceType不能为空")
    @SerializedName("boxPriceType")
    private Integer boxPriceType;

    public BoxPriceDetail getBoxPriceDetail() {
        return boxPriceDetail;
    }
    public void setBoxPriceDetail(BoxPriceDetail boxPriceDetail) {
        this.boxPriceDetail = boxPriceDetail;
    }
    public Integer getBoxPriceType() {
        return boxPriceType;
    }
    public void setBoxPriceType(Integer boxPriceType) {
        this.boxPriceType = boxPriceType;
    }


    @Override
    public MeituanResponse<String> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<String>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "WaimaiSaveBoxPriceTypeAndDetailRequest{" + "boxPriceDetail=" + boxPriceDetail + "," + "boxPriceType=" + boxPriceType + "}";
    }
}
