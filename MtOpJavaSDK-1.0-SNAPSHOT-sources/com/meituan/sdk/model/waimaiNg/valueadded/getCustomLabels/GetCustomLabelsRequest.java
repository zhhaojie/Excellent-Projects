package com.meituan.sdk.model.waimaiNg.valueadded.getCustomLabels;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 获取自定义标签
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/valueadded/getCustomLabels",
    businessId = 2,
    apiVersion = "10017",
    apiName = "get_custom_labels",
    needAuth = true
)
public class GetCustomLabelsRequest implements MeituanRequest<List<LableResponse>> {
    /**
    * <p><span style="color: rgb(51, 51, 51)"><font style="font-size:14px;line-height:22px" data-size="14">版本号。1.0老数据，2.0新数据</font></span></p>
    */
    @SerializedName("version")
    private String version;

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }


    @Override
    public MeituanResponse<List<LableResponse>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<LableResponse>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GetCustomLabelsRequest{" + "version=" + version + "}";
    }
}
