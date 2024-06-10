package com.meituan.sdk.model.design.image.newImageFoodDet;

import com.google.gson.annotations.SerializedName;

/**
* 菜品主体检测
* This file was automatically generated.
*/
public class NewImageFoodDetResponse {
    @SerializedName("detect")
    private String detect;

    public String getDetect() {
        return detect;
    }
    public void setDetect(String detect) {
        this.detect = detect;
    }




    @Override
    public String toString() {
        return "NewImageFoodDetResponse{" + "detect=" + detect + "}";
    }
}
