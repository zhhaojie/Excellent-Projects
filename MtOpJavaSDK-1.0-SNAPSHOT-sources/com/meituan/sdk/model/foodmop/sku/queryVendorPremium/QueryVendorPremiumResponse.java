package com.meituan.sdk.model.foodmop.sku.queryVendorPremium;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 查询配料属性信息
* This file was automatically generated.
*/
public class QueryVendorPremiumResponse {
    /**
    * 配料属性基本信息
    */
    @NotNull(message = "spuPremiumBasic不能为空")
    @SerializedName("spuPremiumBasic")
    private SpuPremiumBasicDTO spuPremiumBasic;
    /**
    * 只适用于星巴克品牌
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
        return "QueryVendorPremiumResponse{" + "spuPremiumBasic=" + spuPremiumBasic + "," + "childPremiumCode=" + childPremiumCode + "}";
    }
}
