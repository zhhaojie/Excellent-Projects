package com.meituan.sdk.model.wmoperNg.special.specialFoodBatchQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class Propertys {
    @SerializedName("property_name")
    private String propertyName;
    @SerializedName("values")
    private List<Long> values;
    @SerializedName("required_num")
    private Long requiredNum;

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
    public Long getRequiredNum() {
        return requiredNum;
    }
    public void setRequiredNum(Long requiredNum) {
        this.requiredNum = requiredNum;
    }




    @Override
    public String toString() {
        return "Propertys{" + "propertyName=" + propertyName + "," + "values=" + values + "," + "requiredNum=" + requiredNum + "}";
    }
}
