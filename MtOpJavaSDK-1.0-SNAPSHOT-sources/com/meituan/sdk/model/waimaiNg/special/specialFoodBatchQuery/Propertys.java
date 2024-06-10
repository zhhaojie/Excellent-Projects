package com.meituan.sdk.model.waimaiNg.special.specialFoodBatchQuery;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 
* This file was automatically generated.
*/
public class Propertys {
    @NotBlank(message = "propertyName不能为空")
    @SerializedName("property_name")
    private String propertyName;
    @NotEmpty(message = "values不能为空")
    @SerializedName("values")
    private List<Long> values;
    @NotNull(message = "requiredNum不能为空")
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
