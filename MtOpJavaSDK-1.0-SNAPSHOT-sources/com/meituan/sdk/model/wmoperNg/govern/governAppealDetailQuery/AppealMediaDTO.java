package com.meituan.sdk.model.wmoperNg.govern.governAppealDetailQuery;

import com.google.gson.annotations.SerializedName;

/**
* 申诉媒体材料
* This file was automatically generated.
*/
public class AppealMediaDTO {
    /**
    * 1：图片 ，2：视频
    */
    @SerializedName("type")
    private Integer type;
    /**
    * 图片url
    */
    @SerializedName("picUrl")
    private String picUrl;
    /**
    * 视频url
    */
    @SerializedName("videoUrl")
    private String videoUrl;

    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public String getPicUrl() {
        return picUrl;
    }
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
    public String getVideoUrl() {
        return videoUrl;
    }
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }




    @Override
    public String toString() {
        return "AppealMediaDTO{" + "type=" + type + "," + "picUrl=" + picUrl + "," + "videoUrl=" + videoUrl + "}";
    }
}
