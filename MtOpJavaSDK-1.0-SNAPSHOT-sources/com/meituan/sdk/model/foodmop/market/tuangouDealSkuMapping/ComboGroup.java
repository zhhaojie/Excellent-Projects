package com.meituan.sdk.model.foodmop.market.tuangouDealSkuMapping;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* <p data-diff-id="ct-diff-id-3739b82b-e868-4b01-8cdb-2ba0ab77d86d">套餐分组列表，单次请求最大数数量限制10</p>
* This file was automatically generated.
*/
public class ComboGroup {
    /**
    * <p data-diff-id="ct-diff-id-434d8899-7872-4b38-b824-cdda8e04a4c9">套餐排序</p>
    */
    @SerializedName("rank")
    private Integer rank;
    /**
    * <p data-diff-id="ct-diff-id-e6b051c7-52b8-4e29-b7c4-9f3819ab6e2d">最大选择的商品数</p>
    */
    @NotNull(message = "maxNum不能为空")
    @SerializedName("maxNum")
    private Integer maxNum;
    /**
    * <p data-diff-id="ct-diff-id-205e4132-ead4-4d89-be6a-bcf3ccf3928e">最小选择的商品数，需要等于最大选择的商品数</p>
    */
    @NotNull(message = "minNum不能为空")
    @SerializedName("minNum")
    private Integer minNum;
    /**
    * <p data-diff-id="ct-diff-id-5ba1f778-e2bc-48d2-b3ac-bb819777bc23"><span style="color: ">套餐分组名称,不超过16个字符</span></p>
    */
    @NotBlank(message = "groupName不能为空")
    @SerializedName("groupName")
    private String groupName;
    /**
    * <p data-diff-id="ct-diff-id-ea042fd7-376c-42df-ae88-74e905579846">套餐分组下的菜品，单次请求最大数数量限制300</p>
    */
    @NotEmpty(message = "comboItemList不能为空")
    @SerializedName("comboItemList")
    private List<ComboItem> comboItemList;

    public Integer getRank() {
        return rank;
    }
    public void setRank(Integer rank) {
        this.rank = rank;
    }
    public Integer getMaxNum() {
        return maxNum;
    }
    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }
    public Integer getMinNum() {
        return minNum;
    }
    public void setMinNum(Integer minNum) {
        this.minNum = minNum;
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public List<ComboItem> getComboItemList() {
        return comboItemList;
    }
    public void setComboItemList(List<ComboItem> comboItemList) {
        this.comboItemList = comboItemList;
    }




    @Override
    public String toString() {
        return "ComboGroup{" + "rank=" + rank + "," + "maxNum=" + maxNum + "," + "minNum=" + minNum + "," + "groupName=" + groupName + "," + "comboItemList=" + comboItemList + "}";
    }
}
