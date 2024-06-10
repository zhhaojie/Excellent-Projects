package com.meituan.sdk.model.wmoperNg.order.riderPosition;

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
* 自配订单同步配送信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/order/riderPosition",
    businessId = 16,
    apiVersion = "10022",
    apiName = "rider_position",
    needAuth = true
)
public class RiderPositionRequest implements MeituanRequest<String> {
    /**
    * <p>订单号</p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    /**
    * <p>第三方配送商物流单号，字段不为空时长度必须小于32位</p>
    */
    @SerializedName("thirdCarrierId")
    private String thirdCarrierId;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">code 说明 0 配送单发往配送 10 配送单已确认 15 骑手已到店 20 骑手已取餐 40 骑手已送达 100 配送单已取消</font></span></p>
    */
    @NotNull(message = "logisticsStatus不能为空")
    @SerializedName("logisticsStatus")
    private Integer logisticsStatus;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">配送人名称</font></span></p>
    */
    @NotBlank(message = "courierName不能为空")
    @SerializedName("courierName")
    private String courierName;
    /**
    * <p><span style="color: rgb(88, 90, 110)"><font style="font-size:14px;line-height:22px" data-size="14">配送员联系电话。 格式为纯数字，仅支持11位手机号、固定电话、400电话、用“#”“_”“,”拼接分机号的电话</font></span></p>
    */
    @NotBlank(message = "courierPhone不能为空")
    @SerializedName("courierPhone")
    private String courierPhone;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:13px;line-height:21px" data-size="13">第三方配送方式 配送code 配送方 10001 顺丰 10002 达达 10003 闪送 10004 蜂鸟 10005 UU跑腿 10006 快跑者 10007 极客快送 10008 点我达 10009 同达 10010 生活半径 10011 邻趣 10012 趣送 10013 快服务 10014 菜鸟新配盟 10015 商家自建配送 10016 风先生 10017 其他 10018 美团配送</font></span></p>
    */
    @NotNull(message = "thirdLogisticsId不能为空")
    @SerializedName("thirdLogisticsId")
    private Integer thirdLogisticsId;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">骑手当前的纬度</font></span></p>
    */
    @NotBlank(message = "latitude不能为空")
    @SerializedName("latitude")
    private String latitude;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">骑手当前的经度</font></span></p>
    */
    @NotBlank(message = "longitude不能为空")
    @SerializedName("longitude")
    private String longitude;
    /**
    * <p>骑手信息采集时间戳</p>
    */
    @NotNull(message = "backFlowTime不能为空")
    @SerializedName("backFlowTime")
    private Integer backFlowTime;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">配送员电话类型。0是真实号，1是隐私号</font></span></p>
    */
    @SerializedName("courierPhoneType")
    private Integer courierPhoneType;

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public String getThirdCarrierId() {
        return thirdCarrierId;
    }
    public void setThirdCarrierId(String thirdCarrierId) {
        this.thirdCarrierId = thirdCarrierId;
    }
    public Integer getLogisticsStatus() {
        return logisticsStatus;
    }
    public void setLogisticsStatus(Integer logisticsStatus) {
        this.logisticsStatus = logisticsStatus;
    }
    public String getCourierName() {
        return courierName;
    }
    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }
    public String getCourierPhone() {
        return courierPhone;
    }
    public void setCourierPhone(String courierPhone) {
        this.courierPhone = courierPhone;
    }
    public Integer getThirdLogisticsId() {
        return thirdLogisticsId;
    }
    public void setThirdLogisticsId(Integer thirdLogisticsId) {
        this.thirdLogisticsId = thirdLogisticsId;
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
    public Integer getBackFlowTime() {
        return backFlowTime;
    }
    public void setBackFlowTime(Integer backFlowTime) {
        this.backFlowTime = backFlowTime;
    }
    public Integer getCourierPhoneType() {
        return courierPhoneType;
    }
    public void setCourierPhoneType(Integer courierPhoneType) {
        this.courierPhoneType = courierPhoneType;
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
        return "RiderPositionRequest{" + "orderId=" + orderId + "," + "thirdCarrierId=" + thirdCarrierId + "," + "logisticsStatus=" + logisticsStatus + "," + "courierName=" + courierName + "," + "courierPhone=" + courierPhone + "," + "thirdLogisticsId=" + thirdLogisticsId + "," + "latitude=" + latitude + "," + "longitude=" + longitude + "," + "backFlowTime=" + backFlowTime + "," + "courierPhoneType=" + courierPhoneType + "}";
    }
}
