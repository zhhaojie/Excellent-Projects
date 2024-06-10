package com.meituan.sdk.model.wmoperNg.foodop.foodBatchinitdata;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;
import javax.validation.constraints.NotEmpty;

/**
* 批量创建或更新菜品（新版）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/foodop/food/batchinitdata",
    businessId = 16,
    apiVersion = "10036",
    apiName = "food_batchinitdata",
    needAuth = true
)
public class FoodBatchinitdataRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">菜品集合的</font></span><span style="color: #f5222d"><font style="font-size:14px;line-height:22px" data-size="14">json</font></span><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">数据，</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">处理逻辑：</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">1）如果菜品原来不存在就新增；</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">2）如app_food_code存在就更新；</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">3）picture 可以是调用</font></span>上传菜品图片接口<span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">后返回的图片ID,</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">也可以是url地址,推荐使用图片ID的形式。</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">如果skus传递box_num、box_price以skus为准,</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">未传递box_num、box_price以上级参数为准</font></span></p>
    */
    @NotEmpty(message = "foodData不能为空")
    @SerializedName("food_data")
    private List<FoodData> foodData;
    /**
    * <p data-diff-id="ct-diff-id-a9c9beaa-8585-414c-9019-5ec4f2be3d16">默认为false，为true时会将没有传进来的sku删除（售卖属性增减，都需要传true）</p>
    */
    @SerializedName("skuOverwrite")
    private Boolean skuOverwrite;

    public List<FoodData> getFoodData() {
        return foodData;
    }
    public void setFoodData(List<FoodData> foodData) {
        this.foodData = foodData;
    }
    public Boolean getSkuOverwrite() {
        return skuOverwrite;
    }
    public void setSkuOverwrite(Boolean skuOverwrite) {
        this.skuOverwrite = skuOverwrite;
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
        return "FoodBatchinitdataRequest{" + "foodData=" + foodData + "," + "skuOverwrite=" + skuOverwrite + "}";
    }
}
