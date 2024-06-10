package com.meituan.sdk.model.design.document.foodTextCheck;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 菜品标题诊断
* This file was automatically generated.
*/
@ApiMeta(
    path = "/design/document/foodTextCheck",
    businessId = 24,
    apiVersion = "10005",
    apiName = "food_text_check",
    needAuth = false
)
public class FoodTextCheckRequest implements MeituanRequest<FoodTextCheckResponse> {
    /**
    * 需要诊断的内容（菜名或者菜品描述）
    */
    @NotBlank(message = "text不能为空")
    @SerializedName("text")
    private String text;
    /**
    * <p>0：菜名诊断</p><p>1：菜品描述诊断</p>
    */
    @NotBlank(message = "type不能为空")
    @SerializedName("type")
    private String type;

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }


    @Override
    public MeituanResponse<FoodTextCheckResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<FoodTextCheckResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "FoodTextCheckRequest{" + "text=" + text + "," + "type=" + type + "}";
    }
}
