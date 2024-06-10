package com.meituan.sdk.model.waimaiNg.dish.queryCategoryProperties;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotEmpty;

/**
* 根据类目查询模板下所有属性
* This file was automatically generated.
*/
public class QueryCategoryPropertiesResponse {
    @NotEmpty(message = "propertiesKeys不能为空")
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
        return "QueryCategoryPropertiesResponse{" + "propertiesKeys=" + propertiesKeys + "}";
    }
}
