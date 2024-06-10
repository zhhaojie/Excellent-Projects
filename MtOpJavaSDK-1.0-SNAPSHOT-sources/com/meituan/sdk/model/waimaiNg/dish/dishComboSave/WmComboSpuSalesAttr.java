package com.meituan.sdk.model.waimaiNg.dish.dishComboSave;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p>套餐商品属性只有份量。</p><p></p><p>长度限制 1</p>
* This file was automatically generated.
*/
public class WmComboSpuSalesAttr {
    /**
    * <p>属性项。套餐商品只传“份量” </p>
    */
    @NotBlank(message = "name不能为空")
    @SerializedName("name")
    private String name;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">属性值。“份量”对应的value，</font>套餐商品的value必须为"x人份"</p>
    */
    @NotBlank(message = "value不能为空")
    @SerializedName("value")
    private String value;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">属性价格。单位元，支持小数点后两位。套餐价格上限暂定为5000元</font></p>
    */
    @NotNull(message = "price不能为空")
    @SerializedName("price")
    private Double price;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">属性值上下架状态。0-上架，1-下架，默认0</font></p>
    */
    @NotNull(message = "sellStatus不能为空")
    @SerializedName("sell_status")
    private Integer sellStatus;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Integer getSellStatus() {
        return sellStatus;
    }
    public void setSellStatus(Integer sellStatus) {
        this.sellStatus = sellStatus;
    }




    @Override
    public String toString() {
        return "WmComboSpuSalesAttr{" + "name=" + name + "," + "value=" + value + "," + "price=" + price + "," + "sellStatus=" + sellStatus + "}";
    }
}
