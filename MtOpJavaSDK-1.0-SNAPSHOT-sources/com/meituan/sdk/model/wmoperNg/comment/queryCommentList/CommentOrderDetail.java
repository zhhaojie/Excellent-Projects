package com.meituan.sdk.model.wmoperNg.comment.queryCommentList;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class CommentOrderDetail {
    @SerializedName("food_name")
    private String foodName;
    @SerializedName("count")
    private Long count;

    public String getFoodName() {
        return foodName;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public Long getCount() {
        return count;
    }
    public void setCount(Long count) {
        this.count = count;
    }




    @Override
    public String toString() {
        return "CommentOrderDetail{" + "foodName=" + foodName + "," + "count=" + count + "}";
    }
}
