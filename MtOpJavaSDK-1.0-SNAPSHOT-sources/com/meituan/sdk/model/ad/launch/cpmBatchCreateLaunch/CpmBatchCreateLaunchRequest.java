package com.meituan.sdk.model.ad.launch.cpmBatchCreateLaunch;

import com.meituan.sdk.annotations.ApiMeta;
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
* cpm批量创建投放
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/cpm/batchCreateLaunch",
    businessId = 22,
    apiVersion = "10033",
    apiName = "cpm_batch_create_launch",
    needAuth = true
)
public class CpmBatchCreateLaunchRequest implements MeituanRequest<CpmBatchCreateLaunchResponse> {
    /**
    * <p data-diff-id="ct-diff-id-7e4a657b-9eaf-4149-98bd-c243435af119"><span style="color: rgba(0, 0, 0, 0.65)">推广目的，当前仅开放自定义：3</span></p>
    */
    @SerializedName("launchAim")
    private Integer launchAim;
    /**
    * <p data-diff-id="ct-diff-id-a21c0fcf-93fb-468f-9fbd-acbaa70d24d6"><span style="color: rgba(0, 0, 0, 0.65)">实体类型，当前仅开放自定义落地页链接：11</span></p>
    */
    @SerializedName("entityType")
    private Integer entityType;
    /**
    * <p data-diff-id="ct-diff-id-3eb9f779-3e55-44bf-9ed5-a4ffbe0c8215"><span style="color: rgba(0, 0, 0, 0.65)">门店ID，所有门店须在同一个一级前台类目下，不超过50个</span></p>
    */
    @NotEmpty(message = "shopIdList不能为空")
    @SerializedName("shopIdList")
    private List<Long> shopIdList;
    /**
    * <p data-diff-id="ct-diff-id-105c8617-6531-4fa0-b4ee-6f5e33d204af"><span style="color: rgba(0, 0, 0, 0.65)">投放日期，只填一个时段，暂不开放多时段</span></p>
    */
    @NotEmpty(message = "duration不能为空")
    @SerializedName("duration")
    private List<CpmTimeIntervalDTO> duration;
    /**
    * <p data-diff-id="ct-diff-id-faf8996d-1dc1-46fb-8e96-b7252136fe4d"><span style="color: rgba(0, 0, 0, 0.65)">推广时间，7*24h，由0-167间的数字组成，不能为空</span></p>
    */
    @NotEmpty(message = "timePeriod不能为空")
    @SerializedName("timePeriod")
    private List<Integer> timePeriod;
    /**
    * <p data-diff-id="ct-diff-id-585ca7b6-a2f7-42f8-be5a-f9d72e0815d4"><span style="color: rgba(0, 0, 0, 0.65)">展位ID列表，仅开放410-点评首页信息流、552-美团首页猜你喜欢</span></p>
    */
    @NotEmpty(message = "tagIds不能为空")
    @SerializedName("tagIds")
    private List<Integer> tagIds;
    /**
    * <p data-diff-id="ct-diff-id-8c4d083f-9985-492a-8082-4fcec82257bd"><span style="color: rgba(0, 0, 0, 0.65)">投放区域类型，1-lbs，2-城市商圈</span></p>
    */
    @NotNull(message = "launchType不能为空")
    @SerializedName("launchType")
    private Integer launchType;
    /**
    * <p data-diff-id="ct-diff-id-e2d72245-e226-4d6d-a3d5-d46e776d56f8"><span style="color: rgba(0, 0, 0, 0.65)">点评城市ID，launchType=2时必填</span></p>
    */
    @SerializedName("dpCityIds")
    private List<Integer> dpCityIds;
    /**
    * <p data-diff-id="ct-diff-id-1f9da618-f435-496a-bb6a-b78e056e4018"><span style="color: rgba(0, 0, 0, 0.65)">lbs距离，单位米，1000的整数倍，launchType=1时必填</span></p><p data-diff-id="ct-diff-id-423a33fa-8d97-492c-817b-a75cc4e2d806"></p>
    */
    @SerializedName("lbsDistance")
    private Integer lbsDistance;
    /**
    * <p data-diff-id="ct-diff-id-ae43b703-92ce-4fc3-8e83-c49e2db2f266"><span style="color: rgba(0, 0, 0, 0.65)">推广人群。0-全部人群，1-自定义人群，2-智选人群。默认智选人群</span></p>
    */
    @SerializedName("launchScope")
    private Integer launchScope;
    /**
    * <p data-diff-id="ct-diff-id-74163969-fca5-4a66-9fe4-5e788b2e6e5b"><span style="color: rgba(0, 0, 0, 0.65)">人群包ID，选择自定义人群时必填。</span></p>
    */
    @SerializedName("audienceIds")
    private List<Integer> audienceIds;
    /**
    * <p data-diff-id="ct-diff-id-f60884a2-bec9-4834-8006-ec39b5eaba0a"><span style="color: rgba(0, 0, 0, 0.65)">日预算，单位元</span></p>
    */
    @NotNull(message = "dailyBudget不能为空")
    @SerializedName("dailyBudget")
    private Integer dailyBudget;
    /**
    * <p data-diff-id="ct-diff-id-e05524e4-b762-4f89-acc2-724e608ee669"><span style="color: rgba(0, 0, 0, 0.65)">批量参数</span></p>
    */
    @NotEmpty(message = "params不能为空")
    @SerializedName("params")
    private List<BatchCreateCpmLaunchParam> params;

    public Integer getLaunchAim() {
        return launchAim;
    }
    public void setLaunchAim(Integer launchAim) {
        this.launchAim = launchAim;
    }
    public Integer getEntityType() {
        return entityType;
    }
    public void setEntityType(Integer entityType) {
        this.entityType = entityType;
    }
    public List<Long> getShopIdList() {
        return shopIdList;
    }
    public void setShopIdList(List<Long> shopIdList) {
        this.shopIdList = shopIdList;
    }
    public List<CpmTimeIntervalDTO> getDuration() {
        return duration;
    }
    public void setDuration(List<CpmTimeIntervalDTO> duration) {
        this.duration = duration;
    }
    public List<Integer> getTimePeriod() {
        return timePeriod;
    }
    public void setTimePeriod(List<Integer> timePeriod) {
        this.timePeriod = timePeriod;
    }
    public List<Integer> getTagIds() {
        return tagIds;
    }
    public void setTagIds(List<Integer> tagIds) {
        this.tagIds = tagIds;
    }
    public Integer getLaunchType() {
        return launchType;
    }
    public void setLaunchType(Integer launchType) {
        this.launchType = launchType;
    }
    public List<Integer> getDpCityIds() {
        return dpCityIds;
    }
    public void setDpCityIds(List<Integer> dpCityIds) {
        this.dpCityIds = dpCityIds;
    }
    public Integer getLbsDistance() {
        return lbsDistance;
    }
    public void setLbsDistance(Integer lbsDistance) {
        this.lbsDistance = lbsDistance;
    }
    public Integer getLaunchScope() {
        return launchScope;
    }
    public void setLaunchScope(Integer launchScope) {
        this.launchScope = launchScope;
    }
    public List<Integer> getAudienceIds() {
        return audienceIds;
    }
    public void setAudienceIds(List<Integer> audienceIds) {
        this.audienceIds = audienceIds;
    }
    public Integer getDailyBudget() {
        return dailyBudget;
    }
    public void setDailyBudget(Integer dailyBudget) {
        this.dailyBudget = dailyBudget;
    }
    public List<BatchCreateCpmLaunchParam> getParams() {
        return params;
    }
    public void setParams(List<BatchCreateCpmLaunchParam> params) {
        this.params = params;
    }


    @Override
    public MeituanResponse<CpmBatchCreateLaunchResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<CpmBatchCreateLaunchResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CpmBatchCreateLaunchRequest{" + "launchAim=" + launchAim + "," + "entityType=" + entityType + "," + "shopIdList=" + shopIdList + "," + "duration=" + duration + "," + "timePeriod=" + timePeriod + "," + "tagIds=" + tagIds + "," + "launchType=" + launchType + "," + "dpCityIds=" + dpCityIds + "," + "lbsDistance=" + lbsDistance + "," + "launchScope=" + launchScope + "," + "audienceIds=" + audienceIds + "," + "dailyBudget=" + dailyBudget + "," + "params=" + params + "}";
    }
}
