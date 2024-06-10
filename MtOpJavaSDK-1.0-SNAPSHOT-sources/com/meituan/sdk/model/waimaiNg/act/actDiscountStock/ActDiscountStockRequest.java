package com.meituan.sdk.model.waimaiNg.act.actDiscountStock;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 批量更新折扣商品当日活动库存
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/act/discount/stock",
    businessId = 2,
    apiVersion = "10002",
    apiName = "act_discount_stock",
    needAuth = true
)
public class ActDiscountStockRequest implements MeituanRequest<String> {
    /**
    * <p><font style="font-size:13px;line-height:21px" data-size="13">活动数据数量上限为200</font></p>
    */
    @NotBlank(message = "actData不能为空")
    @SerializedName("actData")
    private String actData;

    public String getActData() {
        return actData;
    }
    public void setActData(String actData) {
        this.actData = actData;
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
        return "ActDiscountStockRequest{" + "actData=" + actData + "}";
    }
}
