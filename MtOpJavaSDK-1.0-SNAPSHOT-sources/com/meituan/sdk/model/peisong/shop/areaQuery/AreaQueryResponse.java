package com.meituan.sdk.model.peisong.shop.areaQuery;

import com.google.gson.annotations.SerializedName;

/**
* 查询合作方配送范围
* This file was automatically generated.
*/
public class AreaQueryResponse {
    /**
    * 门店配送范围
    */
    @SerializedName("scope")
    private String scope;

    public String getScope() {
        return scope;
    }
    public void setScope(String scope) {
        this.scope = scope;
    }




    @Override
    public String toString() {
        return "AreaQueryResponse{" + "scope=" + scope + "}";
    }
}
