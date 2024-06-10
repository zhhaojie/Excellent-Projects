package com.meituan.sdk.model.foodmop.sku.queryVendorSpu;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* 商品后台类目基本信息，用于开店宝后台配置营销活动时，按商品后台分类进行商品圈选。后台类目品牌自定义即可
* This file was automatically generated.
*/
public class BackgroundCategoryBasicDTO {
    /**
    * 后台类目 id
    */
    @NotBlank(message = "vendorBackgroundCategoryId不能为空")
    @SerializedName("vendorBackgroundCategoryId")
    private String vendorBackgroundCategoryId;
    /**
    * 后台类目名称
    */
    @NotBlank(message = "vendorBackgroundCategoryName不能为空")
    @SerializedName("vendorBackgroundCategoryName")
    private String vendorBackgroundCategoryName;
    /**
    * 后台类目英文名称
    */
    @SerializedName("vendorBackgroundCategoryEnglishName")
    private String vendorBackgroundCategoryEnglishName;

    public String getVendorBackgroundCategoryId() {
        return vendorBackgroundCategoryId;
    }
    public void setVendorBackgroundCategoryId(String vendorBackgroundCategoryId) {
        this.vendorBackgroundCategoryId = vendorBackgroundCategoryId;
    }
    public String getVendorBackgroundCategoryName() {
        return vendorBackgroundCategoryName;
    }
    public void setVendorBackgroundCategoryName(String vendorBackgroundCategoryName) {
        this.vendorBackgroundCategoryName = vendorBackgroundCategoryName;
    }
    public String getVendorBackgroundCategoryEnglishName() {
        return vendorBackgroundCategoryEnglishName;
    }
    public void setVendorBackgroundCategoryEnglishName(String vendorBackgroundCategoryEnglishName) {
        this.vendorBackgroundCategoryEnglishName = vendorBackgroundCategoryEnglishName;
    }




    @Override
    public String toString() {
        return "BackgroundCategoryBasicDTO{" + "vendorBackgroundCategoryId=" + vendorBackgroundCategoryId + "," + "vendorBackgroundCategoryName=" + vendorBackgroundCategoryName + "," + "vendorBackgroundCategoryEnglishName=" + vendorBackgroundCategoryEnglishName + "}";
    }
}
