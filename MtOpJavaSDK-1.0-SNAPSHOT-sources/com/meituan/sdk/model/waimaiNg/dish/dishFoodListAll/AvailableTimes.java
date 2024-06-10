package com.meituan.sdk.model.waimaiNg.dish.dishFoodListAll;

import com.google.gson.annotations.SerializedName;

/**
* 菜品可售时间
* This file was automatically generated.
*/
public class AvailableTimes {
    /**
    * 周五
    */
    @SerializedName("friday")
    private String friday;
    /**
    * 周一
    */
    @SerializedName("monday")
    private String monday;
    /**
    * 周六
    */
    @SerializedName("saturday")
    private String saturday;
    /**
    * 周日
    */
    @SerializedName("sunday")
    private String sunday;
    /**
    * 周四
    */
    @SerializedName("thursday")
    private String thursday;
    /**
    * 周二
    */
    @SerializedName("tuesday")
    private String tuesday;
    /**
    * 周三
    */
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
