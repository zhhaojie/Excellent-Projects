package com.meituan.sdk.model.foodmop.sku.queryVendorSpu;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 商品基本信息
* This file was automatically generated.
*/
public class SpuBasicDTO {
    /**
    * SPU 编码
    */
    @NotBlank(message = "vendorSpuId不能为空")
    @SerializedName("vendorSpuId")
    private String vendorSpuId;
    /**
    * 商品名称
    */
    @NotBlank(message = "name不能为空")
    @SerializedName("name")
    private String name;
    /**
    * 商品售卖时间，若不设值，商品全时段均可售卖
    */
    @SerializedName("saleTime")
    private List<TimeDTO> saleTime;
    /**
    * 类目描述
    */
    @SerializedName("description")
    private String description;
    /**
    * 商品主要原料
    */
    @SerializedName("material")
    private String material;
    /**
    * 商品简述
    */
    @SerializedName("brief")
    private String brief;
    /**
    * 全国上下架状态  0 ：下架  1：上架  默认填 1
    */
    @NotNull(message = "shelfStatus不能为空")
    @SerializedName("shelfStatus")
    private Integer shelfStatus;
    /**
    * 是否可用会员积分抵扣  true：可以  false：不可  默认 false
    */
    @NotNull(message = "useMemberPoint不能为空")
    @SerializedName("useMemberPoint")
    private Boolean useMemberPoint;
    /**
    * 商品标签，目前只支持新品标签，固定值为 "NEW"
    */
    @SerializedName("tagList")
    private List<String> tagList;
    /**
    * 媒介信息
    */
    @SerializedName("media")
    private MediaDTO media;
    /**
    * 库存状态  1：有限库存  2：无限库存  一般推荐，饮品属于无限库存，食品有限库存。设置为无限库存的商品，才可以进行商品库存同步，无限库存的商品不用操作库存同步
    */
    @NotNull(message = "stockStatus不能为空")
    @SerializedName("stockStatus")
    private Integer stockStatus;
    /**
    * 扩展属性
    */
    @SerializedName("extendInfoMap")
    private ExtendInfo extendInfoMap;

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
    public ExtendInfo getExtendInfoMap() {
        return extendInfoMap;
    }
    public void setExtendInfoMap(ExtendInfo extendInfoMap) {
        this.extendInfoMap = extendInfoMap;
    }




    @Override
    public String toString() {
        return "SpuBasicDTO{" + "vendorSpuId=" + vendorSpuId + "," + "name=" + name + "," + "saleTime=" + saleTime + "," + "description=" + description + "," + "material=" + material + "," + "brief=" + brief + "," + "shelfStatus=" + shelfStatus + "," + "useMemberPoint=" + useMemberPoint + "," + "tagList=" + tagList + "," + "media=" + media + "," + "stockStatus=" + stockStatus + "," + "extendInfoMap=" + extendInfoMap + "}";
    }
}
