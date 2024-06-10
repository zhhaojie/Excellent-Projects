package com.meituan.sdk.model.design.image.mattingPredict;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 智能抠图服务 可指定对菜品或商品进行智能抠图，并返回指定物品结果图片
* This file was automatically generated.
*/
@ApiMeta(
    path = "/design/image/mattingPredict",
    businessId = 24,
    apiVersion = "10020",
    apiName = "matting_predict",
    needAuth = false
)
public class MattingPredictRequest implements MeituanRequest<MattingPredictResponse> {
    /**
    * 图片二进制流，使用Base64编码 图片格式：JPG(JPEG)，PNG 图片像素尺寸：最小48*48像素，最大4096*4096像素 图片文件大小：最大 5MB
    */
    @NotBlank(message = "content不能为空")
    @SerializedName("content")
    private String content;
    /**
    * 1:菜品抠图  2:商品抠图
    */
    @NotNull(message = "type不能为空")
    @SerializedName("type")
    private Integer type;

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }


    @Override
    public MeituanResponse<MattingPredictResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<MattingPredictResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "MattingPredictRequest{" + "content=" + content + "," + "type=" + type + "}";
    }
}
