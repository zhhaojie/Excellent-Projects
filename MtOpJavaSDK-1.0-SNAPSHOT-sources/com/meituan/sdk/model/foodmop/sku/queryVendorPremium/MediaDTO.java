package com.meituan.sdk.model.foodmop.sku.queryVendorPremium;

import com.google.gson.annotations.SerializedName;

/**
* 媒介信息，配料暂不支持展示图片
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
