package com.meituan.sdk.model.wmoperNg.poiop.poiUpdatepromoteinfo;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 更改门店公告信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/poiop/poi/updatepromoteinfo",
    businessId = 16,
    apiVersion = "10002",
    apiName = "poi_updatepromoteinfo",
    needAuth = true
)
public class PoiUpdatepromoteinfoRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">门店公告信息</font></span></p>
    */
    @NotBlank(message = "promotionInfo不能为空")
    @SerializedName("promotion_info")
    private String promotionInfo;

    public String getPromotionInfo() {
        return promotionInfo;
    }
    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
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
        return "PoiUpdatepromoteinfoRequest{" + "promotionInfo=" + promotionInfo + "}";
    }
}
