package com.meituan.sdk.model.wmoperNg.poi.getPoiScoreDetail;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class ExtraFields {
    @NotBlank(message = "hoverTextPcUrl不能为空")
    @SerializedName("hoverTextPcUrl")
    private String hoverTextPcUrl;
    @NotBlank(message = "hoverBold不能为空")
    @SerializedName("hoverBold")
    private String hoverBold;
    /**
    * hover文本描述
    */
    @SerializedName("hoverText")
    private String hoverText;
    @NotBlank(message = "hoverTextAppUrl不能为空")
    @SerializedName("hoverTextAppUrl")
    private String hoverTextAppUrl;
    /**
    * 占比
    */
    @SerializedName("hoverTextWeight")
    private String hoverTextWeight;

    public String getHoverTextPcUrl() {
        return hoverTextPcUrl;
    }
    public void setHoverTextPcUrl(String hoverTextPcUrl) {
        this.hoverTextPcUrl = hoverTextPcUrl;
    }
    public String getHoverBold() {
        return hoverBold;
    }
    public void setHoverBold(String hoverBold) {
        this.hoverBold = hoverBold;
    }
    public String getHoverText() {
        return hoverText;
    }
    public void setHoverText(String hoverText) {
        this.hoverText = hoverText;
    }
    public String getHoverTextAppUrl() {
        return hoverTextAppUrl;
    }
    public void setHoverTextAppUrl(String hoverTextAppUrl) {
        this.hoverTextAppUrl = hoverTextAppUrl;
    }
    public String getHoverTextWeight() {
        return hoverTextWeight;
    }
    public void setHoverTextWeight(String hoverTextWeight) {
        this.hoverTextWeight = hoverTextWeight;
    }




    @Override
    public String toString() {
        return "ExtraFields{" + "hoverTextPcUrl=" + hoverTextPcUrl + "," + "hoverBold=" + hoverBold + "," + "hoverText=" + hoverText + "," + "hoverTextAppUrl=" + hoverTextAppUrl + "," + "hoverTextWeight=" + hoverTextWeight + "}";
    }
}
