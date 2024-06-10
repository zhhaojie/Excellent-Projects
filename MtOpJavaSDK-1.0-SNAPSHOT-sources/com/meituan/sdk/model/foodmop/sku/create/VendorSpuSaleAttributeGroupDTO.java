package com.meituan.sdk.model.foodmop.sku.create;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-a1e7f0b5-df0b-42a6-a0dd-03199c67f86f">商品售卖属性组列表</p><p data-diff-id="ct-diff-id-b9c5fed1-ceb7-4ca8-b7d0-daf7dc4e841d">当 SKU 数 &gt; 1 时必填；当 SKU 数 = 1 时，可不填</p><p data-diff-id="ct-diff-id-e423a667-b46f-4bc8-b1b9-26c0b50fd3a2">售卖属性组中关联的售卖属性必须通过创建或更新售卖属性前置同步至美团</p>
* This file was automatically generated.
*/
public class VendorSpuSaleAttributeGroupDTO {
    /**
    * <p data-diff-id="ct-diff-id-c08d493d-bb9f-4403-9282-6c3fffdc1c7f">商品售卖属性基本信息</p>
    */
    @NotNull(message = "spuSaleAttributeGroupBasic不能为空")
    @SerializedName("spuSaleAttributeGroupBasic")
    private SpuSaleAttributeGroupBasicDTO spuSaleAttributeGroupBasic;
    /**
    * <p data-diff-id="ct-diff-id-725afeb8-6a90-45fd-a5ab-b6f301c62fdf">售卖属性组关联的属性值</p><p data-diff-id="ct-diff-id-d72dd361-6a1b-4416-86dd-588a81f586e0">Map&lt;Integer,String&gt;类型</p><p data-diff-id="ct-diff-id-ed5a54b0-f9d4-4c6c-9eec-4a553fca1fb7">key：售卖属性于组中的展示顺序</p><p data-diff-id="ct-diff-id-77be2821-0814-46f0-8ed4-b88484921bd5">value：售卖属性 code</p><p data-diff-id="ct-diff-id-1f202219-49d3-49d3-aae7-3a70c89b7ced">不为空，属性值 code 必须对应于售卖属性编码，code 不能重复</p>
    */
    @NotNull(message = "vendorSpuSaleAttributeCodeMap不能为空")
    @SerializedName("vendorSpuSaleAttributeCodeMap")
    private Map vendorSpuSaleAttributeCodeMap;
    /**
    * <p data-diff-id="ct-diff-id-50cf72e0-dc6d-42a9-9d78-d781cf39a429">星巴克品牌定制，其他品牌不关注</p><p data-diff-id="ct-diff-id-a32c7f99-0e60-44f1-be07-4b09978ae744">售卖属性组关联的附加冷热配料</p><p data-diff-id="ct-diff-id-47f6e4b7-affb-4b02-a880-6d09b5fe77a9">Map&lt;Integer,String&gt;类型</p><p data-diff-id="ct-diff-id-9d24f173-40ac-4130-8eb3-503c9cd8a514">key：属性值于组中的展示顺序</p><p data-diff-id="ct-diff-id-b763b231-e511-44ac-b455-913a88f65b6e">value：附加冷热配料 code</p>
    */
    @SerializedName("vendorSpuPremiumCodeMap")
    private Map vendorSpuPremiumCodeMap;

    public SpuSaleAttributeGroupBasicDTO getSpuSaleAttributeGroupBasic() {
        return spuSaleAttributeGroupBasic;
    }
    public void setSpuSaleAttributeGroupBasic(SpuSaleAttributeGroupBasicDTO spuSaleAttributeGroupBasic) {
        this.spuSaleAttributeGroupBasic = spuSaleAttributeGroupBasic;
    }
    public Map getVendorSpuSaleAttributeCodeMap() {
        return vendorSpuSaleAttributeCodeMap;
    }
    public void setVendorSpuSaleAttributeCodeMap(Map vendorSpuSaleAttributeCodeMap) {
        this.vendorSpuSaleAttributeCodeMap = vendorSpuSaleAttributeCodeMap;
    }
    public Map getVendorSpuPremiumCodeMap() {
        return vendorSpuPremiumCodeMap;
    }
    public void setVendorSpuPremiumCodeMap(Map vendorSpuPremiumCodeMap) {
        this.vendorSpuPremiumCodeMap = vendorSpuPremiumCodeMap;
    }




    @Override
    public String toString() {
        return "VendorSpuSaleAttributeGroupDTO{" + "spuSaleAttributeGroupBasic=" + spuSaleAttributeGroupBasic + "," + "vendorSpuSaleAttributeCodeMap=" + vendorSpuSaleAttributeCodeMap + "," + "vendorSpuPremiumCodeMap=" + vendorSpuPremiumCodeMap + "}";
    }
}
