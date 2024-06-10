package com.meituan.sdk.model.wmoperNg.order.wmoperngQueryOrderDetail;

import com.google.gson.annotations.SerializedName;

/**
* 套餐商品详情(如果订单含有新版套餐，且品牌不支持新版套餐子商品subDetailList，则仍使用本字段兼容返回套餐详情)(示例为新版套餐返回，旧版套餐不包含规格、数量信息)
* This file was automatically generated.
*/
public class Json {
    /**
    * 商品分类，是否为套餐，1套餐商品
    */
    @SerializedName("attrType")
    private Integer attrType;
    /**
    * 分类名称
    */
    @SerializedName("cate")
    private String cate;
    /**
    * 套餐明细
    */
    @SerializedName("packageDeatil")
    private String packageDeatil;

    public Integer getAttrType() {
        return attrType;
    }
    public void setAttrType(Integer attrType) {
        this.attrType = attrType;
    }
    public String getCate() {
        return cate;
    }
    public void setCate(String cate) {
        this.cate = cate;
    }
    public String getPackageDeatil() {
        return packageDeatil;
    }
    public void setPackageDeatil(String packageDeatil) {
        this.packageDeatil = packageDeatil;
    }




    @Override
    public String toString() {
        return "Json{" + "attrType=" + attrType + "," + "cate=" + cate + "," + "packageDeatil=" + packageDeatil + "}";
    }
}
