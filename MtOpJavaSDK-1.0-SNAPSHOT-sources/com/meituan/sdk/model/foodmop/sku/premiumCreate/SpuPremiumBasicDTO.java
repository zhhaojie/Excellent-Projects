package com.meituan.sdk.model.foodmop.sku.premiumCreate;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-d7e240b9-1d11-4954-9c49-e91c87331b79">配料属性基本信息</p>
* This file was automatically generated.
*/
public class SpuPremiumBasicDTO {
    /**
    * <p data-diff-id="ct-diff-id-554db3e6-5f53-4656-a7ca-40f6f49a956b">配料编码</p><p data-diff-id="ct-diff-id-92eadd23-5f72-4912-817e-14b8a1fb8914">不为空，编码不能重复</p>
    */
    @NotBlank(message = "premiumCode不能为空")
    @SerializedName("premiumCode")
    private String premiumCode;
    /**
    * <p data-diff-id="ct-diff-id-c824ccc2-adbe-4751-b0bc-9fa05b4c8375">配料名称</p><p data-diff-id="ct-diff-id-ce083b61-da5b-4f31-b9ad-cd9364f641bd">不为空</p>
    */
    @NotBlank(message = "premiumValue不能为空")
    @SerializedName("premiumValue")
    private String premiumValue;
    /**
    * <p data-diff-id="ct-diff-id-88d6e21b-c189-45ff-bb06-2da83a82dd6c">排序，默认填 1 即可</p><p data-diff-id="ct-diff-id-eaf6db43-63d4-4252-915a-1a5707a15cbe">不为空，rank &gt; 0</p>
    */
    @NotNull(message = "rank不能为空")
    @SerializedName("rank")
    private Integer rank;
    /**
    * <p data-diff-id="ct-diff-id-3f8b63a3-5c09-4cc1-ae3a-56af90059e39">描述</p>
    */
    @SerializedName("description")
    private String description;
    /**
    * <p data-diff-id="ct-diff-id-15e4586b-cb16-47ad-9f6e-47f79ce93470">媒介信息，配料暂不支持展示图片</p>
    */
    @SerializedName("media")
    private MediaDTO media;
    /**
    * <p data-diff-id="ct-diff-id-46ce45de-f214-4531-8509-12397ada3bd8">全国上下架状态 </p><ul data-diff-id="ct-diff-id-7564e68a-b6d9-4995-904c-a507113dadaa"><li data-list-item-diff-id="ct-list-item-diff-id-3a6282b7-79db-40d5-968a-fe3396ad25fe"><p data-diff-id="ct-diff-id-46cb7785-083a-45ce-a267-db7741d38e41">1：上架</p></li><li data-list-item-diff-id="ct-list-item-diff-id-3b1cf7d3-392c-4d25-a701-3d2ff672043a"><p data-diff-id="ct-diff-id-8f7b867d-a603-4233-b801-191e8752a6ab">0：下架</p></li></ul><p data-diff-id="ct-diff-id-558407a8-34d3-4e5f-ab17-4fa6f29e6266">默认填 1 即可，表示配料全国上架</p><p data-diff-id="ct-diff-id-6af19376-c92b-4a0c-877f-9e29c7bb0811">不为空，只能为 0 或 1</p>
    */
    @NotNull(message = "shelfStatus不能为空")
    @SerializedName("shelfStatus")
    private Integer shelfStatus;
    /**
    * <p data-diff-id="ct-diff-id-4b4d2d2d-92b2-4467-867e-35899b596544">配料标签，该字段未实际投入使用，默认不填</p>
    */
    @SerializedName("tagList")
    private List<String> tagList;
    /**
    * <p data-diff-id="ct-diff-id-2839e6d8-5136-4d3e-ab49-64f889668076">单位，如“泵”</p>
    */
    @SerializedName("unit")
    private String unit;
    /**
    * <p data-diff-id="ct-diff-id-154e4cff-fc31-4901-ae58-cef767074fb6">价格，单位分</p><p data-diff-id="ct-diff-id-06225106-60e3-4b86-b3b9-ed75e1b45881">不为空，price &gt;= 0</p>
    */
    @NotNull(message = "price不能为空")
    @SerializedName("price")
    private Long price;
    /**
    * <p data-diff-id="ct-diff-id-6d636aef-d3b9-4776-92bf-065b61d746d6">会员价，单位分，目前会员价暂不支持，填 0 即可</p><p data-diff-id="ct-diff-id-5d65b30b-9147-429f-b583-37fc31c9abce">memberPrice &gt;= 0</p>
    */
    @SerializedName("memberPrice")
    private Long memberPrice;
    /**
    * <p data-diff-id="ct-diff-id-8b83a876-adeb-4409-9f3b-0b732e5195e4">是否可用会员积分抵扣</p><ul data-diff-id="ct-diff-id-01c70eff-ecc9-4221-a39d-2207c726ded5"><li data-list-item-diff-id="ct-list-item-diff-id-aedaaa1b-73f8-40d3-ade5-9b5312255432"><p data-diff-id="ct-diff-id-46f93303-7be2-4a51-a10d-5d13fdd941fe">true：可以</p></li><li data-list-item-diff-id="ct-list-item-diff-id-5624438c-980d-42d5-8321-23bda9167807"><p data-diff-id="ct-diff-id-a300aeb2-a08f-414e-97a8-0e03a6af0d51">false：不可以</p></li></ul><p data-diff-id="ct-diff-id-fbc5e2eb-aa15-43fe-b502-54375c8b6c7f">默认 false</p>
    */
    @NotNull(message = "useMemberPoint不能为空")
    @SerializedName("useMemberPoint")
    private Boolean useMemberPoint;
    /**
    * <p data-diff-id="ct-diff-id-f788f69f-8da5-485b-b06f-cf79227e972a">配料类型</p><ul data-diff-id="ct-diff-id-a1f05e26-22d3-492f-b812-cf9fd15ae3b8"><li data-list-item-diff-id="ct-list-item-diff-id-da553c4a-0611-49cf-b774-70282a2733a7"><p data-diff-id="ct-diff-id-1429160b-fbbf-4d87-a6f6-d002d1c06cdf">1：标准配料</p></li><li data-list-item-diff-id="ct-list-item-diff-id-9cb15268-8d57-4853-90af-dfec1eb42bff"><p data-diff-id="ct-diff-id-f56c72d0-0333-4970-a916-ebd1a4c67f5c">2：特殊配料，目前只有【换购】是特殊配料</p></li><li data-list-item-diff-id="ct-list-item-diff-id-cf071eef-9c1d-4e23-be50-b912cb9de7f2"><p data-diff-id="ct-diff-id-9ca22426-bd4f-4420-bb8e-337f1c546125">3：附加冷热配料</p></li><li data-list-item-diff-id="ct-list-item-diff-id-971a2b0b-900d-43a6-a7a0-033812bc9c5c"><p data-diff-id="ct-diff-id-e07abb43-2477-430c-ad33-bff640ab8b4c">4：做法</p></li></ul><p data-diff-id="ct-diff-id-add753a4-25a7-48c6-a995-d98042949598">2、3 类型属于星巴克品牌特殊定制，其他品牌默认填 1 即可</p>
    */
    @NotNull(message = "type不能为空")
    @SerializedName("type")
    private Integer type;
    /**
    * <p data-diff-id="ct-diff-id-c7eb83f3-3c62-4b40-bebf-3364e45e10af">星巴克品牌特殊定制，其他品牌不关注</p><p data-diff-id="ct-diff-id-7caa2ec2-4038-4e18-9f02-0956a5737923">附加冷热关联的售卖属性编码，如微热的 relatedSaleAttributeCode = 热的属性编码</p>
    */
    @SerializedName("relatedSaleAttributeCode")
    private String relatedSaleAttributeCode;
    /**
    * <p data-diff-id="ct-diff-id-3e6ab39a-de70-436f-9ca3-e3cb707bf955">数据来源</p><ul data-diff-id="ct-diff-id-e871836a-648c-48d1-a8e8-f2cbc592ee69"><li data-list-item-diff-id="ct-list-item-diff-id-614ca8f1-b231-4466-8663-37ab2edb969e"><p data-diff-id="ct-diff-id-623a8ae4-a739-4c11-8379-ec430278ed4c">1：品牌自建</p></li><li data-list-item-diff-id="ct-list-item-diff-id-e7d51488-9f7a-4267-9f62-9713b2fa3c76"><p data-diff-id="ct-diff-id-cdccd73b-e02a-49ae-8b89-579f16b4389e">2：品牌下发</p></li><li data-list-item-diff-id="ct-list-item-diff-id-09554e49-c6ac-420f-b263-7734dfc1e3fd"><p data-diff-id="ct-diff-id-a12e082c-b4a4-444c-b2bc-5b249c193001">3：门店自建</p></li></ul><p data-diff-id="ct-diff-id-6e31c9ef-c757-47ed-9363-322fb9e25e90">默认为1</p>
    */
    @SerializedName("source")
    private Integer source;
    /**
    * <p data-diff-id="ct-diff-id-f349d95e-239c-4160-b52f-0e06f471b905">厂商门店 id</p><p data-diff-id="ct-diff-id-3eb1c459-c2b7-42e2-ad37-9722182ad7b6">source == 2 或 source ==3时必填</p>
    */
    @SerializedName("vendorShopId")
    private String vendorShopId;
    /**
    * <p data-diff-id="ct-diff-id-973d35b8-33da-4f8f-8c2a-1e37c1237a6d">售卖属性标识</p><p data-diff-id="ct-diff-id-a04a6007-0946-4ffa-85d4-ee0a1010be8e">source == 2 时，必填</p><p data-diff-id="ct-diff-id-187bb2d3-cc32-47d6-bb94-652f546e0667">值为模板配料属性 id</p>
    */
    @SerializedName("tradeMarkCode")
    private String tradeMarkCode;

    public String getPremiumCode() {
        return premiumCode;
    }
    public void setPremiumCode(String premiumCode) {
        this.premiumCode = premiumCode;
    }
    public String getPremiumValue() {
        return premiumValue;
    }
    public void setPremiumValue(String premiumValue) {
        this.premiumValue = premiumValue;
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
    public List<String> getTagList() {
        return tagList;
    }
    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
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
    public Boolean getUseMemberPoint() {
        return useMemberPoint;
    }
    public void setUseMemberPoint(Boolean useMemberPoint) {
        this.useMemberPoint = useMemberPoint;
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
        return "SpuPremiumBasicDTO{" + "premiumCode=" + premiumCode + "," + "premiumValue=" + premiumValue + "," + "rank=" + rank + "," + "description=" + description + "," + "media=" + media + "," + "shelfStatus=" + shelfStatus + "," + "tagList=" + tagList + "," + "unit=" + unit + "," + "price=" + price + "," + "memberPrice=" + memberPrice + "," + "useMemberPoint=" + useMemberPoint + "," + "type=" + type + "," + "relatedSaleAttributeCode=" + relatedSaleAttributeCode + "," + "source=" + source + "," + "vendorShopId=" + vendorShopId + "," + "tradeMarkCode=" + tradeMarkCode + "}";
    }
}
