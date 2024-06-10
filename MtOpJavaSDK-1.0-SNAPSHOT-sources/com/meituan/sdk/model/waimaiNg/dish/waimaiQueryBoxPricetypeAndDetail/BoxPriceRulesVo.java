package com.meituan.sdk.model.waimaiNg.dish.waimaiQueryBoxPricetypeAndDetail;

import com.google.gson.annotations.SerializedName;

/**
* 阶梯规则, 要求规则数量最少两条最多十条
* This file was automatically generated.
*/
public class BoxPriceRulesVo {
    /**
    * 阶梯最高价
    */
    @SerializedName("endPrice")
    private Float endPrice;
    /**
    * 该阶梯内的打包费
    */
    @SerializedName("ladderPrice")
    private Float ladderPrice;
    /**
    * 阶梯起始价
    */
    @SerializedName("startPrice")
    private Float startPrice;

    public Float getEndPrice() {
        return endPrice;
    }
    public void setEndPrice(Float endPrice) {
        this.endPrice = endPrice;
    }
    public Float getLadderPrice() {
        return ladderPrice;
    }
    public void setLadderPrice(Float ladderPrice) {
        this.ladderPrice = ladderPrice;
    }
    public Float getStartPrice() {
        return startPrice;
    }
    public void setStartPrice(Float startPrice) {
        this.startPrice = startPrice;
    }




    @Override
    public String toString() {
        return "BoxPriceRulesVo{" + "endPrice=" + endPrice + "," + "ladderPrice=" + ladderPrice + "," + "startPrice=" + startPrice + "}";
    }
}
