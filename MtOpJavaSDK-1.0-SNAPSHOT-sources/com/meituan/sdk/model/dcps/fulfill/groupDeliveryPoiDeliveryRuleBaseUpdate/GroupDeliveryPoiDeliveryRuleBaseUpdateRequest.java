package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDeliveryRuleBaseUpdate;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 2.1.3.更新门店配送规则基础信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/dcps/fulfill/poi/deliveryRule/base/update",
    businessId = 46,
    apiVersion = "10033",
    apiName = "group_delivery_poi_delivery_rule_base_update",
    needAuth = true
)
public class GroupDeliveryPoiDeliveryRuleBaseUpdateRequest implements MeituanRequest<Boolean> {
    /**
    * <p data-diff-id="ct-diff-id-0c7a2e6a-d361-41a0-9d1c-87242a65cae0">商家联系电话</p>
    */
    @SerializedName("contactPhone")
    private String contactPhone;
    /**
    * <p data-diff-id="ct-diff-id-22563cbb-e389-42d2-8b9a-eb7a2cce1e35">是否支持配送</p><p data-diff-id="ct-diff-id-78e6dd93-a1a3-4bb2-a3d2-ec708dbabd62">1:支持， 0:不支持</p>
    */
    @SerializedName("deliverable")
    private Integer deliverable;
    /**
    * <p data-diff-id="ct-diff-id-46b78676-552e-4fd1-bee4-ae34314639f5">配送时间，结构同查询接口</p>
    */
    @SerializedName("deliveryHours")
    private List<DeliveryHours> deliveryHours;
    @SerializedName("orderPhone")
    private List<PhoneDTO> orderPhone;
    @SerializedName("outerPoiId")
    private String outerPoiId;

    public String getContactPhone() {
        return contactPhone;
    }
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
    public Integer getDeliverable() {
        return deliverable;
    }
    public void setDeliverable(Integer deliverable) {
        this.deliverable = deliverable;
    }
    public List<DeliveryHours> getDeliveryHours() {
        return deliveryHours;
    }
    public void setDeliveryHours(List<DeliveryHours> deliveryHours) {
        this.deliveryHours = deliveryHours;
    }
    public List<PhoneDTO> getOrderPhone() {
        return orderPhone;
    }
    public void setOrderPhone(List<PhoneDTO> orderPhone) {
        this.orderPhone = orderPhone;
    }
    public String getOuterPoiId() {
        return outerPoiId;
    }
    public void setOuterPoiId(String outerPoiId) {
        this.outerPoiId = outerPoiId;
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
        return "GroupDeliveryPoiDeliveryRuleBaseUpdateRequest{" + "contactPhone=" + contactPhone + "," + "deliverable=" + deliverable + "," + "deliveryHours=" + deliveryHours + "," + "orderPhone=" + orderPhone + "," + "outerPoiId=" + outerPoiId + "}";
    }
}
