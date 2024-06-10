package com.meituan.sdk.model.klOpen.order.createOrderSync;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;
import javax.validation.constraints.NotEmpty;

/**
* 快驴同步创建订单
* This file was automatically generated.
*/
@ApiMeta(
    path = "/kl/open/order/create/sync",
    businessId = 27,
    apiVersion = "10004",
    apiName = "create_order_sync",
    needAuth = true
)
public class CreateOrderSyncRequest implements MeituanRequest<String> {
    /**
    * <p>服务商订单标识</p>
    */
    @NotBlank(message = "orderSn不能为空")
    @SerializedName("orderSn")
    private String orderSn;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">快驴门店码</font></span></p>
    */
    @NotBlank(message = "merchantCode不能为空")
    @SerializedName("merchantCode")
    private String merchantCode;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">服务商关联商家品牌</font></span></p>
    */
    @NotBlank(message = "brandIdentify不能为空")
    @SerializedName("brandIdentify")
    private String brandIdentify;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">服务商订单上需要在快驴订单上展示的信息组合</font></span></p>
    */
    @SerializedName("remark")
    private String remark;
    /**
    * <p>加盟店0代表创建订单，1代表支付订单</p><p>直营店1代表创建订单</p><p></p>
    */
    @NotNull(message = "type不能为空")
    @SerializedName("type")
    private Integer type;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">订单商品列表</font></span></p>
    */
    @NotEmpty(message = "cartProducts不能为空")
    @SerializedName("cartProducts")
    private List<GoodsList> cartProducts;
    /**
    * <p>订单金额</p>
    */
    @NotBlank(message = "totalAmount不能为空")
    @SerializedName("totalAmount")
    private String totalAmount;

    public String getOrderSn() {
        return orderSn;
    }
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }
    public String getMerchantCode() {
        return merchantCode;
    }
    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }
    public String getBrandIdentify() {
        return brandIdentify;
    }
    public void setBrandIdentify(String brandIdentify) {
        this.brandIdentify = brandIdentify;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public List<GoodsList> getCartProducts() {
        return cartProducts;
    }
    public void setCartProducts(List<GoodsList> cartProducts) {
        this.cartProducts = cartProducts;
    }
    public String getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
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
        return "CreateOrderSyncRequest{" + "orderSn=" + orderSn + "," + "merchantCode=" + merchantCode + "," + "brandIdentify=" + brandIdentify + "," + "remark=" + remark + "," + "type=" + type + "," + "cartProducts=" + cartProducts + "," + "totalAmount=" + totalAmount + "}";
    }
}
