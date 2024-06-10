package com.meituan.sdk.model.wmoperNg.shipping.shippingFetch;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class Data {
    /**
    * 服务商方提供的配送范围id
    */
    @SerializedName("app_shipping_code")
    private String appShippingCode;
    /**
    * 配置范围类型，（1表示多个配送范围由多个多边形组成）只支持多边形
    */
    @SerializedName("type")
    private String type;
    /**
    * 配送范围type为1时: [{"x":39941199,"y":116385384},{"x":39926983,"y":116361694},{"x ":39921586,"y":116398430}]， type为2时: {"r":1000,"x":40029380,"y":116418390}， 需要对其urlEncode，x代表纬度，y代表经度（美团使用的是高德坐标系，也就是火星坐标系，如果是百度坐标系需要转换，配送范围坐标需要乘以一百万) app_shipping_code	string	125	
    */
    @SerializedName("area")
    private String area;
    /**
    * 该配送区域的起送价
    */
    @SerializedName("min_price")
    private Double minPrice;
    /**
    * 该配送区域的配送费(建议填写这个字段设定配送费,如果此字段为空,则以门店保存的配送费为准)
    */
    @SerializedName("shipping_fee")
    private Double shippingFee;
    /**
    * 此配送范围的配送方式
    */
    @SerializedName("logistics_code")
    private String logisticsCode;
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
    public String getLogisticsCode() {
        return logisticsCode;
    }
    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }
    public String getTimeRange() {
        return timeRange;
    }
    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }




    @Override
    public String toString() {
        return "Data{" + "appShippingCode=" + appShippingCode + "," + "type=" + type + "," + "area=" + area + "," + "minPrice=" + minPrice + "," + "shippingFee=" + shippingFee + "," + "logisticsCode=" + logisticsCode + "," + "timeRange=" + timeRange + "}";
    }
}
