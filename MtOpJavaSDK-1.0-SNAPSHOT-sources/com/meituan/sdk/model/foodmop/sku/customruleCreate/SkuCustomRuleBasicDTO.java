package com.meituan.sdk.model.foodmop.sku.customruleCreate;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-5822482e-2491-4d62-af6e-075f124e6b8d">客制化规则列表</p>
* This file was automatically generated.
*/
public class SkuCustomRuleBasicDTO {
    /**
    * <p data-diff-id="ct-diff-id-b6699c69-fcd0-4d64-aad5-a3bd79f9af50">规则类型：</p><ul data-diff-id="ct-diff-id-ceffeaf4-aa5b-48a3-ab2d-db47dd5968fb"><li data-list-item-diff-id="ct-list-item-diff-id-b99dc99d-db6e-4f08-9385-64a04b11d164"><p data-diff-id="ct-diff-id-e2fd1a36-f96d-4275-acbc-ba30cd2b446a">10：配料组客制化规则</p></li><li data-list-item-diff-id="ct-list-item-diff-id-b185e7af-873a-466f-ba5c-50196417a705"><p data-diff-id="ct-diff-id-e7a2b1f6-ef44-4307-9db0-812b45a5a637">20：配料客制化规则</p></li></ul>
    */
    @NotNull(message = "ruleType不能为空")
    @SerializedName("ruleType")
    private Integer ruleType;
    /**
    * <p data-diff-id="ct-diff-id-1e98de10-d9d6-4c3c-b208-ebcdcfef7488">配料组编码</p><p data-diff-id="ct-diff-id-2caadd0d-dbc7-40c7-a9e0-f710fa0ebb4d"><span style="color: ">ruleType == 10 时必填</span></p>
    */
    @SerializedName("groupCode")
    private String groupCode;
    /**
    * <p data-diff-id="ct-diff-id-ee796175-2954-45a1-8b10-48c225c413e4">配料编码</p><p data-diff-id="ct-diff-id-30b052cc-3400-4759-92ed-a62b6f1eb023"><span style="color: ">ruleType == 20 时必填</span></p>
    */
    @SerializedName("itemCode")
    private String itemCode;
    /**
    * <p data-diff-id="ct-diff-id-a3110ed0-db0f-4b03-95f5-35feefc6933e">是否必选</p><ul data-diff-id="ct-diff-id-a123f311-385a-424f-911b-99c3895bc49c"><li data-list-item-diff-id="ct-list-item-diff-id-f8f49677-cd56-4e90-bd4a-7617d39244bf"><p data-diff-id="ct-diff-id-90edfe67-1957-4cc2-9645-61aceda57a64">true：是</p></li><li data-list-item-diff-id="ct-list-item-diff-id-11292be8-ad41-4c4d-b021-045f14494007"><p data-diff-id="ct-diff-id-81f0be64-6532-40d6-b170-5e86db63b9ed">false：否</p></li></ul>
    */
    @NotNull(message = "mustSelect不能为空")
    @SerializedName("mustSelect")
    private Boolean mustSelect;
    /**
    * <p data-diff-id="ct-diff-id-5cab9bd5-a76b-4da8-9ca9-2e17d7cd3486">是否默认选中</p><ul data-diff-id="ct-diff-id-2239ae50-1410-4ae8-8c7c-e63c643238a7"><li data-list-item-diff-id="ct-list-item-diff-id-7b14652a-ecc3-4c82-ba87-f89a2f33fb58"><p data-diff-id="ct-diff-id-c9293912-c559-4c8d-89ef-22c4c692e731">true：是</p></li><li data-list-item-diff-id="ct-list-item-diff-id-dbde1c61-1d93-4c1d-9fcc-b882fc59497e"><p data-diff-id="ct-diff-id-085423a3-74aa-4480-9ce9-b8bc0aef3de3">false：否</p></li></ul><p data-diff-id="ct-diff-id-710a82b5-3663-4404-95a4-edd280a44f16">默认 false</p><p data-diff-id="ct-diff-id-8b852a1a-a6bc-43e4-81a2-ac745b7d1536">ruleType == 20 时必填</p><p data-diff-id="ct-diff-id-a7101465-5774-4411-9795-950ea3f084eb">若 mustSelect == true，则需保证 defaultSelect == true</p>
    */
    @SerializedName("defaultSelect")
    private Boolean defaultSelect;
    /**
    * <p data-diff-id="ct-diff-id-14ab7342-04a3-401f-a768-11938e9785f7">属性组是否折叠</p><ul data-diff-id="ct-diff-id-6295bf60-2096-41d2-a1a9-9a04eb91e9d6"><li data-list-item-diff-id="ct-list-item-diff-id-617271dd-5e57-45c0-b127-e3a6ba67909c"><p data-diff-id="ct-diff-id-d4f8aacc-343c-4c00-ad2f-a4c1a17f832a">true：折叠</p></li><li data-list-item-diff-id="ct-list-item-diff-id-31c09c51-41f1-45eb-9326-38395cc029d7"><p data-diff-id="ct-diff-id-ae8eb665-7dec-44aa-a1f2-e50c21dd07d5">false：不折叠</p></li></ul><p data-diff-id="ct-diff-id-57676688-0d1d-4713-8da0-1fc8807b159d">默认 false</p><p data-diff-id="ct-diff-id-017a726f-1a56-41f5-a9a4-7f91f97ac37c"><span style="color: ">ruleType == 10 时必填</span></p>
    */
    @SerializedName("fold")
    private Boolean fold;
    /**
    * <p data-diff-id="ct-diff-id-b416ca56-478f-4ea0-9992-5ed353ba4ea2">属性组 or 属性值展示排序</p><p data-diff-id="ct-diff-id-65a745b2-5c2b-4785-923e-aaced8eadd83"><span style="color: ">不为空，rank &gt; 0</span></p>
    */
    @NotNull(message = "rank不能为空")
    @SerializedName("rank")
    private Integer rank;
    /**
    * <p data-diff-id="ct-diff-id-c154f3ba-ddfe-4258-86f4-33aca18be73d">最小选择数，默认 1</p><p data-diff-id="ct-diff-id-8e708b33-0be3-4f6f-8b5e-8d7af9ac5df5">ruleType == 20 时必填</p><p data-diff-id="ct-diff-id-500674bd-03b2-4d49-aedd-22efa434348d">不为空，0 &lt;= <span style="color: rgb(0, 0, 0)">minChoice &lt;= maxChoice</span></p>
    */
    @SerializedName("minChoice")
    private Integer minChoice;
    /**
    * <p data-diff-id="ct-diff-id-3f96e1e5-fa86-4877-9a86-2d42397bdfb8">最大选择数，默认 1</p><p data-diff-id="ct-diff-id-0aef1f86-834a-44d3-a217-afe0422f40c5">ruleType == 20 时必填</p><p data-diff-id="ct-diff-id-c06b7cbe-3eb5-4da2-9115-5023e08324be"><span style="color: rgb(0, 0, 0)">maxChoice &gt;= minChoice</span></p>
    */
    @SerializedName("maxChoice")
    private Integer maxChoice;
    /**
    * <p data-diff-id="ct-diff-id-96b9de7c-7cf7-46ba-8c11-d637dc1108d2">配料 or 配料组是否在页面隐藏</p><ul data-diff-id="ct-diff-id-20b1a0f2-7ccc-452b-a2b8-3be1e1729672"><li data-list-item-diff-id="ct-list-item-diff-id-7e6e8713-4a61-49e5-8700-79ccd11a4a9d"><p data-diff-id="ct-diff-id-8cb647b2-0fec-4c04-bf20-7369cb625979">true：是</p></li><li data-list-item-diff-id="ct-list-item-diff-id-5dd42c49-d97f-4580-803c-91f5ed49ba9d"><p data-diff-id="ct-diff-id-1eec1032-d2a1-429b-b190-f3803c875097">false：否</p></li></ul>
    */
    @NotNull(message = "hide不能为空")
    @SerializedName("hide")
    private Boolean hide;
    /**
    * <p data-diff-id="ct-diff-id-b12a4f3e-5f5a-401f-bdc2-f17356b3b3f2">是否支持换购</p><ul data-diff-id="ct-diff-id-76438d27-89b2-4c10-be16-81be3eb59da1"><li data-list-item-diff-id="ct-list-item-diff-id-ba602a41-6673-4b2b-90f2-e2960f860ce8"><p data-diff-id="ct-diff-id-c440bc66-769d-409d-8f60-8638b3f0c4c6">true：是</p></li><li data-list-item-diff-id="ct-list-item-diff-id-d997d216-9090-40f2-afd1-9e2ba7ba894b"><p data-diff-id="ct-diff-id-dd2b0782-0ccb-4769-8c9d-1cd8dedc6db4">false：否</p></li></ul><p data-diff-id="ct-diff-id-810fc415-b587-46ee-a987-b816b8f01795">星巴克品牌定制，其他品牌设为 false</p>
    */
    @NotNull(message = "exchange不能为空")
    @SerializedName("exchange")
    private Boolean exchange;
    /**
    * <p data-diff-id="ct-diff-id-1158e04c-a279-4795-a912-b9e3dfc241f1">最大免费数，默认 0</p>
    */
    @SerializedName("maxFreeNum")
    private Integer maxFreeNum;
    /**
    * <p data-diff-id="ct-diff-id-06138a6c-700b-480e-ada9-428724a1c863">默认选中数，默认 0</p>
    */
    @SerializedName("defaultSelectNum")
    private Integer defaultSelectNum;
    /**
    * <p data-diff-id="ct-diff-id-8cde9baf-ac6f-4a01-9d03-c36ab49ebe3d">每份数量，按份计价用，一般品牌无特殊要求，默认填 1 即可</p>
    */
    @SerializedName("numOfPortion")
    private Integer numOfPortion;

    public Integer getRuleType() {
        return ruleType;
    }
    public void setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
    }
    public String getGroupCode() {
        return groupCode;
    }
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }
    public String getItemCode() {
        return itemCode;
    }
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    public Boolean getMustSelect() {
        return mustSelect;
    }
    public void setMustSelect(Boolean mustSelect) {
        this.mustSelect = mustSelect;
    }
    public Boolean getDefaultSelect() {
        return defaultSelect;
    }
    public void setDefaultSelect(Boolean defaultSelect) {
        this.defaultSelect = defaultSelect;
    }
    public Boolean getFold() {
        return fold;
    }
    public void setFold(Boolean fold) {
        this.fold = fold;
    }
    public Integer getRank() {
        return rank;
    }
    public void setRank(Integer rank) {
        this.rank = rank;
    }
    public Integer getMinChoice() {
        return minChoice;
    }
    public void setMinChoice(Integer minChoice) {
        this.minChoice = minChoice;
    }
    public Integer getMaxChoice() {
        return maxChoice;
    }
    public void setMaxChoice(Integer maxChoice) {
        this.maxChoice = maxChoice;
    }
    public Boolean getHide() {
        return hide;
    }
    public void setHide(Boolean hide) {
        this.hide = hide;
    }
    public Boolean getExchange() {
        return exchange;
    }
    public void setExchange(Boolean exchange) {
        this.exchange = exchange;
    }
    public Integer getMaxFreeNum() {
        return maxFreeNum;
    }
    public void setMaxFreeNum(Integer maxFreeNum) {
        this.maxFreeNum = maxFreeNum;
    }
    public Integer getDefaultSelectNum() {
        return defaultSelectNum;
    }
    public void setDefaultSelectNum(Integer defaultSelectNum) {
        this.defaultSelectNum = defaultSelectNum;
    }
    public Integer getNumOfPortion() {
        return numOfPortion;
    }
    public void setNumOfPortion(Integer numOfPortion) {
        this.numOfPortion = numOfPortion;
    }




    @Override
    public String toString() {
        return "SkuCustomRuleBasicDTO{" + "ruleType=" + ruleType + "," + "groupCode=" + groupCode + "," + "itemCode=" + itemCode + "," + "mustSelect=" + mustSelect + "," + "defaultSelect=" + defaultSelect + "," + "fold=" + fold + "," + "rank=" + rank + "," + "minChoice=" + minChoice + "," + "maxChoice=" + maxChoice + "," + "hide=" + hide + "," + "exchange=" + exchange + "," + "maxFreeNum=" + maxFreeNum + "," + "defaultSelectNum=" + defaultSelectNum + "," + "numOfPortion=" + numOfPortion + "}";
    }
}
