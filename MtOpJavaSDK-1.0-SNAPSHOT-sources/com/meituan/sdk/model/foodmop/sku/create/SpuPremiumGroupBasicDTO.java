package com.meituan.sdk.model.foodmop.sku.create;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-8219d02d-1a6e-4809-bb7d-b7a1c83fa36b">配料组基本信息</p>
* This file was automatically generated.
*/
public class SpuPremiumGroupBasicDTO {
    /**
    * <p data-diff-id="ct-diff-id-821fd985-338c-4943-aea0-863ea56f9ee5">配料属性组编码</p>
    */
    @NotBlank(message = "groupCode不能为空")
    @SerializedName("groupCode")
    private String groupCode;
    /**
    * <p data-diff-id="ct-diff-id-f9a79172-ef9e-494b-a5d0-a98783ee5f8f">配料属性组名称</p>
    */
    @NotBlank(message = "groupName不能为空")
    @SerializedName("groupName")
    private String groupName;
    /**
    * <p data-diff-id="ct-diff-id-148bdc4c-83f9-4a79-b77c-9ac1350e7762">配料属性组排序</p>
    */
    @NotNull(message = "rank不能为空")
    @SerializedName("rank")
    private Integer rank;
    /**
    * <p data-diff-id="ct-diff-id-6fb71658-1b38-42a0-b5f8-b5908ac8ed7d">配料组是否支持选多个配料</p><ul data-diff-id="ct-diff-id-1362fddc-95e3-4e7f-9c90-46f43410101a"><li data-list-item-diff-id="ct-list-item-diff-id-11336458-f9ed-432e-a4d1-3503bfc8f984"><p data-diff-id="ct-diff-id-adb71540-d4dc-429d-835b-765da4d6ded7">true：支持</p></li><li data-list-item-diff-id="ct-list-item-diff-id-ac65cc77-0234-4fd3-9c3a-64f4aeb3be02"><p data-diff-id="ct-diff-id-303ef81b-3ec9-420b-ae20-23f8a4051ea3">false：不支持</p></li></ul>
    */
    @SerializedName("chooseMultiPremium")
    private Boolean chooseMultiPremium;
    /**
    * <p data-diff-id="ct-diff-id-34b12ec4-6c3d-4deb-b6b5-edfcd5b1e332">配料组下配料是否支持选多份</p><ul data-diff-id="ct-diff-id-dc5647e1-2665-4dce-95dc-4f8252657590"><li data-list-item-diff-id="ct-list-item-diff-id-f8b73340-dcb0-487d-9732-90c32a100108"><p data-diff-id="ct-diff-id-8942c2fc-8aed-4e1c-933d-2d1c0e5b5f62">true：支持</p></li><li data-list-item-diff-id="ct-list-item-diff-id-d0af2aa6-c99c-4f0f-8b77-16d4223e9566"><p data-diff-id="ct-diff-id-6a327ac0-f1d9-4171-af65-b80ceb6581b0">false：不支持</p></li></ul><p data-diff-id="ct-diff-id-a67d712d-1674-4bde-a7d2-14495af1a182"><span class="ct-image"><img alt="" data-origin="http://p0.meituan.net/giraffe/b2059e0ec27699cf5d508ec898267603145907.png" data-small="http://p0.meituan.net/giraffe/b2059e0ec27699cf5d508ec898267603145907.png" data-src="http://p0.meituan.net/giraffe/b2059e0ec27699cf5d508ec898267603145907.png"></span><br></p><p data-diff-id="ct-diff-id-7b6bd1fb-caea-4677-8e22-055f5ae170d5">例如 chooseMultiPremium=true &amp; multiChoosePremium=true 时，配料组可以选多个配料，且每个配料可以选多份（每个配料最多能选几个，在<span style="color: rgba(0, 0, 0, 0.65)">创建或更改商品客制化规则</span>中有明确描述）</p>
    */
    @SerializedName("multiChoosePremium")
    private Boolean multiChoosePremium;

    public String getGroupCode() {
        return groupCode;
    }
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public Integer getRank() {
        return rank;
    }
    public void setRank(Integer rank) {
        this.rank = rank;
    }
    public Boolean getChooseMultiPremium() {
        return chooseMultiPremium;
    }
    public void setChooseMultiPremium(Boolean chooseMultiPremium) {
        this.chooseMultiPremium = chooseMultiPremium;
    }
    public Boolean getMultiChoosePremium() {
        return multiChoosePremium;
    }
    public void setMultiChoosePremium(Boolean multiChoosePremium) {
        this.multiChoosePremium = multiChoosePremium;
    }




    @Override
    public String toString() {
        return "SpuPremiumGroupBasicDTO{" + "groupCode=" + groupCode + "," + "groupName=" + groupName + "," + "rank=" + rank + "," + "chooseMultiPremium=" + chooseMultiPremium + "," + "multiChoosePremium=" + multiChoosePremium + "}";
    }
}
