package com.meituan.sdk.model.resv2.table.tableStatusPush;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-ff6cc7a4-0e3d-420d-b5a6-8f531d1c7941"><span style="color: rgb(36, 41, 46)">桌台对应的点菜数据</span></p>
* This file was automatically generated.
*/
public class Dish {
    /**
    * <p data-diff-id="ct-diff-id-123aea07-126f-4555-b0fd-0782873f22a3"><span style="color: rgb(36, 41, 46)">商家菜品id</span></p>
    */
    @NotBlank(message = "dishId不能为空")
    @SerializedName("dishId")
    private String dishId;
    /**
    * <p data-diff-id="ct-diff-id-005a1501-3474-4eac-9924-6695e607aee6"><span style="color: rgb(36, 41, 46)">菜品速记code</span></p>
    */
    @NotBlank(message = "dishCode不能为空")
    @SerializedName("dishCode")
    private String dishCode;
    /**
    * <p data-diff-id="ct-diff-id-55205999-b5b5-4cda-95f9-8f0337019b32"><span style="color: rgb(36, 41, 46)">菜品名称</span></p>
    */
    @NotBlank(message = "dishName不能为空")
    @SerializedName("dishName")
    private String dishName;
    /**
    * <p data-diff-id="ct-diff-id-a72d0059-dfa8-41cf-adcf-015217c5f46d"><span style="color: rgb(36, 41, 46)">"份","斤","盒"等等</span></p>
    */
    @SerializedName("dishSpec")
    private String dishSpec;
    /**
    * <p data-diff-id="ct-diff-id-a8047ddf-153c-4e5a-97f3-811b809eccc2"><span style="color: rgb(36, 41, 46)">菜品价格</span></p>
    */
    @NotNull(message = "dishPrice不能为空")
    @SerializedName("dishPrice")
    private Double dishPrice;
    /**
    * <p data-diff-id="ct-diff-id-b5fd519d-630d-4340-9bee-ce2936c503c8"><span style="color: rgb(36, 41, 46)">菜品数量</span></p>
    */
    @NotNull(message = "dishCount不能为空")
    @SerializedName("dishCount")
    private Integer dishCount;

    public String getDishId() {
        return dishId;
    }
    public void setDishId(String dishId) {
        this.dishId = dishId;
    }
    public String getDishCode() {
        return dishCode;
    }
    public void setDishCode(String dishCode) {
        this.dishCode = dishCode;
    }
    public String getDishName() {
        return dishName;
    }
    public void setDishName(String dishName) {
        this.dishName = dishName;
    }
    public String getDishSpec() {
        return dishSpec;
    }
    public void setDishSpec(String dishSpec) {
        this.dishSpec = dishSpec;
    }
    public Double getDishPrice() {
        return dishPrice;
    }
    public void setDishPrice(Double dishPrice) {
        this.dishPrice = dishPrice;
    }
    public Integer getDishCount() {
        return dishCount;
    }
    public void setDishCount(Integer dishCount) {
        this.dishCount = dishCount;
    }




    @Override
    public String toString() {
        return "Dish{" + "dishId=" + dishId + "," + "dishCode=" + dishCode + "," + "dishName=" + dishName + "," + "dishSpec=" + dishSpec + "," + "dishPrice=" + dishPrice + "," + "dishCount=" + dishCount + "}";
    }
}
