package com.meituan.sdk.model.wmoperNg.foodop.wmoperngImageUploadNoWater;

import com.google.gson.annotations.SerializedName;

/**
* 上传无水印图片
* This file was automatically generated.
*/
public class WmoperngImageUploadNoWaterResponse {
    /**
    * 图片code
    */
    @SerializedName("pic_code")
    private String picCode;
    /**
    * 图片url
    */
    @SerializedName("pic_url")
    private String picUrl;

    public String getPicCode() {
        return picCode;
    }
    public void setPicCode(String picCode) {
        this.picCode = picCode;
    }
    public String getPicUrl() {
        return picUrl;
    }
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }




    @Override
    public String toString() {
        return "WmoperngImageUploadNoWaterResponse{" + "picCode=" + picCode + "," + "picUrl=" + picUrl + "}";
    }
}
