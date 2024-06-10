package com.meituan.sdk.model.wmoperNg.poi.wmoperBatchQueryPoi;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class WmoperBatchQueryPoiResponse {
    @NotNull(message = "appId不能为空")
    @SerializedName("app_id")
    private Long appId;
    /**
    * epoiId
    */
    @SerializedName("epoiId")
    private String epoiId;
    /**
    * 门店名称
    */
    @SerializedName("name")
    private String name;
    /**
    * 门店地址
    */
    @SerializedName("address")
    private String address;
    /**
    * 门店纬度
    */
    @SerializedName("latitude")
    private Double latitude;
    /**
    * 门店经度
    */
    @SerializedName("longitude")
    private Double longitude;
    /**
    * 门店图片地址
    */
    @SerializedName("pic_url")
    private String picUrl;
    /**
    * 客服电话号码
    */
    @SerializedName("phone")
    private String phone;
    /**
    * 门店电话号码(已废弃)
    */
    @SerializedName("standby_tel")
    private String standbyTel;
    /**
    * 每个订单的配送费
    */
    @SerializedName("shipping_fee")
    private Float shippingFee;
    /**
    * 门店营业时间
    */
    @SerializedName("shipping_time")
    private String shippingTime;
    /**
    * 门店推广信息
    */
    @SerializedName("promotion_info")
    private String promotionInfo;
    @NotBlank(message = "remark不能为空")
    @SerializedName("remark")
    private String remark;
    /**
    * 门店的营业状态：1为可配送，3为休息中
    */
    @SerializedName("open_level")
    private Integer openLevel;
    /**
    * 门店上下线状态：0为下线，1为上线，2为上单中，3为审核通过可上线
    */
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
    * 发票相关说明（invoice_suport为1时可用）
    */
    @SerializedName("invoice_description")
    private String invoiceDescription;
    /**
    * 此字段已不再维护，请避免使用
    */
    @NotNull(message = "cityId不能为空")
    @SerializedName("city_id")
    private Long cityId;
    @NotNull(message = "locationId不能为空")
    @SerializedName("location_id")
    private Long locationId;
    /**
    * 创建时间（当前距离Epoch（1970年1月1日） 以秒计算的时间，即unix-timestamp）
    */
    @SerializedName("ctime")
    private Integer ctime;
    /**
    * 更新时间（当前距离Epoch（1970年1月1日） 以秒计算的时间，即unix-timestamp）
    */
    @SerializedName("utime")
    private Integer utime;
    @NotBlank(message = "tagName不能为空")
    @SerializedName("tag_name")
    private String tagName;
    /**
    * 是否支持营业时间范围外预下单，1表支持，0表不支持
    */
    @SerializedName("pre_book")
    private Integer preBook;
    /**
    * 是否支持营业时间范围内预下单，1表支持，0表不支持
    */
    @SerializedName("time_select")
    private Integer timeSelect;
    @NotNull(message = "preBookMinDays不能为空")
    @SerializedName("pre_book_min_days")
    private Long preBookMinDays;
    @NotNull(message = "preBookMaxDays不能为空")
    @SerializedName("pre_book_max_days")
    private Long preBookMaxDays;
    /**
    * 门店的配送方式，参考值：1003-美团跑腿；1001-专送（加盟）；1002-专送（自建）；1004-城市代理；2002-快送；3001-混合送（专送+快送)；2010-全城送；0000-商家自配；5001-聚合配。
    */
    @SerializedName("logistics_codes")
    private String logisticsCodes;
    /**
    * 门店品类
    */
    @SerializedName("third_tag_name")
    private String thirdTagName;
    /**
    * 门店的配送方式,参考值：1003-美团跑腿；1001-专送（加盟）；1002-专送（自建）；1004-城市代理；2002-快送；3001-混合送（专送+快送)；2010-全城送；0000-商家自配；5001-聚合配;4015-企客远距离配送。
    */
    @SerializedName("logistics_code")
    private String logisticsCode;

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
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
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
    public Integer getCtime() {
        return ctime;
    }
    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }
    public Integer getUtime() {
        return utime;
    }
    public void setUtime(Integer utime) {
        this.utime = utime;
    }
    public String getTagName() {
        return tagName;
    }
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
    public Integer getPreBook() {
        return preBook;
    }
    public void setPreBook(Integer preBook) {
        this.preBook = preBook;
    }
    public Integer getTimeSelect() {
        return timeSelect;
    }
    public void setTimeSelect(Integer timeSelect) {
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
    public String getThirdTagName() {
        return thirdTagName;
    }
    public void setThirdTagName(String thirdTagName) {
        this.thirdTagName = thirdTagName;
    }
    public String getLogisticsCode() {
        return logisticsCode;
    }
    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }




    @Override
    public String toString() {
        return "WmoperBatchQueryPoiResponse{" + "appId=" + appId + "," + "epoiId=" + epoiId + "," + "name=" + name + "," + "address=" + address + "," + "latitude=" + latitude + "," + "longitude=" + longitude + "," + "picUrl=" + picUrl + "," + "phone=" + phone + "," + "standbyTel=" + standbyTel + "," + "shippingFee=" + shippingFee + "," + "shippingTime=" + shippingTime + "," + "promotionInfo=" + promotionInfo + "," + "remark=" + remark + "," + "openLevel=" + openLevel + "," + "isOnline=" + isOnline + "," + "invoiceSupport=" + invoiceSupport + "," + "invoiceMinPrice=" + invoiceMinPrice + "," + "invoiceDescription=" + invoiceDescription + "," + "cityId=" + cityId + "," + "locationId=" + locationId + "," + "ctime=" + ctime + "," + "utime=" + utime + "," + "tagName=" + tagName + "," + "preBook=" + preBook + "," + "timeSelect=" + timeSelect + "," + "preBookMinDays=" + preBookMinDays + "," + "preBookMaxDays=" + preBookMaxDays + "," + "logisticsCodes=" + logisticsCodes + "," + "thirdTagName=" + thirdTagName + "," + "logisticsCode=" + logisticsCode + "}";
    }
}
