package com.meituan.sdk.model.wmoperNg.foodop.wmoperngImageUploadNoWater;

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
* 上传无水印图片
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/foodop/image/uploadNoWater",
    businessId = 16,
    apiVersion = "10008",
    apiName = "wmoperng_image_upload_no_water",
    needAuth = true
)
public class WmoperngImageUploadNoWaterRequest implements MeituanRequest<WmoperngImageUploadNoWaterResponse> {
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
    /**
    * <p>图片类型：1.海报，2.招牌，3.安心卡</p>
    */
    @NotNull(message = "picType不能为空")
    @SerializedName("pic_type")
    private Integer picType;

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
    public Integer getPicType() {
        return picType;
    }
    public void setPicType(Integer picType) {
        this.picType = picType;
    }


    @Override
    public MeituanResponse<WmoperngImageUploadNoWaterResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WmoperngImageUploadNoWaterResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "WmoperngImageUploadNoWaterRequest{" + "imgName=" + imgName + "," + "img=" + img + "," + "picType=" + picType + "}";
    }
}
