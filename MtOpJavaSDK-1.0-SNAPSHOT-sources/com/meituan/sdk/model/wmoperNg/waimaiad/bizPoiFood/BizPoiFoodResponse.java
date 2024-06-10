package com.meituan.sdk.model.wmoperNg.waimaiad.bizPoiFood;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 经营分析-菜品信息
* This file was automatically generated.
*/
public class BizPoiFoodResponse {
    @NotNull(message = "result不能为空")
    @SerializedName("result")
    private Result result;
    @NotEmpty(message = "foodList不能为空")
    @SerializedName("foodList")
    private List<FoodInfo> foodList;

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }
    public List<FoodInfo> getFoodList() {
        return foodList;
    }
    public void setFoodList(List<FoodInfo> foodList) {
        this.foodList = foodList;
    }




    @Override
    public String toString() {
        return "BizPoiFoodResponse{" + "result=" + result + "," + "foodList=" + foodList + "}";
    }
}
