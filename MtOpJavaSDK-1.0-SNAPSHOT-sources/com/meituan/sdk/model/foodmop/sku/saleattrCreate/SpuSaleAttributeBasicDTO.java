package com.meituan.sdk.model.foodmop.sku.saleattrCreate;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-a2988d31-ce27-44da-876f-2c46f1d5772d"><span style="color: ">商品售卖属性列表</span></p>
* This file was automatically generated.
*/
public class SpuSaleAttributeBasicDTO {
    /**
    * <p data-diff-id="ct-diff-id-a2988d31-ce27-44da-876f-2c46f1d5772d">售卖属性编码</p>
    */
    @NotBlank(message = "saleAttributeCode不能为空")
    @SerializedName("saleAttributeCode")
    private String saleAttributeCode;
    /**
    * <p data-diff-id="ct-diff-id-5b134b32-7617-43d5-ab37-b1a98712a28c">售卖属性名称</p>
    */
    @NotBlank(message = "saleAttributeValue不能为空")
    @SerializedName("saleAttributeValue")
    private String saleAttributeValue;
    /**
    * <p data-diff-id="ct-diff-id-6a90555b-044b-4959-8883-465ee6c8986f">售卖属性排序，默认填 1 即可</p>
    */
    @NotNull(message = "rank不能为空")
    @SerializedName("rank")
    private Integer rank;
    /**
    * <p data-diff-id="ct-diff-id-d73e07fb-6539-4125-a0d7-2753662d49dd">售卖属性描述</p>
    */
    @SerializedName("description")
    private String description;
    /**
    * <p data-diff-id="ct-diff-id-cc00a486-1546-4b7f-adbd-6cb86bc605e8">媒介信息（图片等），目前不支持售卖属性添加图片</p>
    */
    @SerializedName("media")
    private MediaDTO media;
    /**
    * <p data-diff-id="ct-diff-id-10edd6e8-d3b9-47b4-8e32-bded3698d099">全国上下架状态 1：上架，0：下架。默认填 1 即可，表示<span style="color: ">售卖属性</span>全国上架</p><p data-diff-id="ct-diff-id-f99f006d-2a1c-4e15-8c1a-893c8f791592"></p>
    */
    @NotNull(message = "shelfStatus不能为空")
    @SerializedName("shelfStatus")
    private Integer shelfStatus;
    /**
    * <p data-diff-id="ct-diff-id-1aa4765c-eafc-4523-bf34-408ab0cb8606">份量大小，一般用于描述杯型的毫升数描述</p>
    */
    @SerializedName("weight")
    private String weight;
    /**
    * <p data-diff-id="ct-diff-id-40871e46-6014-4729-8759-3e36f3c9ce94">份量单位 ，一般用于描述杯型的毫升数的单位</p>
    */
    @SerializedName("weightUnit")
    private String weightUnit;
    /**
    * <p data-diff-id="ct-diff-id-61c9f1b3-e91b-47b5-955b-d7ff19622765">标识附加售卖属性还是标准售卖属性：</p><ul data-diff-id="ct-diff-id-a5cee23e-45e2-4487-a75a-76a28a922451"><li data-list-item-diff-id="ct-list-item-diff-id-d9ae70a9-fc6e-499e-89e1-7a5d6c840252"><p data-diff-id="ct-diff-id-caa00e06-e069-49c6-b927-e46d3afd8d13">1：标准售卖属性</p></li><li data-list-item-diff-id="ct-list-item-diff-id-7328a407-4564-40e9-9497-f3a7e71b5424"><p data-diff-id="ct-diff-id-e0c44d58-57ab-4534-8b2c-c25d6ef9853f">2：附加售卖属性</p></li></ul><p data-diff-id="ct-diff-id-928601a6-d1ae-4472-9eb9-38cd6d42b4bc">只适用于星巴克品牌，其他品牌只需要写死 type = 1 即可</p>
    */
    @NotNull(message = "type不能为空")
    @SerializedName("type")
    private Integer type;
    /**
    * <p data-diff-id="ct-diff-id-1fe8e04e-a9b4-473f-9846-04306d1c3cea">星巴克品牌特殊定制，其他品牌不关注</p><p data-diff-id="ct-diff-id-f21c8ab9-8813-4df0-8283-30efc4628dab">附加售卖属性关联的售卖属性编码，如微热的 relatedSaleAttributeCode = 热的属性编码</p>
    */
    @SerializedName("relatedSaleAttributeCode")
    private String relatedSaleAttributeCode;
    /**
    * <p data-diff-id="ct-diff-id-1888a016-5b7e-4777-b5bd-00d81f89c416">是否可用会员积分抵扣</p><ul data-diff-id="ct-diff-id-ac186dd2-8d98-4916-9435-05e05e537c22"><li data-list-item-diff-id="ct-list-item-diff-id-604af705-484d-4033-bafb-ed92cb281731"><p data-diff-id="ct-diff-id-03046746-7296-4739-8569-e9c8ee1a32a0">true：可以</p></li><li data-list-item-diff-id="ct-list-item-diff-id-10014d4d-968a-458b-b853-aec0eb0f41b3"><p data-diff-id="ct-diff-id-9d39df4b-fb92-4181-9d1e-e276cd9a6371">false：不可</p></li></ul><p data-diff-id="ct-diff-id-f8d6bc85-068d-4007-94d2-cf4bbd99e7d4">默认填 false</p>
    */
    @NotNull(message = "useMemberPoint不能为空")
    @SerializedName("useMemberPoint")
    private Boolean useMemberPoint;
    /**
    * <p data-diff-id="ct-diff-id-32688a39-3798-4028-bd66-aacdfa2644dd">数据来源 </p><p data-diff-id="ct-diff-id-94729196-f2ad-4e1c-964c-db853852fc31">1：品牌自建</p><p data-diff-id="ct-diff-id-d6aa761b-385d-4d11-bb4a-7b43db8f58d8">2：品牌下发</p><p data-diff-id="ct-diff-id-0e2594b8-1dc1-46c3-8e56-c5d3f97ab628">3：门店自建</p><p data-diff-id="ct-diff-id-f1f9ec67-3733-47f6-b686-2bc622992765">默认为1</p>
    */
    @SerializedName("source")
    private Integer source;
    /**
    * <p data-diff-id="ct-diff-id-91d92e99-34dc-4aeb-882e-2471f9ea5d99">厂商门店 id</p><p data-diff-id="ct-diff-id-e7e476b6-484a-457d-b04c-256f4f4443df">source == 2 或source ==3时必填</p>
    */
    @SerializedName("vendorShopId")
    private String vendorShopId;
    /**
    * <p data-diff-id="ct-diff-id-e532f82c-de07-4189-a9ab-db2dcc73960a">售卖属性标识</p><p data-diff-id="ct-diff-id-f9b9c0d2-4ed5-4b48-9c9d-a019e3b08e75">source == 2 时，必填值为模板模板售卖属性 id</p>
    */
    @SerializedName("tradeMarkCode")
    private String tradeMarkCode;

    public String getSaleAttributeCode() {
        return saleAttributeCode;
    }
    public void setSaleAttributeCode(String saleAttributeCode) {
        this.saleAttributeCode = saleAttributeCode;
    }
    public String getSaleAttributeValue() {
        return saleAttributeValue;
    }
    public void setSaleAttributeValue(String saleAttributeValue) {
        this.saleAttributeValue = saleAttributeValue;
    }
    public Integer getRank() {
        return rank;
    }
    public void setRank(Integer rank) {
        this.rank = rank;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public MediaDTO getMedia() {
        return media;
    }
    public void setMedia(MediaDTO media) {
        this.media = media;
    }
    public Integer getShelfStatus() {
        return shelfStatus;
    }
    public void setShelfStatus(Integer shelfStatus) {
        this.shelfStatus = shelfStatus;
    }
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public String getWeightUnit() {
        return weightUnit;
    }
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public String getRelatedSaleAttributeCode() {
        return relatedSaleAttributeCode;
    }
    public void setRelatedSaleAttributeCode(String relatedSaleAttributeCode) {
        this.relatedSaleAttributeCode = relatedSaleAttributeCode;
    }
    public Boolean getUseMemberPoint() {
        return useMemberPoint;
    }
    public void setUseMemberPoint(Boolean useMemberPoint) {
        this.useMemberPoint = useMemberPoint;
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
        return "SpuSaleAttributeBasicDTO{" + "saleAttributeCode=" + saleAttributeCode + "," + "saleAttributeValue=" + saleAttributeValue + "," + "rank=" + rank + "," + "description=" + description + "," + "media=" + media + "," + "shelfStatus=" + shelfStatus + "," + "weight=" + weight + "," + "weightUnit=" + weightUnit + "," + "type=" + type + "," + "relatedSaleAttributeCode=" + relatedSaleAttributeCode + "," + "useMemberPoint=" + useMemberPoint + "," + "source=" + source + "," + "vendorShopId=" + vendorShopId + "," + "tradeMarkCode=" + tradeMarkCode + "}";
    }
}
