package com.meituan.sdk.model.wmoperNg.decoration.decorationBossRecommendQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 商家开放平台查询老板推荐
* This file was automatically generated.
*/
public class DecorationBossRecommendQueryResponse {
    /**
    * ERP 商品ID 列表
    */
    @SerializedName("app_food_codes")
    private List<String> appFoodCodes;
    /**
    * 老板推荐是否开启 0:关闭 1:自定义 2:智能推荐
    */
    @SerializedName("state")
    private Integer state;

    public List<String> getAppFoodCodes() {
        return appFoodCodes;
    }
    public void setAppFoodCodes(List<String> appFoodCodes) {
        this.appFoodCodes = appFoodCodes;
    }
    public Integer getState() {
        return state;
    }
    public void setState(Integer state) {
        this.state = state;
    }




    @Override
    public String toString() {
        return "DecorationBossRecommendQueryResponse{" + "appFoodCodes=" + appFoodCodes + "," + "state=" + state + "}";
    }
}
