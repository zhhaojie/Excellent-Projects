package com.meituan.sdk.model.resv2.config.configDiningTime;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-16326147-7263-4245-8657-ec09f53310d2"><span style="color: rgb(36, 41, 46)">具体配置</span></p>
* This file was automatically generated.
*/
public class DiningTime {
    /**
    * <p data-diff-id="ct-diff-id-5300aa0e-2c50-44ec-9ac3-8026cf292381"><span style="color: rgb(36, 41, 46)">时段类型</span></p>
    */
    @NotNull(message = "type不能为空")
    @SerializedName("type")
    private Integer type;
    /**
    * <p data-diff-id="ct-diff-id-0d97945c-05af-481a-9287-f970cd952385"><span style="color: rgb(36, 41, 46)">开始小时</span></p>
    */
    @NotNull(message = "startHour不能为空")
    @SerializedName("startHour")
    private Integer startHour;
    /**
    * <p data-diff-id="ct-diff-id-48c851c7-a237-4240-8a24-474a1420c4fe"><span style="color: rgb(36, 41, 46)">开始分钟</span></p>
    */
    @NotNull(message = "startMinute不能为空")
    @SerializedName("startMinute")
    private Integer startMinute;
    /**
    * <p data-diff-id="ct-diff-id-e997540f-77b3-409c-8f5b-5c3af1584da4"><span style="color: rgb(36, 41, 46)">结束小时</span></p>
    */
    @NotNull(message = "endHour不能为空")
    @SerializedName("endHour")
    private Integer endHour;
    /**
    * <p data-diff-id="ct-diff-id-69993a49-006f-4222-8c60-34c2bb6a3d4b"><span style="color: rgb(36, 41, 46)">结束分钟</span></p>
    */
    @NotNull(message = "endMinute不能为空")
    @SerializedName("endMinute")
    private Integer endMinute;

    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public Integer getStartHour() {
        return startHour;
    }
    public void setStartHour(Integer startHour) {
        this.startHour = startHour;
    }
    public Integer getStartMinute() {
        return startMinute;
    }
    public void setStartMinute(Integer startMinute) {
        this.startMinute = startMinute;
    }
    public Integer getEndHour() {
        return endHour;
    }
    public void setEndHour(Integer endHour) {
        this.endHour = endHour;
    }
    public Integer getEndMinute() {
        return endMinute;
    }
    public void setEndMinute(Integer endMinute) {
        this.endMinute = endMinute;
    }




    @Override
    public String toString() {
        return "DiningTime{" + "type=" + type + "," + "startHour=" + startHour + "," + "startMinute=" + startMinute + "," + "endHour=" + endHour + "," + "endMinute=" + endMinute + "}";
    }
}
