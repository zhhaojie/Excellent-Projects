package com.meituan.sdk.model.ad.launch.batchUpdateLaunchTimeslot;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 批量更新投放每周时间段
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/batchUpdateLaunchTimeSlot",
    businessId = 22,
    apiVersion = "10016",
    apiName = "batch_update_launch_timeslot",
    needAuth = true
)
public class BatchUpdateLaunchTimeslotRequest implements MeituanRequest<BatchUpdateLaunchTimeslotResponse> {
    /**
    * <p data-diff-id="ct-diff-id-a68e98c6-924f-4769-8838-1a946440e546">timeSlot：周一至周末的时间片7*24小时=168位，0表示关闭，1表示开启</p>
    */
    @NotBlank(message = "launchTimeSlotList不能为空")
    @SerializedName("launchTimeSlotList")
    private String launchTimeSlotList;

    public String getLaunchTimeSlotList() {
        return launchTimeSlotList;
    }
    public void setLaunchTimeSlotList(String launchTimeSlotList) {
        this.launchTimeSlotList = launchTimeSlotList;
    }


    @Override
    public MeituanResponse<BatchUpdateLaunchTimeslotResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<BatchUpdateLaunchTimeslotResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "BatchUpdateLaunchTimeslotRequest{" + "launchTimeSlotList=" + launchTimeSlotList + "}";
    }
}
