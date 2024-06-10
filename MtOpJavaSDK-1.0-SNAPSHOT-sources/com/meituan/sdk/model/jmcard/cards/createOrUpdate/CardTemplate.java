package com.meituan.sdk.model.jmcard.cards.createOrUpdate;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">卡模板信息，可传多个</font></span></p>
* This file was automatically generated.
*/
public class CardTemplate {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">卡模板key，标记一套卡模板，必须确保多个卡模板key之间的唯一性，否则报错</font></span></p>
    */
    @NotBlank(message = "templateKey不能为空")
    @SerializedName("templateKey")
    private String templateKey;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">卡模板基础信息</font></span></p><p><span class="ct-image" style="width: 443.17px"><img alt="image.png" data-origin="" data-small="" data-src="https://img.meituan.net/gwdoc/0bc243ad529c58144f9312c231f49565693209.png" data-width="443.17" data-height="600"></span><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">​</font></span></p>
    */
    @NotNull(message = "cardTemplateBaseInfo不能为空")
    @SerializedName("cardTemplateBaseInfo")
    private CardTemplateBaseInfo cardTemplateBaseInfo;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">卡模板会员权益</font></span></p>
    */
    @NotNull(message = "membershipCardBenefitInfo不能为空")
    @SerializedName("membershipCardBenefitInfo")
    private MembershipCardBenefitInfo membershipCardBenefitInfo;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">卡模板栏位信息</font></span></p>
    */
    @NotNull(message = "membershipCardDetailInfo不能为空")
    @SerializedName("membershipCardDetailInfo")
    private MembershipCardDetailInfo membershipCardDetailInfo;

    public String getTemplateKey() {
        return templateKey;
    }
    public void setTemplateKey(String templateKey) {
        this.templateKey = templateKey;
    }
    public CardTemplateBaseInfo getCardTemplateBaseInfo() {
        return cardTemplateBaseInfo;
    }
    public void setCardTemplateBaseInfo(CardTemplateBaseInfo cardTemplateBaseInfo) {
        this.cardTemplateBaseInfo = cardTemplateBaseInfo;
    }
    public MembershipCardBenefitInfo getMembershipCardBenefitInfo() {
        return membershipCardBenefitInfo;
    }
    public void setMembershipCardBenefitInfo(MembershipCardBenefitInfo membershipCardBenefitInfo) {
        this.membershipCardBenefitInfo = membershipCardBenefitInfo;
    }
    public MembershipCardDetailInfo getMembershipCardDetailInfo() {
        return membershipCardDetailInfo;
    }
    public void setMembershipCardDetailInfo(MembershipCardDetailInfo membershipCardDetailInfo) {
        this.membershipCardDetailInfo = membershipCardDetailInfo;
    }




    @Override
    public String toString() {
        return "CardTemplate{" + "templateKey=" + templateKey + "," + "cardTemplateBaseInfo=" + cardTemplateBaseInfo + "," + "membershipCardBenefitInfo=" + membershipCardBenefitInfo + "," + "membershipCardDetailInfo=" + membershipCardDetailInfo + "}";
    }
}
