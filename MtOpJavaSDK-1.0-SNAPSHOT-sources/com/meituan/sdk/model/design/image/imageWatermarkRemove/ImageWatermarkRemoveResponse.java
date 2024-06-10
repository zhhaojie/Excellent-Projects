package com.meituan.sdk.model.design.image.imageWatermarkRemove;

import com.google.gson.annotations.SerializedName;

/**
* 通用图像去水印
* This file was automatically generated.
*/
public class ImageWatermarkRemoveResponse {
    /**
    * 去水印后图片Base64编码二进制 
    */
    @SerializedName("content")
    private String content;

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }




    @Override
    public String toString() {
        return "ImageWatermarkRemoveResponse{" + "content=" + content + "}";
    }
}
