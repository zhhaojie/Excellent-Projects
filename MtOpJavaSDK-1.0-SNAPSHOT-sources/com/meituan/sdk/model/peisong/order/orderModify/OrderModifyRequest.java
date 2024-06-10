package com.meituan.sdk.model.peisong.order.orderModify;

import com.meituan.sdk.annotations.ApiMeta;
import java.lang.Void;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 订单修改
* This file was automatically generated.
*/
@ApiMeta(
    path = "/peisong/order/modify",
    businessId = 19,
    apiVersion = "10011",
    apiName = "order_modify",
    needAuth = false
)
public class OrderModifyRequest implements MeituanRequest<Void> {
    /**
    * 美团配送内部订单id，最长不超过32个字符
    */
    @NotBlank(message = "mtPeisongId不能为空")
    @SerializedName("mt_peisong_id")
    private String mtPeisongId;
    /**
    * 收件人电话，最长不超过64个字符
    */
    @SerializedName("receiver_phone")
    private String receiverPhone;
    /**
    * 收件人地址详情，如永兴路365号，最长不超过100个字符
    */
    @SerializedName("receiver_detail_address")
    private String receiverDetailAddress;
    /**
    * 收件人经度（火星坐标或百度坐标，和 coordinate_type 字段配合使用），坐标 * （10的六次方），如 116398419
    */
    @SerializedName("receiver_lng")
    private Integer receiverLng;
    /**
    * 收件人纬度（火星坐标或百度坐标，和 coordinate_type 字段配合使用），坐标 * （10的六次方），如 39985005
    */
    @SerializedName("receiver_lat")
    private Integer receiverLat;
    /**
    * 坐标类型，0：火星坐标（高德，腾讯地图均采用火星坐标） 1：百度坐标 （默认值为0）
    */
    @SerializedName("coordinate_type")
    private Integer coordinateType;
    /**
    * 备注，最长不超过200个字符
    */
    @SerializedName("note")
    private String note;

    public String getMtPeisongId() {
        return mtPeisongId;
    }
    public void setMtPeisongId(String mtPeisongId) {
        this.mtPeisongId = mtPeisongId;
    }
    public String getReceiverPhone() {
        return receiverPhone;
    }
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }
    public String getReceiverDetailAddress() {
        return receiverDetailAddress;
    }
    public void setReceiverDetailAddress(String receiverDetailAddress) {
        this.receiverDetailAddress = receiverDetailAddress;
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
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
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
        return "OrderModifyRequest{" + "mtPeisongId=" + mtPeisongId + "," + "receiverPhone=" + receiverPhone + "," + "receiverDetailAddress=" + receiverDetailAddress + "," + "receiverLng=" + receiverLng + "," + "receiverLat=" + receiverLat + "," + "coordinateType=" + coordinateType + "," + "note=" + note + "}";
    }
}
