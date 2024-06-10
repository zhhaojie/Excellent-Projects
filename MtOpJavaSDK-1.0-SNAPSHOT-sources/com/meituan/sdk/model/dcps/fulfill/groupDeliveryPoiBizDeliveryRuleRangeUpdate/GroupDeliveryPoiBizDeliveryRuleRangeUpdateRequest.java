package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiBizDeliveryRuleRangeUpdate;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 门店配送规则更新自配配送范围
* This file was automatically generated.
*/
@ApiMeta(
    path = "/dcps/fulfill/poi/biz/deliveryRule/range/update",
    businessId = 46,
    apiVersion = "10031",
    apiName = "group_delivery_poi_biz_delivery_rule_range_update",
    needAuth = true
)
public class GroupDeliveryPoiBizDeliveryRuleRangeUpdateRequest implements MeituanRequest<Boolean> {
    @SerializedName("needFix")
    private Boolean needFix;
    @SerializedName("regularHourDeliveryRange")
    private List<RegularHourDeliveryRange> regularHourDeliveryRange;
    @SerializedName("peakHours")
    private List<PeakHours> peakHours;
    @SerializedName("peakHoursDeliveryRange")
    private List<PeakHoursDeliveryRange> peakHoursDeliveryRange;

    public Boolean getNeedFix() {
        return needFix;
    }
    public void setNeedFix(Boolean needFix) {
        this.needFix = needFix;
    }
    public List<RegularHourDeliveryRange> getRegularHourDeliveryRange() {
        return regularHourDeliveryRange;
    }
    public void setRegularHourDeliveryRange(List<RegularHourDeliveryRange> regularHourDeliveryRange) {
        this.regularHourDeliveryRange = regularHourDeliveryRange;
    }
    public List<PeakHours> getPeakHours() {
        return peakHours;
    }
    public void setPeakHours(List<PeakHours> peakHours) {
        this.peakHours = peakHours;
    }
    public List<PeakHoursDeliveryRange> getPeakHoursDeliveryRange() {
        return peakHoursDeliveryRange;
    }
    public void setPeakHoursDeliveryRange(List<PeakHoursDeliveryRange> peakHoursDeliveryRange) {
        this.peakHoursDeliveryRange = peakHoursDeliveryRange;
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
        return "GroupDeliveryPoiBizDeliveryRuleRangeUpdateRequest{" + "needFix=" + needFix + "," + "regularHourDeliveryRange=" + regularHourDeliveryRange + "," + "peakHours=" + peakHours + "," + "peakHoursDeliveryRange=" + peakHoursDeliveryRange + "}";
    }
}
