package com.meituan.sdk.model.foodmop.sku.queryVendorSpu;

import com.google.gson.annotations.SerializedName;

/**
* 媒介信息
* This file was automatically generated.
*/
public class MediaDTO {
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
