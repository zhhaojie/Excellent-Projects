package com.meituan.sdk.model.foodmop.sku.batchQuerySkuPrice;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-33336438-95de-44bd-a4cb-8ea0cc21a22b">SKU 价格维度</p>
* This file was automatically generated.
*/
public class PriceBusinessDimensionDTO {
    /**
    * <p data-diff-id="ct-diff-id-b50da8ab-a431-43d7-b097-d6a9905feae3"><span style="color: rgba(0, 0, 0, 0.65)">1：商品基础价格；2：门店聚合维度价格，3：门店维度</span></p>
    */
    @NotNull(message = "businessDimensionType不能为空")
    @SerializedName("businessDimensionType")
    private Integer businessDimensionType;
    /**
    * <p data-diff-id="ct-diff-id-6191c7ab-2a4d-4ac8-b2bd-1361a059890d">价格维度 id-value</p><table data-borderwidth="1" data-diff-id="ct-diff-id-85efa35f-0581-4cf4-aa01-af792337be6d"><tbody><tr data-row-diff-id="ct-tr-diff-id-e3465276-4063-472e-b303-ed0d66310034"><th data-colwidth="151" width="151" data-cell-diff-id="ct-cell-diff-id-8695f961-e2b7-4cb5-99ca-fd8eb3462b1c"><p data-diff-id="ct-diff-id-ce968fa9-2ddf-4acc-9c1d-6764b7438366">key</p></th><th data-colwidth="114" width="114" data-cell-diff-id="ct-cell-diff-id-4abdfa90-ad94-482e-9ee0-a20e98b07222"><p data-diff-id="ct-diff-id-26f3122a-8949-487f-8afc-a5ed1e3be15a">value</p></th><th data-colwidth="104" width="104" data-cell-diff-id="ct-cell-diff-id-fc37a32d-50fc-4282-aab1-9c852ac551c1"><p data-diff-id="ct-diff-id-d8dd953c-bdff-4de1-ae61-f96fb68dcbce">businessDimensionType</p></th></tr><tr data-row-diff-id="ct-tr-diff-id-65b7c32d-55f9-493a-8d12-fef842098648"><td data-colwidth="151" width="151" data-cell-diff-id="ct-cell-diff-id-3fea8f40-6137-46be-a4b9-57be60c1904a"><p data-diff-id="ct-diff-id-1f8df944-d135-4c49-81a7-07509758c693">POI_AGGREGATION</p></td><td data-colwidth="114" width="114" data-cell-diff-id="ct-cell-diff-id-69f3b953-2952-42d7-9d20-fe432b0fe59f"><p data-diff-id="ct-diff-id-923bfcb2-b0b2-4b87-96e5-02150da88796">商家门店聚合 id（TAG_CODE门店标签接口)</p></td><td data-colwidth="104" width="104" data-cell-diff-id="ct-cell-diff-id-b1482c01-ef69-4f68-936a-1ae5505eab4c"><p data-diff-id="ct-diff-id-c74cfdc0-4ea9-4933-b36a-7ac80a949c73">2 时的 key</p></td></tr><tr data-row-diff-id="ct-tr-diff-id-8e19f960-6e9d-4587-bdcd-860a5bd0cbfb"><td data-colwidth="151" width="151" data-cell-diff-id="ct-cell-diff-id-9a2b63c6-f8d7-4c81-9c4f-e5575d44d641"><p data-diff-id="ct-diff-id-ddc63b66-5ae1-4e5e-9fb1-efbed0127f5d">POI</p></td><td data-colwidth="114" width="114" data-cell-diff-id="ct-cell-diff-id-3780ca87-37a7-42ca-987c-ab4028c4444d"><p data-diff-id="ct-diff-id-b898974a-7a6e-4790-a8ab-76ed788af9fe">商家门店Id(即VendorShopId)</p></td><td data-colwidth="104" width="104" data-cell-diff-id="ct-cell-diff-id-d7307c7d-0921-44dc-9987-9f772992876b"><p data-diff-id="ct-diff-id-4feedce5-ae31-429e-ad7a-4fafe4f08084">3 时的 key</p></td></tr></tbody></table><p data-diff-id="ct-diff-id-c0551061-6cf7-42f0-8420-8114157f4f42">businessDimensionType == 2 时必传</p><p data-diff-id="ct-diff-id-ee5f8a11-f292-43bc-ad5a-8748dbfaca37">value 必须为数字类型</p><p data-diff-id="ct-diff-id-7edfb48f-1a19-4a82-9d32-8c5926c5096f">例如瑞幸，POI_AGGREGATION = 门店价格等级</p><p data-diff-id="ct-diff-id-f2f3eab6-f335-46cb-8102-4a4de41b153b"></p>
    */
    @SerializedName("businessDimensionMap")
    private BusinessDimensionMap businessDimensionMap;
    /**
    * <p data-diff-id="ct-diff-id-d9d48046-68ce-461e-a2cb-2eebf83dd0cb">商品 spuId</p><p data-diff-id="ct-diff-id-558d884b-1b46-4936-afb8-3f9de4171c97">长度&lt;=xx字符</p>
    */
    @NotBlank(message = "vendorSpuId不能为空")
    @SerializedName("vendorSpuId")
    private String vendorSpuId;
    /**
    * <p data-diff-id="ct-diff-id-96660273-796f-4130-ad20-7401743a27af">商品 skuId</p><p data-diff-id="ct-diff-id-cae3418d-8c41-4afd-9015-f1cdab926ad1">1、长度&lt;=xx字符</p><p data-diff-id="ct-diff-id-d34e52b0-99c2-47fa-b64e-76b2f28932fb">2、目前不支持一个品牌下不同vendorSpuId存在相同vendorSkuId 的情况</p>
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
    public BusinessDimensionMap getBusinessDimensionMap() {
        return businessDimensionMap;
    }
    public void setBusinessDimensionMap(BusinessDimensionMap businessDimensionMap) {
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
