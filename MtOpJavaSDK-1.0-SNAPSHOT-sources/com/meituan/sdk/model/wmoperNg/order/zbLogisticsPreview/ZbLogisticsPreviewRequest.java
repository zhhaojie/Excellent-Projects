package com.meituan.sdk.model.wmoperNg.order.zbLogisticsPreview;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询众包配送费
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/order/zbLogisticsPreview",
    businessId = 16,
    apiVersion = "10045",
    apiName = "zb_logistics_preview",
    needAuth = true
)
public class ZbLogisticsPreviewRequest implements MeituanRequest<ZbLogisticsPreviewResponse> {
    /**
    * <p>订单ID</p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">跑腿配送服务品牌</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">1003-美团跑腿经济送；2011-美团跑腿蛋糕送。</font></span></p>
    */
    @SerializedName("logisticsCode")
    private String logisticsCode;
    /**
    * <p data-diff-id="ct-diff-id-492f1021-4df0-43de-9124-82221a278440">当传递true时会返回对应可使用的权益列表。</p>
    */
    @SerializedName("recommendRights")
    private Boolean recommendRights;

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public String getLogisticsCode() {
        return logisticsCode;
    }
    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }
    public Boolean getRecommendRights() {
        return recommendRights;
    }
    public void setRecommendRights(Boolean recommendRights) {
        this.recommendRights = recommendRights;
    }


    @Override
    public MeituanResponse<ZbLogisticsPreviewResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<ZbLogisticsPreviewResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "ZbLogisticsPreviewRequest{" + "orderId=" + orderId + "," + "logisticsCode=" + logisticsCode + "," + "recommendRights=" + recommendRights + "}";
    }
}
