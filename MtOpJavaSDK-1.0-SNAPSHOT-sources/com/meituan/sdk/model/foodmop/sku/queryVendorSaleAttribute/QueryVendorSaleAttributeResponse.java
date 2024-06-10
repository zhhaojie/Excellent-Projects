package com.meituan.sdk.model.foodmop.sku.queryVendorSaleAttribute;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 查询售卖属性信息
* This file was automatically generated.
*/
public class QueryVendorSaleAttributeResponse {
    /**
    * 售卖属性编码
    */
    @NotBlank(message = "saleAttributeCode不能为空")
    @SerializedName("saleAttributeCode")
    private String saleAttributeCode;
    /**
    * 售卖属性名称
    */
    @NotBlank(message = "saleAttributeValue不能为空")
    @SerializedName("saleAttributeValue")
    private String saleAttributeValue;
    /**
    * 售卖属性排序，默认填 1 即可
    */
    @NotNull(message = "rank不能为空")
    @SerializedName("rank")
    private Integer rank;
    /**
    * 售卖属性描述
    */
    @SerializedName("description")
    private String description;
    /**
    * 媒介信息（图片等），目前不支持售卖属性添加图片
    */
    @SerializedName("media")
    private MediaDTO media;
    /**
    * 全国上下架状态 1：上架，0：下架。默认填 1 即可，表示配料全国上
    */
    @NotNull(message = "shelfStatus不能为空")
    @SerializedName("shelfStatus")
    private Integer shelfStatus;
    /**
    * 份量大小，一般用于描述杯型的毫升数描述
    */
    @SerializedName("weight")
    private String weight;
    /**
    * 份量单位 ，一般用于描述杯型的毫升数的单位
    */
    @SerializedName("weightUnit")
    private String weightUnit;
    /**
    * 标识附加售卖属性还是标准售卖属性
    */
    @NotNull(message = "type不能为空")
    @SerializedName("type")
    private Integer type;
    /**
    * 星巴克品牌特殊定制，其他品牌不关注
    */
    @SerializedName("relatedSaleAttributeCode")
    private String relatedSaleAttributeCode;
    /**
    * 是否可用会员积分抵扣
    */
    @NotNull(message = "useMemberPoint不能为空")
    @SerializedName("useMemberPoint")
    private Boolean useMemberPoint;

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




    @Override
    public String toString() {
        return "QueryVendorSaleAttributeResponse{" + "saleAttributeCode=" + saleAttributeCode + "," + "saleAttributeValue=" + saleAttributeValue + "," + "rank=" + rank + "," + "description=" + description + "," + "media=" + media + "," + "shelfStatus=" + shelfStatus + "," + "weight=" + weight + "," + "weightUnit=" + weightUnit + "," + "type=" + type + "," + "relatedSaleAttributeCode=" + relatedSaleAttributeCode + "," + "useMemberPoint=" + useMemberPoint + "}";
    }
}
