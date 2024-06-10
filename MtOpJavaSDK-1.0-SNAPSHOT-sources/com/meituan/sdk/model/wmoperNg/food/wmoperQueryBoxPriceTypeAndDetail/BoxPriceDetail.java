package com.meituan.sdk.model.wmoperNg.food.wmoperQueryBoxPriceTypeAndDetail;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class BoxPriceDetail {
    /**
    * 打包费收取方式 1为按阶梯价格收费, 2为按一口价收费
    */
    @SerializedName("boxPriceRuleType")
    private Integer boxPriceRuleType;
    /**
    * 一口价价格
    */
    @SerializedName("fixedPrice")
    private Float fixedPrice;
    /**
    * 阶梯规则, 要求规则数量最少两条最多十条
    */
    @SerializedName("boxPriceRulesVoList")
    private List<BoxPriceRulesVo> boxPriceRulesVoList;

    public Integer getBoxPriceRuleType() {
        return boxPriceRuleType;
    }
    public void setBoxPriceRuleType(Integer boxPriceRuleType) {
        this.boxPriceRuleType = boxPriceRuleType;
    }
    public Float getFixedPrice() {
        return fixedPrice;
    }
    public void setFixedPrice(Float fixedPrice) {
        this.fixedPrice = fixedPrice;
    }
    public List<BoxPriceRulesVo> getBoxPriceRulesVoList() {
        return boxPriceRulesVoList;
    }
    public void setBoxPriceRulesVoList(List<BoxPriceRulesVo> boxPriceRulesVoList) {
        this.boxPriceRulesVoList = boxPriceRulesVoList;
    }




    @Override
    public String toString() {
        return "BoxPriceDetail{" + "boxPriceRuleType=" + boxPriceRuleType + "," + "fixedPrice=" + fixedPrice + "," + "boxPriceRulesVoList=" + boxPriceRulesVoList + "}";
    }
}
