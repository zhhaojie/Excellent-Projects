package com.meituan.sdk.model.waimaiNg.decoration.queryPoster;

import com.google.gson.annotations.SerializedName;

/**
* 商品信息
* This file was automatically generated.
*/
public class WmAppPostFoodVos {
    /**
    * 菜品id
    */
    @SerializedName("app_food_code")
    private Long appFoodCode;
    /**
    * 菜品名称
    */
    @SerializedName("food_name")
    private String foodName;
    /**
    * 标签名
    */
    @SerializedName("tag_name")
    private String tagName;
    /**
    * 是否有图片
    */
    @SerializedName("has_pic")
    private Boolean hasPic;

    public Long getAppFoodCode() {
        return appFoodCode;
    }
    public void setAppFoodCode(Long appFoodCode) {
        this.appFoodCode = appFoodCode;
    }
    public String getFoodName() {
        return foodName;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public String getTagName() {
        return tagName;
    }
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
    public Boolean getHasPic() {
        return hasPic;
    }
    public void setHasPic(Boolean hasPic) {
        this.hasPic = hasPic;
    }




    @Override
    public String toString() {
        return "WmAppPostFoodVos{" + "appFoodCode=" + appFoodCode + "," + "foodName=" + foodName + "," + "tagName=" + tagName + "," + "hasPic=" + hasPic + "}";
    }
}
