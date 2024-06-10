package com.meituan.sdk.model.design.document.foodTextCheck;

import com.google.gson.annotations.SerializedName;

/**
* 菜品标题诊断
* This file was automatically generated.
*/
public class FoodTextCheckResponse {
    /**
    * 诊断结果
    */
    @SerializedName("result")
    private String result;

    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }




    @Override
    public String toString() {
        return "FoodTextCheckResponse{" + "result=" + result + "}";
    }
}
