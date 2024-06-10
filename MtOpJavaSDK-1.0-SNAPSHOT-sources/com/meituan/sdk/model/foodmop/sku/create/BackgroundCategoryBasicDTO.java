package com.meituan.sdk.model.foodmop.sku.create;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-3719df7a-e6c8-48cc-bedb-4db90be4541d">商品后台类目基本信息，用于开店宝后台配置营销活动时，按商品后台分类进行商品圈选。后台类目品牌自定义即可</p>
* This file was automatically generated.
*/
public class BackgroundCategoryBasicDTO {
    /**
    * <p data-diff-id="ct-diff-id-bc310cfb-7122-4d75-9e50-7f6f6475d5ea">后台类目 id</p>
    */
    @NotBlank(message = "vendorBackgroundCategoryId不能为空")
    @SerializedName("vendorBackgroundCategoryId")
    private String vendorBackgroundCategoryId;
    /**
    * <p data-diff-id="ct-diff-id-8126b4b4-f8a7-4c10-af2c-38b2b60de16c">后台类目名称</p>
    */
    @NotBlank(message = "vendorBackgroundCategoryName不能为空")
    @SerializedName("vendorBackgroundCategoryName")
    private String vendorBackgroundCategoryName;
    /**
    * <p data-diff-id="ct-diff-id-ce0f760c-f05d-42a7-809d-05bbe3c2c633">后台类目英文名称</p>
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
