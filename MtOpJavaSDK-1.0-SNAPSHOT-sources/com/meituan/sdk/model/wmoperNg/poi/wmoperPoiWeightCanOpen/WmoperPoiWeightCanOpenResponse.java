package com.meituan.sdk.model.wmoperNg.poi.wmoperPoiWeightCanOpen;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 门店是否可开启加权
* This file was automatically generated.
*/
public class WmoperPoiWeightCanOpenResponse {
    /**
    * 是否可开启加权
    */
    @SerializedName("canWeight")
    private Boolean canWeight;
    /**
    * 开启状态(1待开启、2开启中、3开启结束、4过期)
    */
    @SerializedName("openWeightStatus")
    private Integer openWeightStatus;
    /**
    * 过期日期(未开启加权，有首次营业才有值)(yyyy-mm-dd HH:mm:ss)
    */
    @SerializedName("overDueDate")
    private String overDueDate;
    /**
    * 秒级unix timestamp，开启加权时间(开启过加权的才有值)
    */
    @SerializedName("weightStartTime")
    private Integer weightStartTime;
    /**
    * 单位秒，加权剩余时间（开启过加权，未加权结束的才有值）
    */
    @SerializedName("surPlusTime")
    private Integer surPlusTime;
    /**
    * 未通过硬性门槛
    */
    @SerializedName("unPassHardThresholdResults")
    private List<UnPassHardThresholdResults> unPassHardThresholdResults;
    /**
    * 未通过软性门槛
    */
    @SerializedName("unPassSoftThresholdResults")
    private List<UnPassSoftThresholdResults> unPassSoftThresholdResults;

    public Boolean getCanWeight() {
        return canWeight;
    }
    public void setCanWeight(Boolean canWeight) {
        this.canWeight = canWeight;
    }
    public Integer getOpenWeightStatus() {
        return openWeightStatus;
    }
    public void setOpenWeightStatus(Integer openWeightStatus) {
        this.openWeightStatus = openWeightStatus;
    }
    public String getOverDueDate() {
        return overDueDate;
    }
    public void setOverDueDate(String overDueDate) {
        this.overDueDate = overDueDate;
    }
    public Integer getWeightStartTime() {
        return weightStartTime;
    }
    public void setWeightStartTime(Integer weightStartTime) {
        this.weightStartTime = weightStartTime;
    }
    public Integer getSurPlusTime() {
        return surPlusTime;
    }
    public void setSurPlusTime(Integer surPlusTime) {
        this.surPlusTime = surPlusTime;
    }
    public List<UnPassHardThresholdResults> getUnPassHardThresholdResults() {
        return unPassHardThresholdResults;
    }
    public void setUnPassHardThresholdResults(List<UnPassHardThresholdResults> unPassHardThresholdResults) {
        this.unPassHardThresholdResults = unPassHardThresholdResults;
    }
    public List<UnPassSoftThresholdResults> getUnPassSoftThresholdResults() {
        return unPassSoftThresholdResults;
    }
    public void setUnPassSoftThresholdResults(List<UnPassSoftThresholdResults> unPassSoftThresholdResults) {
        this.unPassSoftThresholdResults = unPassSoftThresholdResults;
    }




    @Override
    public String toString() {
        return "WmoperPoiWeightCanOpenResponse{" + "canWeight=" + canWeight + "," + "openWeightStatus=" + openWeightStatus + "," + "overDueDate=" + overDueDate + "," + "weightStartTime=" + weightStartTime + "," + "surPlusTime=" + surPlusTime + "," + "unPassHardThresholdResults=" + unPassHardThresholdResults + "," + "unPassSoftThresholdResults=" + unPassSoftThresholdResults + "}";
    }
}
