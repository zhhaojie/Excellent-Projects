package com.meituan.sdk.model.wmoperNg.waimaiad.peerAdEffectdata;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class Data {
    @NotNull(message = "dt不能为空")
    @SerializedName("dt")
    private Long dt;
    @NotBlank(message = "show不能为空")
    @SerializedName("show")
    private String show;
    @NotBlank(message = "click不能为空")
    @SerializedName("click")
    private String click;

    public Long getDt() {
        return dt;
    }
    public void setDt(Long dt) {
        this.dt = dt;
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
        return "Data{" + "dt=" + dt + "," + "show=" + show + "," + "click=" + click + "}";
    }
}
