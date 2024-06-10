package com.meituan.sdk.model.ad.report.cpcRtdataByaccount;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class Data {
    /**
    * 天
    */
    @SerializedName("date")
    private String date;
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
        return "Data{" + "date=" + date + "," + "charge=" + charge + "," + "imp=" + imp + "," + "click=" + click + "}";
    }
}
