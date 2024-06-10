package com.meituan.sdk.model.design.image.imageBokeh;

import com.google.gson.annotations.SerializedName;

/**
* 图片虚景滤镜特效 对菜品等物体图片，添加虚景滤镜，对菜品等主要物体以外的背景进行虚化处理，突出菜品等主要物体本身。
* This file was automatically generated.
*/
public class ImageBokehResponse {
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
        return "ImageBokehResponse{" + "content=" + content + "}";
    }
}
