package com.meituan.sdk.model.wmoperNg.food.wmoperSaveBoxPriceTypeAndDetail;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-f0580792-ea7c-4bd0-a624-bad9b5a7b0e3"><span style="color: #333">打包费信息(boxPriceType为0时该字段可不传)</span></p>
* This file was automatically generated.
*/
public class BoxPriceDetail {
    /**
    * <p data-diff-id="ct-diff-id-bd0ab102-e5fb-451a-854c-8111334d9510"><span style="color: #333">打包费收取方式 1为按阶梯价格收费, 2为按一口价收费</span></p>
    */
    @SerializedName("boxPriceRuleType")
    private Integer boxPriceRuleType;
    /**
    * <p data-diff-id="ct-diff-id-b3f82920-62d2-4007-a9c2-4d81011a39fc"><span style="color: ">一口价价格(boxPriceRulesVoList不为空时，该字段不传或传值为0)</span></p>
    */
    @SerializedName("fixedPrice")
    private Float fixedPrice;
    /**
    * <p data-diff-id="ct-diff-id-4d8c8d91-7cb5-4673-adc7-3a49767214eb"><span style="color: ">阶梯规则 (1. 要求规则数量最少两条最多十条; 2. fixedPrice&gt;0时，该字段不传或为空)</span></p>
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
