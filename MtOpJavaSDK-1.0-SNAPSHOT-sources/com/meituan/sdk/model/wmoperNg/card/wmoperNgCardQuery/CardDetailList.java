package com.meituan.sdk.model.wmoperNg.card.wmoperNgCardQuery;

import com.google.gson.annotations.SerializedName;

/**
* 安心卡内容详情。当syncOpenReceipt\u003d1，即把安心卡信息同步打印小票时， 必须将此信息随小票打印
* This file was automatically generated.
*/
public class CardDetailList {
    /**
    * 岗位
    */
    @SerializedName("job")
    private String job;
    /**
    * 姓名
    */
    @SerializedName("name")
    private String name;
    /**
    * 体温。格式为 xx.x，只能一位小数
    */
    @SerializedName("temperature")
    private String temperature;

    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTemperature() {
        return temperature;
    }
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }




    @Override
    public String toString() {
        return "CardDetailList{" + "job=" + job + "," + "name=" + name + "," + "temperature=" + temperature + "}";
    }
}
