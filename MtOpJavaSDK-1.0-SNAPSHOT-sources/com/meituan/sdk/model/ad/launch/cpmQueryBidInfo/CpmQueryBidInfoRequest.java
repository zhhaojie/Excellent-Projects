package com.meituan.sdk.model.ad.launch.cpmQueryBidInfo;

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
* cpm查询出价信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/cpm/queryBidInfo",
    businessId = 22,
    apiVersion = "10034",
    apiName = "cpm_query_bid_info",
    needAuth = true
)
public class CpmQueryBidInfoRequest implements MeituanRequest<List<BidInfo>> {
    /**
    * <p data-diff-id="ct-diff-id-19ee71b9-71c1-4445-a48d-caf4804ed5c3"><span style="color: rgba(0, 0, 0, 0.65)">推广目的</span></p>
    */
    @SerializedName("launchAim")
    private Integer launchAim;
    /**
    * <p data-diff-id="ct-diff-id-30f845e8-4f4c-495a-a17c-290aea5684a1"><span style="color: rgba(0, 0, 0, 0.65)">实体类型</span></p>
    */
    @SerializedName("entityType")
    private Integer entityType;
    /**
    * <p data-diff-id="ct-diff-id-3c6eb2b8-469a-457a-a85d-741004f2d4ec"><span style="color: rgba(0, 0, 0, 0.65)">门店ID，所有门店须在同一个一级前台类目下</span></p>
    */
    @NotEmpty(message = "shopIdList不能为空")
    @SerializedName("shopIdList")
    private List<Long> shopIdList;
    /**
    * <p data-diff-id="ct-diff-id-b1e73749-df05-4744-b80c-44537dd08d4e"><span style="color: rgba(0, 0, 0, 0.65)">推广时间，7*24h，由0-167间的数字组成，不能为空</span></p>
    */
    @NotEmpty(message = "timePeriod不能为空")
    @SerializedName("timePeriod")
    private List<Integer> timePeriod;
    /**
    * <p data-diff-id="ct-diff-id-b15f367e-7fc9-4db3-b8c1-e92cf4b4d8f2"><span style="color: rgba(0, 0, 0, 0.65)">展位ID列表</span></p>
    */
    @NotEmpty(message = "tagIds不能为空")
    @SerializedName("tagIds")
    private List<Integer> tagIds;
    /**
    * <p data-diff-id="ct-diff-id-0bb18dc9-2696-479a-8e05-f109c81e6bc2"><span style="color: rgba(0, 0, 0, 0.65)">投放区域类型，1-lbs，2-城市商圈</span></p>
    */
    @SerializedName("launchType")
    private Integer launchType;
    /**
    * <p data-diff-id="ct-diff-id-4f237e16-9bb8-4a6f-991f-aaacff48c85a"><span style="color: rgba(0, 0, 0, 0.65)">点评城市ID，launchType=2时必填</span></p>
    */
    @SerializedName("dpCityIds")
    private List<Integer> dpCityIds;
    /**
    * <p data-diff-id="ct-diff-id-3c74d1cb-169b-45d1-87c0-12f8a98e0bcf"><span style="color: rgba(0, 0, 0, 0.65)">lbs距离，launchType=1时必填</span></p><p data-diff-id="ct-diff-id-78008208-6df2-4bf9-b799-a56bfd05f37c"></p>
    */
    @SerializedName("lbsDistance")
    private Integer lbsDistance;
    /**
    * <p data-diff-id="ct-diff-id-c002b9af-dc80-4fdd-94a1-fd3f5e99a038"><span style="color: rgba(0, 0, 0, 0.65)">推广人群。0-全部人群，1-自定义人群，2-智选人群</span></p>
    */
    @SerializedName("launchScope")
    private Integer launchScope;
    /**
    * <p data-diff-id="ct-diff-id-dea31306-1a26-47aa-9f95-ed77e8aa9e22"><span style="color: rgba(0, 0, 0, 0.65)">人群包ID，选择自定义人群时必填。</span></p>
    */
    @SerializedName("audienceIds")
    private List<Integer> audienceIds;
    /**
    * <p data-diff-id="ct-diff-id-38f32475-a625-41fa-951a-40dda317ae07"><span style="color: rgba(0, 0, 0, 0.65)">日预算，单位元</span></p>
    */
    @NotNull(message = "dailyBudget不能为空")
    @SerializedName("dailyBudget")
    private Integer dailyBudget;
    /**
    * <p data-diff-id="ct-diff-id-62d8b0cd-be66-4f65-a567-ec455400f04f"><span style="color: rgba(0, 0, 0, 0.65)">批量参数</span></p>
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
    public MeituanResponse<List<BidInfo>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<BidInfo>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CpmQueryBidInfoRequest{" + "launchAim=" + launchAim + "," + "entityType=" + entityType + "," + "shopIdList=" + shopIdList + "," + "timePeriod=" + timePeriod + "," + "tagIds=" + tagIds + "," + "launchType=" + launchType + "," + "dpCityIds=" + dpCityIds + "," + "lbsDistance=" + lbsDistance + "," + "launchScope=" + launchScope + "," + "audienceIds=" + audienceIds + "," + "dailyBudget=" + dailyBudget + "," + "params=" + params + "}";
    }
}
