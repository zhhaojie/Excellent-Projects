package com.meituan.sdk.model.foodmop.sku.saleattrCreate;

import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-cc00a486-1546-4b7f-adbd-6cb86bc605e8">媒介信息（图片等），目前不支持售卖属性添加图片</p>
* This file was automatically generated.
*/
public class MediaDTO {
    /**
    * <p data-diff-id="ct-diff-id-14d30010-8d4f-4064-8873-cb594a2d792f">图片资源</p>
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
