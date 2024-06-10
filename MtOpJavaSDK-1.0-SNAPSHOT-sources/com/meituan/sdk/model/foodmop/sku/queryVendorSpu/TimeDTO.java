package com.meituan.sdk.model.foodmop.sku.queryVendorSpu;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 商品售卖时间，若不设值，商品全时段均可售卖
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
    * 时间段，10:20-12:00
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
