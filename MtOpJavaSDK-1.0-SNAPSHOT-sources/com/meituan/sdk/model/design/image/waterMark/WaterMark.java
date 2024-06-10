package com.meituan.sdk.model.design.image.waterMark;

import com.google.gson.annotations.SerializedName;

/**
* 水印标签列表
* This file was automatically generated.
*/
public class WaterMark {
    /**
    * 水印坐标
    */
    @SerializedName("x0")
    private Integer x0;
    /**
    * 水印坐标
    */
    @SerializedName("y0")
    private Integer y0;
    /**
    * 水印坐标
    */
    @SerializedName("x1")
    private Integer x1;
    /**
    * 水印坐标
    */
    @SerializedName("y1")
    private Integer y1;
    /**
    * 标签
    */
    @SerializedName("label")
    private String label;
    /**
    * 置信度得分
    */
    @SerializedName("score")
    private String score;

    public Integer getX0() {
        return x0;
    }
    public void setX0(Integer x0) {
        this.x0 = x0;
    }
    public Integer getY0() {
        return y0;
    }
    public void setY0(Integer y0) {
        this.y0 = y0;
    }
    public Integer getX1() {
        return x1;
    }
    public void setX1(Integer x1) {
        this.x1 = x1;
    }
    public Integer getY1() {
        return y1;
    }
    public void setY1(Integer y1) {
        this.y1 = y1;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }




    @Override
    public String toString() {
        return "WaterMark{" + "x0=" + x0 + "," + "y0=" + y0 + "," + "x1=" + x1 + "," + "y1=" + y1 + "," + "label=" + label + "," + "score=" + score + "}";
    }
}
