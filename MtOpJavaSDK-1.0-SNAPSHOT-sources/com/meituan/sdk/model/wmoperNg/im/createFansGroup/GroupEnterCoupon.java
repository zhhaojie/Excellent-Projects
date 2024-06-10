package com.meituan.sdk.model.wmoperNg.im.createFansGroup;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class GroupEnterCoupon {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">优惠券金额</font></span></p>
    */
    @SerializedName("price")
    private Integer price;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">使用门槛</font></span></p>
    */
    @SerializedName("limitPrice")
    private Integer limitPrice;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">有效期</font></span></p>
    */
    @SerializedName("validity")
    private Integer validity;

    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getLimitPrice() {
        return limitPrice;
    }
    public void setLimitPrice(Integer limitPrice) {
        this.limitPrice = limitPrice;
    }
    public Integer getValidity() {
        return validity;
    }
    public void setValidity(Integer validity) {
        this.validity = validity;
    }




    @Override
    public String toString() {
        return "GroupEnterCoupon{" + "price=" + price + "," + "limitPrice=" + limitPrice + "," + "validity=" + validity + "}";
    }
}
