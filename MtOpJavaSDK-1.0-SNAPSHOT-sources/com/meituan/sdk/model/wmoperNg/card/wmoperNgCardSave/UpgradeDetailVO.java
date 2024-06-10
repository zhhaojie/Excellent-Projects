package com.meituan.sdk.model.wmoperNg.card.wmoperNgCardSave;

import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-19053441-337e-4b14-a120-5f36f56c60ba"><span style="color: rgba(0, 0, 0, 0.65)">安心卡升级版的安心保障模块详情。当安心卡类型为普通版（type=0），此字段为[]。当安心卡类型为升级版（type=1），此字段为必填。</span></p>
* This file was automatically generated.
*/
public class UpgradeDetailVO {
    /**
    * <p data-diff-id="ct-diff-id-5cfe9078-7e53-49f0-8361-c75dc20a0672"><span style="color: rgba(0, 0, 0, 0.65)">1全员体温检测正常；2全员佩戴口罩；3全员定时洗手；4店内每日消毒。当type=1时，desc必为 全员体温检测正常；当type=2时，desc必为 全员佩戴口罩；当type=3时，desc必为 全员定时洗手；当type=4时，desc必为 店内每日消毒；其他取值type和desc 不限定；type取值不可重复</span></p>
    */
    @SerializedName("type")
    private Integer type;
    /**
    * <p data-diff-id="ct-diff-id-fa61d57e-483b-4fe2-861c-12bb1b316e5c"><span style="color: rgba(0, 0, 0, 0.65)">主标题</span></p>
    */
    @SerializedName("desc")
    private String desc;
    /**
    * <p data-diff-id="ct-diff-id-44892c63-3d16-4a76-9a6d-bbf30fa5a99b"><span style="color: rgba(0, 0, 0, 0.65)">图片地址，参见</span>7.6.12<span style="color: rgba(0, 0, 0, 0.65)"> 上传安心卡图片</span></p>
    */
    @SerializedName("url")
    private String url;
    /**
    * <p data-diff-id="ct-diff-id-79f44269-24ad-41da-9a48-d35a9818dce7"><span style="color: rgba(0, 0, 0, 0.65)">副标题</span></p>
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
        return "UpgradeDetailVO{" + "type=" + type + "," + "desc=" + desc + "," + "url=" + url + "," + "subTitle=" + subTitle + "}";
    }
}
