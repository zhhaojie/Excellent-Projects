package com.meituan.sdk.model.waimaiNg.dish.waimaiQueryBoxPricetypeAndDetail;

import com.google.gson.annotations.SerializedName;

/**
* 查询门店打包费
* This file was automatically generated.
*/
public class WaimaiQueryBoxPricetypeAndDetailResponse {
    @SerializedName("boxPriceDetail")
    private BoxPriceDetail boxPriceDetail;
    /**
    * 打包费类型, 0为按商品收费, 1 为按订单收费, 2为按口袋收费
    */
    @SerializedName("boxPriceType")
    private Integer boxPriceType;

    public BoxPriceDetail getBoxPriceDetail() {
        return boxPriceDetail;
    }
    public void setBoxPriceDetail(BoxPriceDetail boxPriceDetail) {
        this.boxPriceDetail = boxPriceDetail;
    }
    public Integer getBoxPriceType() {
        return boxPriceType;
    }
    public void setBoxPriceType(Integer boxPriceType) {
        this.boxPriceType = boxPriceType;
    }




    @Override
    public String toString() {
        return "WaimaiQueryBoxPricetypeAndDetailResponse{" + "boxPriceDetail=" + boxPriceDetail + "," + "boxPriceType=" + boxPriceType + "}";
    }
}
