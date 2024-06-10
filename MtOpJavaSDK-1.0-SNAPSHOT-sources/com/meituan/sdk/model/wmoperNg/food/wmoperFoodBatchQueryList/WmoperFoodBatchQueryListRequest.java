package com.meituan.sdk.model.wmoperNg.food.wmoperFoodBatchQueryList;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 批量查询外卖菜品
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/food/batchQuery",
    businessId = 16,
    apiVersion = "10027",
    apiName = "wmoper_food_batch_query_list",
    needAuth = true
)
public class WmoperFoodBatchQueryListRequest implements MeituanRequest<List<WmoperFoodBatchQueryListResponse>> {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">商品code列表，最多20个，英文逗号隔开【,】</font></span></p>
    */
    @NotBlank(message = "appFoodCodes不能为空")
    @SerializedName("app_food_codes")
    private String appFoodCodes;

    public String getAppFoodCodes() {
        return appFoodCodes;
    }
    public void setAppFoodCodes(String appFoodCodes) {
        this.appFoodCodes = appFoodCodes;
    }


    @Override
    public MeituanResponse<List<WmoperFoodBatchQueryListResponse>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<WmoperFoodBatchQueryListResponse>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "WmoperFoodBatchQueryListRequest{" + "appFoodCodes=" + appFoodCodes + "}";
    }
}
