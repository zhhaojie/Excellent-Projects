package com.meituan.sdk.model.wmoperNg.waimaiad.waimaiPoiInfo;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class WmPoiInfo {
    @NotBlank(message = "firstCityName不能为空")
    @SerializedName("firstCityName")
    private String firstCityName;
    @NotBlank(message = "secondCityName不能为空")
    @SerializedName("secondCityName")
    private String secondCityName;
    @NotBlank(message = "thirdCityName不能为空")
    @SerializedName("thirdCityName")
    private String thirdCityName;
    @NotBlank(message = "firstTagName不能为空")
    @SerializedName("firstTagName")
    private String firstTagName;
    @NotBlank(message = "secondTagName不能为空")
    @SerializedName("secondTagName")
    private String secondTagName;
    @NotBlank(message = "thirdTagName不能为空")
    @SerializedName("thirdTagName")
    private String thirdTagName;

    public String getFirstCityName() {
        return firstCityName;
    }
    public void setFirstCityName(String firstCityName) {
        this.firstCityName = firstCityName;
    }
    public String getSecondCityName() {
        return secondCityName;
    }
    public void setSecondCityName(String secondCityName) {
        this.secondCityName = secondCityName;
    }
    public String getThirdCityName() {
        return thirdCityName;
    }
    public void setThirdCityName(String thirdCityName) {
        this.thirdCityName = thirdCityName;
    }
    public String getFirstTagName() {
        return firstTagName;
    }
    public void setFirstTagName(String firstTagName) {
        this.firstTagName = firstTagName;
    }
    public String getSecondTagName() {
        return secondTagName;
    }
    public void setSecondTagName(String secondTagName) {
        this.secondTagName = secondTagName;
    }
    public String getThirdTagName() {
        return thirdTagName;
    }
    public void setThirdTagName(String thirdTagName) {
        this.thirdTagName = thirdTagName;
    }




    @Override
    public String toString() {
        return "WmPoiInfo{" + "firstCityName=" + firstCityName + "," + "secondCityName=" + secondCityName + "," + "thirdCityName=" + thirdCityName + "," + "firstTagName=" + firstTagName + "," + "secondTagName=" + secondTagName + "," + "thirdTagName=" + thirdTagName + "}";
    }
}
