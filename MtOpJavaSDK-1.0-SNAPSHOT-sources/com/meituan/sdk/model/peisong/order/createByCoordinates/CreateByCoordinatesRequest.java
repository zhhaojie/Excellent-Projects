package com.meituan.sdk.model.peisong.order.createByCoordinates;

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
* 订单创建(送货分拣方式)
* This file was automatically generated.
*/
@ApiMeta(
    path = "/peisong/order/createByCoordinates",
    businessId = 19,
    apiVersion = "10007",
    apiName = "create_by_coordinates",
    needAuth = false
)
public class CreateByCoordinatesRequest implements MeituanRequest<CreateByCoordinatesResponse> {
    /**
    * 即配送活动标识，由外部系统生成，不同order_id应对应 不同的delivery_id，若因美团系统故障导致发单接口失 败，可利用相同的delivery_id重新发单，系统视为同一次 配送活动，若更换delivery_id，则系统视为两次独立配送 活动。
    */
    @NotNull(message = "deliveryId不能为空")
    @SerializedName("delivery_id")
    private Long deliveryId;
    /**
    * 订单id，即该订单在合作方系统中的id，最长不超过32个字符  注：目前若某一订单正在配送中（状态不为取消），再次发送同一订单（order_id相同）将返回同一mt_peisong_id
    */
    @NotBlank(message = "orderId不能为空")
    @SerializedName("order_id")
    private String orderId;
    /**
    * 订单来源：  101.美团（外卖&闪购）  102.饿了么  103.京东到家  201.商家web网站  202.商家小程序-微信  203.商家小程序-支付宝  204.商家APP  205.商家热线  其他，请直接填写中文字符串，最长不超过20个字符  非「其他」需传代码
    */
    @NotBlank(message = "outerOrderSourceDesc不能为空")
    @SerializedName("outer_order_source_desc")
    private String outerOrderSourceDesc;
    /**
    * 原平台订单号，如订单来源为美团，该字段必填，且为美团平台生成的订单号，最长不超过32个字符
    */
    @SerializedName("outer_order_source_no")
    private String outerOrderSourceNo;
    /**
    * 配送服务代码，详情见合同  飞速达:4002  快速达:4011  及时达:4012  集中送:4013
    */
    @NotNull(message = "deliveryServiceCode不能为空")
    @SerializedName("delivery_service_code")
    private Integer deliveryServiceCode;
    /**
    * 货物取货类型，目前只支持1  1：客户配送至站点  2：美团自取
    */
    @NotNull(message = "pickUpType不能为空")
    @SerializedName("pick_up_type")
    private Integer pickUpType;
    /**
    * 收件人名称，最长不超过256个字符
    */
    @NotBlank(message = "receiverName不能为空")
    @SerializedName("receiver_name")
    private String receiverName;
    /**
    * 收件人电话，最长不超过64个字符
    */
    @NotBlank(message = "receiverPhone不能为空")
    @SerializedName("receiver_phone")
    private String receiverPhone;
    /**
    * 收件人地址省，如上海市，江苏省，最长不超过10个字符
    */
    @NotBlank(message = "receiverProvince不能为空")
    @SerializedName("receiver_province")
    private String receiverProvince;
    /**
    * 收件人地址市，如上海市，南京市，最长不超过10个字符
    */
    @NotBlank(message = "receiverCity不能为空")
    @SerializedName("receiver_city")
    private String receiverCity;
    /**
    * 收件人地址区县，如静安区，最长不超过10个字符
    */
    @NotBlank(message = "receiverCountry不能为空")
    @SerializedName("receiver_country")
    private String receiverCountry;
    /**
    * 收件人地址街道，如宝山路街道，最长不超过30个字符
    */
    @SerializedName("receiver_town")
    private String receiverTown;
    /**
    * 收件人地址详情，如永兴路365号，最长不超过100个字符
    */
    @NotBlank(message = "receiverDetailAddress不能为空")
    @SerializedName("receiver_detail_address")
    private String receiverDetailAddress;
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
    * 货物价格，单位为元，精确到小数点后两位（如果小数点后位数多于两位，则四舍五入保留两位小数），范围为0-5000
    */
    @NotNull(message = "goodsValue不能为空")
    @SerializedName("goods_value")
    private Double goodsValue;
    /**
    * 货物高度，单位为cm，精确到小数点后两位（如果小数点后位数多于两位，则四舍五入保留两位小数），范围为0-45
    */
    @SerializedName("goods_height")
    private Double goodsHeight;
    /**
    * 货物宽度，单位为cm，精确到小数点后两位（如果小数点后位数多于两位，则四舍五入保留两位小数），范围为0-50
    */
    @SerializedName("goods_width")
    private Double goodsWidth;
    /**
    * 货物长度，单位为cm，精确到小数点后两位（如果小数点后位数多于两位，则四舍五入保留两位小数），范围为0-65
    */
    @SerializedName("goods_length")
    private Double goodsLength;
    /**
    * 货物重量，单位为kg，精确到小数点后两位（如果小数点后位数多于两位，则四舍五入保留两位小数），范围为0-50
    */
    @NotNull(message = "goodsWeight不能为空")
    @SerializedName("goods_weight")
    private Double goodsWeight;
    /**
    * <p>货物详情，最长不超过10240个字符，内容为JSON格式，示例如下：</p><p><font style="font-size:14px;line-height:22px" data-size="14">{ "goods":[ { "goodCount": 1, "goodName": "货品名称", "goodPrice": 9.99, "goodUnit": "个", "goodUnitCode":"10008" } ] }</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">goods对应货物列表；</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">goodCount表示货物数量，int类型，必填且必须大于0；</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">goodName表示货品名称，String类型，必填且不能为空；</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">goodPrice表示货品单价，double类型，选填，数值不小于0，精确到小数点后两位（如果小数点后位数多于两位，则四舍五入保留两位小数）；</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">goodUnit表示货品单位，String类型，选填，最长不超过20个字符；</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">goodUnitCode表示货品标准计量单位，String类型，有特殊计费模式商家请必传；若字段【goodUnit】与当前字段同时传值不一致时，则以当前货品标准计量单位为准；参照附录-<a class="ct-link" href="https://developer.meituan.com/docs/biz/biz_peisong_8f57644b-d79e-44f6-9060-063ccf10c942" data-auto_update="0"><font style="font-size:14px;line-height:22px" data-size="14">货品标准计量单位列表</font></a>。</font></p><p><strong><font style="font-size:14px;line-height:22px" data-size="14">强烈建议提供，方便骑手在取货时确认货品信息</font></strong></p>
    */
    @SerializedName("goods_detail")
    private String goodsDetail;
    /**
    * 货物取货信息，用于骑手到店取货，最长不超过100个字符
    */
    @SerializedName("goods_pickup_info")
    private String goodsPickupInfo;
    /**
    * 货物交付信息，最长不超过100个字符
    */
    @SerializedName("goods_delivery_info")
    private String goodsDeliveryInfo;
    /**
    * 期望取货时间，时区为GMT+8，当前距离Epoch（1970年1月1日) 以秒计算的时间，即unix-timestamp。
    */
    @SerializedName("expected_pickup_time")
    private Long expectedPickupTime;
    /**
    * 期望送达时间，时区为GMT+8，当前距离Epoch（1970年1月1日) 以秒计算的时间，即unix-timestamp。
    */
    @NotNull(message = "expectedDeliveryTime不能为空")
    @SerializedName("expected_delivery_time")
    private Long expectedDeliveryTime;
    /**
    * 订单类型，目前只支持预约单  0: 及时单(尽快送达，限当日订单)  1: 预约单
    */
    @NotNull(message = "orderType不能为空")
    @SerializedName("order_type")
    private Integer orderType;
    /**
    * 门店订单流水号，建议提供，方便骑手门店取货，最长不超过32个字符
    */
    @SerializedName("poi_seq")
    private String poiSeq;
    /**
    * 备注，最长不超过200个字符。
    */
    @SerializedName("note")
    private String note;

    public Long getDeliveryId() {
        return deliveryId;
    }
    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getOuterOrderSourceDesc() {
        return outerOrderSourceDesc;
    }
    public void setOuterOrderSourceDesc(String outerOrderSourceDesc) {
        this.outerOrderSourceDesc = outerOrderSourceDesc;
    }
    public String getOuterOrderSourceNo() {
        return outerOrderSourceNo;
    }
    public void setOuterOrderSourceNo(String outerOrderSourceNo) {
        this.outerOrderSourceNo = outerOrderSourceNo;
    }
    public Integer getDeliveryServiceCode() {
        return deliveryServiceCode;
    }
    public void setDeliveryServiceCode(Integer deliveryServiceCode) {
        this.deliveryServiceCode = deliveryServiceCode;
    }
    public Integer getPickUpType() {
        return pickUpType;
    }
    public void setPickUpType(Integer pickUpType) {
        this.pickUpType = pickUpType;
    }
    public String getReceiverName() {
        return receiverName;
    }
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
    public String getReceiverPhone() {
        return receiverPhone;
    }
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }
    public String getReceiverProvince() {
        return receiverProvince;
    }
    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }
    public String getReceiverCity() {
        return receiverCity;
    }
    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }
    public String getReceiverCountry() {
        return receiverCountry;
    }
    public void setReceiverCountry(String receiverCountry) {
        this.receiverCountry = receiverCountry;
    }
    public String getReceiverTown() {
        return receiverTown;
    }
    public void setReceiverTown(String receiverTown) {
        this.receiverTown = receiverTown;
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
    public Double getGoodsValue() {
        return goodsValue;
    }
    public void setGoodsValue(Double goodsValue) {
        this.goodsValue = goodsValue;
    }
    public Double getGoodsHeight() {
        return goodsHeight;
    }
    public void setGoodsHeight(Double goodsHeight) {
        this.goodsHeight = goodsHeight;
    }
    public Double getGoodsWidth() {
        return goodsWidth;
    }
    public void setGoodsWidth(Double goodsWidth) {
        this.goodsWidth = goodsWidth;
    }
    public Double getGoodsLength() {
        return goodsLength;
    }
    public void setGoodsLength(Double goodsLength) {
        this.goodsLength = goodsLength;
    }
    public Double getGoodsWeight() {
        return goodsWeight;
    }
    public void setGoodsWeight(Double goodsWeight) {
        this.goodsWeight = goodsWeight;
    }
    public String getGoodsDetail() {
        return goodsDetail;
    }
    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail;
    }
    public String getGoodsPickupInfo() {
        return goodsPickupInfo;
    }
    public void setGoodsPickupInfo(String goodsPickupInfo) {
        this.goodsPickupInfo = goodsPickupInfo;
    }
    public String getGoodsDeliveryInfo() {
        return goodsDeliveryInfo;
    }
    public void setGoodsDeliveryInfo(String goodsDeliveryInfo) {
        this.goodsDeliveryInfo = goodsDeliveryInfo;
    }
    public Long getExpectedPickupTime() {
        return expectedPickupTime;
    }
    public void setExpectedPickupTime(Long expectedPickupTime) {
        this.expectedPickupTime = expectedPickupTime;
    }
    public Long getExpectedDeliveryTime() {
        return expectedDeliveryTime;
    }
    public void setExpectedDeliveryTime(Long expectedDeliveryTime) {
        this.expectedDeliveryTime = expectedDeliveryTime;
    }
    public Integer getOrderType() {
        return orderType;
    }
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }
    public String getPoiSeq() {
        return poiSeq;
    }
    public void setPoiSeq(String poiSeq) {
        this.poiSeq = poiSeq;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }


    @Override
    public MeituanResponse<CreateByCoordinatesResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<CreateByCoordinatesResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CreateByCoordinatesRequest{" + "deliveryId=" + deliveryId + "," + "orderId=" + orderId + "," + "outerOrderSourceDesc=" + outerOrderSourceDesc + "," + "outerOrderSourceNo=" + outerOrderSourceNo + "," + "deliveryServiceCode=" + deliveryServiceCode + "," + "pickUpType=" + pickUpType + "," + "receiverName=" + receiverName + "," + "receiverPhone=" + receiverPhone + "," + "receiverProvince=" + receiverProvince + "," + "receiverCity=" + receiverCity + "," + "receiverCountry=" + receiverCountry + "," + "receiverTown=" + receiverTown + "," + "receiverDetailAddress=" + receiverDetailAddress + "," + "receiverLng=" + receiverLng + "," + "receiverLat=" + receiverLat + "," + "coordinateType=" + coordinateType + "," + "goodsValue=" + goodsValue + "," + "goodsHeight=" + goodsHeight + "," + "goodsWidth=" + goodsWidth + "," + "goodsLength=" + goodsLength + "," + "goodsWeight=" + goodsWeight + "," + "goodsDetail=" + goodsDetail + "," + "goodsPickupInfo=" + goodsPickupInfo + "," + "goodsDeliveryInfo=" + goodsDeliveryInfo + "," + "expectedPickupTime=" + expectedPickupTime + "," + "expectedDeliveryTime=" + expectedDeliveryTime + "," + "orderType=" + orderType + "," + "poiSeq=" + poiSeq + "," + "note=" + note + "}";
    }
}
