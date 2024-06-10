package com.meituan.sdk.model.foodmop.sku.queryVendorSpu;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 商品配料属性组列表  若商品没有配料，则不填
* This file was automatically generated.
*/
public class VendorSpuPremiumGroupDTO {
    /**
    * 配料组基本信息
    */
    @NotNull(message = "spuPremiumGroupBasic不能为空")
    @SerializedName("spuPremiumGroupBasic")
    private SpuPremiumGroupBasicDTO spuPremiumGroupBasic;
    /**
    * 配料组关联的配料  key：配料于组中的展示顺序  value：配料 code
    */
    @NotBlank(message = "vendorSpuPremiumCodeMap不能为空")
    @SerializedName("vendorSpuPremiumCodeMap")
    private String vendorSpuPremiumCodeMap;
    /**
    * 若配料组之间具有父子层级，则需要配置配料组对应的父配料 code  例如星巴克品牌中，配料「低因」下挂子配料性组【萃取方式】，那么【萃取方式】组的 parentPremiumCode 为「低因」的属性值编码  一般品牌不需要关注此字段，不填即可
    */
    @SerializedName("parentPremiumCode")
    private String parentPremiumCode;

    public SpuPremiumGroupBasicDTO getSpuPremiumGroupBasic() {
        return spuPremiumGroupBasic;
    }
    public void setSpuPremiumGroupBasic(SpuPremiumGroupBasicDTO spuPremiumGroupBasic) {
        this.spuPremiumGroupBasic = spuPremiumGroupBasic;
    }
    public String getVendorSpuPremiumCodeMap() {
        return vendorSpuPremiumCodeMap;
    }
    public void setVendorSpuPremiumCodeMap(String vendorSpuPremiumCodeMap) {
        this.vendorSpuPremiumCodeMap = vendorSpuPremiumCodeMap;
    }
    public String getParentPremiumCode() {
        return parentPremiumCode;
    }
    public void setParentPremiumCode(String parentPremiumCode) {
        this.parentPremiumCode = parentPremiumCode;
    }




    @Override
    public String toString() {
        return "VendorSpuPremiumGroupDTO{" + "spuPremiumGroupBasic=" + spuPremiumGroupBasic + "," + "vendorSpuPremiumCodeMap=" + vendorSpuPremiumCodeMap + "," + "parentPremiumCode=" + parentPremiumCode + "}";
    }
}
