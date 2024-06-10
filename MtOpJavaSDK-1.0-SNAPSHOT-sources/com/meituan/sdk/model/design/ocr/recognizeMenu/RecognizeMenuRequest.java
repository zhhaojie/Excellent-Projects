package com.meituan.sdk.model.design.ocr.recognizeMenu;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 菜单OCR识别 识别并结构化输出菜单图片中的菜名、价格和单位。
* This file was automatically generated.
*/
@ApiMeta(
    path = "/design/ocr/recognizeMenu",
    businessId = 24,
    apiVersion = "10004",
    apiName = "recognize_menu",
    needAuth = false
)
public class RecognizeMenuRequest implements MeituanRequest<RecognizeMenuResponse> {
    /**
    * <p>图片二进制流，使用Base64编码 </p><p>图片格式：JPG(JPEG)，PNG </p><p>图片像素尺寸：最小48*48像素，最大4096*4096像素 </p><p>图片文件大小：最大 5MB</p>
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
    public MeituanResponse<RecognizeMenuResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<RecognizeMenuResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "RecognizeMenuRequest{" + "content=" + content + "}";
    }
}
