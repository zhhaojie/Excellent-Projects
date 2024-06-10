package com.meituan.sdk.model.jmcard.cards.createOrUpdate;

import com.google.gson.annotations.SerializedName;

/**
* <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">会员注册信息设置</font></span></p><p><span class="ct-image" style="width: 325.89px"><img alt="image.png" data-origin="" data-small="" data-src="https://img.meituan.net/gwdoc/7ff66485970b97afad5949dd29ea5229556177.png" data-width="325.89" data-height="600"></span><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">​</font></span></p>
* This file was automatically generated.
*/
public class RegisterStructure {
    /**
    * <p>类型，<span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">可选：姓名（NAME）、性别(SEX)、电话(PHONE)、生日(BIRTHDAY)、城市(CITY)</font></span></p>
    */
    @SerializedName("type")
    private String type;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }




    @Override
    public String toString() {
        return "RegisterStructure{" + "type=" + type + "}";
    }
}
