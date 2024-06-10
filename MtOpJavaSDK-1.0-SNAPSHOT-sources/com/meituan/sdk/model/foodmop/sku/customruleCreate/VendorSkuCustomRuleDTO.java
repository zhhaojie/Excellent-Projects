package com.meituan.sdk.model.foodmop.sku.customruleCreate;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotEmpty;

/**
* <p data-diff-id="ct-diff-id-6ac84962-b3d2-4aad-8a5a-51537dfad08e"><span style="color: ">商品 SPU 客制化规则列表</span></p>
* This file was automatically generated.
*/
public class VendorSkuCustomRuleDTO {
    /**
    * <p data-diff-id="ct-diff-id-6b6ac7dd-7f22-48e7-b6ef-60d4059cb339">商品 SPU 编码</p>
    */
    @NotBlank(message = "vendorSpuId不能为空")
    @SerializedName("vendorSpuId")
    private String vendorSpuId;
    /**
    * <p data-diff-id="ct-diff-id-56ca741b-156a-4f91-a8fc-da42c7dacc11">商品 SKU 编码</p>
    */
    @NotBlank(message = "vendorSkuId不能为空")
    @SerializedName("vendorSkuId")
    private String vendorSkuId;
    /**
    * <p data-diff-id="ct-diff-id-5822482e-2491-4d62-af6e-075f124e6b8d">客制化规则列表</p>
    */
    @NotEmpty(message = "skuCustomRuleBasicList不能为空")
    @SerializedName("skuCustomRuleBasicList")
    private List<SkuCustomRuleBasicDTO> skuCustomRuleBasicList;
    /**
    * <p data-diff-id="ct-diff-id-fb019a86-31fc-40c1-bb03-9ce9f3d2c20a">厂商门店 id</p><p data-diff-id="ct-diff-id-818e3061-3ca8-4a0b-93b0-fd958e1ade4f"><span style="color: ">门店商品需要传入</span></p>
    */
    @SerializedName("vendorShopId")
    private String vendorShopId;

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
    public String getVendorShopId() {
        return vendorShopId;
    }
    public void setVendorShopId(String vendorShopId) {
        this.vendorShopId = vendorShopId;
    }




    @Override
    public String toString() {
        return "VendorSkuCustomRuleDTO{" + "vendorSpuId=" + vendorSpuId + "," + "vendorSkuId=" + vendorSkuId + "," + "skuCustomRuleBasicList=" + skuCustomRuleBasicList + "," + "vendorShopId=" + vendorShopId + "}";
    }
}
