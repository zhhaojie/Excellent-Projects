package com.meituan.sdk.model.jmcard.cards.createOrUpdate;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">卡模板基础信息</font></span></p><p><span class="ct-image" style="width: 443.17px"><img alt="image.png" data-origin="" data-small="" data-src="https://img.meituan.net/gwdoc/0bc243ad529c58144f9312c231f49565693209.png" data-width="443.17" data-height="600"></span><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">​</font></span></p>
* This file was automatically generated.
*/
public class CardTemplateBaseInfo {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">会员卡模板展示名称，尽量短，超长截断展示，最长限制32个字符</font></span></p>
    */
    @NotBlank(message = "cardName不能为空")
    @SerializedName("cardName")
    private String cardName;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">logo展示url，</font>图片格式支持jpeg和png，尺寸大小： 100x100px</span></p><p style="text-align: start;"><span style="color: ">限制256个字符</span></p>
    */
    @NotBlank(message = "logo不能为空")
    @SerializedName("logo")
    private String logo;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">小图,</font>用户领卡后，在卡包展示会员卡信息，尺寸大小： 1440x276px</span></p><p style="text-align: start;"><span style="color: ">图片格式支持jpeg和png</span></p><p style="text-align: start;"><span style="color: ">限制128个字符</span></p><p style="text-align: start;"></p><p style="text-align: start;"><span style="color: ">​</span></p>
    */
    @NotBlank(message = "smallPic不能为空")
    @SerializedName("smallPic")
    private String smallPic;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">中图。</font>领卡引导页使用（门店详情页等），尺寸大小： 1440x462px</span></p><p style="text-align: start;"><span style="color: ">图片格式支持jpeg和png</span></p><p style="text-align: start;"><span style="color: ">限制128个字符</span></p>
    */
    @NotBlank(message = "middlePic不能为空")
    @SerializedName("middlePic")
    private String middlePic;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">大图，</font>领卡页使用，尺寸大小： 1440x810px</span></p><p style="text-align: start;"><span style="color: ">图片格式支持jpeg和png</span></p><p style="text-align: start;"><span style="color: ">限制128个字符</span></p><p style="text-align: start;"><span class="ct-image" style="width: 469.62px"><img alt="image.png" data-origin="" data-small="" data-src="https://img.meituan.net/gwdoc/d32913216d04a152c8eef8cf68cca167422620.png" data-width="469.62" data-height="600"></span><span style="color: ">​</span></p>
    */
    @NotBlank(message = "bigPic不能为空")
    @SerializedName("bigPic")
    private String bigPic;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">背景色。</font></span>控制领卡按钮颜色等</p><p style="text-align: start;">仅支持格式如：#ff6633</p><p style="text-align: start;"><span class="ct-image" style="width: 328.08px"><img alt="image.png" data-origin="" data-small="" data-src="https://img.meituan.net/gwdoc/27afff41cad9c46bdd7119fa41f2d73f548740.png" data-width="328.08" data-height="600"></span>​</p>
    */
    @NotBlank(message = "bgColor不能为空")
    @SerializedName("bgColor")
    private String bgColor;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">营销文案。限制32个字符以内</font></span></p>
    */
    @SerializedName("promotionText")
    private String promotionText;

    public String getCardName() {
        return cardName;
    }
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }
    public String getSmallPic() {
        return smallPic;
    }
    public void setSmallPic(String smallPic) {
        this.smallPic = smallPic;
    }
    public String getMiddlePic() {
        return middlePic;
    }
    public void setMiddlePic(String middlePic) {
        this.middlePic = middlePic;
    }
    public String getBigPic() {
        return bigPic;
    }
    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }
    public String getBgColor() {
        return bgColor;
    }
    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }
    public String getPromotionText() {
        return promotionText;
    }
    public void setPromotionText(String promotionText) {
        this.promotionText = promotionText;
    }




    @Override
    public String toString() {
        return "CardTemplateBaseInfo{" + "cardName=" + cardName + "," + "logo=" + logo + "," + "smallPic=" + smallPic + "," + "middlePic=" + middlePic + "," + "bigPic=" + bigPic + "," + "bgColor=" + bgColor + "," + "promotionText=" + promotionText + "}";
    }
}
