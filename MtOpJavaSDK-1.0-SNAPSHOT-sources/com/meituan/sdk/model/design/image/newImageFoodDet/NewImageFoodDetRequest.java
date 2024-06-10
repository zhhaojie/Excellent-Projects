package com.meituan.sdk.model.design.image.newImageFoodDet;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 菜品主体检测
* This file was automatically generated.
*/
@ApiMeta(
    path = "/design/image/newFoodDet",
    businessId = 24,
    apiVersion = "10025",
    apiName = "new_image_food_det",
    needAuth = false
)
public class NewImageFoodDetRequest implements MeituanRequest<NewImageFoodDetResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">图片二进制流，使用Base64编码 图片格式：JPG(JPEG)，PNG 图片像素尺寸：最小48*48像素，最大4096*4096像素 图片文件大小：最大 10MB</font></span></p>
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
    public MeituanResponse<NewImageFoodDetResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<NewImageFoodDetResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "NewImageFoodDetRequest{" + "content=" + content + "}";
    }
}
