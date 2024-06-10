package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDeliveryRuleFeeDiscountUpdate;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 门店配送规则更新配送费折扣信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/dcps/fulfill/poi/deliveryRule/feeDiscount/update",
    businessId = 46,
    apiVersion = "10003",
    apiName = "group_delivery_poi_delivery_rule_fee_discount_update",
    needAuth = true
)
public class GroupDeliveryPoiDeliveryRuleFeeDiscountUpdateRequest implements MeituanRequest<Boolean> {
    @SerializedName("discountSwitch")
    private Boolean discountSwitch;
    @SerializedName("discountType")
    private Integer discountType;
    @SerializedName("tieredDiscounts")
    private List<TieredDiscount> tieredDiscounts;
    @SerializedName("unifiedDiscount")
    private String unifiedDiscount;

    public Boolean getDiscountSwitch() {
        return discountSwitch;
    }
    public void setDiscountSwitch(Boolean discountSwitch) {
        this.discountSwitch = discountSwitch;
    }
    public Integer getDiscountType() {
        return discountType;
    }
    public void setDiscountType(Integer discountType) {
        this.discountType = discountType;
    }
    public List<TieredDiscount> getTieredDiscounts() {
        return tieredDiscounts;
    }
    public void setTieredDiscounts(List<TieredDiscount> tieredDiscounts) {
        this.tieredDiscounts = tieredDiscounts;
    }
    public String getUnifiedDiscount() {
        return unifiedDiscount;
    }
    public void setUnifiedDiscount(String unifiedDiscount) {
        this.unifiedDiscount = unifiedDiscount;
    }


    @Override
    public MeituanResponse<Boolean> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<Boolean>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GroupDeliveryPoiDeliveryRuleFeeDiscountUpdateRequest{" + "discountSwitch=" + discountSwitch + "," + "discountType=" + discountType + "," + "tieredDiscounts=" + tieredDiscounts + "," + "unifiedDiscount=" + unifiedDiscount + "}";
    }
}
