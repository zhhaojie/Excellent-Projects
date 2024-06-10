package com.meituan.sdk.model.waimaiNg.kaidian.waimaiKaidianBizsettle;

import com.google.gson.annotations.SerializedName;

/**
* 获取美团外卖开店绿色通道链接地址
* This file was automatically generated.
*/
public class WaimaiKaidianBizsettleResponse {
    /**
    * 美团外卖开店绿色通道链接地址
    */
    @SerializedName("url")
    private String url;

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }




    @Override
    public String toString() {
        return "WaimaiKaidianBizsettleResponse{" + "url=" + url + "}";
    }
}
