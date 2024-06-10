package com.meituan.sdk.model.waimaiNg.special.specialFoodBatchQuery;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class Setmeals {
    @NotBlank(message = "name不能为空")
    @SerializedName("name")
    private String name;
    @NotNull(message = "price不能为空")
    @SerializedName("price")
    private Double price;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }




    @Override
    public String toString() {
        return "Setmeals{" + "name=" + name + "," + "price=" + price + "}";
    }
}
