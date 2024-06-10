package com.meituan.sdk.model.foodmop.sku.premiumCreate;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-02c889d9-fc84-424f-b7a2-4803efe89636">商品配料属性列表</p><p data-diff-id="ct-diff-id-5fd85904-5d17-4af4-b559-1e95a7995c75">不为空，每次最多传 25 个</p>
* This file was automatically generated.
*/
public class VendorSpuPremiumDTO {
    /**
    * <p data-diff-id="ct-diff-id-d7e240b9-1d11-4954-9c49-e91c87331b79">配料属性基本信息</p>
    */
    @NotNull(message = "spuPremiumBasic不能为空")
    @SerializedName("spuPremiumBasic")
    private SpuPremiumBasicDTO spuPremiumBasic;
    /**
    * <p data-diff-id="ct-diff-id-9eace99b-0a4d-4f6f-bd3b-a6a7deb182c1">只适用于星巴克品牌，其他品牌不填即可</p><p data-diff-id="ct-diff-id-5af90365-54b5-4243-8c61-891de7fffb37">子属性 code，若「浓缩份数」属性下有子属性「换购」则「浓缩份数」的 childPremiumCode 是「换购」的配料编码</p><p data-diff-id="ct-diff-id-05c9016f-3c62-401f-83c6-91102dd9d3b2"></p><p data-diff-id="ct-diff-id-49fb598e-71ef-4a80-9411-5baf96e97eae">childPremiumCode 必须存在于配料池，childPremiumCode != spuPremiumBasic.premiumCode</p>
    */
    @SerializedName("childPremiumCode")
    private String childPremiumCode;

    public SpuPremiumBasicDTO getSpuPremiumBasic() {
        return spuPremiumBasic;
    }
    public void setSpuPremiumBasic(SpuPremiumBasicDTO spuPremiumBasic) {
        this.spuPremiumBasic = spuPremiumBasic;
    }
    public String getChildPremiumCode() {
        return childPremiumCode;
    }
    public void setChildPremiumCode(String childPremiumCode) {
        this.childPremiumCode = childPremiumCode;
    }




    @Override
    public String toString() {
        return "VendorSpuPremiumDTO{" + "spuPremiumBasic=" + spuPremiumBasic + "," + "childPremiumCode=" + childPremiumCode + "}";
    }
}
