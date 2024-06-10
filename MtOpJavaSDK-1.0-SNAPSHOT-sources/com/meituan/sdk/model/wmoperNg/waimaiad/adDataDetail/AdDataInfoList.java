package com.meituan.sdk.model.wmoperNg.waimaiad.adDataDetail;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class AdDataInfoList {
    @NotBlank(message = "time不能为空")
    @SerializedName("time")
    private String time;
    @NotBlank(message = "show不能为空")
    @SerializedName("show")
    private String show;
    @NotBlank(message = "click不能为空")
    @SerializedName("click")
    private String click;
    @NotBlank(message = "debit不能为空")
    @SerializedName("debit")
    private String debit;

    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
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
    public String getDebit() {
        return debit;
    }
    public void setDebit(String debit) {
        this.debit = debit;
    }




    @Override
    public String toString() {
        return "AdDataInfoList{" + "time=" + time + "," + "show=" + show + "," + "click=" + click + "," + "debit=" + debit + "}";
    }
}
