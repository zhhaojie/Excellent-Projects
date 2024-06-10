package com.meituan.sdk.model.design.image.imageWatermarkRemove;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* 水印位置列表
* This file was automatically generated.
*/
public class Rects {
    /**
    * x0, y0 是左上角坐标
    */
    @NotBlank(message = "x0不能为空")
    @SerializedName("x0")
    private String x0;
    /**
    * x0, y0 是左上角坐标
    */
    @NotBlank(message = "y0不能为空")
    @SerializedName("y0")
    private String y0;
    /**
    * x1, y1 是右下角坐标
    */
    @NotBlank(message = "x1不能为空")
    @SerializedName("x1")
    private String x1;
    /**
    * x1, y1 是右下角坐标
    */
    @NotBlank(message = "y1不能为空")
    @SerializedName("y1")
    private String y1;

    public String getX0() {
        return x0;
    }
    public void setX0(String x0) {
        this.x0 = x0;
    }
    public String getY0() {
        return y0;
    }
    public void setY0(String y0) {
        this.y0 = y0;
    }
    public String getX1() {
        return x1;
    }
    public void setX1(String x1) {
        this.x1 = x1;
    }
    public String getY1() {
        return y1;
    }
    public void setY1(String y1) {
        this.y1 = y1;
    }




    @Override
    public String toString() {
        return "Rects{" + "x0=" + x0 + "," + "y0=" + y0 + "," + "x1=" + x1 + "," + "y1=" + y1 + "}";
    }
}
