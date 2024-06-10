package com.meituan.sdk.model.design.image.imageWatermarkRemove;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;
import javax.validation.constraints.NotEmpty;

/**
* 通用图像去水印
* This file was automatically generated.
*/
@ApiMeta(
    path = "/design/image/waterMarkRemove",
    businessId = 24,
    apiVersion = "10020",
    apiName = "image_watermark_remove",
    needAuth = false
)
public class ImageWatermarkRemoveRequest implements MeituanRequest<ImageWatermarkRemoveResponse> {
    /**
    * 图片二进制流，使用Base64编码 图片格式：JPG(JPEG)，PNG 图片像素尺寸：最小48*48像素，最大4096*4096像素 图片文件大小：最大 5MB
    */
    @NotBlank(message = "content不能为空")
    @SerializedName("content")
    private String content;
    /**
    * 水印位置列表
    */
    @NotEmpty(message = "rects不能为空")
    @SerializedName("rects")
    private List<Rects> rects;

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public List<Rects> getRects() {
        return rects;
    }
    public void setRects(List<Rects> rects) {
        this.rects = rects;
    }


    @Override
    public MeituanResponse<ImageWatermarkRemoveResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<ImageWatermarkRemoveResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "ImageWatermarkRemoveRequest{" + "content=" + content + "," + "rects=" + rects + "}";
    }
}
