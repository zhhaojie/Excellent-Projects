package com.meituan.sdk.model.wmoperNg.food.wmoperFoodPropertyList;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 菜品属性数组
* This file was automatically generated.
*/
public class Data {
    /**
    * 菜品属性名
    */
    @SerializedName("property_name")
    private String propertyName;
    /**
    * 菜品具体属性
    */
    @SerializedName("values")
    private List<String> values;

    public String getPropertyName() {
        return propertyName;
    }
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
    public List<String> getValues() {
        return values;
    }
    public void setValues(List<String> values) {
        this.values = values;
    }




    @Override
    public String toString() {
        return "Data{" + "propertyName=" + propertyName + "," + "values=" + values + "}";
    }
}
