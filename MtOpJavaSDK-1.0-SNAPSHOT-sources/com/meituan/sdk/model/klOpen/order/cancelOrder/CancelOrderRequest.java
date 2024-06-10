package com.meituan.sdk.model.klOpen.order.cancelOrder;

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
* 申请取消订单
* This file was automatically generated.
*/
@ApiMeta(
    path = "/kl/open/order/cancel",
    businessId = 27,
    apiVersion = "10006",
    apiName = "cancel_order",
    needAuth = true
)
public class CancelOrderRequest implements MeituanRequest<Void> {
    /**
    * <p>快驴订单编号</p>
    */
    @NotBlank(message = "orderId不能为空")
    @SerializedName("orderId")
    private String orderId;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">取消原因</font></span></p>
    */
    @NotBlank(message = "cancelReason不能为空")
    @SerializedName("cancelReason")
    private String cancelReason;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">取消备注</font></span></p>
    */
    @NotBlank(message = "cancelRemark不能为空")
    @SerializedName("cancelRemark")
    private String cancelRemark;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">取消人</font></span></p>
    */
    @SerializedName("cancelUser")
    private String cancelUser;
    /**
    * <p data-diff-id="ct-diff-id-a501b8e7-54e9-4623-b5ae-7f7ff5c461d8">品牌标识，除华住外其他服务商必传。</p>
    */
    @SerializedName("brandIdentify")
    private String brandIdentify;

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getCancelReason() {
        return cancelReason;
    }
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }
    public String getCancelRemark() {
        return cancelRemark;
    }
    public void setCancelRemark(String cancelRemark) {
        this.cancelRemark = cancelRemark;
    }
    public String getCancelUser() {
        return cancelUser;
    }
    public void setCancelUser(String cancelUser) {
        this.cancelUser = cancelUser;
    }
    public String getBrandIdentify() {
        return brandIdentify;
    }
    public void setBrandIdentify(String brandIdentify) {
        this.brandIdentify = brandIdentify;
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
        return "CancelOrderRequest{" + "orderId=" + orderId + "," + "cancelReason=" + cancelReason + "," + "cancelRemark=" + cancelRemark + "," + "cancelUser=" + cancelUser + "," + "brandIdentify=" + brandIdentify + "}";
    }
}
