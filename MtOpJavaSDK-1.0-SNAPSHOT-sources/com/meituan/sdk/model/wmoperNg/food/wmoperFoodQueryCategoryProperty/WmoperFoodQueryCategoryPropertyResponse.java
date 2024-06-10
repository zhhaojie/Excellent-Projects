package com.meituan.sdk.model.wmoperNg.food.wmoperFoodQueryCategoryProperty;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 根据类目查询模板下所有属性
* This file was automatically generated.
*/
public class WmoperFoodQueryCategoryPropertyResponse {
    @SerializedName("propertiesKeys")
    private List<PropertiesKeys> propertiesKeys;

    public List<PropertiesKeys> getPropertiesKeys() {
        return propertiesKeys;
    }
    public void setPropertiesKeys(List<PropertiesKeys> propertiesKeys) {
        this.propertiesKeys = propertiesKeys;
    }




    @Override
    public String toString() {
        return "WmoperFoodQueryCategoryPropertyResponse{" + "propertiesKeys=" + propertiesKeys + "}";
    }
}
