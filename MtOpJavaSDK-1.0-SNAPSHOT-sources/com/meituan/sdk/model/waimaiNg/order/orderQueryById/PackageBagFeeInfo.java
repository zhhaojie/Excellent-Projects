package com.meituan.sdk.model.waimaiNg.order.orderQueryById;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 打包费模块
* This file was automatically generated.
*/
public class PackageBagFeeInfo {
    /**
    * 打包费模式
    */
    @SerializedName("package_bag_mode")
    private Integer packageBagMode;
    /**
    * 打包费金额
    */
    @SerializedName("package_bag_fee")
    private Double packageBagFee;
    /**
    * 口袋打包费明细
    */
    @SerializedName("package_bag_cart_detail")
    private List<PackageBagCartDetail> packageBagCartDetail;

    public Integer getPackageBagMode() {
        return packageBagMode;
    }
    public void setPackageBagMode(Integer packageBagMode) {
        this.packageBagMode = packageBagMode;
    }
    public Double getPackageBagFee() {
        return packageBagFee;
    }
    public void setPackageBagFee(Double packageBagFee) {
        this.packageBagFee = packageBagFee;
    }
    public List<PackageBagCartDetail> getPackageBagCartDetail() {
        return packageBagCartDetail;
    }
    public void setPackageBagCartDetail(List<PackageBagCartDetail> packageBagCartDetail) {
        this.packageBagCartDetail = packageBagCartDetail;
    }




    @Override
    public String toString() {
        return "PackageBagFeeInfo{" + "packageBagMode=" + packageBagMode + "," + "packageBagFee=" + packageBagFee + "," + "packageBagCartDetail=" + packageBagCartDetail + "}";
    }
}
