package com.meituan.sdk.model.waimaiNg.poi.getPoiScoreDetail;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class ExtraFields {
    /**
    * 占比
    */
    @SerializedName("hoverTextWeight")
    private String hoverTextWeight;
    /**
    * hover文本描述
    */
    @SerializedName("hoverText")
    private String hoverText;

    public String getHoverTextWeight() {
        return hoverTextWeight;
    }
    public void setHoverTextWeight(String hoverTextWeight) {
        this.hoverTextWeight = hoverTextWeight;
    }
    public String getHoverText() {
        return hoverText;
    }
    public void setHoverText(String hoverText) {
        this.hoverText = hoverText;
    }




    @Override
    public String toString() {
        return "ExtraFields{" + "hoverTextWeight=" + hoverTextWeight + "," + "hoverText=" + hoverText + "}";
    }
}
