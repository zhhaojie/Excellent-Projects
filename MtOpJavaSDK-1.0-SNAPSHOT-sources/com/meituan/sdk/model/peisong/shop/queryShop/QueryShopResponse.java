package com.meituan.sdk.model.peisong.shop.queryShop;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 查询门店信息
* This file was automatically generated.
*/
public class QueryShopResponse {
    /**
    * 取货门店id，即合作方向美团提供的门店id
    */
    @SerializedName("shop_id")
    private String shopId;
    /**
    * 城市ID，见城市代码表
    */
    @SerializedName("city")
    private Integer city;
    /**
    * 一级品类，见附件品类代码表
    */
    @SerializedName("category")
    private Integer category;
    /**
    * 二级品类，见附件品类代码表
    */
    @SerializedName("second_category")
    private Integer secondCategory;
    /**
    * 门店联系人
    */
    @SerializedName("contact_name")
    private String contactName;
    /**
    * 联系电话
    */
    @SerializedName("contact_phone")
    private String contactPhone;
    /**
    * 联系邮箱
    */
    @SerializedName("contact_email")
    private String contactEmail;
    /**
    * 门店地址
    */
    @SerializedName("shop_address")
    private String shopAddress;
    /**
    * 门牌号
    */
    @SerializedName("shop_address_detail")
    private String shopAddressDetail;
    /**
    * 门店经度（火星坐标或百度坐标，和 coordinate_type 字段配合使用），坐标 * （10的六次方），如 116398419
    */
    @SerializedName("shop_lng")
    private Integer shopLng;
    /**
    * 门店纬度（火星坐标或百度坐标，和 coordinate_type 字段配合使用），坐标 * （10的六次方），如 39985005
    */
    @SerializedName("shop_lat")
    private Integer shopLat;
    /**
    * 坐标类型，0：火星坐标（高德，腾讯地图均采用火星坐标） 1：百度坐标 （默认值为0）
    */
    @SerializedName("coordinate_type")
    private Integer coordinateType;
    /**
    * 配送服务代码，详情见合同  1）服务包  飞速达:4002  快速达:4011  及时达:4012  集中送:4013  跑腿B帮送:4031 例如：4011,4012(多个英文逗号隔开)  2）新服务产品  具体可参考新服务产品列表
    */
    @SerializedName("delivery_service_codes")
    private String deliveryServiceCodes;
    /**
    * 配送时间  例：[{"beginTime":"00:00","endTime":"24:00"}]
    */
    @SerializedName("delivery_hours")
    private String deliveryHours;
    /**
    * 是否支持预约单，0：不支持，1：支持
    */
    @SerializedName("prebook")
    private Integer prebook;
    /**
    * 是否支持营业时间外预约单，0：不支持，1：支持
    */
    @SerializedName("prebook_out_of_biz_time")
    private Integer prebookOutOfBizTime;
    /**
    * 预约单时间段，格式为{"start": "0", "end": "2"}，单位为天
    */
    @SerializedName("prebook_period")
    private String prebookPeriod;
    /**
    * 门店当前可支持的结算方式下的支付方式，支付方式，0、账期支付，1、余额支付；  账期支付请关注月度账单；余额支付请联系运营协助操作账户开通、充值等，开通余额支付时可参与相应营销活动、使用优惠券等。
    */
    @SerializedName("pay_type_codes")
    private List<Integer> payTypeCodes;

    public String getShopId() {
        return shopId;
    }
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
    public Integer getCity() {
        return city;
    }
    public void setCity(Integer city) {
        this.city = city;
    }
    public Integer getCategory() {
        return category;
    }
    public void setCategory(Integer category) {
        this.category = category;
    }
    public Integer getSecondCategory() {
        return secondCategory;
    }
    public void setSecondCategory(Integer secondCategory) {
        this.secondCategory = secondCategory;
    }
    public String getContactName() {
        return contactName;
    }
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    public String getContactPhone() {
        return contactPhone;
    }
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
    public String getContactEmail() {
        return contactEmail;
    }
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
    public String getShopAddress() {
        return shopAddress;
    }
    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }
    public String getShopAddressDetail() {
        return shopAddressDetail;
    }
    public void setShopAddressDetail(String shopAddressDetail) {
        this.shopAddressDetail = shopAddressDetail;
    }
    public Integer getShopLng() {
        return shopLng;
    }
    public void setShopLng(Integer shopLng) {
        this.shopLng = shopLng;
    }
    public Integer getShopLat() {
        return shopLat;
    }
    public void setShopLat(Integer shopLat) {
        this.shopLat = shopLat;
    }
    public Integer getCoordinateType() {
        return coordinateType;
    }
    public void setCoordinateType(Integer coordinateType) {
        this.coordinateType = coordinateType;
    }
    public String getDeliveryServiceCodes() {
        return deliveryServiceCodes;
    }
    public void setDeliveryServiceCodes(String deliveryServiceCodes) {
        this.deliveryServiceCodes = deliveryServiceCodes;
    }
    public String getDeliveryHours() {
        return deliveryHours;
    }
    public void setDeliveryHours(String deliveryHours) {
        this.deliveryHours = deliveryHours;
    }
    public Integer getPrebook() {
        return prebook;
    }
    public void setPrebook(Integer prebook) {
        this.prebook = prebook;
    }
    public Integer getPrebookOutOfBizTime() {
        return prebookOutOfBizTime;
    }
    public void setPrebookOutOfBizTime(Integer prebookOutOfBizTime) {
        this.prebookOutOfBizTime = prebookOutOfBizTime;
    }
    public String getPrebookPeriod() {
        return prebookPeriod;
    }
    public void setPrebookPeriod(String prebookPeriod) {
        this.prebookPeriod = prebookPeriod;
    }
    public List<Integer> getPayTypeCodes() {
        return payTypeCodes;
    }
    public void setPayTypeCodes(List<Integer> payTypeCodes) {
        this.payTypeCodes = payTypeCodes;
    }




    @Override
    public String toString() {
        return "QueryShopResponse{" + "shopId=" + shopId + "," + "city=" + city + "," + "category=" + category + "," + "secondCategory=" + secondCategory + "," + "contactName=" + contactName + "," + "contactPhone=" + contactPhone + "," + "contactEmail=" + contactEmail + "," + "shopAddress=" + shopAddress + "," + "shopAddressDetail=" + shopAddressDetail + "," + "shopLng=" + shopLng + "," + "shopLat=" + shopLat + "," + "coordinateType=" + coordinateType + "," + "deliveryServiceCodes=" + deliveryServiceCodes + "," + "deliveryHours=" + deliveryHours + "," + "prebook=" + prebook + "," + "prebookOutOfBizTime=" + prebookOutOfBizTime + "," + "prebookPeriod=" + prebookPeriod + "," + "payTypeCodes=" + payTypeCodes + "}";
    }
}
