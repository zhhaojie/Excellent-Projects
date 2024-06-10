package com.meituan.sdk.model.waimaiNg.dish.dishQueryPropertyList;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 菜品属性数组
* This file was automatically generated.
*/
public class DishPropertyInfo {
    /**
    * 菜品属性名
    */
    @SerializedName("propertyName")
    private String propertyName;
    /**
    * 菜品具体属性
    */
    @SerializedName("values")
    private List<Long> values;

    public String getPropertyName() {
        return propertyName;
    }
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
    public List<Long> getValues() {
        return values;
    }
    public void setValues(List<Long> values) {
        this.values = values;
    }




    @Override
    public String toString() {
        return "DishPropertyInfo{" + "propertyName=" + propertyName + "," + "values=" + values + "}";
    }
}
