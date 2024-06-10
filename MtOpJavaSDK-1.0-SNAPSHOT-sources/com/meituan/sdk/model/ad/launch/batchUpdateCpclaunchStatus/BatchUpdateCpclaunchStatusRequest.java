package com.meituan.sdk.model.ad.launch.batchUpdateCpclaunchStatus;

import com.meituan.sdk.annotations.ApiMeta;
import java.lang.Void;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;
import javax.validation.constraints.NotEmpty;

/**
* 更新推广状态
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/batchUpdateCpcLaunchStatus",
    businessId = 22,
    apiVersion = "10005",
    apiName = "batch_update_cpclaunch_status",
    needAuth = false
)
public class BatchUpdateCpclaunchStatusRequest implements MeituanRequest<Void> {
    /**
    * 推广id列表，单次最多支持50个
    */
    @NotEmpty(message = "launchIds不能为空")
    @SerializedName("launchIds")
    private List<Long> launchIds;
    /**
    * 需要修改的推广状态，1有效,5暂停,9删除
    */
    @NotNull(message = "power不能为空")
    @SerializedName("power")
    private Integer power;
    @SerializedName("sonAdaccountId")
    private Integer sonAdaccountId;

    public List<Long> getLaunchIds() {
        return launchIds;
    }
    public void setLaunchIds(List<Long> launchIds) {
        this.launchIds = launchIds;
    }
    public Integer getPower() {
        return power;
    }
    public void setPower(Integer power) {
        this.power = power;
    }
    public Integer getSonAdaccountId() {
        return sonAdaccountId;
    }
    public void setSonAdaccountId(Integer sonAdaccountId) {
        this.sonAdaccountId = sonAdaccountId;
    }


    @Override
    public MeituanResponse<Void> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<Void>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "BatchUpdateCpclaunchStatusRequest{" + "launchIds=" + launchIds + "," + "power=" + power + "," + "sonAdaccountId=" + sonAdaccountId + "}";
    }
}
