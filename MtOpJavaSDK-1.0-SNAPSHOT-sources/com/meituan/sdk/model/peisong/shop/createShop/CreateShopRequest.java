package com.meituan.sdk.model.peisong.shop.createShop;

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
* 创建配送门店
* This file was automatically generated.
*/
@ApiMeta(
    path = "/peisong/shop/create",
    businessId = 19,
    apiVersion = "10008",
    apiName = "create_shop",
    needAuth = false
)
public class CreateShopRequest implements MeituanRequest<CreateShopResponse> {
    /**
    * 取货门店id，即合作方向美团提供的门店id
    */
    @NotBlank(message = "shopId不能为空")
    @SerializedName("shop_id")
    private String shopId;
    /**
    * 门店名称 说明：门店名称格式请按照 【XX品牌-XX店】填写，例：百果园-望京店，注：该名称需与实体门店门牌保持一致，保证骑手取货可确认门店。
    */
    @NotBlank(message = "shopName不能为空")
    @SerializedName("shop_name")
    private String shopName;
    /**
    * 一级品类，见附件品类代码表 说明：品类需按门店真实配送品类选择，如无法判断可咨询您的销售经理。
    */
    @NotNull(message = "category不能为空")
    @SerializedName("category")
    private Integer category;
    /**
    * 二级品类，见附件品类代码表 说明：品类需按门店真实配送品类选择，如无法判断可咨询您的销售经理。
    */
    @NotNull(message = "secondCategory不能为空")
    @SerializedName("second_category")
    private Integer secondCategory;
    /**
    * 门店联系人姓名
    */
    @NotBlank(message = "contactName不能为空")
    @SerializedName("contact_name")
    private String contactName;
    /**
    * 联系电话
    */
    @NotBlank(message = "contactPhone不能为空")
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
    @NotBlank(message = "shopAddress不能为空")
    @SerializedName("shop_address")
    private String shopAddress;
    /**
    * 门牌号
    */
    @SerializedName("shop_address_detail")
    private String shopAddressDetail;
    /**
    * 门店经度（火星坐标或百度坐标，和 coordinate_type 字段配合使用），坐标 * （10的六次方），如 116398419 说明：请提供准确坐标，便于骑手取货
    */
    @NotNull(message = "shopLng不能为空")
    @SerializedName("shop_lng")
    private Integer shopLng;
    /**
    * 门店纬度（火星坐标或百度坐标，和 coordinate_type 字段配合使用），坐标 * （10的六次方），如 39985005 说明：请提供准确坐标，便于骑手取货
    */
    @NotNull(message = "shopLat不能为空")
    @SerializedName("shop_lat")
    private Integer shopLat;
    /**
    * 坐标类型，0：火星坐标（高德，腾讯地图均采用火星坐标） 1：百度坐标 （默认值为0）
    */
    @NotNull(message = "coordinateType不能为空")
    @SerializedName("coordinate_type")
    private Integer coordinateType;
    /**
    * 配送服务代码，详情见合同  1）服务包  飞速达:4002  快速达:4011  及时达:4012  集中送:4013  跑腿B帮送:4031 例如：4011,4012(多个英文逗号隔开)  2）新服务产品  具体可参考新服务产品列表
    */
    @SerializedName("delivery_service_codes")
    private String deliveryServiceCodes;
    /**
    * 营业时间  例：[{"beginTime":"00:00","endTime":"24:00"}]  注：传入后美团根据区域可配送时间取交集时间作为门店配送时间
    */
    @NotBlank(message = "businessHours不能为空")
    @SerializedName("business_hours")
    private String businessHours;

    public String getShopId() {
        return shopId;
    }
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
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
    public String getBusinessHours() {
        return businessHours;
    }
    public void setBusinessHours(String businessHours) {
        this.businessHours = businessHours;
    }


    @Override
    public MeituanResponse<CreateShopResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<CreateShopResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CreateShopRequest{" + "shopId=" + shopId + "," + "shopName=" + shopName + "," + "category=" + category + "," + "secondCategory=" + secondCategory + "," + "contactName=" + contactName + "," + "contactPhone=" + contactPhone + "," + "contactEmail=" + contactEmail + "," + "shopAddress=" + shopAddress + "," + "shopAddressDetail=" + shopAddressDetail + "," + "shopLng=" + shopLng + "," + "shopLat=" + shopLat + "," + "coordinateType=" + coordinateType + "," + "deliveryServiceCodes=" + deliveryServiceCodes + "," + "businessHours=" + businessHours + "}";
    }
}
