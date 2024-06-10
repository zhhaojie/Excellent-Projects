package com.meituan.sdk.model.waimaiNg.card.saveCard;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* 安心卡内容详情：当syncIM=1 或者 syncOpenReceipt=1 或者 syncPost=1 时，安心卡内容详情的人员信息不能为空
* This file was automatically generated.
*/
public class CardDetailList {
    /**
    * 岗位
    */
    @NotBlank(message = "job不能为空")
    @SerializedName("job")
    private String job;
    /**
    * 姓名
    */
    @NotBlank(message = "name不能为空")
    @SerializedName("name")
    private String name;
    /**
    * 体温，格式为 xx.x，只能一位小数
    */
    @NotBlank(message = "temperature不能为空")
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
