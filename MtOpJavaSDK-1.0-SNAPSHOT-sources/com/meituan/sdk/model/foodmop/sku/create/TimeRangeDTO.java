package com.meituan.sdk.model.foodmop.sku.create;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-79e29b90-7ad9-4d19-9b3d-79dfce3953d9">时间段</p>
* This file was automatically generated.
*/
public class TimeRangeDTO {
    /**
    * <p data-diff-id="ct-diff-id-80544a81-bcf7-492d-8d25-424676b4a54f">开始时间</p><p data-diff-id="ct-diff-id-795a9589-d226-4d46-9d1d-4781a136b9bb">不能为空，只能为 xx:xx 格式</p>
    */
    @NotBlank(message = "start不能为空")
    @SerializedName("start")
    private String start;
    /**
    * <p data-diff-id="ct-diff-id-b977c8d3-ebfc-4fb8-b1f0-5a15dfdd4fe1">结束时间</p><p data-diff-id="ct-diff-id-7d3541d6-0508-4f85-bc5f-7c1bde16dd8a">不能为空，只能为 xx:xx 格式</p>
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
