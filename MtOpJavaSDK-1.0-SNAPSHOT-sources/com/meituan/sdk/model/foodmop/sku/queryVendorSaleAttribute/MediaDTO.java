package com.meituan.sdk.model.foodmop.sku.queryVendorSaleAttribute;

import com.google.gson.annotations.SerializedName;

/**
* 媒介信息（图片等），目前不支持售卖属性添加图片
* This file was automatically generated.
*/
public class MediaDTO {
    /**
    * 图片资源
    */
    @SerializedName("picture")
    private PictureDTO picture;

    public PictureDTO getPicture() {
        return picture;
    }
    public void setPicture(PictureDTO picture) {
        this.picture = picture;
    }




    @Override
    public String toString() {
        return "MediaDTO{" + "picture=" + picture + "}";
    }
}
