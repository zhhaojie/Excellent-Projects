package com.meituan.sdk.model.wmoperNg.poi.wmoperngQueryPoiDetail;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class Data {
    @NotNull(message = "appId不能为空")
    @SerializedName("app_id")
    private Long appId;
    @NotBlank(message = "epoiId不能为空")
    @SerializedName("epoiId")
    private String epoiId;
    @NotBlank(message = "name不能为空")
    @SerializedName("name")
    private String name;
    @NotBlank(message = "address不能为空")
    @SerializedName("address")
    private String address;
    @NotNull(message = "latitude不能为空")
    @SerializedName("latitude")
    private Double latitude;
    @NotNull(message = "longitude不能为空")
    @SerializedName("longitude")
    private Double longitude;
    @NotBlank(message = "picUrl不能为空")
    @SerializedName("pic_url")
    private String picUrl;
    @NotBlank(message = "phone不能为空")
    @SerializedName("phone")
    private String phone;
    @NotBlank(message = "standbyTel不能为空")
    @SerializedName("standby_tel")
    private String standbyTel;
    @NotNull(message = "shippingFee不能为空")
    @SerializedName("shipping_fee")
    private Double shippingFee;
    @NotBlank(message = "shippingTime不能为空")
    @SerializedName("shipping_time")
    private String shippingTime;
    @NotBlank(message = "promotionInfo不能为空")
    @SerializedName("promotion_info")
    private String promotionInfo;
    @NotBlank(message = "remark不能为空")
    @SerializedName("remark")
    private String remark;
    @NotNull(message = "openLevel不能为空")
    @SerializedName("open_level")
    private Long openLevel;
    @NotNull(message = "isOnline不能为空")
    @SerializedName("is_online")
    private Long isOnline;
    @NotNull(message = "invoiceSupport不能为空")
    @SerializedName("invoice_support")
    private Long invoiceSupport;
    @NotNull(message = "invoiceMinPrice不能为空")
    @SerializedName("invoice_min_price")
    private Long invoiceMinPrice;
    @NotBlank(message = "invoiceDescription不能为空")
    @SerializedName("invoice_description")
    private String invoiceDescription;
    @NotNull(message = "cityId不能为空")
    @SerializedName("city_id")
    private Long cityId;
    @NotNull(message = "locationId不能为空")
    @SerializedName("location_id")
    private Long locationId;
    @NotNull(message = "ctime不能为空")
    @SerializedName("ctime")
    private Long ctime;
    @NotNull(message = "utime不能为空")
    @SerializedName("utime")
    private Long utime;
    @NotBlank(message = "tagName不能为空")
    @SerializedName("tag_name")
    private String tagName;
    @NotNull(message = "preBook不能为空")
    @SerializedName("pre_book")
    private Long preBook;
    @NotNull(message = "timeSelect不能为空")
    @SerializedName("time_select")
    private Long timeSelect;
    @NotNull(message = "preBookMinDays不能为空")
    @SerializedName("pre_book_min_days")
    private Long preBookMinDays;
    @NotNull(message = "preBookMaxDays不能为空")
    @SerializedName("pre_book_max_days")
    private Long preBookMaxDays;
    @NotBlank(message = "logisticsCodes不能为空")
    @SerializedName("logistics_codes")
    private String logisticsCodes;

    public Long getAppId() {
        return appId;
    }
    public void setAppId(Long appId) {
        this.appId = appId;
    }
    public String getEpoiId() {
        return epoiId;
    }
    public void setEpoiId(String epoiId) {
        this.epoiId = epoiId;
    }
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
    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    public String getPicUrl() {
        return picUrl;
    }
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
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
    public Double getShippingFee() {
        return shippingFee;
    }
    public void setShippingFee(Double shippingFee) {
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
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Long getOpenLevel() {
        return openLevel;
    }
    public void setOpenLevel(Long openLevel) {
        this.openLevel = openLevel;
    }
    public Long getIsOnline() {
        return isOnline;
    }
    public void setIsOnline(Long isOnline) {
        this.isOnline = isOnline;
    }
    public Long getInvoiceSupport() {
        return invoiceSupport;
    }
    public void setInvoiceSupport(Long invoiceSupport) {
        this.invoiceSupport = invoiceSupport;
    }
    public Long getInvoiceMinPrice() {
        return invoiceMinPrice;
    }
    public void setInvoiceMinPrice(Long invoiceMinPrice) {
        this.invoiceMinPrice = invoiceMinPrice;
    }
    public String getInvoiceDescription() {
        return invoiceDescription;
    }
    public void setInvoiceDescription(String invoiceDescription) {
        this.invoiceDescription = invoiceDescription;
    }
    public Long getCityId() {
        return cityId;
    }
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }
    public Long getLocationId() {
        return locationId;
    }
    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }
    public Long getCtime() {
        return ctime;
    }
    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }
    public Long getUtime() {
        return utime;
    }
    public void setUtime(Long utime) {
        this.utime = utime;
    }
    public String getTagName() {
        return tagName;
    }
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
    public Long getPreBook() {
        return preBook;
    }
    public void setPreBook(Long preBook) {
        this.preBook = preBook;
    }
    public Long getTimeSelect() {
        return timeSelect;
    }
    public void setTimeSelect(Long timeSelect) {
        this.timeSelect = timeSelect;
    }
    public Long getPreBookMinDays() {
        return preBookMinDays;
    }
    public void setPreBookMinDays(Long preBookMinDays) {
        this.preBookMinDays = preBookMinDays;
    }
    public Long getPreBookMaxDays() {
        return preBookMaxDays;
    }
    public void setPreBookMaxDays(Long preBookMaxDays) {
        this.preBookMaxDays = preBookMaxDays;
    }
    public String getLogisticsCodes() {
        return logisticsCodes;
    }
    public void setLogisticsCodes(String logisticsCodes) {
        this.logisticsCodes = logisticsCodes;
    }




    @Override
    public String toString() {
        return "Data{" + "appId=" + appId + "," + "epoiId=" + epoiId + "," + "name=" + name + "," + "address=" + address + "," + "latitude=" + latitude + "," + "longitude=" + longitude + "," + "picUrl=" + picUrl + "," + "phone=" + phone + "," + "standbyTel=" + standbyTel + "," + "shippingFee=" + shippingFee + "," + "shippingTime=" + shippingTime + "," + "promotionInfo=" + promotionInfo + "," + "remark=" + remark + "," + "openLevel=" + openLevel + "," + "isOnline=" + isOnline + "," + "invoiceSupport=" + invoiceSupport + "," + "invoiceMinPrice=" + invoiceMinPrice + "," + "invoiceDescription=" + invoiceDescription + "," + "cityId=" + cityId + "," + "locationId=" + locationId + "," + "ctime=" + ctime + "," + "utime=" + utime + "," + "tagName=" + tagName + "," + "preBook=" + preBook + "," + "timeSelect=" + timeSelect + "," + "preBookMinDays=" + preBookMinDays + "," + "preBookMaxDays=" + preBookMaxDays + "," + "logisticsCodes=" + logisticsCodes + "}";
    }
}
