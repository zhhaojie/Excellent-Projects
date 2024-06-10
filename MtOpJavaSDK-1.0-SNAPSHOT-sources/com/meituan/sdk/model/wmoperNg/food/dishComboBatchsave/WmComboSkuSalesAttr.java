package com.meituan.sdk.model.wmoperNg.food.dishComboBatchsave;

import com.google.gson.annotations.SerializedName;

/**
* <p>sku销售属性</p>
* This file was automatically generated.
*/
public class WmComboSkuSalesAttr {
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">属性名，</font>套餐商品固定传"份量"</p>
    */
    @SerializedName("name")
    private String name;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">属性值，</font>套餐商品固定传"x人份"</p>
    */
    @SerializedName("value")
    private String value;

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




    @Override
    public String toString() {
        return "WmComboSkuSalesAttr{" + "name=" + name + "," + "value=" + value + "}";
    }
}
