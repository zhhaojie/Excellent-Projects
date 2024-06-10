package com.meituan.sdk.model.jmcard.cards.createOrUpdate;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">卡模板会员权益</font></span></p>
* This file was automatically generated.
*/
public class MembershipCardBenefitInfo {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">默认会员权益</font></span></p><p><span class="ct-image" style="width: 520.78px"><img alt="image.png" data-origin="" data-small="" data-src="https://img.meituan.net/gwdoc/287b15bb70f7ab7348b7041648e75aaa464283.png" data-width="520.78" data-height="600"></span><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">​</font></span><span class="ct-image" style="width: 364.25px"><img alt="image.png" data-origin="" data-small="" data-src="https://img.meituan.net/gwdoc/79980f03e293505601b132b0b0cdcfaf313173.png" data-width="364.25" data-height="600"></span><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">​</font></span></p>
    */
    @NotNull(message = "defaultBenefit不能为空")
    @SerializedName("defaultBenefit")
    private DefaultBenefitStructure defaultBenefit;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">新增会员权益</font></span></p>
    */
    @NotEmpty(message = "newBenefits不能为空")
    @SerializedName("newBenefits")
    private List<NewBenefitStructure> newBenefits;

    public DefaultBenefitStructure getDefaultBenefit() {
        return defaultBenefit;
    }
    public void setDefaultBenefit(DefaultBenefitStructure defaultBenefit) {
        this.defaultBenefit = defaultBenefit;
    }
    public List<NewBenefitStructure> getNewBenefits() {
        return newBenefits;
    }
    public void setNewBenefits(List<NewBenefitStructure> newBenefits) {
        this.newBenefits = newBenefits;
    }




    @Override
    public String toString() {
        return "MembershipCardBenefitInfo{" + "defaultBenefit=" + defaultBenefit + "," + "newBenefits=" + newBenefits + "}";
    }
}
