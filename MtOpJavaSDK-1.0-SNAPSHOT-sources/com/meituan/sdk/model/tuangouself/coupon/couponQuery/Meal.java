package com.meituan.sdk.model.tuangouself.coupon.couponQuery;

import com.google.gson.annotations.SerializedName;

/**
* 菜品列表
* This file was automatically generated.
*/
public class Meal {
    /**
    * 菜品名称
    */
    @SerializedName("mealName")
    private String mealName;
    /**
    * 菜品数量
    */
    @SerializedName("mealNum")
    private String mealNum;

    public String getMealName() {
        return mealName;
    }
    public void setMealName(String mealName) {
        this.mealName = mealName;
    }
    public String getMealNum() {
        return mealNum;
    }
    public void setMealNum(String mealNum) {
        this.mealNum = mealNum;
    }




    @Override
    public String toString() {
        return "Meal{" + "mealName=" + mealName + "," + "mealNum=" + mealNum + "}";
    }
}
