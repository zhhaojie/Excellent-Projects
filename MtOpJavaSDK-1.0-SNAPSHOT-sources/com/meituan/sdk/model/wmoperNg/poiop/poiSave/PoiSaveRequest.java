package com.meituan.sdk.model.wmoperNg.poiop.poiSave;

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
* 创建或更新门店信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/poiop/poi/save",
    businessId = 16,
    apiVersion = "10002",
    apiName = "poi_save",
    needAuth = true
)
public class PoiSaveRequest implements MeituanRequest<String> {
    /**
    * 门店名称
    */
    @NotBlank(message = "name不能为空")
    @SerializedName("name")
    private String name;
    /**
    * 门店地址
    */
    @NotBlank(message = "address不能为空")
    @SerializedName("address")
    private String address;
    /**
    * 门店纬度，（美团使用的是高德坐标系，也就是火星坐标系，如果是百度坐标系需要转换），(门店坐标不需要乘以一百万)
    */
    @NotNull(message = "latitude不能为空")
    @SerializedName("latitude")
    private Float latitude;
    /**
    * 门店经度，（美团使用的是高德坐标系，也就是火星坐标系，如果是百度坐标系需要转换），(门店坐标不需要乘以一百万)
    */
    @NotNull(message = "longitude不能为空")
    @SerializedName("longitude")
    private Float longitude;
    /**
    * 门店头图图片地址，图片比例1:1，需要为JPG/JPEG格式，大于256x256
    */
    @SerializedName("pic_url")
    private String picUrl;
    /**
    * 门店头图图片地址，图片比例4:3，需要为JPG/JPEG格式，大于400x300
    */
    @SerializedName("pic_url_large")
    private String picUrlLarge;
    /**
    * 客服电话号码 （注意：此号码留客服号码）
    */
    @NotBlank(message = "phone不能为空")
    @SerializedName("phone")
    private String phone;
    /**
    * 门店电话号码 （注意：此号码留商家电话）(已废弃)
    */
    @SerializedName("standby_tel")
    private String standbyTel;
    /**
    * 每个订单的配送费
    */
    @NotNull(message = "shippingFee不能为空")
    @SerializedName("shipping_fee")
    private Float shippingFee;
    /**
    * 门店营业时间 （注意格式，且保证不同时间段之间不存在交集）
    */
    @NotBlank(message = "shippingTime不能为空")
    @SerializedName("shipping_time")
    private String shippingTime;
    /**
    * 门店推广信息
    */
    @SerializedName("promotion_info")
    private String promotionInfo;
    /**
    * 门店的营业状态：1为可配送，3为休息中
    */
    @NotNull(message = "openLevel不能为空")
    @SerializedName("open_level")
    private Integer openLevel;
    /**
    * 门店上下线状态：1为上线，0为下线，门店必须在菜品、配送范围和门店信息都齐全后，才能提交上线（注意：此字段不为1时门店不会提交审核）
    */
    @NotNull(message = "isOnline不能为空")
    @SerializedName("is_online")
    private Integer isOnline;
    /**
    * 门店是否支持发票
    */
    @SerializedName("invoice_support")
    private Integer invoiceSupport;
    /**
    * 门店支持开发票的最小订单价（invoice_suport为1时可用）
    */
    @SerializedName("invoice_min_price")
    private Integer invoiceMinPrice;
    /**
    * 发票相关说明（invoice_support为1时可用）
    */
    @SerializedName("invoice_description")
    private String invoiceDescription;
    /**
    * 目前最多支持上传两个门店品类：一个主营品类（上传的第一个品类为主营品类），一个辅营品类；部分门店品类只支持上传一个品类（例如：火锅，特色菜，地方菜，东南亚菜，日韩料理，生活超市）
    */
    @NotBlank(message = "thirdTagName不能为空")
    @SerializedName("third_tag_name")
    private String thirdTagName;
    /**
    * 是否支持营业时间范围外预下单。1表支持，0表不支持
    */
    @SerializedName("pre_book")
    private Integer preBook;
    /**
    * 是否支持营业时间范围内预下单。1表支持，0表不支持。此字段开启后不可关闭
    */
    @SerializedName("time_select")
    private String timeSelect;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Float getLatitude() {
        return latitude;
    }
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }
    public Float getLongitude() {
        return longitude;
    }
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }
    public String getPicUrl() {
        return picUrl;
    }
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
    public String getPicUrlLarge() {
        return picUrlLarge;
    }
    public void setPicUrlLarge(String picUrlLarge) {
        this.picUrlLarge = picUrlLarge;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getStandbyTel() {
        return standbyTel;
    }
    public void setStandbyTel(String standbyTel) {
        this.standbyTel = standbyTel;
    }
    public Float getShippingFee() {
        return shippingFee;
    }
    public void setShippingFee(Float shippingFee) {
        this.shippingFee = shippingFee;
    }
    public String getShippingTime() {
        return shippingTime;
    }
    public void setShippingTime(String shippingTime) {
        this.shippingTime = shippingTime;
    }
    public String getPromotionInfo() {
        return promotionInfo;
    }
    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }
    public Integer getOpenLevel() {
        return openLevel;
    }
    public void setOpenLevel(Integer openLevel) {
        this.openLevel = openLevel;
    }
    public Integer getIsOnline() {
        return isOnline;
    }
    public void setIsOnline(Integer isOnline) {
        this.isOnline = isOnline;
    }
    public Integer getInvoiceSupport() {
        return invoiceSupport;
    }
    public void setInvoiceSupport(Integer invoiceSupport) {
        this.invoiceSupport = invoiceSupport;
    }
    public Integer getInvoiceMinPrice() {
        return invoiceMinPrice;
    }
    public void setInvoiceMinPrice(Integer invoiceMinPrice) {
        this.invoiceMinPrice = invoiceMinPrice;
    }
    public String getInvoiceDescription() {
        return invoiceDescription;
    }
    public void setInvoiceDescription(String invoiceDescription) {
        this.invoiceDescription = invoiceDescription;
    }
    public String getThirdTagName() {
        return thirdTagName;
    }
    public void setThirdTagName(String thirdTagName) {
        this.thirdTagName = thirdTagName;
    }
    public Integer getPreBook() {
        return preBook;
    }
    public void setPreBook(Integer preBook) {
        this.preBook = preBook;
    }
    public String getTimeSelect() {
        return timeSelect;
    }
    public void setTimeSelect(String timeSelect) {
        this.timeSelect = timeSelect;
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
        return "PoiSaveRequest{" + "name=" + name + "," + "address=" + address + "," + "latitude=" + latitude + "," + "longitude=" + longitude + "," + "picUrl=" + picUrl + "," + "picUrlLarge=" + picUrlLarge + "," + "phone=" + phone + "," + "standbyTel=" + standbyTel + "," + "shippingFee=" + shippingFee + "," + "shippingTime=" + shippingTime + "," + "promotionInfo=" + promotionInfo + "," + "openLevel=" + openLevel + "," + "isOnline=" + isOnline + "," + "invoiceSupport=" + invoiceSupport + "," + "invoiceMinPrice=" + invoiceMinPrice + "," + "invoiceDescription=" + invoiceDescription + "," + "thirdTagName=" + thirdTagName + "," + "preBook=" + preBook + "," + "timeSelect=" + timeSelect + "}";
    }
}
