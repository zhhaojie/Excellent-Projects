package com.meituan.sdk.model.foodmop.market.tuangouDealSkuMapping;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-ea042fd7-376c-42df-ae88-74e905579846">套餐分组下的菜品，单次请求最大数数量限制300</p>
* This file was automatically generated.
*/
public class ComboItem {
    /**
    * <p data-diff-id="ct-diff-id-a5148f38-9357-4355-bc55-ea064f0cbff0">菜品排序</p>
    */
    @SerializedName("rank")
    private Integer rank;
    /**
    * <p data-diff-id="ct-diff-id-3e075b86-4102-42d6-8645-e3e22620460a">商家skuId</p>
    */
    @NotBlank(message = "vendorSkuId不能为空")
    @SerializedName("vendorSkuId")
    private String vendorSkuId;
    /**
    * <p data-diff-id="ct-diff-id-f8a93330-648b-4309-a651-dad7f7198315">商家spuId</p>
    */
    @SerializedName("vendorSpuId")
    private String vendorSpuId;

    public Integer getRank() {
        return rank;
    }
    public void setRank(Integer rank) {
        this.rank = rank;
    }
    public String getVendorSkuId() {
        return vendorSkuId;
    }
    public void setVendorSkuId(String vendorSkuId) {
        this.vendorSkuId = vendorSkuId;
    }
    public String getVendorSpuId() {
        return vendorSpuId;
    }
    public void setVendorSpuId(String vendorSpuId) {
        this.vendorSpuId = vendorSpuId;
    }




    @Override
    public String toString() {
        return "ComboItem{" + "rank=" + rank + "," + "vendorSkuId=" + vendorSkuId + "," + "vendorSpuId=" + vendorSpuId + "}";
    }
}
