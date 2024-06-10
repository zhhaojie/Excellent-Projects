package com.meituan.sdk.model.design.image.imageEnhance;

import com.google.gson.annotations.SerializedName;

/**
* 图片智能美化
* This file was automatically generated.
*/
public class ImageEnhanceResponse {
    /**
    * 图片二进制 Base64编码
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
        return "ImageEnhanceResponse{" + "content=" + content + "}";
    }
}
