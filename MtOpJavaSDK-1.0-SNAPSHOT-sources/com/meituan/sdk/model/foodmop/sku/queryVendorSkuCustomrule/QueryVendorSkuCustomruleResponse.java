package com.meituan.sdk.model.foodmop.sku.queryVendorSkuCustomrule;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotEmpty;

/**
* 查询商品客制化规则
* This file was automatically generated.
*/
public class QueryVendorSkuCustomruleResponse {
    /**
    * 商品 SPU 编码
    */
    @NotBlank(message = "vendorSpuId不能为空")
    @SerializedName("vendorSpuId")
    private String vendorSpuId;
    /**
    * 商品 SKU 编码
    */
    @NotBlank(message = "vendorSkuId不能为空")
    @SerializedName("vendorSkuId")
    private String vendorSkuId;
    /**
    * 客制化规则列表
    */
    @NotEmpty(message = "skuCustomRuleBasicList不能为空")
    @SerializedName("skuCustomRuleBasicList")
    private List<SkuCustomRuleBasicDTO> skuCustomRuleBasicList;

    public String getVendorSpuId() {
        return vendorSpuId;
    }
    public void setVendorSpuId(String vendorSpuId) {
        this.vendorSpuId = vendorSpuId;
    }
    public String getVendorSkuId() {
        return vendorSkuId;
    }
    public void setVendorSkuId(String vendorSkuId) {
        this.vendorSkuId = vendorSkuId;
    }
    public List<SkuCustomRuleBasicDTO> getSkuCustomRuleBasicList() {
        return skuCustomRuleBasicList;
    }
    public void setSkuCustomRuleBasicList(List<SkuCustomRuleBasicDTO> skuCustomRuleBasicList) {
        this.skuCustomRuleBasicList = skuCustomRuleBasicList;
    }




    @Override
    public String toString() {
        return "QueryVendorSkuCustomruleResponse{" + "vendorSpuId=" + vendorSpuId + "," + "vendorSkuId=" + vendorSkuId + "," + "skuCustomRuleBasicList=" + skuCustomRuleBasicList + "}";
    }
}
