package com.meituan.sdk.model.wmoperNg.card.wmoperUploadCardImage;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 上传安心卡图片
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/card/uploadCardImage",
    businessId = 16,
    apiVersion = "10000",
    apiName = "wmoper_upload_card_image",
    needAuth = true
)
public class WmoperUploadCardImageRequest implements MeituanRequest<WmoperUploadCardImageResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">图片名称。图片名称必须以.jpg或.png或.jpeg结尾</font></span></p>
    */
    @NotBlank(message = "imageName不能为空")
    @SerializedName("imageName")
    private String imageName;
    /**
    * <p>Base64格式图片内容。</p>
    */
    @NotBlank(message = "file不能为空")
    @SerializedName("file")
    private String file;

    public String getImageName() {
        return imageName;
    }
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
    public String getFile() {
        return file;
    }
    public void setFile(String file) {
        this.file = file;
    }


    @Override
    public MeituanResponse<WmoperUploadCardImageResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WmoperUploadCardImageResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "WmoperUploadCardImageRequest{" + "imageName=" + imageName + "," + "file=" + file + "}";
    }
}
