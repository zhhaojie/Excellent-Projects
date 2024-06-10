package com.meituan.sdk.model.waimaiNg.dish.waimaiSaveBoxPriceTypeAndDetail;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-46a480fa-d853-4a62-8bc9-e0c7add91d07"><span style="color: #333">打包费信息 (boxPriceType为0时该字段可不传)</span></p>
* This file was automatically generated.
*/
public class BoxPriceDetail {
    /**
    * <p data-diff-id="ct-diff-id-e3c29c07-39bc-457a-af2d-0cf7528646f1"><span style="color: #333">打包费收取方式 1为按阶梯价格收费, 2为按一口价收费</span></p>
    */
    @SerializedName("boxPriceRuleType")
    private Integer boxPriceRuleType;
    /**
    * <p data-diff-id="ct-diff-id-86c47089-d33e-402f-980b-89031d058e0d"><span style="color: rgb(51, 51, 51)">一口价价格(boxPriceRulesVoList不为空时，该字段不传或传值为0)</span></p>
    */
    @SerializedName("fixedPrice")
    private Float fixedPrice;
    /**
    * <p data-diff-id="ct-diff-id-df90bbe5-a3f9-46ef-87c2-ba89c914630f"><span style="color: #333">阶梯规则  (1. 要求规则数量最少两条最多十条; 2. fixedPrice&gt;0时，该字段不传或为空)</span></p>
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
