package com.meituan.sdk.model.design.image.imageFilter;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 图片添加滤镜效果，对图片整体进行定制化色彩调整。
* This file was automatically generated.
*/
@ApiMeta(
    path = "/design/image/filter",
    businessId = 24,
    apiVersion = "10019",
    apiName = "image_filter",
    needAuth = false
)
public class ImageFilterRequest implements MeituanRequest<ImageFilterResponse> {
    /**
    * 图片二进制流，使用Base64编码 图片格式：JPG(JPEG)，PNG 图片像素尺寸：最小48*48像素，最大4096*4096像素 图片文件大小：最大 5MB
    */
    @NotBlank(message = "content不能为空")
    @SerializedName("content")
    private String content;

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public MeituanResponse<ImageFilterResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<ImageFilterResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "ImageFilterRequest{" + "content=" + content + "}";
    }
}
