package com.meituan.sdk.model.waimaiNg.dish.dishQueryListByEdishCodes;

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
* 根据eDishCode批量查询外卖菜品信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/dish/queryListByEdishCodes",
    businessId = 2,
    apiVersion = "10076",
    apiName = "dish_query_list_by_edish_codes",
    needAuth = true
)
public class DishQueryListByEdishCodesRequest implements MeituanRequest<DishQueryListByEdishCodesResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">ERP方要查询菜品id（多个，以逗号隔开，最多100个）</font></span></p>
    */
    @NotBlank(message = "eDishCodes不能为空")
    @SerializedName("eDishCodes")
    private String eDishCodes;

    public String getEDishCodes() {
        return eDishCodes;
    }
    public void setEDishCodes(String eDishCodes) {
        this.eDishCodes = eDishCodes;
    }


    @Override
    public MeituanResponse<DishQueryListByEdishCodesResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<DishQueryListByEdishCodesResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "DishQueryListByEdishCodesRequest{" + "eDishCodes=" + eDishCodes + "}";
    }
}
