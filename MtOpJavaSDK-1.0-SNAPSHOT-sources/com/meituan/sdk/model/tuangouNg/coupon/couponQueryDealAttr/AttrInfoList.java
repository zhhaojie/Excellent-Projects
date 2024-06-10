package com.meituan.sdk.model.tuangouNg.coupon.couponQueryDealAttr;

import com.google.gson.annotations.SerializedName;

/**
* 当前dealId对应的attrId以及属性值
* This file was automatically generated.
*/
public class AttrInfoList {
    /**
    * attrId
    */
    @SerializedName("attrId")
    private Integer attrId;
    /**
    * 拓展属性的值（由团购侧接口返回，不作处理）
    */
    @SerializedName("value")
    private String value;

    public Integer getAttrId() {
        return attrId;
    }
    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }




    @Override
    public String toString() {
        return "AttrInfoList{" + "attrId=" + attrId + "," + "value=" + value + "}";
    }
}
