package com.meituan.sdk.model.design.image.imageFilter;

import com.google.gson.annotations.SerializedName;

/**
* 图片添加滤镜效果，对图片整体进行定制化色彩调整。
* This file was automatically generated.
*/
public class ImageFilterResponse {
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
        return "ImageFilterResponse{" + "content=" + content + "}";
    }
}
