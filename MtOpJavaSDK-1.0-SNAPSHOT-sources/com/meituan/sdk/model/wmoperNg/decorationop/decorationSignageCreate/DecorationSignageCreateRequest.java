package com.meituan.sdk.model.wmoperNg.decorationop.decorationSignageCreate;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 商家开放平台创建招牌
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/decorationop/signageCreate",
    businessId = 16,
    apiVersion = "10000",
    apiName = "decoration_signage_create",
    needAuth = true
)
public class DecorationSignageCreateRequest implements MeituanRequest<Boolean> {
    /**
    * <p>epoiId门店列表，通过英文逗号分隔</p>
    */
    @NotBlank(message = "poiIds不能为空")
    @SerializedName("poiIds")
    private String poiIds;
    /**
    * <p>图片code，服务商可通过接口【上传无水印照片】获取</p>
    */
    @NotBlank(message = "picCode不能为空")
    @SerializedName("pic_code")
    private String picCode;

    public String getPoiIds() {
        return poiIds;
    }
    public void setPoiIds(String poiIds) {
        this.poiIds = poiIds;
    }
    public String getPicCode() {
        return picCode;
    }
    public void setPicCode(String picCode) {
        this.picCode = picCode;
    }


    @Override
    public MeituanResponse<Boolean> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<Boolean>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "DecorationSignageCreateRequest{" + "poiIds=" + poiIds + "," + "picCode=" + picCode + "}";
    }
}
