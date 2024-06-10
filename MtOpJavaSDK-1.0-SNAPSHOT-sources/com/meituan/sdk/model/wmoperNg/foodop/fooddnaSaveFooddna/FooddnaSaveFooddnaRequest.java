package com.meituan.sdk.model.wmoperNg.foodop.fooddnaSaveFooddna;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 保存商品DNA
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/foodop/foodDna/saveFoodDna",
    businessId = 16,
    apiVersion = "10003",
    apiName = "fooddna_save_fooddna",
    needAuth = true
)
public class FooddnaSaveFooddnaRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">dna信息，json字符串：</font></span></p><div class="ct-code" spellcheck="false" data-language="JavaScript" data-theme="xq-light" data-title="代码块" data-expand="true"><pre><code>[
{
"app_food_code": "FOOD_0005",
"wmProductSpuExtendList": [
{
"category_id": 23, // 后台类目ID
"code": "1000000012", //后台类目对应模板下属性ID
"is_leaf": 1, // 是否叶子节点
"level": 0, // 层级
"name": "荤素", // 后台类目对应模板下属性名称
"parent_property_id": 0, // 后台类目对应模板下属性父ID
"sequence": 0, // 排序
"template_id": 10, // 模板ID
"value": "", // 后台类目对应模板下属性填的值
"value_id": 0 // 后台类目对应模板下属性填的值的ID
}
]
}
]</code></pre></div><p></p>
    */
    @NotBlank(message = "foodData不能为空")
    @SerializedName("food_data")
    private String foodData;

    public String getFoodData() {
        return foodData;
    }
    public void setFoodData(String foodData) {
        this.foodData = foodData;
    }


    @Override
    public MeituanResponse<String> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<String>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "FooddnaSaveFooddnaRequest{" + "foodData=" + foodData + "}";
    }
}
