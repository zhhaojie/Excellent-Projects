package com.meituan.sdk.model.waimaiNg.dish.waimaiSaveBoxPriceTypeAndDetail;

import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-df90bbe5-a3f9-46ef-87c2-ba89c914630f"><span style="color: #333">阶梯规则  (1. 要求规则数量最少两条最多十条; 2. fixedPrice&gt;0时，该字段不传或为空)</span></p>
* This file was automatically generated.
*/
public class BoxPriceRulesVo {
    /**
    * <p data-diff-id="ct-diff-id-6b9979a8-2305-4b71-ba1b-6627182a7bbb"><span style="color: #333">阶梯最高价（最后一个阶梯的最高价用-1标识正无穷）</span></p>
    */
    @SerializedName("endPrice")
    private Float endPrice;
    /**
    * <p data-diff-id="ct-diff-id-1db47c89-697c-432a-b2d9-e4878f3864b9"><span style="color: #333">该阶梯内的打包费</span></p>
    */
    @SerializedName("ladderPrice")
    private Float ladderPrice;
    /**
    * <p data-diff-id="ct-diff-id-1362e469-fb3e-47a2-8279-23bc92bb99bc"><span style="color: #333">阶梯起始价(1.后一个阶梯的起始价需要和前一个阶梯的最高价相同; 2.第一个阶梯起始价必须为0)</span></p>
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
