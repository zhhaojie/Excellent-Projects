package com.meituan.sdk.model.foodmop.shop.tagBind;

import com.google.gson.annotations.SerializedName;

/**
* 失败结果封装
* This file was automatically generated.
*/
public class BindFailResult {
    /**
    * SHOP_OFFLINE：门店不在线  TAG_ERR：标签错误
    */
    @SerializedName("failCode")
    private String failCode;
    /**
    * 如果failCode = TAG_ERR必传：  key(String)：标签code  value(String)：  TAG_AUDIT_REJECT：标签审核失败  TAG_IS_NULL：标签不存在 
    */
    @SerializedName("tagFailMap")
    private TagFail tagFailMap;

    public String getFailCode() {
        return failCode;
    }
    public void setFailCode(String failCode) {
        this.failCode = failCode;
    }
    public TagFail getTagFailMap() {
        return tagFailMap;
    }
    public void setTagFailMap(TagFail tagFailMap) {
        this.tagFailMap = tagFailMap;
    }




    @Override
    public String toString() {
        return "BindFailResult{" + "failCode=" + failCode + "," + "tagFailMap=" + tagFailMap + "}";
    }
}
