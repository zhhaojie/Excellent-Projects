package com.meituan.sdk.model.foodmop.market.tuangouDealSkuMapping;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotEmpty;

/**
* <p data-diff-id="ct-diff-id-7e26540c-186c-4d0a-aecd-cbbf13e0bf13">套餐分组列表，mappingType为20-套餐时非空</p>
* This file was automatically generated.
*/
public class Combo {
    /**
    * <p data-diff-id="ct-diff-id-236a227e-74a5-40ad-93b6-da473d40371a">商家套餐id，下单时会透传该字段</p>
    */
    @SerializedName("vendorComboId")
    private String vendorComboId;
    /**
    * <p data-diff-id="ct-diff-id-3739b82b-e868-4b01-8cdb-2ba0ab77d86d">套餐分组列表，单次请求最大数数量限制10</p>
    */
    @NotEmpty(message = "comboGroupList不能为空")
    @SerializedName("comboGroupList")
    private List<ComboGroup> comboGroupList;
    /**
    * <p data-diff-id="ct-diff-id-9f825e1e-fbb7-4f0c-9a52-67976759b2ae">套餐名称</p>
    */
    @SerializedName("comboName")
    private String comboName;

    public String getVendorComboId() {
        return vendorComboId;
    }
    public void setVendorComboId(String vendorComboId) {
        this.vendorComboId = vendorComboId;
    }
    public List<ComboGroup> getComboGroupList() {
        return comboGroupList;
    }
    public void setComboGroupList(List<ComboGroup> comboGroupList) {
        this.comboGroupList = comboGroupList;
    }
    public String getComboName() {
        return comboName;
    }
    public void setComboName(String comboName) {
        this.comboName = comboName;
    }




    @Override
    public String toString() {
        return "Combo{" + "vendorComboId=" + vendorComboId + "," + "comboGroupList=" + comboGroupList + "," + "comboName=" + comboName + "}";
    }
}
