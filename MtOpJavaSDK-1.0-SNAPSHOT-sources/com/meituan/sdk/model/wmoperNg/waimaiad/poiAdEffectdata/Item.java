package com.meituan.sdk.model.wmoperNg.waimaiad.poiAdEffectdata;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class Item {
    @SerializedName("dt")
    private Long dt;
    @SerializedName("data")
    private List<Prop> data;

    public Long getDt() {
        return dt;
    }
    public void setDt(Long dt) {
        this.dt = dt;
    }
    public List<Prop> getData() {
        return data;
    }
    public void setData(List<Prop> data) {
        this.data = data;
    }




    @Override
    public String toString() {
        return "Item{" + "dt=" + dt + "," + "data=" + data + "}";
    }
}
