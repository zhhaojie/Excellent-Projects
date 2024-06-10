package com.meituan.sdk.model.waimaiNg.order.orderQueryZbShippingFee;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 众包配送场景－查询配送费
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/order/queryZbShippingFee",
    businessId = 2,
    apiVersion = "10059",
    apiName = "order_query_zb_shipping_fee",
    needAuth = true
)
public class OrderQueryZbShippingFeeRequest implements MeituanRequest<List<ZbShippingFeeInfo>> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">订单号,多个订单号逗号隔开</font></span></p>
    */
    @NotBlank(message = "orderIds不能为空")
    @SerializedName("orderIds")
    private String orderIds;

    public String getOrderIds() {
        return orderIds;
    }
    public void setOrderIds(String orderIds) {
        this.orderIds = orderIds;
    }


    @Override
    public MeituanResponse<List<ZbShippingFeeInfo>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<ZbShippingFeeInfo>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "OrderQueryZbShippingFeeRequest{" + "orderIds=" + orderIds + "}";
    }
}
