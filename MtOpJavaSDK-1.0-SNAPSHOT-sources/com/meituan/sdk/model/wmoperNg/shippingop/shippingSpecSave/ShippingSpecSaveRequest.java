package com.meituan.sdk.model.wmoperNg.shippingop.shippingSpecSave;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 创建/更新特殊时段配送范围（自配）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/shippingop/spec/save",
    businessId = 16,
    apiVersion = "10001",
    apiName = "shipping_spec_save",
    needAuth = true
)
public class ShippingSpecSaveRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">服务商方提供的配送范围id，如一个门店没有配送范围ID，且每个门店只有一个配送范围，可以填1</font></span></p>
    */
    @NotBlank(message = "appShippingCode不能为空")
    @SerializedName("app_shipping_code")
    private String appShippingCode;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">配置范围类型，（1表示多个配送范围由多个多边形组成）只支持多边形</font></span></p>
    */
    @NotBlank(message = "type不能为空")
    @SerializedName("type")
    private String type;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">配送范围type为1时:</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">[{"x":39941199,"y":116385384},{"x":39926983,"y":116361694},{"x ":39921586,"y":116398430}]，</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">需要对其urlEncode，x代表纬度，y代表经度（美团使用的是高德坐标系，也就是火星坐标系，如果是百度坐标系需要转换，配送范围坐标需要乘以一百万)</font></span></p>
    */
    @NotBlank(message = "area不能为空")
    @SerializedName("area")
    private String area;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">该配送区域的起送价</font></span></p>
    */
    @NotNull(message = "minPrice不能为空")
    @SerializedName("min_price")
    private Double minPrice;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">该配送区域的配送费(建议填写这个字段设定配送费,如果此字段为空,则以门店保存的配送费为准)</font></span></p>
    */
    @NotNull(message = "shippingFee不能为空")
    @SerializedName("shipping_fee")
    private Double shippingFee;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">此配送范围的生效时间，最多允许1个时间段，允许跨天，需小于24小时，如时间段开始时间小于结束时间，则认为是跨天</font></span></p>
    */
    @NotBlank(message = "timeRange不能为空")
    @SerializedName("time_range")
    private String timeRange;

    public String getAppShippingCode() {
        return appShippingCode;
    }
    public void setAppShippingCode(String appShippingCode) {
        this.appShippingCode = appShippingCode;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public Double getMinPrice() {
        return minPrice;
    }
    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }
    public Double getShippingFee() {
        return shippingFee;
    }
    public void setShippingFee(Double shippingFee) {
        this.shippingFee = shippingFee;
    }
    public String getTimeRange() {
        return timeRange;
    }
    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
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
        return "ShippingSpecSaveRequest{" + "appShippingCode=" + appShippingCode + "," + "type=" + type + "," + "area=" + area + "," + "minPrice=" + minPrice + "," + "shippingFee=" + shippingFee + "," + "timeRange=" + timeRange + "}";
    }
}
