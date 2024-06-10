package com.meituan.sdk.model.waimaiNg.order.getPreparationMealtime;

import com.google.gson.annotations.SerializedName;

/**
* 商家获取备餐时间
* This file was automatically generated.
*/
public class GetPreparationMealtimeResponse {
    /**
    * 备餐时长 （单位秒）
    */
    @SerializedName("preparationMealTime")
    private Integer preparationMealTime;

    public Integer getPreparationMealTime() {
        return preparationMealTime;
    }
    public void setPreparationMealTime(Integer preparationMealTime) {
        this.preparationMealTime = preparationMealTime;
    }




    @Override
    public String toString() {
        return "GetPreparationMealtimeResponse{" + "preparationMealTime=" + preparationMealTime + "}";
    }
}
