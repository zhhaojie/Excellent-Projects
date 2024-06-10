package com.meituan.sdk.model.waimaiNg.dish.queryFoodDna;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 查询菜品DNA
* This file was automatically generated.
*/
public class QueryFoodDnaResponse {
    /**
    * 后台类目ID
    */
    @NotNull(message = "categoryId不能为空")
    @SerializedName("categoryId")
    private Long categoryId;
    @NotNull(message = "customizable不能为空")
    @SerializedName("customizable")
    private Long customizable;
    @NotEmpty(message = "propertiesValues不能为空")
    @SerializedName("properties_values")
    private List<PropertiesValues> propertiesValues;

    public Long getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
    public Long getCustomizable() {
        return customizable;
    }
    public void setCustomizable(Long customizable) {
        this.customizable = customizable;
    }
    public List<PropertiesValues> getPropertiesValues() {
        return propertiesValues;
    }
    public void setPropertiesValues(List<PropertiesValues> propertiesValues) {
        this.propertiesValues = propertiesValues;
    }




    @Override
    public String toString() {
        return "QueryFoodDnaResponse{" + "categoryId=" + categoryId + "," + "customizable=" + customizable + "," + "propertiesValues=" + propertiesValues + "}";
    }
}
