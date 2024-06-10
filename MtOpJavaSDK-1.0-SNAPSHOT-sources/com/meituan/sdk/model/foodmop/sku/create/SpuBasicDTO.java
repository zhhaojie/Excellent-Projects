package com.meituan.sdk.model.foodmop.sku.create;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-fa885452-24dd-407e-b136-cd24b52f1b45"><span style="color: rgb(0, 0, 0)">商品基本信息</span></p>
* This file was automatically generated.
*/
public class SpuBasicDTO {
    /**
    * <p data-diff-id="ct-diff-id-01388aed-69c4-4434-a3a6-82156f04a340">SPU 编码<br></p>
    */
    @NotBlank(message = "vendorSpuId不能为空")
    @SerializedName("vendorSpuId")
    private String vendorSpuId;
    /**
    * <p data-diff-id="ct-diff-id-60cecb20-79d1-4e7c-8a74-4d2f7789f7c1">商品名称</p>
    */
    @NotBlank(message = "name不能为空")
    @SerializedName("name")
    private String name;
    /**
    * <p data-diff-id="ct-diff-id-ecca5d8a-e710-433e-b299-627766eae45d">商品售卖时间，若不设值，商品全时段均可售卖</p>
    */
    @SerializedName("saleTime")
    private List<TimeDTO> saleTime;
    /**
    * <p data-diff-id="ct-diff-id-aa058ca5-212c-4663-968d-64a9f44626e0">商品描述</p>
    */
    @SerializedName("description")
    private String description;
    /**
    * <p data-diff-id="ct-diff-id-a9d067a7-3e18-45e7-934a-01e3ca5e9962">商品主要原料</p>
    */
    @SerializedName("material")
    private String material;
    /**
    * <p data-diff-id="ct-diff-id-da4ef035-5b45-4e0e-9edc-9616679e4f66">商品简述-<span style="color: ">最多 27 个字</span></p>
    */
    @SerializedName("brief")
    private String brief;
    /**
    * <p data-diff-id="ct-diff-id-987eeb19-6850-4320-8417-044d003017a3">全国上下架状态</p><ul data-diff-id="ct-diff-id-da05a68e-6310-4e74-9feb-8c994dbeefeb"><li data-list-item-diff-id="ct-list-item-diff-id-5c516869-08fa-4ec8-8cf7-a7af959e2fe7"><p data-diff-id="ct-diff-id-04578196-e1db-494d-8caa-e1eacdc1602b">0 ：下架</p></li><li data-list-item-diff-id="ct-list-item-diff-id-03b80acb-19ee-4f0f-a205-625e66e1e7e6"><p data-diff-id="ct-diff-id-53338783-61a0-465e-9c75-fda81854086f">1：上架</p></li></ul><p data-diff-id="ct-diff-id-e4821efc-f62c-4132-93fa-0e098580a3f6">默认填 1</p>
    */
    @NotNull(message = "shelfStatus不能为空")
    @SerializedName("shelfStatus")
    private Integer shelfStatus;
    /**
    * <p data-diff-id="ct-diff-id-f2ca2172-0225-4b54-bde2-7e22ce9c8b5e">是否可用会员积分抵扣</p><ul data-diff-id="ct-diff-id-2e8b437e-1b7d-417f-8fc1-0a0ae57252bc"><li data-list-item-diff-id="ct-list-item-diff-id-38c1d345-776f-4357-b351-232c31569d01"><p data-diff-id="ct-diff-id-700ed1b6-324c-4505-a48c-74cdf7a16320">true：可以</p></li><li data-list-item-diff-id="ct-list-item-diff-id-2646c727-f0f8-42e0-9bda-811aa4bc7787"><p data-diff-id="ct-diff-id-3df13eb3-2cbe-4081-9356-5dcaf3109c42">false：不可</p></li></ul><p data-diff-id="ct-diff-id-6ca3b647-bad9-4844-8f21-96a25f9f474b">默认 false</p>
    */
    @NotNull(message = "useMemberPoint不能为空")
    @SerializedName("useMemberPoint")
    private Boolean useMemberPoint;
    /**
    * <p data-diff-id="ct-diff-id-9c58a5d1-8f14-4e4c-937b-5ba9c1317825">商品标签，目前只支持新品标签，固定值为 "NEW"</p>
    */
    @SerializedName("tagList")
    private List<String> tagList;
    /**
    * <p data-diff-id="ct-diff-id-1236a5b4-72ef-42ce-9d72-079b0bde060a">媒介信息</p>
    */
    @SerializedName("media")
    private MediaDTO media;
    /**
    * <p data-diff-id="ct-diff-id-1f193e15-272b-4aa2-8bbc-c2e7440dec66">库存状态</p><ul data-diff-id="ct-diff-id-be9e3b91-0c30-467b-a052-287d8a49e736"><li data-list-item-diff-id="ct-list-item-diff-id-87b43b15-31e6-4ddb-a8d7-31d6ec504bf5"><p data-diff-id="ct-diff-id-ebb29ccc-01d0-4fef-a4f6-a1a395a7724a">1：有限库存</p></li><li data-list-item-diff-id="ct-list-item-diff-id-9e6725be-d740-4b10-980c-38bf90b456ea"><p data-diff-id="ct-diff-id-4d150c8a-27b3-4479-aa3f-239b87894964">2：无限库存</p></li></ul><p data-diff-id="ct-diff-id-fe8593ac-8013-4f9d-a8f7-0180b03d41f3">一般推荐，饮品属于无限库存，食品有限库存。设置为无限库存的商品，才可以进行商品库存同步，无限库存的商品不用操作库存同步</p>
    */
    @NotNull(message = "stockStatus不能为空")
    @SerializedName("stockStatus")
    private Integer stockStatus;
    /**
    * <p data-diff-id="ct-diff-id-ede2fea8-826a-4e73-b20c-d4489fa83bb1">扩展属性，一般品牌无特殊需求，不填即可</p><p data-diff-id="ct-diff-id-acc247bc-7f69-4b1b-a601-d6bd4e35b090"><span style="color: ">Map&lt;String,String&gt;</span></p><table data-borderwidth="1" data-diff-id="ct-diff-id-59dd0403-6915-43b7-a2cf-c619a049c7ee"><tbody><tr data-row-diff-id="ct-tr-diff-id-e780a458-aeb7-4326-a867-28d582b576a1"><th data-colwidth="168" width="168" data-cell-diff-id="ct-cell-diff-id-63602d08-aaa2-479c-8bb1-c44b21265b38"><p data-diff-id="ct-diff-id-08000308-78e3-4aec-af9a-db8b483976aa">Key</p></th><th data-colwidth="223" width="223" data-cell-diff-id="ct-cell-diff-id-d332f800-881e-4202-ad3f-0d498512cd7d"><p data-diff-id="ct-diff-id-8541b930-2ed5-4ddc-989e-845ccb1cff98">Value</p></th><th data-colwidth="370" width="370" data-cell-diff-id="ct-cell-diff-id-139e23e8-d0f4-41fa-85f9-057639eecf44"><p data-diff-id="ct-diff-id-bd43e785-f105-4e7b-8f0b-0b94e333a718">说明</p></th></tr><tr data-row-diff-id="ct-tr-diff-id-5319baa4-178e-42c4-8212-2343aee771a8"><td data-colwidth="168" width="168" data-cell-diff-id="ct-cell-diff-id-d5f9b7b2-5e02-40d9-8259-c5ffb64d497d"><p data-diff-id="ct-diff-id-6da99faf-097d-46f7-9304-1e7cfcb4b121">HIDE_IN_SHOP_MENU</p></td><td data-colwidth="223" width="223" data-cell-diff-id="ct-cell-diff-id-98a3ade1-a8e2-4fee-9373-bb15a3ce194d"><p data-diff-id="ct-diff-id-08fb3c88-e1d6-4d6a-bc24-5b5ab197bfd0">true</p><p data-diff-id="ct-diff-id-e0267a5e-fc70-4819-8018-adca5feaf061">false</p></td><td data-colwidth="370" width="370" data-cell-diff-id="ct-cell-diff-id-43781c07-b530-4b72-b630-44517d0c3000"><p data-diff-id="ct-diff-id-0e768395-ae62-484b-9a07-8f8e2aa70830">菜单隐藏商品</p></td></tr><tr data-row-diff-id="ct-tr-diff-id-d51748b2-a51c-4982-86f3-098d75494249"><td data-colwidth="168" width="168" data-cell-diff-id="ct-cell-diff-id-9abed0a1-fe1c-40b8-929e-47a9ffe77b99"><p data-diff-id="ct-diff-id-00594873-21fb-47ae-b8fb-a65a2d610008">SALE_ATTRIBUTE_MUTEX_MAP</p></td><td data-colwidth="223" width="223" data-cell-diff-id="ct-cell-diff-id-53562be6-9edc-4c50-889b-1ccbeb345ec1"><p data-diff-id="ct-diff-id-5593b53e-95b9-4a82-80f6-261a049eb32d">Map&lt;String, List&lt;String&gt;&gt;</p><p data-diff-id="ct-diff-id-accc4076-535f-408a-b9f6-b466142b971c"></p><p data-diff-id="ct-diff-id-b55292bb-443b-4a42-8a33-e54b199c654f">使用JSON.toJSONString序列化</p></td><td data-colwidth="370" width="370" data-cell-diff-id="ct-cell-diff-id-db84e84e-c629-4fc4-9e4f-2402835e2a68"><p data-diff-id="ct-diff-id-b0b46b8d-74ee-4252-bad4-1c0b6309587c">售卖属性互斥，互斥的售卖属性不能同时选中。例如「中杯」和「热」互斥，那么用户选中「中杯」后，「热」会置灰不可选，反之亦然</p><p data-diff-id="ct-diff-id-164d15c8-4e05-45ef-b917-8cb970d3d9d8">key: 售卖属性 code</p><p data-diff-id="ct-diff-id-e87eb129-b88a-4c4b-975b-803b218d91c2">value: 与 key 互斥的售卖属性 code 列表</p></td></tr></tbody></table><p data-diff-id="ct-diff-id-35a20336-7e09-408a-afe6-0c15565aa912"></p>
    */
    @SerializedName("extendInfoMap")
    private Map extendInfoMap;
    /**
    * <p data-diff-id="ct-diff-id-aeb1b1fb-b10f-422f-a18f-76ebb5ea143e">数据来源</p><p data-diff-id="ct-diff-id-52cef599-afec-4b1a-a88c-63ef99f27ac1">1：品牌自建</p><p data-diff-id="ct-diff-id-44dbf88e-ef94-4191-8556-a38164a41fac">2：品牌下发</p><p data-diff-id="ct-diff-id-c6331c84-6331-4abb-a275-0eb95c2b0c5b">3：门店自建</p><p data-diff-id="ct-diff-id-2fa954ed-1196-4916-909e-e77d37db9753">默认为1</p>
    */
    @SerializedName("source")
    private Integer source;
    /**
    * <p data-diff-id="ct-diff-id-4e4b86f4-3552-4817-bd11-12ea2f40ba77">source == 2 或 source ==3时必填</p>
    */
    @SerializedName("vendorShopId")
    private String vendorShopId;
    /**
    * <p data-diff-id="ct-diff-id-124eca14-c7e4-42a4-b959-82ba6ca51d93">source == 2 时，必填</p><p data-diff-id="ct-diff-id-0b65db5d-f400-4cf5-9575-f17102947d84">值为模板模板售卖属性 id</p>
    */
    @SerializedName("tradeMarkCode")
    private String tradeMarkCode;

    public String getVendorSpuId() {
        return vendorSpuId;
    }
    public void setVendorSpuId(String vendorSpuId) {
        this.vendorSpuId = vendorSpuId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<TimeDTO> getSaleTime() {
        return saleTime;
    }
    public void setSaleTime(List<TimeDTO> saleTime) {
        this.saleTime = saleTime;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getBrief() {
        return brief;
    }
    public void setBrief(String brief) {
        this.brief = brief;
    }
    public Integer getShelfStatus() {
        return shelfStatus;
    }
    public void setShelfStatus(Integer shelfStatus) {
        this.shelfStatus = shelfStatus;
    }
    public Boolean getUseMemberPoint() {
        return useMemberPoint;
    }
    public void setUseMemberPoint(Boolean useMemberPoint) {
        this.useMemberPoint = useMemberPoint;
    }
    public List<String> getTagList() {
        return tagList;
    }
    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }
    public MediaDTO getMedia() {
        return media;
    }
    public void setMedia(MediaDTO media) {
        this.media = media;
    }
    public Integer getStockStatus() {
        return stockStatus;
    }
    public void setStockStatus(Integer stockStatus) {
        this.stockStatus = stockStatus;
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
        return "SpuBasicDTO{" + "vendorSpuId=" + vendorSpuId + "," + "name=" + name + "," + "saleTime=" + saleTime + "," + "description=" + description + "," + "material=" + material + "," + "brief=" + brief + "," + "shelfStatus=" + shelfStatus + "," + "useMemberPoint=" + useMemberPoint + "," + "tagList=" + tagList + "," + "media=" + media + "," + "stockStatus=" + stockStatus + "," + "extendInfoMap=" + extendInfoMap + "," + "source=" + source + "," + "vendorShopId=" + vendorShopId + "," + "tradeMarkCode=" + tradeMarkCode + "}";
    }
}
