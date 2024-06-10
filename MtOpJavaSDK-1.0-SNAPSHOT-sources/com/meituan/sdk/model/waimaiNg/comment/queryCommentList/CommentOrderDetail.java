package com.meituan.sdk.model.waimaiNg.comment.queryCommentList;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class CommentOrderDetail {
    @NotBlank(message = "foodName不能为空")
    @SerializedName("food_name")
    private String foodName;
    @NotNull(message = "count不能为空")
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
