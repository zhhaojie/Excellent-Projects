package com.meituan.sdk.model.foodmop.sku.create;

import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-1236a5b4-72ef-42ce-9d72-079b0bde060a">媒介信息</p>
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
