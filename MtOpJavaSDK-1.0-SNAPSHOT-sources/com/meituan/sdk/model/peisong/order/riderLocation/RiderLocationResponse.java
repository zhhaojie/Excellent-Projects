package com.meituan.sdk.model.peisong.order.riderLocation;

import com.google.gson.annotations.SerializedName;

/**
* 获取骑手当前位置
* This file was automatically generated.
*/
public class RiderLocationResponse {
    /**
    * 纬度
    */
    @SerializedName("lat")
    private Integer lat;
    /**
    * 经度
    */
    @SerializedName("lng")
    private String lng;

    public Integer getLat() {
        return lat;
    }
    public void setLat(Integer lat) {
        this.lat = lat;
    }
    public String getLng() {
        return lng;
    }
    public void setLng(String lng) {
        this.lng = lng;
    }




    @Override
    public String toString() {
        return "RiderLocationResponse{" + "lat=" + lat + "," + "lng=" + lng + "}";
    }
}
