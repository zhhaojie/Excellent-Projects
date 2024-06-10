package com.meituan.sdk.model.jmcard.members.memberQuery;

import com.google.gson.annotations.SerializedName;

/**
* 表单内容列表
* This file was automatically generated.
*/
public class FormItem {
    /**
    * 注册信息类别，可选值为NAME,SEX,PHONE,BIRTHDAY,CITY
    */
    @SerializedName("itemEnum")
    private String itemEnum;
    /**
    * 值
    */
    @SerializedName("value")
    private String value;

    public String getItemEnum() {
        return itemEnum;
    }
    public void setItemEnum(String itemEnum) {
        this.itemEnum = itemEnum;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }




    @Override
    public String toString() {
        return "FormItem{" + "itemEnum=" + itemEnum + "," + "value=" + value + "}";
    }
}
