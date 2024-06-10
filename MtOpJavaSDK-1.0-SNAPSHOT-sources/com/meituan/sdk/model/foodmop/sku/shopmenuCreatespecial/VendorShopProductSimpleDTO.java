package com.meituan.sdk.model.foodmop.sku.shopmenuCreatespecial;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-2c2383e3-d2e3-47c7-98bb-3d88fc49fcd7">商品 SPU 列表，必存在于商品池中</p><p data-diff-id="ct-diff-id-f488cf4f-4a7b-4536-a225-734289bef438">SellerCategoryBasicDTO<strong>.</strong>level == 2 时必填</p><p data-diff-id="ct-diff-id-1cd9d538-0bef-45a9-bc2a-aeb5bc10ec03">最多 50 个</p>
* This file was automatically generated.
*/
public class VendorShopProductSimpleDTO {
    /**
    * <p data-diff-id="ct-diff-id-c9b0ef98-e3e3-4955-9c61-65734c2b2cd4">商品id</p>
    */
    @NotBlank(message = "vendorProductId不能为空")
    @SerializedName("vendorProductId")
    private String vendorProductId;
    /**
    * <p data-diff-id="ct-diff-id-1d408f80-a0da-4dd6-ab37-4fd61991af9c">商品门店上下架状态</p><ul data-diff-id="ct-diff-id-d016bb56-0ede-4cc0-812c-9dde00fe491a"><li data-list-item-diff-id="ct-list-item-diff-id-03e3f6d2-01d3-403c-816a-b1228c7ac8df"><p data-diff-id="ct-diff-id-f93259aa-8892-40e4-b3ec-b86891eda446">0 ：下架</p></li><li data-list-item-diff-id="ct-list-item-diff-id-0101633e-3c56-4047-8442-58ad12de91b3"><p data-diff-id="ct-diff-id-a2c45534-27da-43c3-a74b-ef3c573dd02c">1：上架</p></li><li data-list-item-diff-id="ct-list-item-diff-id-901e2af4-46f6-4f2e-9da3-35175b6b5e5a"><p data-diff-id="ct-diff-id-0cf61d61-8388-4e05-9017-53db1526e352">如果updateShelfStatus=true</p><p data-diff-id="ct-diff-id-8a4a9b2f-8e33-44a5-8f8d-b3ddbc57d522">则不能为空，只能为 0 or 1</p></li></ul>
    */
    @NotNull(message = "shelfStatus不能为空")
    @SerializedName("shelfStatus")
    private Integer shelfStatus;
    /**
    * <p data-diff-id="ct-diff-id-bd88c2ea-61ea-41c2-8167-157872c4d9b0">商品形式：</p><ul data-diff-id="ct-diff-id-31de3f58-2a47-450a-99e8-f102a153e8fb"><li data-list-item-diff-id="ct-list-item-diff-id-ff529d33-cc7b-476e-8668-ab7ed8b384e2"><p data-diff-id="ct-diff-id-6c6d61b3-1b83-4fae-a69b-06c0e5a1f709">1：单品</p></li><li data-list-item-diff-id="ct-list-item-diff-id-f9940152-52ce-468f-adea-601d5ddd2021"><p data-diff-id="ct-diff-id-6963d756-43ee-4fa1-b8cb-3456bf3984d2">2：套餐</p></li></ul>
    */
    @NotNull(message = "vendorProductForm不能为空")
    @SerializedName("vendorProductForm")
    private Integer vendorProductForm;

    public String getVendorProductId() {
        return vendorProductId;
    }
    public void setVendorProductId(String vendorProductId) {
        this.vendorProductId = vendorProductId;
    }
    public Integer getShelfStatus() {
        return shelfStatus;
    }
    public void setShelfStatus(Integer shelfStatus) {
        this.shelfStatus = shelfStatus;
    }
    public Integer getVendorProductForm() {
        return vendorProductForm;
    }
    public void setVendorProductForm(Integer vendorProductForm) {
        this.vendorProductForm = vendorProductForm;
    }




    @Override
    public String toString() {
        return "VendorShopProductSimpleDTO{" + "vendorProductId=" + vendorProductId + "," + "shelfStatus=" + shelfStatus + "," + "vendorProductForm=" + vendorProductForm + "}";
    }
}
