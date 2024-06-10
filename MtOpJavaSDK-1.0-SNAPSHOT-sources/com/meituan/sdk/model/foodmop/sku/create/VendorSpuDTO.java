package com.meituan.sdk.model.foodmop.sku.create;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* <p data-diff-id="ct-diff-id-da44a776-a3cc-498f-85e5-60ba091c427c">商品信息</p><p data-diff-id="ct-diff-id-e795dbc7-af25-41fe-9252-bfbb1ff5af19">不为空，每次最多传 1 个</p>
* This file was automatically generated.
*/
public class VendorSpuDTO {
    /**
    * <p data-diff-id="ct-diff-id-fa885452-24dd-407e-b136-cd24b52f1b45"><span style="color: rgb(0, 0, 0)">商品基本信息</span></p>
    */
    @NotNull(message = "spuBasic不能为空")
    @SerializedName("spuBasic")
    private SpuBasicDTO spuBasic;
    /**
    * <p data-diff-id="ct-diff-id-54cee0a9-98d0-4f2f-bd40-4fd726955f14">商品类型</p><ul data-diff-id="ct-diff-id-c346f135-ed4f-4166-b222-d5f94c916975"><li data-list-item-diff-id="ct-list-item-diff-id-0c0f75eb-1d85-4030-beb1-9114d5184134"><p data-diff-id="ct-diff-id-634bb337-a2d7-4b74-9813-721021498c9c">NORMAL_SPU(1, "普通商品")</p></li><li data-list-item-diff-id="ct-list-item-diff-id-f643592c-26f0-4c4d-91d3-8c643a6ec1d5"><p data-diff-id="ct-diff-id-97cf54c4-58c1-4c90-8121-17534dbef9be">FIXED_COMBO(2, "固定套餐")</p></li><li data-list-item-diff-id="ct-list-item-diff-id-3dd948d9-2614-4a5b-ae01-ffab85109889"><p data-diff-id="ct-diff-id-53e06eba-396e-4b0e-8fef-dd207a5861a5">DINNERWARE(3, "餐具")</p></li></ul>
    */
    @NotNull(message = "type不能为空")
    @SerializedName("type")
    private Integer type;
    /**
    * <p data-diff-id="ct-diff-id-0ee2d1fc-af5e-4785-8a1f-04cdc0723fb0"><span style="color: rgba(0, 0, 0, 0.65)">商品 SKU 列表</span></p>
    */
    @NotEmpty(message = "vendorSkuList不能为空")
    @SerializedName("vendorSkuList")
    private List<VendorSkuDTO> vendorSkuList;
    /**
    * <p data-diff-id="ct-diff-id-1ed47873-742f-4c7e-8992-48f99695cc40">默认选中的 skuId</p><p data-diff-id="ct-diff-id-2e2d3284-384e-4d94-8eef-7e85e232d119">skuId 必须存在于 vendorSkuList 中</p>
    */
    @NotBlank(message = "defaultVendorSkuId不能为空")
    @SerializedName("defaultVendorSkuId")
    private String defaultVendorSkuId;
    /**
    * <p data-diff-id="ct-diff-id-3719df7a-e6c8-48cc-bedb-4db90be4541d">商品后台类目基本信息，用于开店宝后台配置营销活动时，按商品后台分类进行商品圈选。后台类目品牌自定义即可</p>
    */
    @NotNull(message = "backgroundCategoryBasic不能为空")
    @SerializedName("backgroundCategoryBasic")
    private BackgroundCategoryBasicDTO backgroundCategoryBasic;
    /**
    * <p data-diff-id="ct-diff-id-a1e7f0b5-df0b-42a6-a0dd-03199c67f86f">商品售卖属性组列表</p><p data-diff-id="ct-diff-id-b9c5fed1-ceb7-4ca8-b7d0-daf7dc4e841d">当 SKU 数 &gt; 1 时必填；当 SKU 数 = 1 时，可不填</p><p data-diff-id="ct-diff-id-e423a667-b46f-4bc8-b1b9-26c0b50fd3a2">售卖属性组中关联的售卖属性必须通过创建或更新售卖属性前置同步至美团</p>
    */
    @SerializedName("vendorSpuSaleAttributeGroupList")
    private List<VendorSpuSaleAttributeGroupDTO> vendorSpuSaleAttributeGroupList;
    /**
    * <p data-diff-id="ct-diff-id-eea80d59-14f4-4a7c-be58-d1f41ecd6e10">商品配料属性组列表</p><p data-diff-id="ct-diff-id-55543c03-4d27-4191-85dc-5961bec9c5f1">若商品没有配料，则不填</p><p data-diff-id="ct-diff-id-dc641e66-7a15-4f87-b4b2-3887b45f785f">配料组中关联的售卖属性必须通过创建或更新配料属性前置同步至美团</p>
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
