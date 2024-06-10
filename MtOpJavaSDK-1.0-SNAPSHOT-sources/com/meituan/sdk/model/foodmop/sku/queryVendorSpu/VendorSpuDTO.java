package com.meituan.sdk.model.foodmop.sku.queryVendorSpu;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 商品信息
* This file was automatically generated.
*/
public class VendorSpuDTO {
    /**
    * 商品基本信息
    */
    @NotNull(message = "spuBasic不能为空")
    @SerializedName("spuBasic")
    private SpuBasicDTO spuBasic;
    /**
    * 商品类型  NORMAL_SPU(1, "普通商品")  FIXED_COMBO(2, "固定套餐")  DINNERWARE(3, "餐具")
    */
    @NotNull(message = "type不能为空")
    @SerializedName("type")
    private Integer type;
    /**
    * 商品 SKU 列表
    */
    @NotEmpty(message = "vendorSkuList不能为空")
    @SerializedName("vendorSkuList")
    private List<VendorSkuDTO> vendorSkuList;
    /**
    * defaultVendorSkuId
    */
    @NotBlank(message = "defaultVendorSkuId不能为空")
    @SerializedName("defaultVendorSkuId")
    private String defaultVendorSkuId;
    /**
    * 商品后台类目基本信息，用于开店宝后台配置营销活动时，按商品后台分类进行商品圈选。后台类目品牌自定义即可
    */
    @NotNull(message = "backgroundCategoryBasic不能为空")
    @SerializedName("backgroundCategoryBasic")
    private BackgroundCategoryBasicDTO backgroundCategoryBasic;
    /**
    * 商品售卖属性组列表  当 SKU 数 > 1 时必填；当 SKU 数 = 1 时，可不填
    */
    @SerializedName("vendorSpuSaleAttributeGroupList")
    private List<VendorSpuSaleAttributeGroupDTO> vendorSpuSaleAttributeGroupList;
    /**
    * 商品配料属性组列表  若商品没有配料，则不填
    */
    @SerializedName("vendorSpuPremiumGroupList")
    private List<VendorSpuPremiumGroupDTO> vendorSpuPremiumGroupList;

    public SpuBasicDTO getSpuBasic() {
        return spuBasic;
    }
    public void setSpuBasic(SpuBasicDTO spuBasic) {
        this.spuBasic = spuBasic;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public List<VendorSkuDTO> getVendorSkuList() {
        return vendorSkuList;
    }
    public void setVendorSkuList(List<VendorSkuDTO> vendorSkuList) {
        this.vendorSkuList = vendorSkuList;
    }
    public String getDefaultVendorSkuId() {
        return defaultVendorSkuId;
    }
    public void setDefaultVendorSkuId(String defaultVendorSkuId) {
        this.defaultVendorSkuId = defaultVendorSkuId;
    }
    public BackgroundCategoryBasicDTO getBackgroundCategoryBasic() {
        return backgroundCategoryBasic;
    }
    public void setBackgroundCategoryBasic(BackgroundCategoryBasicDTO backgroundCategoryBasic) {
        this.backgroundCategoryBasic = backgroundCategoryBasic;
    }
    public List<VendorSpuSaleAttributeGroupDTO> getVendorSpuSaleAttributeGroupList() {
        return vendorSpuSaleAttributeGroupList;
    }
    public void setVendorSpuSaleAttributeGroupList(List<VendorSpuSaleAttributeGroupDTO> vendorSpuSaleAttributeGroupList) {
        this.vendorSpuSaleAttributeGroupList = vendorSpuSaleAttributeGroupList;
    }
    public List<VendorSpuPremiumGroupDTO> getVendorSpuPremiumGroupList() {
        return vendorSpuPremiumGroupList;
    }
    public void setVendorSpuPremiumGroupList(List<VendorSpuPremiumGroupDTO> vendorSpuPremiumGroupList) {
        this.vendorSpuPremiumGroupList = vendorSpuPremiumGroupList;
    }




    @Override
    public String toString() {
        return "VendorSpuDTO{" + "spuBasic=" + spuBasic + "," + "type=" + type + "," + "vendorSkuList=" + vendorSkuList + "," + "defaultVendorSkuId=" + defaultVendorSkuId + "," + "backgroundCategoryBasic=" + backgroundCategoryBasic + "," + "vendorSpuSaleAttributeGroupList=" + vendorSpuSaleAttributeGroupList + "," + "vendorSpuPremiumGroupList=" + vendorSpuPremiumGroupList + "}";
    }
}
