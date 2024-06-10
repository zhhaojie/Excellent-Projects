package com.meituan.sdk.model.jmcard.cards.createOrUpdate;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">联系方式</font></span></p>
* This file was automatically generated.
*/
public class MerchantContact {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">类型，手机（MOBILE），座机（TEL）</font></span></p>
    */
    @NotBlank(message = "type不能为空")
    @SerializedName("type")
    private String type;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">联系方式值，</font></span>手机号或者座机号</p><p style="text-align: start;">请填写真实的电话号码</p>
    */
    @NotBlank(message = "value不能为空")
    @SerializedName("value")
    private String value;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }




    @Override
    public String toString() {
        return "MerchantContact{" + "type=" + type + "," + "value=" + value + "}";
    }
}
