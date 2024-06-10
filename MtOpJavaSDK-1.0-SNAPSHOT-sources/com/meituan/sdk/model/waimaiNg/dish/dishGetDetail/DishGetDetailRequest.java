package com.meituan.sdk.model.waimaiNg.dish.dishGetDetail;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询菜品详情
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/dish/getDetail",
    businessId = 2,
    apiVersion = "10100",
    apiName = "dish_get_detail",
    needAuth = true
)
public class DishGetDetailRequest implements MeituanRequest<DishGetDetailResponse> {
    /**
    * <p>菜品id(三方商品spu_code值, 不同门店可以重复，同一门店内不能重复)最大长度128</p>
    */
    @NotBlank(message = "eDishCode不能为空")
    @SerializedName("eDishCode")
    private String eDishCode;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">标识订单是否为团餐定制菜单。</font></span>1：团餐定制菜单，0或空：外卖菜单</p>
    */
    @SerializedName("orderEntranceType")
    private Integer orderEntranceType;

    public String getEDishCode() {
        return eDishCode;
    }
    public void setEDishCode(String eDishCode) {
        this.eDishCode = eDishCode;
    }
    public Integer getOrderEntranceType() {
        return orderEntranceType;
    }
    public void setOrderEntranceType(Integer orderEntranceType) {
        this.orderEntranceType = orderEntranceType;
    }


    @Override
    public MeituanResponse<DishGetDetailResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<DishGetDetailResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "DishGetDetailRequest{" + "eDishCode=" + eDishCode + "," + "orderEntranceType=" + orderEntranceType + "}";
    }
}
