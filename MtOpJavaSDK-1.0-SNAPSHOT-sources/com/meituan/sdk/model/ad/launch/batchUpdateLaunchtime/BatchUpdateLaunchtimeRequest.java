package com.meituan.sdk.model.ad.launch.batchUpdateLaunchtime;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 批量修改投放时间段
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/batchUpdateLaunchTime",
    businessId = 22,
    apiVersion = "10017",
    apiName = "batch_update_launchtime",
    needAuth = true
)
public class BatchUpdateLaunchtimeRequest implements MeituanRequest<BatchUpdateLaunchtimeResponse> {
    /**
    * <p data-diff-id="ct-diff-id-a68e98c6-924f-4769-8838-1a946440e546"></p>
    */
    @NotBlank(message = "launchDateList不能为空")
    @SerializedName("launchDateList")
    private String launchDateList;

    public String getLaunchDateList() {
        return launchDateList;
    }
    public void setLaunchDateList(String launchDateList) {
        this.launchDateList = launchDateList;
    }


    @Override
    public MeituanResponse<BatchUpdateLaunchtimeResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<BatchUpdateLaunchtimeResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "BatchUpdateLaunchtimeRequest{" + "launchDateList=" + launchDateList + "}";
    }
}
