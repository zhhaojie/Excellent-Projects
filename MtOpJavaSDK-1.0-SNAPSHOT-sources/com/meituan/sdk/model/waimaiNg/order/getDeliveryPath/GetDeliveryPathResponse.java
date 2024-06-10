package com.meituan.sdk.model.waimaiNg.order.getDeliveryPath;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class GetDeliveryPathResponse {
    /**
    * 纬度
    */
    @SerializedName("latitude")
    private Long latitude;
    /**
    * 经度
    */
    @SerializedName("longitude")
    private Long longitude;
    /**
    * 信息采集时间戳
    */
    @SerializedName("time")
    private Integer time;

    public Long getLatitude() {
        return latitude;
    }
    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }
    public Long getLongitude() {
        return longitude;
    }
    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }
    public Integer getTime() {
        return time;
    }
    public void setTime(Integer time) {
        this.time = time;
    }




    @Override
    public String toString() {
        return "GetDeliveryPathResponse{" + "latitude=" + latitude + "," + "longitude=" + longitude + "," + "time=" + time + "}";
    }
}
