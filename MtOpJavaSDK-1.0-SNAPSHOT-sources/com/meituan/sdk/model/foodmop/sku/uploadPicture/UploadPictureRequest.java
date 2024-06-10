package com.meituan.sdk.model.foodmop.sku.uploadPicture;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 图片上传（必接）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/uploadPicture",
    businessId = 51,
    apiVersion = "10004",
    apiName = "upload_picture",
    needAuth = true
)
public class UploadPictureRequest implements MeituanRequest<String> {
    /**
    * <p data-diff-id="ct-diff-id-b28b6105-610e-43e6-9c01-f69ed17d42df">图片url</p><p data-diff-id="ct-diff-id-5ec965be-5e1a-4ebc-976e-e7eadf9b35af">仅支持 https 的图片 url 链接且不能包含中文</p>
    */
    @NotBlank(message = "picUrl不能为空")
    @SerializedName("picUrl")
    private String picUrl;

    public String getPicUrl() {
        return picUrl;
    }
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
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
        return "UploadPictureRequest{" + "picUrl=" + picUrl + "}";
    }
}
