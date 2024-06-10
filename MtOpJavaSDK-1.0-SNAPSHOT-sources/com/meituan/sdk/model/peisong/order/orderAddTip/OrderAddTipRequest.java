package com.meituan.sdk.model.peisong.order.orderAddTip;

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
* 增加小费接口
* This file was automatically generated.
*/
@ApiMeta(
    path = "/peisong/order/addTip",
    businessId = 19,
    apiVersion = "10011",
    apiName = "order_add_tip",
    needAuth = false
)
public class OrderAddTipRequest implements MeituanRequest<Void> {
    /**
    * 配送活动标识
    */
    @NotNull(message = "deliveryId不能为空")
    @SerializedName("delivery_id")
    private Long deliveryId;
    /**
    * 美团配送内部订单id，最长不超过32个字符
    */
    @NotBlank(message = "mtPeisongId不能为空")
    @SerializedName("mt_peisong_id")
    private String mtPeisongId;
    /**
    * 小费金额，精确到元，需要为1或1的倍数，上限20，允许每个运单最多加5次；
    */
    @NotNull(message = "tipAmount不能为空")
    @SerializedName("tip_amount")
    private Integer tipAmount;
    /**
    * 加小费传入的唯一标识，用来幂等处理，最长不超过128个字符
    */
    @NotBlank(message = "serialNumber不能为空")
    @SerializedName("serial_number")
    private String serialNumber;

    public Long getDeliveryId() {
        return deliveryId;
    }
    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }
    public String getMtPeisongId() {
        return mtPeisongId;
    }
    public void setMtPeisongId(String mtPeisongId) {
        this.mtPeisongId = mtPeisongId;
    }
    public Integer getTipAmount() {
        return tipAmount;
    }
    public void setTipAmount(Integer tipAmount) {
        this.tipAmount = tipAmount;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
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
        return "OrderAddTipRequest{" + "deliveryId=" + deliveryId + "," + "mtPeisongId=" + mtPeisongId + "," + "tipAmount=" + tipAmount + "," + "serialNumber=" + serialNumber + "}";
    }
}
