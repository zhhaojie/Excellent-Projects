package com.meituan.sdk.model.peisong.order.check;

import com.meituan.sdk.annotations.ApiMeta;
import java.lang.Void;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 配送能力校验
* This file was automatically generated.
*/
@ApiMeta(
    path = "/peisong/order/check",
    businessId = 19,
    apiVersion = "10012",
    apiName = "check",
    needAuth = false
)
public class CheckRequest implements MeituanRequest<Void> {
    /**
    * 取货门店 id，即合作方向美团提供的门店 id。  注：测试门店的 shop_id 固定为 test_0001，仅用于对接时联调测试。
    */
    @NotBlank(message = "shopId不能为空")
    @SerializedName("shop_id")
    private String shopId;
    /**
    * 配送服务代码，详情见合同  1）服务包  飞速达:4002  快速达:4011  及时达:4012  集中送:4013  跑腿B帮送:4031  2）新服务产品  具体可参考 新服务产品列表
    */
    @NotNull(message = "deliveryServiceCode不能为空")
    @SerializedName("delivery_service_code")
    private Integer deliveryServiceCode;
    /**
    * 收件人地址，最长不超过 512 个字符
    */
    @NotBlank(message = "receiverAddress不能为空")
    @SerializedName("receiver_address")
    private String receiverAddress;
    /**
    * 收件人经度（火星坐标或百度坐标，和 coordinate_type 字段配合使用），坐标 * （10的六次方），如 116398419
    */
    @NotNull(message = "receiverLng不能为空")
    @SerializedName("receiver_lng")
    private Integer receiverLng;
    /**
    * 收件人纬度（火星坐标或百度坐标，和 coordinate_type 字段配合使用），坐标 * （10的六次方），如 39985005
    */
    @NotNull(message = "receiverLat不能为空")
    @SerializedName("receiver_lat")
    private Integer receiverLat;
    /**
    * 坐标类型，0：火星坐标（高德，腾讯地图均采用火星坐标） 1：百度坐标 （默认值为0）
    */
    @SerializedName("coordinate_type")
    private Integer coordinateType;
    /**
    * 预留字段，方便以后扩充校验规则，check_type = 1
    */
    @NotNull(message = "checkType不能为空")
    @SerializedName("check_type")
    private Integer checkType;
    /**
    * 模拟发单时间，时区为 GMT+8，当前距离 Epoch（1970年1月1日) 以秒计算的时间，即 unix-timestamp。
    */
    @NotNull(message = "mockOrderTime不能为空")
    @SerializedName("mock_order_time")
    private Long mockOrderTime;

    public String getShopId() {
        return shopId;
    }
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
    public Integer getDeliveryServiceCode() {
        return deliveryServiceCode;
    }
    public void setDeliveryServiceCode(Integer deliveryServiceCode) {
        this.deliveryServiceCode = deliveryServiceCode;
    }
    public String getReceiverAddress() {
        return receiverAddress;
    }
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }
    public Integer getReceiverLng() {
        return receiverLng;
    }
    public void setReceiverLng(Integer receiverLng) {
        this.receiverLng = receiverLng;
    }
    public Integer getReceiverLat() {
        return receiverLat;
    }
    public void setReceiverLat(Integer receiverLat) {
        this.receiverLat = receiverLat;
    }
    public Integer getCoordinateType() {
        return coordinateType;
    }
    public void setCoordinateType(Integer coordinateType) {
        this.coordinateType = coordinateType;
    }
    public Integer getCheckType() {
        return checkType;
    }
    public void setCheckType(Integer checkType) {
        this.checkType = checkType;
    }
    public Long getMockOrderTime() {
        return mockOrderTime;
    }
    public void setMockOrderTime(Long mockOrderTime) {
        this.mockOrderTime = mockOrderTime;
    }


    @Override
    public MeituanResponse<Void> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<Void>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CheckRequest{" + "shopId=" + shopId + "," + "deliveryServiceCode=" + deliveryServiceCode + "," + "receiverAddress=" + receiverAddress + "," + "receiverLng=" + receiverLng + "," + "receiverLat=" + receiverLat + "," + "coordinateType=" + coordinateType + "," + "checkType=" + checkType + "," + "mockOrderTime=" + mockOrderTime + "}";
    }
}
