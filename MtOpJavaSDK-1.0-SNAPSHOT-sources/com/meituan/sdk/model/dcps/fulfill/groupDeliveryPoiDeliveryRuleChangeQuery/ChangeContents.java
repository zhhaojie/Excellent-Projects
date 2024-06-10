package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDeliveryRuleChangeQuery;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class ChangeContents {
    @SerializedName("fieldName")
    private String fieldName;
    @SerializedName("newValue")
    private String newValue;
    @SerializedName("oldValue")
    private String oldValue;

    public String getFieldName() {
        return fieldName;
    }
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
    public String getNewValue() {
        return newValue;
    }
    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }
    public String getOldValue() {
        return oldValue;
    }
    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }




    @Override
    public String toString() {
        return "ChangeContents{" + "fieldName=" + fieldName + "," + "newValue=" + newValue + "," + "oldValue=" + oldValue + "}";
    }
}
