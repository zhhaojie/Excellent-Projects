package com.meituan.sdk.model.ad.launch.batchQueryCpcLaunchinfos;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class LaunchInfo {
    /**
    * 推广id
    */
    @SerializedName("launchid")
    private Integer launchid;
    /**
    * 推广名称
    */
    @SerializedName("launchName")
    private String launchName;
    /**
    * 门店名称
    */
    @SerializedName("shopName")
    private String shopName;
    /**
    * 日预算
    */
    @SerializedName("budgetBasic")
    private Integer budgetBasic;
    /**
    * 高峰日上浮比例
    */
    @SerializedName("budgetFloatRatio")
    private Integer budgetFloatRatio;
    /**
    * 是否支持匀速投放  0 不支持 1 支持
    */
    @SerializedName("deliverySpeed")
    private Integer deliverySpeed;
    /**
    * 推广开始时间
    */
    @SerializedName("startTime")
    private String startTime;
    /**
    * 推广结束时间
    */
    @SerializedName("endTime")
    private String endTime;
    /**
    * 1有效，2过期，3暂停，4审核中，5审核驳回 6 删除 8 未投放（推广计划暂停） 9待推广，10 状态异常
    */
    @SerializedName("launchStatus")
    private Integer launchStatus;
    /**
    * 时间定向 7*24小时
    */
    @SerializedName("timeSlotPeriod")
    private List<Long> timeSlotPeriod;
    @SerializedName("TargetBean")
    private List<TargetInfo> targetBean;

    public Integer getLaunchid() {
        return launchid;
    }
    public void setLaunchid(Integer launchid) {
        this.launchid = launchid;
    }
    public String getLaunchName() {
        return launchName;
    }
    public void setLaunchName(String launchName) {
        this.launchName = launchName;
    }
    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public Integer getBudgetBasic() {
        return budgetBasic;
    }
    public void setBudgetBasic(Integer budgetBasic) {
        this.budgetBasic = budgetBasic;
    }
    public Integer getBudgetFloatRatio() {
        return budgetFloatRatio;
    }
    public void setBudgetFloatRatio(Integer budgetFloatRatio) {
        this.budgetFloatRatio = budgetFloatRatio;
    }
    public Integer getDeliverySpeed() {
        return deliverySpeed;
    }
    public void setDeliverySpeed(Integer deliverySpeed) {
        this.deliverySpeed = deliverySpeed;
    }
    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    public Integer getLaunchStatus() {
        return launchStatus;
    }
    public void setLaunchStatus(Integer launchStatus) {
        this.launchStatus = launchStatus;
    }
    public List<Long> getTimeSlotPeriod() {
        return timeSlotPeriod;
    }
    public void setTimeSlotPeriod(List<Long> timeSlotPeriod) {
        this.timeSlotPeriod = timeSlotPeriod;
    }
    public List<TargetInfo> getTargetBean() {
        return targetBean;
    }
    public void setTargetBean(List<TargetInfo> targetBean) {
        this.targetBean = targetBean;
    }




    @Override
    public String toString() {
        return "LaunchInfo{" + "launchid=" + launchid + "," + "launchName=" + launchName + "," + "shopName=" + shopName + "," + "budgetBasic=" + budgetBasic + "," + "budgetFloatRatio=" + budgetFloatRatio + "," + "deliverySpeed=" + deliverySpeed + "," + "startTime=" + startTime + "," + "endTime=" + endTime + "," + "launchStatus=" + launchStatus + "," + "timeSlotPeriod=" + timeSlotPeriod + "," + "targetBean=" + targetBean + "}";
    }
}
