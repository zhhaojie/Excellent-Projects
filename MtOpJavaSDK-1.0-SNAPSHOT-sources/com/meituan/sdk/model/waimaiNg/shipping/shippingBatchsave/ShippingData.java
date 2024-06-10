package com.meituan.sdk.model.waimaiNg.shipping.shippingBatchsave;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">配送范围集合的json数据，处理逻辑：</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">1）如果配送范围原来不存在就新增；</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">2）如app_shipping_code存在就更新；</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">3）如原来存在的app_shipping_code，而这次没提交，就删除范围都为多边形，不支持圆形</font></span></p>
* This file was automatically generated.
*/
public class ShippingData {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">该配送区域的起送价</font></span></p>
    */
    @NotNull(message = "minPrice不能为空")
    @SerializedName("min_price")
    private Double minPrice;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">配送范围type为1 时:</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">[{"x":39941199,"y":116385384},{"x":39926983,"y":116361694},{"x ":39921586,"y":116398430}]，</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">type为2时:</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">{"r":1000,"x":40029380,"y":116418390}，</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">需要对其urlEncode，x代表纬度，y代表经度（美团使用的是高德坐标系，也就是火星坐标系，如果是百度坐标系需要转换，配送范围坐标需要乘以一百万)</font></span></p>
    */
    @NotBlank(message = "area不能为空")
    @SerializedName("area")
    private String area;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">APP方提供的配送范围id，如一个门店没有配送范围ID，且每个门店只有一个配送范围，可以填1</font></span></p>
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
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">该配送区域的配送费(建议填写这个字段设定配送费,如果此字段为空,则以门店保存的配送费为准)</font></span></p>
    */
    @SerializedName("shipping_fee")
    private Double shippingFee;

    public Double getMinPrice() {
        return minPrice;
    }
    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
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
    public Double getShippingFee() {
        return shippingFee;
    }
    public void setShippingFee(Double shippingFee) {
        this.shippingFee = shippingFee;
    }




    @Override
    public String toString() {
        return "ShippingData{" + "minPrice=" + minPrice + "," + "area=" + area + "," + "appShippingCode=" + appShippingCode + "," + "type=" + type + "," + "shippingFee=" + shippingFee + "}";
    }
}
