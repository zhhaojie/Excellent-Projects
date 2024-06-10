package com.meituan.sdk.model.ad.launch.batchEditCpcBidprice;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 修改推广出价
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/batchEditCpcBidPrice",
    businessId = 22,
    apiVersion = "10013",
    apiName = "batch_edit_cpc_bidprice",
    needAuth = false
)
public class BatchEditCpcBidpriceRequest implements MeituanRequest<BatchEditCpcBidpriceResponse> {
    /**
    * 批量修改出价,单次最对支持50个
    */
    @NotBlank(message = "launchs不能为空")
    @SerializedName("launchs")
    private String launchs;
    /**
    * <p>子账号</p>
    */
    @SerializedName("sonAdaccountId")
    private Integer sonAdaccountId;

    public String getLaunchs() {
        return launchs;
    }
    public void setLaunchs(String launchs) {
        this.launchs = launchs;
    }
    public Integer getSonAdaccountId() {
        return sonAdaccountId;
    }
    public void setSonAdaccountId(Integer sonAdaccountId) {
        this.sonAdaccountId = sonAdaccountId;
    }


    @Override
    public MeituanResponse<BatchEditCpcBidpriceResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<BatchEditCpcBidpriceResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "BatchEditCpcBidpriceRequest{" + "launchs=" + launchs + "," + "sonAdaccountId=" + sonAdaccountId + "}";
    }
}
