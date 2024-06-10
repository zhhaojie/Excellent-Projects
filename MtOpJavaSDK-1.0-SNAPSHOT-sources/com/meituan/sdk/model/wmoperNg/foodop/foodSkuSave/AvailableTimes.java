package com.meituan.sdk.model.wmoperNg.foodop.foodSkuSave;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* sku起售时间，要保证不同时间段之间不存在交集
* This file was automatically generated.
*/
public class AvailableTimes {
    /**
    * 周一
    */
    @NotBlank(message = "monday不能为空")
    @SerializedName("monday")
    private String monday;
    /**
    * 周二
    */
    @NotBlank(message = "tuesday不能为空")
    @SerializedName("tuesday")
    private String tuesday;
    /**
    * 周三
    */
    @NotBlank(message = "wednesday不能为空")
    @SerializedName("wednesday")
    private String wednesday;
    /**
    * 周四
    */
    @NotBlank(message = "thursday不能为空")
    @SerializedName("thursday")
    private String thursday;
    /**
    * 周五
    */
    @NotBlank(message = "friday不能为空")
    @SerializedName("friday")
    private String friday;
    /**
    * 周六
    */
    @NotBlank(message = "saturday不能为空")
    @SerializedName("saturday")
    private String saturday;
    /**
    * 周日
    */
    @NotBlank(message = "sunday不能为空")
    @SerializedName("sunday")
    private String sunday;

    public String getMonday() {
        return monday;
    }
    public void setMonday(String monday) {
        this.monday = monday;
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
    public String getThursday() {
        return thursday;
    }
    public void setThursday(String thursday) {
        this.thursday = thursday;
    }
    public String getFriday() {
        return friday;
    }
    public void setFriday(String friday) {
        this.friday = friday;
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




    @Override
    public String toString() {
        return "AvailableTimes{" + "monday=" + monday + "," + "tuesday=" + tuesday + "," + "wednesday=" + wednesday + "," + "thursday=" + thursday + "," + "friday=" + friday + "," + "saturday=" + saturday + "," + "sunday=" + sunday + "}";
    }
}
