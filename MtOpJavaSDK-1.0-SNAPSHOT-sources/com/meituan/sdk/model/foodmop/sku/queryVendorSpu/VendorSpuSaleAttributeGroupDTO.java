package com.meituan.sdk.model.foodmop.sku.queryVendorSpu;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 商品售卖属性组列表  当 SKU 数 > 1 时必填；当 SKU 数 = 1 时，可不填
* This file was automatically generated.
*/
public class VendorSpuSaleAttributeGroupDTO {
    /**
    * 商品售卖属性组基本信息
    */
    @NotNull(message = "spuSaleAttributeGroupBasic不能为空")
    @SerializedName("spuSaleAttributeGroupBasic")
    private SpuSaleAttributeGroupBasicDTO spuSaleAttributeGroupBasic;
    /**
    * 售卖属性组关联的属性值  key：售卖属性于组中的展示顺序  value：售卖属性 code
    */
    @NotBlank(message = "vendorSpuSaleAttributeCodeMap不能为空")
    @SerializedName("vendorSpuSaleAttributeCodeMap")
    private String vendorSpuSaleAttributeCodeMap;
    /**
    * 星巴克品牌定制，其他品牌不关注  售卖属性组关联的附加冷热配料  key：属性值于组中的展示顺序  value：附加冷热配料 code
    */
    @SerializedName("vendorSpuPremiumCodeMap")
    private String vendorSpuPremiumCodeMap;

    public SpuSaleAttributeGroupBasicDTO getSpuSaleAttributeGroupBasic() {
        return spuSaleAttributeGroupBasic;
    }
    public void setSpuSaleAttributeGroupBasic(SpuSaleAttributeGroupBasicDTO spuSaleAttributeGroupBasic) {
        this.spuSaleAttributeGroupBasic = spuSaleAttributeGroupBasic;
    }
    public String getVendorSpuSaleAttributeCodeMap() {
        return vendorSpuSaleAttributeCodeMap;
    }
    public void setVendorSpuSaleAttributeCodeMap(String vendorSpuSaleAttributeCodeMap) {
        this.vendorSpuSaleAttributeCodeMap = vendorSpuSaleAttributeCodeMap;
    }
    public String getVendorSpuPremiumCodeMap() {
        return vendorSpuPremiumCodeMap;
    }
    public void setVendorSpuPremiumCodeMap(String vendorSpuPremiumCodeMap) {
        this.vendorSpuPremiumCodeMap = vendorSpuPremiumCodeMap;
    }




    @Override
    public String toString() {
        return "VendorSpuSaleAttributeGroupDTO{" + "spuSaleAttributeGroupBasic=" + spuSaleAttributeGroupBasic + "," + "vendorSpuSaleAttributeCodeMap=" + vendorSpuSaleAttributeCodeMap + "," + "vendorSpuPremiumCodeMap=" + vendorSpuPremiumCodeMap + "}";
    }
}
