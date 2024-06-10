package com.meituan.sdk.model.waimaiNg.dish.batchQueryFoodDna;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 商品DNA信息
* This file was automatically generated.
*/
public class FoodDna {
    /**
    * 后台类目id
    */
    @NotNull(message = "categoryId不能为空")
    @SerializedName("categoryId")
    private Long categoryId;
    @NotNull(message = "customizable不能为空")
    @SerializedName("customizable")
    private Long customizable;
    /**
    * 菜品id
    */
    @NotBlank(message = "appFoodCode不能为空")
    @SerializedName("app_food_code")
    private String appFoodCode;
    /**
    * 模板信息
    */
    @NotEmpty(message = "propertiesValues不能为空")
    @SerializedName("properties_values")
    private List<PropertiesValue> propertiesValues;

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
    public String getAppFoodCode() {
        return appFoodCode;
    }
    public void setAppFoodCode(String appFoodCode) {
        this.appFoodCode = appFoodCode;
    }
    public List<PropertiesValue> getPropertiesValues() {
        return propertiesValues;
    }
    public void setPropertiesValues(List<PropertiesValue> propertiesValues) {
        this.propertiesValues = propertiesValues;
    }




    @Override
    public String toString() {
        return "FoodDna{" + "categoryId=" + categoryId + "," + "customizable=" + customizable + "," + "appFoodCode=" + appFoodCode + "," + "propertiesValues=" + propertiesValues + "}";
    }
}
