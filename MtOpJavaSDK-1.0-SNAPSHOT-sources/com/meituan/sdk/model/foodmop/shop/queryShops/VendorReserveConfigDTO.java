package com.meituan.sdk.model.foodmop.shop.queryShops;

import com.google.gson.annotations.SerializedName;

/**
* 预约配置
* This file was automatically generated.
*/
public class VendorReserveConfigDTO {
    /**
    * 是否支持预约，参数值：  TRUE- 支持预约  FALSE- 不支持预约
    */
    @SerializedName("mopReserveOpen")
    private String mopReserveOpen;
    /**
    * MOP可预约时间，参数值范例：  {\"1\":[{\"startTime\":\"08:00\",\"endTime\":\"20:00\"}]
    */
    @SerializedName("mopReserveHour")
    private String mopReserveHour;
    /**
    * 预约周期（单位分钟），参数值范例：  5 （ 配置5min，则每小时的0,5,10, ... ）
    */
    @SerializedName("mopReservePeriod")
    private String mopReservePeriod;
    /**
    * 距离现在的最早可预约时间分钟数（单位分钟）,参数值范例  10
    */
    @SerializedName("earliesReserveTimeFromNowByMinutes")
    private String earliesReserveTimeFromNowByMinutes;
    /**
    * 距离现在的最晚可预约时间分钟数（单位分钟），参数值范例  100
    */
    @SerializedName("latestReserveTimeFromNowByMinutes")
    private String latestReserveTimeFromNowByMinutes;

    public String getMopReserveOpen() {
        return mopReserveOpen;
    }
    public void setMopReserveOpen(String mopReserveOpen) {
        this.mopReserveOpen = mopReserveOpen;
    }
    public String getMopReserveHour() {
        return mopReserveHour;
    }
    public void setMopReserveHour(String mopReserveHour) {
        this.mopReserveHour = mopReserveHour;
    }
    public String getMopReservePeriod() {
        return mopReservePeriod;
    }
    public void setMopReservePeriod(String mopReservePeriod) {
        this.mopReservePeriod = mopReservePeriod;
    }
    public String getEarliesReserveTimeFromNowByMinutes() {
        return earliesReserveTimeFromNowByMinutes;
    }
    public void setEarliesReserveTimeFromNowByMinutes(String earliesReserveTimeFromNowByMinutes) {
        this.earliesReserveTimeFromNowByMinutes = earliesReserveTimeFromNowByMinutes;
    }
    public String getLatestReserveTimeFromNowByMinutes() {
        return latestReserveTimeFromNowByMinutes;
    }
    public void setLatestReserveTimeFromNowByMinutes(String latestReserveTimeFromNowByMinutes) {
        this.latestReserveTimeFromNowByMinutes = latestReserveTimeFromNowByMinutes;
    }




    @Override
    public String toString() {
        return "VendorReserveConfigDTO{" + "mopReserveOpen=" + mopReserveOpen + "," + "mopReserveHour=" + mopReserveHour + "," + "mopReservePeriod=" + mopReservePeriod + "," + "earliesReserveTimeFromNowByMinutes=" + earliesReserveTimeFromNowByMinutes + "," + "latestReserveTimeFromNowByMinutes=" + latestReserveTimeFromNowByMinutes + "}";
    }
}
