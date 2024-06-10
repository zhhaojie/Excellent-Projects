package com.meituan.sdk.model.wmoperNg.order.wmoperZhongbaoShippingfeebycode;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 批量查询跑腿配送费
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/order/zhongbao/shippingFeeByCode",
    businessId = 16,
    apiVersion = "10029",
    apiName = "wmoper_zhongbao_shippingfeebycode",
    needAuth = true
)
public class WmoperZhongbaoShippingfeebycodeRequest implements MeituanRequest<WmoperZhongbaoShippingfeebycodeResponse> {
    @SerializedName("orderExtraList")
    private List<OrderExtraList> orderExtraList;

    public List<OrderExtraList> getOrderExtraList() {
        return orderExtraList;
    }
    public void setOrderExtraList(List<OrderExtraList> orderExtraList) {
        this.orderExtraList = orderExtraList;
    }


    @Override
    public MeituanResponse<WmoperZhongbaoShippingfeebycodeResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WmoperZhongbaoShippingfeebycodeResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "WmoperZhongbaoShippingfeebycodeRequest{" + "orderExtraList=" + orderExtraList + "}";
    }
}
