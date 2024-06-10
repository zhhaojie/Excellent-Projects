package com.meituan.sdk.model.wmoperNg.card.wmoperCardQuery;

import com.google.gson.annotations.SerializedName;

/**
* 安心卡升级版的安心保障模块详情。当syncOpenReceipt=1，即把安心卡信息同步打印小票时， 无须将此信息随小票打印
* This file was automatically generated.
*/
public class UpgradeDetailList {
    /**
    * 1全员体温检测正常；2全员佩戴口罩；3全员定时洗手；4店内每日消毒
    */
    @SerializedName("type")
    private Integer type;
    /**
    * 主标题
    */
    @SerializedName("desc")
    private String desc;
    /**
    * 图片地址
    */
    @SerializedName("url")
    private String url;
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
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getSubTitle() {
        return subTitle;
    }
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }




    @Override
    public String toString() {
        return "UpgradeDetailList{" + "type=" + type + "," + "desc=" + desc + "," + "url=" + url + "," + "subTitle=" + subTitle + "}";
    }
}
