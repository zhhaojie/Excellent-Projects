package com.meituan.sdk.model.waimaiNg.dish.dishUpdateStock;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 更新菜品库存【sku的库存】
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/dish/updateStock",
    businessId = 2,
    apiVersion = "10090",
    apiName = "dish_update_stock",
    needAuth = true
)
public class DishUpdateStockRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">菜品库存列表 参考dishSkuStocks说明 使用json数组格式传递参数</font></span></p>
    */
    @NotBlank(message = "dishSkuStocks不能为空")
    @SerializedName("dishSkuStocks")
    private String dishSkuStocks;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">ERP方门店id 最大长度100</font></span></p>
    */
    @SerializedName("ePoiId")
    private String ePoiId;

    public String getDishSkuStocks() {
        return dishSkuStocks;
    }
    public void setDishSkuStocks(String dishSkuStocks) {
        this.dishSkuStocks = dishSkuStocks;
    }
    public String getEPoiId() {
        return ePoiId;
    }
    public void setEPoiId(String ePoiId) {
        this.ePoiId = ePoiId;
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
        return "DishUpdateStockRequest{" + "dishSkuStocks=" + dishSkuStocks + "," + "ePoiId=" + ePoiId + "}";
    }
}
