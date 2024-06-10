package com.meituan.sdk.model.jmcard.cards.createOrUpdate;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">默认中心栏位配置，中心栏位+列表栏位数量小于等于3</font></span></p><p><span class="ct-image" style="width: 451.18px"><img alt="image.png" data-origin="" data-small="" data-src="https://img.meituan.net/gwdoc/edf3802e03791a51179f36de9d834e3f461135.png" data-width="451.18" data-height="600"></span><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">​</font></span></p>
* This file was automatically generated.
*/
public class DefaultMainEntrance {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">中心栏位类型，</font></span>可选：</p><p style="text-align: start;">"POINT":积分</p><p style="text-align: start;">"BALANCE":余额</p><p style="text-align: start;">"COUPON":优惠券</p>
    */
    @NotBlank(message = "type不能为空")
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
        return "DefaultMainEntrance{" + "type=" + type + "}";
    }
}
