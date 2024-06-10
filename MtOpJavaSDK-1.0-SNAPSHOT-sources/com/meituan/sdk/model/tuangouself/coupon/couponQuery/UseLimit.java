package com.meituan.sdk.model.tuangouself.coupon.couponQuery;

import com.google.gson.annotations.SerializedName;

/**
* 美团券使用限制
* This file was automatically generated.
*/
public class UseLimit {
    /**
    * 是否限制使用美团券，若为代金券，返回默认值false
    */
    @SerializedName("isLimit")
    private Boolean isLimit;
    /**
    * 每人限制张数
    */
    @SerializedName("personLimit")
    private Integer personLimit;
    /**
    * 每桌限制张数
    */
    @SerializedName("tableLimit")
    private Integer tableLimit;

    public Boolean getIsLimit() {
        return isLimit;
    }
    public void setIsLimit(Boolean isLimit) {
        this.isLimit = isLimit;
    }
    public Integer getPersonLimit() {
        return personLimit;
    }
    public void setPersonLimit(Integer personLimit) {
        this.personLimit = personLimit;
    }
    public Integer getTableLimit() {
        return tableLimit;
    }
    public void setTableLimit(Integer tableLimit) {
        this.tableLimit = tableLimit;
    }




    @Override
    public String toString() {
        return "UseLimit{" + "isLimit=" + isLimit + "," + "personLimit=" + personLimit + "," + "tableLimit=" + tableLimit + "}";
    }
}
