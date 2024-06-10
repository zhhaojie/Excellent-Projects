package com.meituan.sdk.model.wmoperNg.special.specialFoodUpdateSellStatus;

import com.meituan.sdk.annotations.ApiMeta;
import java.lang.Void;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 修改商品上下架状态(拼好饭)
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/special/food/updateSellStatus",
    businessId = 16,
    apiVersion = "10004",
    apiName = "special_food_update_sell_status",
    needAuth = true
)
public class SpecialFoodUpdateSellStatusRequest implements MeituanRequest<Void> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">业务标识，1-拼好饭</font></span></p>
    */
    @NotNull(message = "businessIdentify不能为空")
    @SerializedName("businessIdentify")
    private Integer businessIdentify;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">三方菜品id，当eDishCode为default时，表示清空该值，当eDishCode为空字符串时，表示不处理该字段，对应外卖侧的app_food_code</font></span></p>
    */
    @NotBlank(message = "eDishCode不能为空")
    @SerializedName("eDishCode")
    private String eDishCode;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">菜品上下架状态，0表上架，1表下架</font></span></p>
    */
    @NotNull(message = "sellStatus不能为空")
    @SerializedName("sellStatus")
    private Integer sellStatus;

    public Integer getBusinessIdentify() {
        return businessIdentify;
    }
    public void setBusinessIdentify(Integer businessIdentify) {
        this.businessIdentify = businessIdentify;
    }
    public String getEDishCode() {
        return eDishCode;
    }
    public void setEDishCode(String eDishCode) {
        this.eDishCode = eDishCode;
    }
    public Integer getSellStatus() {
        return sellStatus;
    }
    public void setSellStatus(Integer sellStatus) {
        this.sellStatus = sellStatus;
    }


    @Override
    public MeituanResponse<Void> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<Void>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "SpecialFoodUpdateSellStatusRequest{" + "businessIdentify=" + businessIdentify + "," + "eDishCode=" + eDishCode + "," + "sellStatus=" + sellStatus + "}";
    }
}
