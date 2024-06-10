package com.meituan.sdk.model.waimaiNg.dish.dishQueryListByEpoiid;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* 配送时间， 默认门店营业时间
* This file was automatically generated.
*/
public class AvailableTimes {
    @NotBlank(message = "friday不能为空")
    @SerializedName("friday")
    private String friday;
    @NotBlank(message = "monday不能为空")
    @SerializedName("monday")
    private String monday;
    @NotBlank(message = "saturday不能为空")
    @SerializedName("saturday")
    private String saturday;
    @NotBlank(message = "sunday不能为空")
    @SerializedName("sunday")
    private String sunday;
    @NotBlank(message = "thursday不能为空")
    @SerializedName("thursday")
    private String thursday;
    @NotBlank(message = "tuesday不能为空")
    @SerializedName("tuesday")
    private String tuesday;
    @NotBlank(message = "wednesday不能为空")
    @SerializedName("wednesday")
    private String wednesday;

    public String getFriday() {
        return friday;
    }
    public void setFriday(String friday) {
        this.friday = friday;
    }
    public String getMonday() {
        return monday;
    }
    public void setMonday(String monday) {
        this.monday = monday;
    }
    public String getSaturday() {
        return saturday;
    }
    public void setSaturday(String saturday) {
        this.saturday = saturday;
    }
    public String getSunday() {
        return sunday;
    }
    public void setSunday(String sunday) {
        this.sunday = sunday;
    }
    public String getThursday() {
        return thursday;
    }
    public void setThursday(String thursday) {
        this.thursday = thursday;
    }
    public String getTuesday() {
        return tuesday;
    }
    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }
    public String getWednesday() {
        return wednesday;
    }
    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }




    @Override
    public String toString() {
        return "AvailableTimes{" + "friday=" + friday + "," + "monday=" + monday + "," + "saturday=" + saturday + "," + "sunday=" + sunday + "," + "thursday=" + thursday + "," + "tuesday=" + tuesday + "," + "wednesday=" + wednesday + "}";
    }
}
