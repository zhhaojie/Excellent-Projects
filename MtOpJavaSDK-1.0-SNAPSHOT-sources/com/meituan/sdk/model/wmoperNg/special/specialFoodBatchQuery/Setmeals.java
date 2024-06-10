package com.meituan.sdk.model.wmoperNg.special.specialFoodBatchQuery;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class Setmeals {
    @SerializedName("name")
    private String name;
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
