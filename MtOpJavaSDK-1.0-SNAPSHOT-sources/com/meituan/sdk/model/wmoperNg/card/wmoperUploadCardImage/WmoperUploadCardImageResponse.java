package com.meituan.sdk.model.wmoperNg.card.wmoperUploadCardImage;

import com.google.gson.annotations.SerializedName;

/**
* 上传安心卡图片
* This file was automatically generated.
*/
public class WmoperUploadCardImageResponse {
    /**
    * 图片URL
    */
    @SerializedName("pic_url")
    private String picUrl;

    public String getPicUrl() {
        return picUrl;
    }
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }




    @Override
    public String toString() {
        return "WmoperUploadCardImageResponse{" + "picUrl=" + picUrl + "}";
    }
}
