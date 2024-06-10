package com.meituan.sdk.model.design.image.imageTagsFoodScene;

import com.google.gson.annotations.SerializedName;

/**
* 菜品标签
* This file was automatically generated.
*/
public class Tags {
    /**
    * 标签名称 [宣传图，美食，Logo，菜单，小票，其他，内部环境，外部环境]
    */
    @SerializedName("name")
    private String name;
    /**
    * 置信度 范围0-1  0为非菜品图片，1为菜品图片，0~1区间表示为菜品的可信度。
    */
    @SerializedName("prob")
    private Double prob;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getProb() {
        return prob;
    }
    public void setProb(Double prob) {
        this.prob = prob;
    }




    @Override
    public String toString() {
        return "Tags{" + "name=" + name + "," + "prob=" + prob + "}";
    }
}
