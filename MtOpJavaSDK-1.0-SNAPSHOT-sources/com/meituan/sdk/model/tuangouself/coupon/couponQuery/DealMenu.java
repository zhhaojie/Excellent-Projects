package com.meituan.sdk.model.tuangouself.coupon.couponQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* deal对应的菜品信息
* This file was automatically generated.
*/
public class DealMenu {
    /**
    * 项目ID
    */
    @SerializedName("dealId")
    private Long dealId;
    /**
    * 菜品分类
    */
    @SerializedName("menuTitle")
    private String menuTitle;
    /**
    * 菜品列表
    */
    @SerializedName("meals")
    private List<Meal> meals;

    public Long getDealId() {
        return dealId;
    }
    public void setDealId(Long dealId) {
        this.dealId = dealId;
    }
    public String getMenuTitle() {
        return menuTitle;
    }
    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }
    public List<Meal> getMeals() {
        return meals;
    }
    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }




    @Override
    public String toString() {
        return "DealMenu{" + "dealId=" + dealId + "," + "menuTitle=" + menuTitle + "," + "meals=" + meals + "}";
    }
}
