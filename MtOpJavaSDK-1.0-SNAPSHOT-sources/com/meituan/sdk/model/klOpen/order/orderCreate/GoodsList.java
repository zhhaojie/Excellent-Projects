package com.meituan.sdk.model.klOpen.order.orderCreate;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">订单商品列表</font></span></p>
* This file was automatically generated.
*/
public class GoodsList {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">服务商订单明细标识</font></span></p>
    */
    @NotBlank(message = "orderItemIdentify不能为空")
    @SerializedName("orderItemIdentify")
    private String orderItemIdentify;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">服务商商品标识</font></span></p>
    */
    @NotBlank(message = "goodsIdentify不能为空")
    @SerializedName("goodsIdentify")
    private String goodsIdentify;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">订单购买商品的数量</font></span></p>
    */
    @NotNull(message = "quantity不能为空")
    @SerializedName("quantity")
    private Integer quantity;

    public String getOrderItemIdentify() {
        return orderItemIdentify;
    }
    public void setOrderItemIdentify(String orderItemIdentify) {
        this.orderItemIdentify = orderItemIdentify;
    }
    public String getGoodsIdentify() {
        return goodsIdentify;
    }
    public void setGoodsIdentify(String goodsIdentify) {
        this.goodsIdentify = goodsIdentify;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }




    @Override
    public String toString() {
        return "GoodsList{" + "orderItemIdentify=" + orderItemIdentify + "," + "goodsIdentify=" + goodsIdentify + "," + "quantity=" + quantity + "}";
    }
}
