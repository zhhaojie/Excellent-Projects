package com.meituan.sdk.model.foodmop.sku.queryShopMenu;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 分时置顶时间
* This file was automatically generated.
*/
public class TimeDTO {
    /**
    * 一周的第几天，eg：  1：星期一  2：星期二  ...以此类推
    */
    @NotNull(message = "dayOfWeek不能为空")
    @SerializedName("dayOfWeek")
    private Integer dayOfWeek;
    /**
    * 时间段
    */
    @NotEmpty(message = "range不能为空")
    @SerializedName("range")
    private List<TimeRangeDTO> range;

    public Integer getDayOfWeek() {
        return dayOfWeek;
    }
    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
    public List<TimeRangeDTO> getRange() {
        return range;
    }
    public void setRange(List<TimeRangeDTO> range) {
        this.range = range;
    }




    @Override
    public String toString() {
        return "TimeDTO{" + "dayOfWeek=" + dayOfWeek + "," + "range=" + range + "}";
    }
}
