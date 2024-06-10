package com.meituan.sdk.model.peisong.shop.updateShop;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 修改门店
* This file was automatically generated.
*/
@ApiMeta(
    path = "/peisong/shop/update",
    businessId = 19,
    apiVersion = "10007",
    apiName = "update_shop",
    needAuth = true
)
public class UpdateShopRequest implements MeituanRequest<UpdateShopResponse> {
    /**
    * <p><span style="color: rgb(42, 42, 42)"><font style="font-size:14px;line-height:22px" data-size="14">取货门店id，即合作方向美团提供的门店id</font></span></p>
    */
    @NotBlank(message = "shopId不能为空")
    @SerializedName("shop_id")
    private String shopId;
    /**
    * <p>门店名称</p><p>说明：①门店名称格式请按照 【XX品牌-XX店 or XX品牌（XX店）】填写，例：百果园（望京店），括号内信息必须以【店】结尾；②名称最大不能超过50个字符。</p><p>注：该名称需与实体门店门牌保持一致，保证骑手取货可确认门店。</p>
    */
    @SerializedName("shop_name")
    private String shopName;
    /**
    * <p><span style="color: rgb(42, 42, 42)"><font style="font-size:14px;line-height:22px" data-size="14">门店联系人姓名</font></span></p>
    */
    @SerializedName("contact_name")
    private String contactName;
    /**
    * <p><span style="color: rgb(42, 42, 42)"><font style="font-size:14px;line-height:22px" data-size="14">联系电话</font></span></p><p>说明：支持手机号、支持400电话、支持固话（格式为【区号】【-】【座机号】【-】【分机号】，分机号如有则添加）。</p>
    */
    @SerializedName("contact_phone")
    private String contactPhone;
    /**
    * <p><span style="color: rgb(42, 42, 42)"><font style="font-size:14px;line-height:22px" data-size="14">联系邮箱</font></span></p>
    */
    @SerializedName("contact_email")
    private String contactEmail;
    /**
    * <p><span style="color: rgb(42, 42, 42)"><font style="font-size:14px;line-height:22px" data-size="14">门店地址</font></span></p><p>说明：①地址长度不得小于5个字符大于60个字符；②地址信息不得含有折扣/满减信息。</p><p>注：请提供真实准确的门店地址，便于骑手取货。</p>
    */
    @SerializedName("shop_address")
    private String shopAddress;
    /**
    * <p><span style="color: rgb(42, 42, 42)"><font style="font-size:14px;line-height:22px" data-size="14">门牌号</font></span></p>
    */
    @SerializedName("shop_address_detail")
    private String shopAddressDetail;
    /**
    * <p><span style="color: rgb(42, 42, 42)"><font style="font-size:14px;line-height:22px" data-size="14">门店经度（火星坐标或百度坐标，和 coordinate_type 字段配合使用），坐标 * （10的六次方），如 116398419</font></span></p><p>说明：门店坐标与地址所在城市、行政区等需保持一致。</p><p>注：请提供准确坐标，便于骑手取货。</p>
    */
    @SerializedName("shop_lng")
    private Integer shopLng;
    /**
    * <p><span style="color: rgb(42, 42, 42)"><font style="font-size:14px;line-height:22px" data-size="14">门店纬度（火星坐标或百度坐标，和 coordinate_type 字段配合使用），坐标 * （10的六次方），如 39985005</font></span></p><p>说明：门店坐标与地址所在城市、行政区等需保持一致。</p><p>注：请提供准确坐标，便于骑手取货。</p>
    */
    @SerializedName("shop_lat")
    private Integer shopLat;
    /**
    * <p><span style="color: rgb(42, 42, 42)"><font style="font-size:14px;line-height:22px" data-size="14">坐标类型，0：火星坐标（高德，腾讯地图均采用火星坐标） 1：百度坐标 （默认值为0）</font></span></p>
    */
    @SerializedName("coordinate_type")
    private Integer coordinateType;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">配送服务代码，详情见合同 1）服务包 飞速达:4002 快速达:4011 及时达:4012 集中送:4013 跑腿B帮送:4031 例如：4011,4012(多个英文逗号隔开) 2）新服务产品 具体可参考新服务产品列表</font></span></p>
    */
    @SerializedName("delivery_service_codes")
    private String deliveryServiceCodes;
    /**
    * <p>营业时间</p><p>例：[{"beginTime":"00:00","endTime":"24:00"}]</p><p>注：传入后美团根据区域可配送时间取交集时间作为门店配送时间</p>
    */
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
    public MeituanResponse<UpdateShopResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<UpdateShopResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "UpdateShopRequest{" + "shopId=" + shopId + "," + "shopName=" + shopName + "," + "contactName=" + contactName + "," + "contactPhone=" + contactPhone + "," + "contactEmail=" + contactEmail + "," + "shopAddress=" + shopAddress + "," + "shopAddressDetail=" + shopAddressDetail + "," + "shopLng=" + shopLng + "," + "shopLat=" + shopLat + "," + "coordinateType=" + coordinateType + "," + "deliveryServiceCodes=" + deliveryServiceCodes + "," + "businessHours=" + businessHours + "}";
    }
}
