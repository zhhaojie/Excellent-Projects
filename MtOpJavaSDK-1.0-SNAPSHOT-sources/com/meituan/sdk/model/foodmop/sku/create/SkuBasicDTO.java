package com.meituan.sdk.model.foodmop.sku.create;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-5970d370-6a18-421b-aa3a-0663e961c227">商品 SKU 基本信息</p>
* This file was automatically generated.
*/
public class SkuBasicDTO {
    /**
    * <p data-diff-id="ct-diff-id-99d1d1d5-2f04-48f8-b4a6-ca6fb1d33bbd">商品 SKU 编码</p>
    */
    @NotBlank(message = "vendorSkuId不能为空")
    @SerializedName("vendorSkuId")
    private String vendorSkuId;
    /**
    * <p data-diff-id="ct-diff-id-fa9e94ba-8fe2-48e1-9b76-b18fb6c3b595">SKU 价格，单位分</p>
    */
    @NotNull(message = "price不能为空")
    @SerializedName("price")
    private Long price;
    /**
    * <p data-diff-id="ct-diff-id-f89e61d6-6e3f-4dbb-8d33-53399ef92f8a">会员价，单位分</p>
    */
    @SerializedName("memberPrice")
    private Long memberPrice;
    /**
    * <p data-diff-id="ct-diff-id-45684b37-7775-4bc5-a5f6-6fa880895f3d">全国上下架状态</p><ul data-diff-id="ct-diff-id-8d830272-cb76-4be1-8c34-8d02ad84ca72"><li data-list-item-diff-id="ct-list-item-diff-id-165ff4e7-2e22-438e-ac73-f7c6af9a1806"><p data-diff-id="ct-diff-id-9a89c0b2-c749-44a3-b8a6-2bac6ddec6af">0 ：下架</p></li><li data-list-item-diff-id="ct-list-item-diff-id-04fb0844-34a4-4ac7-945d-0410031c85ef"><p data-diff-id="ct-diff-id-cf802d58-1136-4d34-920a-5e28dc391f1a">1：上架</p></li></ul><p data-diff-id="ct-diff-id-8e6c513d-4bfe-49b4-a7a9-1cb1e0f74748">默认填 1 即可</p>
    */
    @NotNull(message = "shelfStatus不能为空")
    @SerializedName("shelfStatus")
    private Integer shelfStatus;
    /**
    * <p data-diff-id="ct-diff-id-fcc0763c-4f13-4478-ae47-38b183c20fdc">扩展属性</p><p data-diff-id="ct-diff-id-2278cbb0-fb8c-4a8e-a080-a379cf58728c"><span style="color: ">Map&lt;String,String&gt;</span></p><table data-borderwidth="1" data-diff-id="ct-diff-id-83158316-d42b-487c-a0b4-6407b1220674"><tbody><tr data-row-diff-id="ct-tr-diff-id-c0eeb67d-8cba-442d-9273-1c7bde3f59d9"><th data-colwidth="191" width="191" data-cell-diff-id="ct-cell-diff-id-c8ffdf19-9ca3-4349-99fc-c0bf1d9a98a6"><p data-diff-id="ct-diff-id-1e5a1c64-5fd6-4b38-854b-a11569bb2305"><strong>Key</strong></p></th><th data-colwidth="197" width="197" data-cell-diff-id="ct-cell-diff-id-d65703da-55ba-4216-aae1-9b0d374f04e5"><p data-diff-id="ct-diff-id-b7596baa-8188-4f51-8717-7a31bd342fc5">说明</p></th></tr><tr data-row-diff-id="ct-tr-diff-id-38259d83-0170-4b27-9cb3-9cf2857192d2"><td data-colwidth="191" width="191" data-cell-diff-id="ct-cell-diff-id-d3de15f7-87c8-41ee-bd60-5dc3efce356a"><p data-diff-id="ct-diff-id-206d3c74-26cc-4e88-971b-a4ec089a396a"><strong>DEFAULT_CPU_SIZE_ML</strong></p></td><td data-colwidth="197" width="197" data-cell-diff-id="ct-cell-diff-id-16d28e1a-4903-4294-b6c3-dd65e73f3c2e"><p data-diff-id="ct-diff-id-c71be3b0-f650-48e7-94fe-c8951bba693a">默认杯型毫升数，星巴克品牌针对部分 SKU 需要展示默认杯型的毫升数。</p></td></tr></tbody></table><p data-diff-id="ct-diff-id-6dccd31e-a68f-4181-81c4-bedd60e07a14"></p>
    */
    @SerializedName("extendInfoMap")
    private Map extendInfoMap;
    /**
    * <p data-diff-id="ct-diff-id-35d1f096-81d5-4619-92f3-d4b1ae022767"><span style="color: rgb(0, 0, 0)">数据来源</span></p><p data-diff-id="ct-diff-id-ba420bad-cbb7-4039-8070-580960fc6dff"><span style="color: rgb(0, 0, 0)">1：品牌自建</span></p><p data-diff-id="ct-diff-id-fd9abc64-c5af-46aa-bd64-56d8fd504f9b"><span style="color: rgb(0, 0, 0)">2：品牌下发</span></p><p data-diff-id="ct-diff-id-da23cde7-2214-4a6b-984e-642c33484f07"><span style="color: rgb(0, 0, 0)">3：门店自建</span></p><p data-diff-id="ct-diff-id-e29893cc-262e-4ae3-a4a8-62409e3d0d11"><span style="color: rgb(0, 0, 0)">默认1，其他先联系美团PM</span></p>
    */
    @SerializedName("source")
    private Integer source;
    /**
    * <p data-diff-id="ct-diff-id-9b0a7777-ba31-4bd9-82c3-c31c3307195f">source == 2 || source ==3时必填</p>
    */
    @SerializedName("vendorShopId")
    private String vendorShopId;
    /**
    * <p data-diff-id="ct-diff-id-2c2a2b98-80b3-4570-aeb5-c70a01e5d9cd"><span style="color: ">source == 2 时必填，值为模版商品 vendorSpuId</span></p>
    */
    @SerializedName("tradeMarkCode")
    private String tradeMarkCode;

    public String getVendorSkuId() {
        return vendorSkuId;
    }
    public void setVendorSkuId(String vendorSkuId) {
        this.vendorSkuId = vendorSkuId;
    }
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    }
    public Long getMemberPrice() {
        return memberPrice;
    }
    public void setMemberPrice(Long memberPrice) {
        this.memberPrice = memberPrice;
    }
    public Integer getShelfStatus() {
        return shelfStatus;
    }
    public void setShelfStatus(Integer shelfStatus) {
        this.shelfStatus = shelfStatus;
    }
    public Map getExtendInfoMap() {
        return extendInfoMap;
    }
    public void setExtendInfoMap(Map extendInfoMap) {
        this.extendInfoMap = extendInfoMap;
    }
    public Integer getSource() {
        return source;
    }
    public void setSource(Integer source) {
        this.source = source;
    }
    public String getVendorShopId() {
        return vendorShopId;
    }
    public void setVendorShopId(String vendorShopId) {
        this.vendorShopId = vendorShopId;
    }
    public String getTradeMarkCode() {
        return tradeMarkCode;
    }
    public void setTradeMarkCode(String tradeMarkCode) {
        this.tradeMarkCode = tradeMarkCode;
    }




    @Override
    public String toString() {
        return "SkuBasicDTO{" + "vendorSkuId=" + vendorSkuId + "," + "price=" + price + "," + "memberPrice=" + memberPrice + "," + "shelfStatus=" + shelfStatus + "," + "extendInfoMap=" + extendInfoMap + "," + "source=" + source + "," + "vendorShopId=" + vendorShopId + "," + "tradeMarkCode=" + tradeMarkCode + "}";
    }
}
