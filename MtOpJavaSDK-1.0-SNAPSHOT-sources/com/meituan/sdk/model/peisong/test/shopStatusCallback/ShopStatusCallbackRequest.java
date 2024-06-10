package com.meituan.sdk.model.peisong.test.shopStatusCallback;

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
* 模拟门店状态回调测试
* This file was automatically generated.
*/
@ApiMeta(
    path = "/peisong/test/shopStatusCallback",
    businessId = 19,
    apiVersion = "10003",
    apiName = "shop_status_callback",
    needAuth = false
)
public class ShopStatusCallbackRequest implements MeituanRequest<Void> {
    /**
    * 取货门店id，即合作方向美团提供的门店id
    */
    @NotBlank(message = "shopId不能为空")
    @SerializedName("shop_id")
    private String shopId;
    /**
    * 10-审核驳回  20-审核通过  30-创建成功  40-上线可发单
    */
    @NotNull(message = "status不能为空")
    @SerializedName("status")
    private Integer status;

    public String getShopId() {
        return shopId;
    }
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
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
        return "ShopStatusCallbackRequest{" + "shopId=" + shopId + "," + "status=" + status + "}";
    }
}
