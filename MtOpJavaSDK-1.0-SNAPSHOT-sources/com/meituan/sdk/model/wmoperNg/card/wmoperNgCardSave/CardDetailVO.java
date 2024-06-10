package com.meituan.sdk.model.wmoperNg.card.wmoperNgCardSave;

import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-e676f862-786d-403f-a59d-1510c6e0a6f8"><span style="color: rgba(0, 0, 0, 0.65)">安心卡内容详情：当syncIM=1 或者 syncOpenReceipt=1 或者 syncPost=1 时，安心卡内容详情的人员信息不能为空</span></p>
* This file was automatically generated.
*/
public class CardDetailVO {
    /**
    * <p data-diff-id="ct-diff-id-7ab19f73-ecac-4d1b-b934-be582256141b"><span style="color: rgba(0, 0, 0, 0.65)">岗位</span></p>
    */
    @SerializedName("job")
    private String job;
    /**
    * <p data-diff-id="ct-diff-id-be17056c-a852-48a8-8c43-43f692adf340"><span style="color: rgba(0, 0, 0, 0.65)">姓名</span></p>
    */
    @SerializedName("name")
    private String name;
    /**
    * <p data-diff-id="ct-diff-id-8eff37cb-0764-4c58-844e-d9f5388ff37b"><span style="color: rgba(0, 0, 0, 0.65)">体温，格式为 xx.x，只能一位小数</span></p>
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
        return "CardDetailVO{" + "job=" + job + "," + "name=" + name + "," + "temperature=" + temperature + "}";
    }
}
