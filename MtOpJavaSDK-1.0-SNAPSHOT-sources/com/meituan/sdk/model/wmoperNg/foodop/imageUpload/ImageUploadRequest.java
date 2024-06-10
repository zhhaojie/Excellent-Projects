package com.meituan.sdk.model.wmoperNg.foodop.imageUpload;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 上传菜品图片
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/foodop/image/upload",
    businessId = 16,
    apiVersion = "10009",
    apiName = "image_upload",
    needAuth = true
)
public class ImageUploadRequest implements MeituanRequest<String> {
    /**
    * <p>图片名称</p>
    */
    @NotBlank(message = "imgName不能为空")
    @SerializedName("img_name")
    private String imgName;
    /**
    * <p>图片BASE64字符串</p>
    */
    @NotBlank(message = "img不能为空")
    @SerializedName("img")
    private String img;

    public String getImgName() {
        return imgName;
    }
    public void setImgName(String imgName) {
        this.imgName = imgName;
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
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
        return "ImageUploadRequest{" + "imgName=" + imgName + "," + "img=" + img + "}";
    }
}
