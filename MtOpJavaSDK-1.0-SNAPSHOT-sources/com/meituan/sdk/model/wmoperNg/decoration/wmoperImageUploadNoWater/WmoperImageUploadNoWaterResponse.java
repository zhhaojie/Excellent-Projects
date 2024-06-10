package com.meituan.sdk.model.wmoperNg.decoration.wmoperImageUploadNoWater;

import com.google.gson.annotations.SerializedName;

/**
* 上传门店装修图片
* This file was automatically generated.
*/
public class WmoperImageUploadNoWaterResponse {
    /**
    * 图片地址
    */
    @SerializedName("pic_url")
    private String picUrl;
    /**
    * 图片code
    */
    @SerializedName("pic_code")
    private String picCode;

    public String getPicUrl() {
        return picUrl;
    }
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
    public String getPicCode() {
        return picCode;
    }
    public void setPicCode(String picCode) {
        this.picCode = picCode;
    }




    @Override
    public String toString() {
        return "WmoperImageUploadNoWaterResponse{" + "picUrl=" + picUrl + "," + "picCode=" + picCode + "}";
    }
}
