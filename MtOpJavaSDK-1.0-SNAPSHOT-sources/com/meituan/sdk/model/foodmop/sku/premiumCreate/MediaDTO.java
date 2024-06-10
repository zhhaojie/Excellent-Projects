package com.meituan.sdk.model.foodmop.sku.premiumCreate;

import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-15e4586b-cb16-47ad-9f6e-47f79ce93470">媒介信息，配料暂不支持展示图片</p>
* This file was automatically generated.
*/
public class MediaDTO {
    /**
    * <p data-diff-id="ct-diff-id-912b52ec-64ba-47d5-97f5-d96050c25fc9">图片资源</p>
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
