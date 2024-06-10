package com.meituan.sdk.model.waimaiNg.kaidian.waimaiKaidianBizsettle;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 获取美团外卖开店绿色通道链接地址
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/kaidian/bizsettle",
    businessId = 2,
    apiVersion = "10002",
    apiName = "waimai_kaidian_bizsettle",
    needAuth = false
)
public class WaimaiKaidianBizsettleRequest implements MeituanRequest<WaimaiKaidianBizsettleResponse> {
    @SerializedName("developerId")
    private Long developerId;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">服务商门店id</font></span></p>
    */
    @NotBlank(message = "ePoiId不能为空")
    @SerializedName("ePoiId")
    private String ePoiId;

    public Long getDeveloperId() {
        return developerId;
    }
    public void setDeveloperId(Long developerId) {
        this.developerId = developerId;
    }
    public String getEPoiId() {
        return ePoiId;
    }
    public void setEPoiId(String ePoiId) {
        this.ePoiId = ePoiId;
    }


    @Override
    public MeituanResponse<WaimaiKaidianBizsettleResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WaimaiKaidianBizsettleResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "WaimaiKaidianBizsettleRequest{" + "developerId=" + developerId + "," + "ePoiId=" + ePoiId + "}";
    }
}
