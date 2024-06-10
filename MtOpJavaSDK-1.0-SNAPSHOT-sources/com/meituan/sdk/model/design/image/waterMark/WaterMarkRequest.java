package com.meituan.sdk.model.design.image.waterMark;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 通用水印/文字涂鸦识别接口
* This file was automatically generated.
*/
@ApiMeta(
    path = "/design/image/waterMark",
    businessId = 24,
    apiVersion = "10022",
    apiName = "water_mark",
    needAuth = false
)
public class WaterMarkRequest implements MeituanRequest<List<WaterMark>> {
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
    public MeituanResponse<List<WaterMark>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<WaterMark>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "WaterMarkRequest{" + "content=" + content + "}";
    }
}
