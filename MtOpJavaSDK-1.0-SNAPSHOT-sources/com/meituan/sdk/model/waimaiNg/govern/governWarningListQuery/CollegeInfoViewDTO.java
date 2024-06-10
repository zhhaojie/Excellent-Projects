package com.meituan.sdk.model.waimaiNg.govern.governWarningListQuery;

import com.google.gson.annotations.SerializedName;

/**
* 规则跳转链接
* This file was automatically generated.
*/
public class CollegeInfoViewDTO {
    /**
    * 规则标题
    */
    @SerializedName("title")
    private String title;
    /**
    * 规则跳转链接
    */
    @SerializedName("url")
    private String url;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }




    @Override
    public String toString() {
        return "CollegeInfoViewDTO{" + "title=" + title + "," + "url=" + url + "}";
    }
}
