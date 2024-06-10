package com.meituan.sdk.model.foodmop.sku.batchUpdateSkuPrice;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-1e6ac31b-9c2e-4db2-9e3b-4663fde47a45">sku 价格维度</p>
* This file was automatically generated.
*/
public class PriceBusinessDimensionDTO {
    /**
    * <p data-diff-id="ct-diff-id-0893e46f-7ea2-44b8-be74-0d93b25910a2">1：商品基础价格；2：门店聚合维度价格，3：门店维度</p>
    */
    @NotNull(message = "businessDimensionType不能为空")
    @SerializedName("businessDimensionType")
    private Integer businessDimensionType;
    /**
    * <p data-diff-id="ct-diff-id-2b0380e5-3382-4b50-b3e9-e5ed5b994d07">价格维度 id-value</p><table data-borderwidth="1" data-diff-id="ct-diff-id-002c4bfc-0989-4a72-96d0-c40474496f06"><tbody><tr data-row-diff-id="ct-tr-diff-id-e3465276-4063-472e-b303-ed0d66310034"><th data-colwidth="151" width="151" data-cell-diff-id="ct-cell-diff-id-dd1e367b-70fa-41e1-8fc6-3a71798fd94b"><p data-diff-id="ct-diff-id-25478eeb-844b-4d3d-87d2-47adc0fe1046">key</p></th><th data-colwidth="114" width="114" data-cell-diff-id="ct-cell-diff-id-bd5c8a7b-8dc2-44d6-883e-d9b00172ec07"><p data-diff-id="ct-diff-id-1f5c6206-2985-489d-a80b-c7ae88d3020a">value</p></th><th data-colwidth="104" width="104" data-cell-diff-id="ct-cell-diff-id-435c1e63-b08c-4976-aead-d1797e798d98"><p data-diff-id="ct-diff-id-83253162-d009-4091-9e15-e8a14ae7edc0">businessDimensionType</p></th></tr><tr data-row-diff-id="ct-tr-diff-id-65b7c32d-55f9-493a-8d12-fef842098648"><td data-colwidth="151" width="151" data-cell-diff-id="ct-cell-diff-id-09736851-20f8-4ed2-8159-a1c49950539c"><p data-diff-id="ct-diff-id-a8f0596c-f123-49bc-a3ab-dc5ea2366314">POI_AGGREGATION</p></td><td data-colwidth="114" width="114" data-cell-diff-id="ct-cell-diff-id-09e44fe6-8817-4d4b-8b6f-8981c779d5c9"><p data-diff-id="ct-diff-id-77693e56-4625-482d-a75b-9ed7d36bb794">商家门店聚合 id（TAG_CODE门店标签接口)</p></td><td data-colwidth="104" width="104" data-cell-diff-id="ct-cell-diff-id-f9f06f4e-0fc8-40ff-8233-331dc9393246"><p data-diff-id="ct-diff-id-293d329a-8624-45e8-a769-35288b0d74e6">2 时的 key</p></td></tr><tr data-row-diff-id="ct-tr-diff-id-8e19f960-6e9d-4587-bdcd-860a5bd0cbfb"><td data-colwidth="151" width="151" data-cell-diff-id="ct-cell-diff-id-0524343a-1f85-41e9-b888-c03c28da85fa"><p data-diff-id="ct-diff-id-3538016c-d0d9-40f8-8ee9-339a2b1b7756">POI</p></td><td data-colwidth="114" width="114" data-cell-diff-id="ct-cell-diff-id-e7155028-a98f-4bc4-9837-95334252498a"><p data-diff-id="ct-diff-id-dffc9e73-20cd-487a-b17d-b546fad6e634">商家门店Id(即VendorShopId)</p></td><td data-colwidth="104" width="104" data-cell-diff-id="ct-cell-diff-id-cf5216dc-57fb-49fb-aec5-db821a0dbb9c"><p data-diff-id="ct-diff-id-c620435c-342a-4819-bd82-630ea636c5e6">3 时的 key</p></td></tr></tbody></table><p data-diff-id="ct-diff-id-eb9fbdda-cef4-49e3-89f8-ad98f13e0f61">businessDimensionType == 2 时必传</p><p data-diff-id="ct-diff-id-dc509f3d-27e8-4950-bcd9-27744bee38a4">value 必须为数字类型</p><p data-diff-id="ct-diff-id-1fe07a04-5078-42cc-aefd-8daff907476b">例如瑞幸，POI_AGGREGATION = 门店价格等级</p><p data-diff-id="ct-diff-id-9a23590b-bb60-493f-828e-428845a4fc11"></p>
    */
    @SerializedName("businessDimensionMap")
    private BusinessDimension businessDimensionMap;
    /**
    * <p data-diff-id="ct-diff-id-b2b30ec0-713b-440e-91be-4a34190cc40a">商品 spuId</p><p data-diff-id="ct-diff-id-764693ba-9a70-4bbc-bec2-8cb7b016d693">长度&lt;=xx字符</p>
    */
    @NotBlank(message = "vendorSpuId不能为空")
    @SerializedName("vendorSpuId")
    private String vendorSpuId;
    /**
    * <p data-diff-id="ct-diff-id-1f5e8ce4-e22d-4fad-96b1-2d5dc8063f09">商品 skuId</p><p data-diff-id="ct-diff-id-a0209546-63dc-4008-bab3-ea09cfa30d83">1、长度&lt;=xx字符</p><p data-diff-id="ct-diff-id-b01cc1d8-bac7-4fc5-b0f8-f05a7a8666a3">2、目前不支持一个品牌下不同vendorSpuId存在相同vendorSkuId 的情况</p>
    */
    @NotBlank(message = "vendorSkuId不能为空")
    @SerializedName("vendorSkuId")
    private String vendorSkuId;

    public Integer getBusinessDimensionType() {
        return businessDimensionType;
    }
    public void setBusinessDimensionType(Integer businessDimensionType) {
        this.businessDimensionType = businessDimensionType;
    }
    public BusinessDimension getBusinessDimensionMap() {
        return businessDimensionMap;
    }
    public void setBusinessDimensionMap(BusinessDimension businessDimensionMap) {
        this.businessDimensionMap = businessDimensionMap;
    }
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




    @Override
    public String toString() {
        return "PriceBusinessDimensionDTO{" + "businessDimensionType=" + businessDimensionType + "," + "businessDimensionMap=" + businessDimensionMap + "," + "vendorSpuId=" + vendorSpuId + "," + "vendorSkuId=" + vendorSkuId + "}";
    }
}
