package com.meituan.sdk.model.wmoperNg.card.wmoperNgCardQuery;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class UpdateDetailVOList {
    /**
    * 1全员体温检测正常；2全员佩戴口罩；3全员定时洗手；4店内每日消毒
    */
    @SerializedName("type")
    private Integer type;
    /**
    * 图片地址
    */
    @SerializedName("url")
    private String url;
    /**
    * 主标题
    */
    @SerializedName("desc")
    private String desc;
    /**
    * 副标题
    */
    @SerializedName("subTitle")
    private String subTitle;

    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getSubTitle() {
        return subTitle;
    }
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }




    @Override
    public String toString() {
        return "UpdateDetailVOList{" + "type=" + type + "," + "url=" + url + "," + "desc=" + desc + "," + "subTitle=" + subTitle + "}";
    }
}
