package com.meituan.sdk.model.wmoperNg.waimaiad.poiAdEffectdata;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class Prop {
    @SerializedName("flowProp")
    private Integer flowProp;
    @SerializedName("pos")
    private String pos;
    @SerializedName("show")
    private String show;
    @SerializedName("click")
    private String click;

    public Integer getFlowProp() {
        return flowProp;
    }
    public void setFlowProp(Integer flowProp) {
        this.flowProp = flowProp;
    }
    public String getPos() {
        return pos;
    }
    public void setPos(String pos) {
        this.pos = pos;
    }
    public String getShow() {
        return show;
    }
    public void setShow(String show) {
        this.show = show;
    }
    public String getClick() {
        return click;
    }
    public void setClick(String click) {
        this.click = click;
    }




    @Override
    public String toString() {
        return "Prop{" + "flowProp=" + flowProp + "," + "pos=" + pos + "," + "show=" + show + "," + "click=" + click + "}";
    }
}
