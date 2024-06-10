package com.meituan.sdk.model.wmoperNg.food.wmoperSaveBoxPriceTypeAndDetail;

import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-4d8c8d91-7cb5-4673-adc7-3a49767214eb"><span style="color: ">阶梯规则 (1. 要求规则数量最少两条最多十条; 2. fixedPrice&gt;0时，该字段不传或为空)</span></p>
* This file was automatically generated.
*/
public class BoxPriceRulesVo {
    /**
    * <p data-diff-id="ct-diff-id-b72b1ce8-e144-40aa-a12e-382086be9230"><span style="color: #333">阶梯最高价（最后一个阶梯的最高价用-1标识正无穷）</span></p>
    */
    @SerializedName("endPrice")
    private Float endPrice;
    /**
    * <p style="text-align: start;" data-diff-id="ct-diff-id-0a297d6f-c1f3-4ca8-855e-6b189244a478">该阶梯内的打包费</p>
    */
    @SerializedName("ladderPrice")
    private Float ladderPrice;
    /**
    * <p data-diff-id="ct-diff-id-5bff328e-0996-4e83-89e3-fb7d1016b2d0"><span style="color: #333">阶梯起始价 (1.后一个阶梯的起始价需要和前一个阶梯的最高价相同; 2.第一个阶梯起始价必须为0)</span></p>
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
