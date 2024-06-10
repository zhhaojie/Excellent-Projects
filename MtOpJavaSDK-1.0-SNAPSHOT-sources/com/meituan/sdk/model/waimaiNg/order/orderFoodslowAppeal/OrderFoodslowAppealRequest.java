package com.meituan.sdk.model.waimaiNg.order.orderFoodslowAppeal;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 商家提交申诉
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/order/foodSlow/appeal",
    businessId = 2,
    apiVersion = "10009",
    apiName = "order_foodslow_appeal",
    needAuth = true
)
public class OrderFoodslowAppealRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">订单ID(订单展示号或者真实号)</font></span><br></p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    /**
    * <p>图片地址url,多个以英文逗号间隔</p><p style="text-align: start;">如果<span style="color: rgb(49, 49, 49)">appeal_type为1，图片不能为空</span></p>
    */
    @SerializedName("appealPictures")
    private String appealPictures;
    /**
    * <p>商家申诉的类型</p><p style="text-align: start;">1.提交照片申诉</p><p style="text-align: start;">2.餐已经被骑手取走</p>
    */
    @NotNull(message = "appealType不能为空")
    @SerializedName("appealType")
    private Integer appealType;

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public String getAppealPictures() {
        return appealPictures;
    }
    public void setAppealPictures(String appealPictures) {
        this.appealPictures = appealPictures;
    }
    public Integer getAppealType() {
        return appealType;
    }
    public void setAppealType(Integer appealType) {
        this.appealType = appealType;
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
        return "OrderFoodslowAppealRequest{" + "orderId=" + orderId + "," + "appealPictures=" + appealPictures + "," + "appealType=" + appealType + "}";
    }
}
