package com.meituan.sdk.model.wmoperNg.food.wmoperFoodBatchQueryFoodDna;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 商品DNA信息
* This file was automatically generated.
*/
public class DNAData {
    /**
    * 后台类目id
    */
    @SerializedName("categoryId")
    private Long categoryId;
    /**
    * 菜品id
    */
    @SerializedName("app_food_code")
    private String appFoodCode;
    /**
    * 模板信息
    */
    @SerializedName("properties_values")
    private List<Property> propertiesValues;

    public Long getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
    public String getAppFoodCode() {
        return appFoodCode;
    }
    public void setAppFoodCode(String appFoodCode) {
        this.appFoodCode = appFoodCode;
    }
    public List<Property> getPropertiesValues() {
        return propertiesValues;
    }
    public void setPropertiesValues(List<Property> propertiesValues) {
        this.propertiesValues = propertiesValues;
    }




    @Override
    public String toString() {
        return "DNAData{" + "categoryId=" + categoryId + "," + "appFoodCode=" + appFoodCode + "," + "propertiesValues=" + propertiesValues + "}";
    }
}
