package com.meituan.sdk.model.wmoperNg.foodop.wmoperImageUpload;

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
    path = "/wmoper/image/upload",
    businessId = 16,
    apiVersion = "10028",
    apiName = "wmoper_image_upload",
    needAuth = true
)
public class WmoperImageUploadRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">图片名称。图片名称必须以.jpg或.png或.jpeg结尾</font></span></p>
    */
    @NotBlank(message = "imageName不能为空")
    @SerializedName("imageName")
    private String imageName;
    /**
    * <p>base64字符串的文件内容。</p>
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
        return "WmoperImageUploadRequest{" + "imageName=" + imageName + "," + "file=" + file + "}";
    }
}
