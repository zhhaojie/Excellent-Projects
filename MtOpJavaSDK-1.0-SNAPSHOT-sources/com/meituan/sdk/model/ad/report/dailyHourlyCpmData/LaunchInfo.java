package com.meituan.sdk.model.ad.report.dailyHourlyCpmData;

import com.google.gson.annotations.SerializedName;

/**
* 对象列表
* This file was automatically generated.
*/
public class LaunchInfo {
    /**
    * 日期
    */
    @SerializedName("date")
    private String date;
    /**
    * 小时
    */
    @SerializedName("hour")
    private Integer hour;
    /**
    * 查询元素id
    */
    @SerializedName("id")
    private Integer id;
    /**
    * 查询元素名称
    */
    @SerializedName("name")
    private String name;
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
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
        return "LaunchInfo{" + "date=" + date + "," + "hour=" + hour + "," + "id=" + id + "," + "name=" + name + "," + "charge=" + charge + "," + "imp=" + imp + "," + "click=" + click + "}";
    }
}
