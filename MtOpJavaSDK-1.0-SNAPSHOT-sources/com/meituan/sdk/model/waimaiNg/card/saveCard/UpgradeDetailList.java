package com.meituan.sdk.model.waimaiNg.card.saveCard;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 安心卡升级版的安心保障模块详情。当安心卡类型为普通版（type=0），此字段为[]。当安心卡类型为升级版（type=1），此字段为必填。
* This file was automatically generated.
*/
public class UpgradeDetailList {
    /**
    * 1全员体温检测正常；2全员佩戴口罩；3全员定时洗手；4店内每日消毒。当type=1时，desc必为 全员体温检测正常；当type=2时，desc必为 全员佩戴口罩；当type=3时，desc必为 全员定时洗手；当type=4时，desc必为 店内每日消毒；其他取值type和desc 不限定；type取值不可重复
    */
    @NotNull(message = "type不能为空")
    @SerializedName("type")
    private Integer type;
    /**
    * 主标题
    */
    @NotBlank(message = "desc不能为空")
    @SerializedName("desc")
    private String desc;
    /**
    * 图片地址，参见7.9.4 上传安心卡图片
    */
    @NotBlank(message = "url不能为空")
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
