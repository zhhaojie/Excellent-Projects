package com.meituan.sdk.model.tuangouNg.coupon.couponQueryDealAttr;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class DealInfoList {
    /**
    * 当前dealId对应的attrId以及属性值
    */
    @SerializedName("attrInfoList")
    private List<AttrInfoList> attrInfoList;
    /**
    * dealId
    */
    @SerializedName("dealId")
    private Integer dealId;

    public List<AttrInfoList> getAttrInfoList() {
        return attrInfoList;
    }
    public void setAttrInfoList(List<AttrInfoList> attrInfoList) {
        this.attrInfoList = attrInfoList;
    }
    public Integer getDealId() {
        return dealId;
    }
    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }




    @Override
    public String toString() {
        return "DealInfoList{" + "attrInfoList=" + attrInfoList + "," + "dealId=" + dealId + "}";
    }
}
