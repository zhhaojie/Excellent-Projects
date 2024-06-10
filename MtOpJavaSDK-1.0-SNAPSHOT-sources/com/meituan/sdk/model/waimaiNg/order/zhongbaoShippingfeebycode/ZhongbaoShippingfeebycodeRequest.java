package com.meituan.sdk.model.waimaiNg.order.zhongbaoShippingfeebycode;

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
    path = "/waimai/ng/order/zhongbao/shippingFeeByCode",
    businessId = 2,
    apiVersion = "10030",
    apiName = "zhongbao_shippingfeebycode",
    needAuth = true
)
public class ZhongbaoShippingfeebycodeRequest implements MeituanRequest<ZhongbaoShippingfeebycodeResponse> {
    @SerializedName("orderExtraList")
    private List<ShippingFeeByCode> orderExtraList;

    public List<ShippingFeeByCode> getOrderExtraList() {
        return orderExtraList;
    }
    public void setOrderExtraList(List<ShippingFeeByCode> orderExtraList) {
        this.orderExtraList = orderExtraList;
    }


    @Override
    public MeituanResponse<ZhongbaoShippingfeebycodeResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<ZhongbaoShippingfeebycodeResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "ZhongbaoShippingfeebycodeRequest{" + "orderExtraList=" + orderExtraList + "}";
    }
}
