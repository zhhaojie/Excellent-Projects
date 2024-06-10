package com.meituan.sdk.model.klOpen.order.orderCreate;

import com.meituan.sdk.annotations.ApiMeta;
import java.lang.Void;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;
import javax.validation.constraints.NotEmpty;

/**
* 快驴订单创建
* This file was automatically generated.
*/
@ApiMeta(
    path = "/kl/open/order/create",
    businessId = 27,
    apiVersion = "10003",
    apiName = "order_create",
    needAuth = true
)
public class OrderCreateRequest implements MeituanRequest<Void> {
    /**
    * <p>服务商订单标识</p>
    */
    @NotBlank(message = "orderIdentify不能为空")
    @SerializedName("orderIdentify")
    private String orderIdentify;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">服务商门店标识</font></span></p>
    */
    @NotBlank(message = "shopIdentify不能为空")
    @SerializedName("shopIdentify")
    private String shopIdentify;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">服务商关联商家品牌</font></span></p>
    */
    @NotBlank(message = "brandIdentify不能为空")
    @SerializedName("brandIdentify")
    private String brandIdentify;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">服务商订单上需要在快驴订单上展示的信息组合</font></span></p>
    */
    @SerializedName("remarks")
    private String remarks;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">订单商品列表</font></span></p>
    */
    @NotEmpty(message = "goodsList不能为空")
    @SerializedName("goodsList")
    private List<GoodsList> goodsList;

    public String getOrderIdentify() {
        return orderIdentify;
    }
    public void setOrderIdentify(String orderIdentify) {
        this.orderIdentify = orderIdentify;
    }
    public String getShopIdentify() {
        return shopIdentify;
    }
    public void setShopIdentify(String shopIdentify) {
        this.shopIdentify = shopIdentify;
    }
    public String getBrandIdentify() {
        return brandIdentify;
    }
    public void setBrandIdentify(String brandIdentify) {
        this.brandIdentify = brandIdentify;
    }
    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public List<GoodsList> getGoodsList() {
        return goodsList;
    }
    public void setGoodsList(List<GoodsList> goodsList) {
        this.goodsList = goodsList;
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
        return "OrderCreateRequest{" + "orderIdentify=" + orderIdentify + "," + "shopIdentify=" + shopIdentify + "," + "brandIdentify=" + brandIdentify + "," + "remarks=" + remarks + "," + "goodsList=" + goodsList + "}";
    }
}
