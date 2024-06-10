package com.meituan.sdk.model.foodmop.sku.queryVendorPremium;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 配料属性基本信息
* This file was automatically generated.
*/
public class SpuPremiumBasicDTO {
    /**
    * 配料编码
    */
    @NotBlank(message = "premiumCode不能为空")
    @SerializedName("premiumCode")
    private String premiumCode;
    /**
    * 配料名称
    */
    @NotBlank(message = "premiumValue不能为空")
    @SerializedName("premiumValue")
    private String premiumValue;
    /**
    * 排序
    */
    @NotNull(message = "rank不能为空")
    @SerializedName("rank")
    private Integer rank;
    /**
    * 描述
    */
    @SerializedName("description")
    private String description;
    /**
    * 媒介信息，配料暂不支持展示图片
    */
    @SerializedName("media")
    private MediaDTO media;
    /**
    * 全国上下架状态 1：上架 0：下架
    */
    @NotNull(message = "shelfStatus不能为空")
    @SerializedName("shelfStatus")
    private Integer shelfStatus;
    /**
    * 配料标签，该字段未实际投入使用，默认不填
    */
    @SerializedName("tagList")
    private List<String> tagList;
    /**
    * 单位，如“泵”
    */
    @SerializedName("unit")
    private String unit;
    /**
    * 价格，单位分
    */
    @NotNull(message = "price不能为空")
    @SerializedName("price")
    private Long price;
    /**
    * 会员价，单位分
    */
    @SerializedName("memberPrice")
    private Long memberPrice;
    /**
    * 是否可用会员积分抵扣
    */
    @NotNull(message = "useMemberPoint不能为空")
    @SerializedName("useMemberPoint")
    private Boolean useMemberPoint;
    /**
    * 配料类型 1：标准配料 2：特殊配料，目前只有【换购】是特殊配料 3：附加冷热配料 2、3 类型属于星巴克品牌特殊定制
    */
    @NotNull(message = "type不能为空")
    @SerializedName("type")
    private Integer type;
    /**
    * 星巴克品牌特殊定制，其他品牌不关注  附加冷热关联的售卖属性编码，如微热的 relatedSaleAttributeCode = 热的属性编码
    */
    @SerializedName("relatedSaleAttributeCode")
    private String relatedSaleAttributeCode;

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




    @Override
    public String toString() {
        return "SpuPremiumBasicDTO{" + "premiumCode=" + premiumCode + "," + "premiumValue=" + premiumValue + "," + "rank=" + rank + "," + "description=" + description + "," + "media=" + media + "," + "shelfStatus=" + shelfStatus + "," + "tagList=" + tagList + "," + "unit=" + unit + "," + "price=" + price + "," + "memberPrice=" + memberPrice + "," + "useMemberPoint=" + useMemberPoint + "," + "type=" + type + "," + "relatedSaleAttributeCode=" + relatedSaleAttributeCode + "}";
    }
}
