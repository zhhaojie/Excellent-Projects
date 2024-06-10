package com.meituan.sdk.model.waimaiNg.act.actDiscountDelete;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 批量删除折扣商品
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/act/discount/delete",
    businessId = 2,
    apiVersion = "10001",
    apiName = "act_discount_delete",
    needAuth = true
)
public class ActDiscountDeleteRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:13px;line-height:21px" data-size="13">APP方商品id，删除商品数量上限为100，若需删除门店中的多个商品折扣活动，请用半角逗号分隔。</font></span></p>
    */
    @NotBlank(message = "appFoodCodes不能为空")
    @SerializedName("appFoodCodes")
    private String appFoodCodes;

    public String getAppFoodCodes() {
        return appFoodCodes;
    }
    public void setAppFoodCodes(String appFoodCodes) {
        this.appFoodCodes = appFoodCodes;
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
        return "ActDiscountDeleteRequest{" + "appFoodCodes=" + appFoodCodes + "}";
    }
}
