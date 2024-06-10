package com.meituan.sdk.model.foodmop.sku.shopmenuCreatespecial;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* <p data-diff-id="ct-diff-id-60339b06-4212-4a61-bcf6-7d261fd4779f">分时置顶时间</p>
* This file was automatically generated.
*/
public class TimeDTO {
    /**
    * <p data-diff-id="ct-diff-id-ef6a8cac-e2bd-4b38-a55c-f60a34a5d36a">一周的第几天，eg：</p><ul data-diff-id="ct-diff-id-1e0efe94-1c5a-47ab-bccb-781a2b70b387"><li data-list-item-diff-id="ct-list-item-diff-id-55ff452d-e204-4632-8624-369cf0655012"><p data-diff-id="ct-diff-id-fddd72fb-0d65-4547-a29a-af174dd4efa3">1：星期一</p></li><li data-list-item-diff-id="ct-list-item-diff-id-b78489f5-cd53-44b0-9106-5ff0d70d79b8"><p data-diff-id="ct-diff-id-8f7c736a-6c81-4cec-a88f-8f20ed9f9e07">2：星期二</p></li><li data-list-item-diff-id="ct-list-item-diff-id-d2dc7b02-63e2-4269-8fbc-c2b0da7ac29c"><p data-diff-id="ct-diff-id-9773eb26-5def-4445-9b00-3ea6386b2475">...以此类推</p></li><li data-list-item-diff-id="ct-list-item-diff-id-61392747-ca1a-4fbe-8a2f-39ae5d3149db"><p data-diff-id="ct-diff-id-b101e8db-1533-4441-bb6e-bf4672612c69">不为空，只能为 1~7</p></li></ul>
    */
    @NotNull(message = "dayOfWeek不能为空")
    @SerializedName("dayOfWeek")
    private Integer dayOfWeek;
    /**
    * <p data-diff-id="ct-diff-id-79e29b90-7ad9-4d19-9b3d-79dfce3953d9">时间段</p>
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
