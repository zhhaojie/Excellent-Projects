package com.meituan.sdk.model.waimaiNg.decoration.bossRecommendQuery;

import com.google.gson.annotations.SerializedName;

/**
* 商家开放平台查询老板推荐
* This file was automatically generated.
*/
public class BossRecommendQueryResponse {
    /**
    * 老板推荐是否开启 0:关闭 1:自定义 2:智能推荐
    */
    @SerializedName("state")
    private Integer state;

    public Integer getState() {
        return state;
    }
    public void setState(Integer state) {
        this.state = state;
    }




    @Override
    public String toString() {
        return "BossRecommendQueryResponse{" + "state=" + state + "}";
    }
}
