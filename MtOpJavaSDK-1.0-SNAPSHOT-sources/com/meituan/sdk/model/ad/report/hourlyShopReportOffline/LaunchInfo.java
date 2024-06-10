package com.meituan.sdk.model.ad.report.hourlyShopReportOffline;

import com.google.gson.annotations.SerializedName;

/**
* 对象列表
* This file was automatically generated.
*/
public class LaunchInfo {
    /**
    * 天数
    */
    @SerializedName("date")
    private String date;
    /**
    * 小时
    */
    @SerializedName("hour")
    private Integer hour;
    /**
    * 门店名称
    */
    @SerializedName("shop_name")
    private String shopName;
    /**
    * 花费
    */
    @SerializedName("charge")
    private Double charge;
    /**
    * 曝光
    */
    @SerializedName("imp")
    private Integer imp;
    /**
    * 点击
    */
    @SerializedName("click")
    private Integer click;

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public Integer getHour() {
        return hour;
    }
    public void setHour(Integer hour) {
        this.hour = hour;
    }
    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public Double getCharge() {
        return charge;
    }
    public void setCharge(Double charge) {
        this.charge = charge;
    }
    public Integer getImp() {
        return imp;
    }
    public void setImp(Integer imp) {
        this.imp = imp;
    }
    public Integer getClick() {
        return click;
    }
    public void setClick(Integer click) {
        this.click = click;
    }




    @Override
    public String toString() {
        return "LaunchInfo{" + "date=" + date + "," + "hour=" + hour + "," + "shopName=" + shopName + "," + "charge=" + charge + "," + "imp=" + imp + "," + "click=" + click + "}";
    }
}
