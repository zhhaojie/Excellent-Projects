package com.meituan.sdk.model.foodmop.sku.queryVendorSpu;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* 时间段，10:20-12:00
* This file was automatically generated.
*/
public class TimeRangeDTO {
    /**
    * 开始时间
    */
    @NotBlank(message = "start不能为空")
    @SerializedName("start")
    private String start;
    /**
    * 结束时间
    */
    @NotBlank(message = "end不能为空")
    @SerializedName("end")
    private String end;

    public String getStart() {
        return start;
    }
    public void setStart(String start) {
        this.start = start;
    }
    public String getEnd() {
        return end;
    }
    public void setEnd(String end) {
        this.end = end;
    }




    @Override
    public String toString() {
        return "TimeRangeDTO{" + "start=" + start + "," + "end=" + end + "}";
    }
}
