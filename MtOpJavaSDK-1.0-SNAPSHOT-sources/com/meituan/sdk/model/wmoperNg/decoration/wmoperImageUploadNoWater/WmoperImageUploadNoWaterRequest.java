package com.meituan.sdk.model.wmoperNg.decoration.wmoperImageUploadNoWater;

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
* 上传门店装修图片
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/image/uploadNoWater",
    businessId = 16,
    apiVersion = "10004",
    apiName = "wmoper_image_upload_no_water",
    needAuth = true
)
public class WmoperImageUploadNoWaterRequest implements MeituanRequest<WmoperImageUploadNoWaterResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">图片名称 文件名只能是字母或数字,且必须以.jpg结尾</font></span></p>
    */
    @NotBlank(message = "imageName不能为空")
    @SerializedName("imageName")
    private String imageName;
    /**
    * <p>Base64格式的图片字符串。</p>
    */
    @NotBlank(message = "file不能为空")
    @SerializedName("file")
    private String file;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">图片类型。1海报，2招牌，3安心卡</font></span></p>
    */
    @NotNull(message = "picType不能为空")
    @SerializedName("picType")
    private Integer picType;

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
    public Integer getPicType() {
        return picType;
    }
    public void setPicType(Integer picType) {
        this.picType = picType;
    }


    @Override
    public MeituanResponse<WmoperImageUploadNoWaterResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WmoperImageUploadNoWaterResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "WmoperImageUploadNoWaterRequest{" + "imageName=" + imageName + "," + "file=" + file + "," + "picType=" + picType + "}";
    }
}
