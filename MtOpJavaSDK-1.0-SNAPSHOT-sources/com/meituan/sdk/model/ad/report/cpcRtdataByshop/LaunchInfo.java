package com.meituan.sdk.model.ad.report.cpcRtdataByshop;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class LaunchInfo {
    /**
    * 天
    */
    @SerializedName("date")
    private String date;
    /**
    * 门店名字
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
    private String click;

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
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
    public String getClick() {
        return click;
    }
    public void setClick(String click) {
        this.click = click;
    }




    @Override
    public String toString() {
        return "LaunchInfo{" + "date=" + date + "," + "shopName=" + shopName + "," + "charge=" + charge + "," + "imp=" + imp + "," + "click=" + click + "}";
    }
}
