package com.meituan.sdk.model.foodmop.sku.queryVendorSpu;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 商品 SKU 基本信息
* This file was automatically generated.
*/
public class SkuBasicDTO {
    /**
    * 商品 SKU 编码
    */
    @NotBlank(message = "vendorSkuId不能为空")
    @SerializedName("vendorSkuId")
    private String vendorSkuId;
    /**
    * SKU 价格，单位分
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
    * 全国上下架状态  0 ：下架  1：上架  默认填 1 即可
    */
    @NotNull(message = "shelfStatus不能为空")
    @SerializedName("shelfStatus")
    private Integer shelfStatus;
    /**
    * 扩展属性
    */
    @SerializedName("extendInfoMap")
    private ExtendInfo extendInfoMap;

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
    public ExtendInfo getExtendInfoMap() {
        return extendInfoMap;
    }
    public void setExtendInfoMap(ExtendInfo extendInfoMap) {
        this.extendInfoMap = extendInfoMap;
    }




    @Override
    public String toString() {
        return "SkuBasicDTO{" + "vendorSkuId=" + vendorSkuId + "," + "price=" + price + "," + "memberPrice=" + memberPrice + "," + "shelfStatus=" + shelfStatus + "," + "extendInfoMap=" + extendInfoMap + "}";
    }
}
