package com.meituan.sdk.model.wmoperNg.foodop.foodSkuSellStatus;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotEmpty;

/**
* <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">菜品sku集合</font></span></p>
* This file was automatically generated.
*/
public class FoodData {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">服务商方的菜品id，最大长度128，不同门店可以重复，同一门店内不能重复</font></span></p>
    */
    @NotBlank(message = "appFoodCode不能为空")
    @SerializedName("app_food_code")
    private String appFoodCode;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">skus</font></span></p>
    */
    @NotEmpty(message = "skus不能为空")
    @SerializedName("skus")
    private List<Skus> skus;

    public String getAppFoodCode() {
        return appFoodCode;
    }
    public void setAppFoodCode(String appFoodCode) {
        this.appFoodCode = appFoodCode;
    }
    public List<Skus> getSkus() {
        return skus;
    }
    public void setSkus(List<Skus> skus) {
        this.skus = skus;
    }




    @Override
    public String toString() {
        return "FoodData{" + "appFoodCode=" + appFoodCode + "," + "skus=" + skus + "}";
    }
}
