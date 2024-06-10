package com.meituan.sdk.model.jmcard.cards.createOrUpdate;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">默认会员权益</font></span></p><p><span class="ct-image" style="width: 520.78px"><img alt="image.png" data-origin="" data-small="" data-src="https://img.meituan.net/gwdoc/287b15bb70f7ab7348b7041648e75aaa464283.png" data-width="520.78" data-height="600"></span><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">​</font></span><span class="ct-image" style="width: 364.25px"><img alt="image.png" data-origin="" data-small="" data-src="https://img.meituan.net/gwdoc/79980f03e293505601b132b0b0cdcfaf313173.png" data-width="364.25" data-height="600"></span><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">​</font></span></p>
* This file was automatically generated.
*/
public class DefaultBenefitStructure {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">联系方式</font></span></p>
    */
    @NotNull(message = "contact不能为空")
    @SerializedName("contact")
    private MerchantContact contact;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">会员卡详细介绍，限制512个字符</font></span></p>
    */
    @NotBlank(message = "detailInfo不能为空")
    @SerializedName("detailInfo")
    private String detailInfo;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">会员卡使用须知，限制512个字符</font></span></p>
    */
    @SerializedName("instruction")
    private String instruction;

    public MerchantContact getContact() {
        return contact;
    }
    public void setContact(MerchantContact contact) {
        this.contact = contact;
    }
    public String getDetailInfo() {
        return detailInfo;
    }
    public void setDetailInfo(String detailInfo) {
        this.detailInfo = detailInfo;
    }
    public String getInstruction() {
        return instruction;
    }
    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }




    @Override
    public String toString() {
        return "DefaultBenefitStructure{" + "contact=" + contact + "," + "detailInfo=" + detailInfo + "," + "instruction=" + instruction + "}";
    }
}
