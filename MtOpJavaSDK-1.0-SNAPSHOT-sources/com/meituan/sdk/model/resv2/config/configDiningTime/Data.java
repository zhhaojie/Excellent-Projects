package com.meituan.sdk.model.resv2.config.configDiningTime;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotEmpty;

/**
* 
* This file was automatically generated.
*/
public class Data {
    /**
    * <p data-diff-id="ct-diff-id-bb69861e-c325-476d-94d0-c7d22b291bab"><span style="color: rgb(36, 41, 46)">星期</span></p>
    */
    @NotEmpty(message = "weeks不能为空")
    @SerializedName("weeks")
    private List<Integer> weeks;
    /**
    * <p data-diff-id="ct-diff-id-16326147-7263-4245-8657-ec09f53310d2"><span style="color: rgb(36, 41, 46)">具体配置</span></p>
    */
    @NotEmpty(message = "diningTime不能为空")
    @SerializedName("diningTime")
    private List<DiningTime> diningTime;

    public List<Integer> getWeeks() {
        return weeks;
    }
    public void setWeeks(List<Integer> weeks) {
        this.weeks = weeks;
    }
    public List<DiningTime> getDiningTime() {
        return diningTime;
    }
    public void setDiningTime(List<DiningTime> diningTime) {
        this.diningTime = diningTime;
    }




    @Override
    public String toString() {
        return "Data{" + "weeks=" + weeks + "," + "diningTime=" + diningTime + "}";
    }
}
