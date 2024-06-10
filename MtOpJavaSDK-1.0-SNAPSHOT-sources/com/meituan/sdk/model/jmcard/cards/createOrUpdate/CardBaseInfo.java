package com.meituan.sdk.model.jmcard.cards.createOrUpdate;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotEmpty;

/**
* <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">会员卡基础信息</font></span></p>
* This file was automatically generated.
*/
public class CardBaseInfo {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">会员卡领卡按钮文案，4个字以内。</font></span></p><p><span class="ct-image" style="width: 365.9px"><img alt="image.png" data-origin="" data-small="" data-src="https://img.meituan.net/gwdoc/db797983bfe9ff894775fab691609fde829644.png" data-width="365.9" data-height="600"></span>​</p>
    */
    @SerializedName("button")
    private String button;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">会员注册信息设置</font></span></p><p><span class="ct-image" style="width: 325.89px"><img alt="image.png" data-origin="" data-small="" data-src="https://img.meituan.net/gwdoc/7ff66485970b97afad5949dd29ea5229556177.png" data-width="325.89" data-height="600"></span><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">​</font></span></p>
    */
    @NotEmpty(message = "registerInfos不能为空")
    @SerializedName("registerInfos")
    private List<RegisterStructure> registerInfos;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">卡有效期，可选：半年（HAFE_YEAR），一年（ONE_YEAR），两年（TWO_YEAR），长期有效（LONGTIME）</font></span></p>
    */
    @NotBlank(message = "validityPeriodType不能为空")
    @SerializedName("validityPeriodType")
    private String validityPeriodType;

    public String getButton() {
        return button;
    }
    public void setButton(String button) {
        this.button = button;
    }
    public List<RegisterStructure> getRegisterInfos() {
        return registerInfos;
    }
    public void setRegisterInfos(List<RegisterStructure> registerInfos) {
        this.registerInfos = registerInfos;
    }
    public String getValidityPeriodType() {
        return validityPeriodType;
    }
    public void setValidityPeriodType(String validityPeriodType) {
        this.validityPeriodType = validityPeriodType;
    }




    @Override
    public String toString() {
        return "CardBaseInfo{" + "button=" + button + "," + "registerInfos=" + registerInfos + "," + "validityPeriodType=" + validityPeriodType + "}";
    }
}
