package com.meituan.sdk.model.waimaiNg.poi.waimaiPoiQueryPoiInfo;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class PoiInfo {
    /**
    * 门店地址
    */
    @SerializedName("address")
    private String address;
    /**
    * ERP方门店id 最大长度100
    */
    @SerializedName("ePoiId")
    private String ePoiId;
    /**
    * 发票相关说明
    */
    @SerializedName("invoiceDescription")
    private String invoiceDescription;
    /**
    * 门店支持开发票的最小订单价
    */
    @SerializedName("invoiceMinPrice")
    private Integer invoiceMinPrice;
    /**
    * 门店是否支持发票 1-可开发票 0-不支持
    */
    @SerializedName("invoiceSupport")
    private Integer invoiceSupport;
    /**
    * 是否在线 1-上线 0-下线
    */
    @SerializedName("isOnline")
    private Integer isOnline;
    /**
    * 是否营业 1可配送 3休息中 0-未上线
    */
    @SerializedName("isOpen")
    private Integer isOpen;
    /**
    * 门店经度 美团使用的是高德坐标系，也就是火星坐标系，如果是百度坐标系需要转换）(门店坐标不需要乘以一百万）
    */
    @SerializedName("latitude")
    private String latitude;
    /**
    * 门店纬度 美团使用的是高德坐标系，也就是火星坐标系，如果是百度坐标系需要转换）(门店坐标不需要乘以一百万）
    */
    @SerializedName("longitude")
    private String longitude;
    /**
    * 门店名称
    */
    @SerializedName("name")
    private String name;
    /**
    * 门店公告信息 2000字以内
    */
    @SerializedName("noticeInfo")
    private String noticeInfo;
    /**
    * 营业时间
    */
    @SerializedName("openTime")
    private String openTime;
    /**
    * 门店电话
    */
    @SerializedName("phone")
    private String phone;
    /**
    * 门店图片url
    */
    @SerializedName("pictureUrl")
    private String pictureUrl;
    /**
    * 是否支持营业时间范围外预下单 0-不支持,1 表示支持
    */
    @SerializedName("preBook")
    private Integer preBook;
    /**
    * 预下单最大日期 2-后天, 预下单支持从最小日期到最大日期的连续日期。例如：preBookMinDays =0，preBookMaxDays=2，表示支持当天，明天，后天的预下单
    */
    @SerializedName("preBookMaxDays")
    private Integer preBookMaxDays;
    /**
    * 预下单最小日期 0-从当天算起
    */
    @SerializedName("preBookMinDays")
    private Integer preBookMinDays;
    /**
    * 配送费
    */
    @SerializedName("shippingFee")
    private Float shippingFee;
    @NotBlank(message = "standbyTel不能为空")
    @SerializedName("standbyTel")
    private String standbyTel;
    /**
    * 美团品类名称
    */
    @SerializedName("tagName")
    private String tagName;
    /**
    * 是否支持营业时间内预下单 0-不支持,1 表示支持
    */
    @SerializedName("timeSelect")
    private Integer timeSelect;
    /**
    * 门店的配送方式,参考值：1003-美团跑腿；1001-专送（加盟）；1002-专送（自建）；1004-城市代理；2002-快送；3001-混合送（专送+快送)；2010-全城送；0000-商家自配；5001-聚合配;4015-企客远距离配送。
    */
    @SerializedName("logisticsCodes")
    private String logisticsCodes;

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEPoiId() {
        return ePoiId;
    }
    public void setEPoiId(String ePoiId) {
        this.ePoiId = ePoiId;
    }
    public String getInvoiceDescription() {
        return invoiceDescription;
    }
    public void setInvoiceDescription(String invoiceDescription) {
        this.invoiceDescription = invoiceDescription;
    }
    public Integer getInvoiceMinPrice() {
        return invoiceMinPrice;
    }
    public void setInvoiceMinPrice(Integer invoiceMinPrice) {
        this.invoiceMinPrice = invoiceMinPrice;
    }
    public Integer getInvoiceSupport() {
        return invoiceSupport;
    }
    public void setInvoiceSupport(Integer invoiceSupport) {
        this.invoiceSupport = invoiceSupport;
    }
    public Integer getIsOnline() {
        return isOnline;
    }
    public void setIsOnline(Integer isOnline) {
        this.isOnline = isOnline;
    }
    public Integer getIsOpen() {
        return isOpen;
    }
    public void setIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
    }
    public String getLatitude() {
        return latitude;
    }
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    public String getLongitude() {
        return longitude;
    }
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNoticeInfo() {
        return noticeInfo;
    }
    public void setNoticeInfo(String noticeInfo) {
        this.noticeInfo = noticeInfo;
    }
    public String getOpenTime() {
        return openTime;
    }
    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPictureUrl() {
        return pictureUrl;
    }
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
    public Integer getPreBook() {
        return preBook;
    }
    public void setPreBook(Integer preBook) {
        this.preBook = preBook;
    }
    public Integer getPreBookMaxDays() {
        return preBookMaxDays;
    }
    public void setPreBookMaxDays(Integer preBookMaxDays) {
        this.preBookMaxDays = preBookMaxDays;
    }
    public Integer getPreBookMinDays() {
        return preBookMinDays;
    }
    public void setPreBookMinDays(Integer preBookMinDays) {
        this.preBookMinDays = preBookMinDays;
    }
    public Float getShippingFee() {
        return shippingFee;
    }
    public void setShippingFee(Float shippingFee) {
        this.shippingFee = shippingFee;
    }
    public String getStandbyTel() {
        return standbyTel;
    }
    public void setStandbyTel(String standbyTel) {
        this.standbyTel = standbyTel;
    }
    public String getTagName() {
        return tagName;
    }
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
    public Integer getTimeSelect() {
        return timeSelect;
    }
    public void setTimeSelect(Integer timeSelect) {
        this.timeSelect = timeSelect;
    }
    public String getLogisticsCodes() {
        return logisticsCodes;
    }
    public void setLogisticsCodes(String logisticsCodes) {
        this.logisticsCodes = logisticsCodes;
    }




    @Override
    public String toString() {
        return "PoiInfo{" + "address=" + address + "," + "ePoiId=" + ePoiId + "," + "invoiceDescription=" + invoiceDescription + "," + "invoiceMinPrice=" + invoiceMinPrice + "," + "invoiceSupport=" + invoiceSupport + "," + "isOnline=" + isOnline + "," + "isOpen=" + isOpen + "," + "latitude=" + latitude + "," + "longitude=" + longitude + "," + "name=" + name + "," + "noticeInfo=" + noticeInfo + "," + "openTime=" + openTime + "," + "phone=" + phone + "," + "pictureUrl=" + pictureUrl + "," + "preBook=" + preBook + "," + "preBookMaxDays=" + preBookMaxDays + "," + "preBookMinDays=" + preBookMinDays + "," + "shippingFee=" + shippingFee + "," + "standbyTel=" + standbyTel + "," + "tagName=" + tagName + "," + "timeSelect=" + timeSelect + "," + "logisticsCodes=" + logisticsCodes + "}";
    }
}
