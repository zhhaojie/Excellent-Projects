package com.meituan.sdk.model.wmoperNg.waimaiad.poipeerAdEffectdata;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class NewUserClickRate {
    @NotNull(message = "dt不能为空")
    @SerializedName("dt")
    private Long dt;
    @NotBlank(message = "poi不能为空")
    @SerializedName("poi")
    private String poi;
    @NotBlank(message = "peer不能为空")
    @SerializedName("peer")
    private String peer;

    public Long getDt() {
        return dt;
    }
    public void setDt(Long dt) {
        this.dt = dt;
    }
    public String getPoi() {
        return poi;
    }
    public void setPoi(String poi) {
        this.poi = poi;
    }
    public String getPeer() {
        return peer;
    }
    public void setPeer(String peer) {
        this.peer = peer;
    }




    @Override
    public String toString() {
        return "NewUserClickRate{" + "dt=" + dt + "," + "poi=" + poi + "," + "peer=" + peer + "}";
    }
}
