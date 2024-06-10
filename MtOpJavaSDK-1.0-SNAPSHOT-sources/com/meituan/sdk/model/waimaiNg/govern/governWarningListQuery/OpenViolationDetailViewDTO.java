package com.meituan.sdk.model.waimaiNg.govern.governWarningListQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 数据列表
* This file was automatically generated.
*/
public class OpenViolationDetailViewDTO {
    /**
    * 违规单id
    */
    @SerializedName("id")
    private Long id;
    /**
    * 门店id
    */
    @SerializedName("epoiId")
    private Integer epoiId;
    /**
    * 预警时间，unix时间戳
    */
    @SerializedName("warningTime")
    private Integer warningTime;
    /**
    * 预警规则id
    */
    @SerializedName("warningId")
    private Integer warningId;
    /**
    * 预警类型
    */
    @SerializedName("warningTitle")
    private String warningTitle;
    /**
    * 平台规则描述
    */
    @SerializedName("warningDesc")
    private String warningDesc;
    /**
    * 违规原因
    */
    @SerializedName("warningReason")
    private String warningReason;
    /**
    * 预警的处罚描述
    */
    @SerializedName("punishDesc")
    private String punishDesc;
    /**
    * 预警计算开始时间，unix时间戳
    */
    @SerializedName("calStartTime")
    private Long calStartTime;
    /**
    * 预警计算束时间，unix时间戳
    */
    @SerializedName("calEndTime")
    private Long calEndTime;
    /**
    * 预警事实依据
    */
    @SerializedName("warningContent")
    private List<ContentViewDTO> warningContent;
    /**
    * 规则跳转链接
    */
    @SerializedName("collegeInfo")
    private CollegeInfoViewDTO collegeInfo;
    /**
    * 阅读状态
    */
    @SerializedName("isRead")
    private Integer isRead;
    /**
    * 门店名称
    */
    @SerializedName("wmPoiName")
    private String wmPoiName;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getEpoiId() {
        return epoiId;
    }
    public void setEpoiId(Integer epoiId) {
        this.epoiId = epoiId;
    }
    public Integer getWarningTime() {
        return warningTime;
    }
    public void setWarningTime(Integer warningTime) {
        this.warningTime = warningTime;
    }
    public Integer getWarningId() {
        return warningId;
    }
    public void setWarningId(Integer warningId) {
        this.warningId = warningId;
    }
    public String getWarningTitle() {
        return warningTitle;
    }
    public void setWarningTitle(String warningTitle) {
        this.warningTitle = warningTitle;
    }
    public String getWarningDesc() {
        return warningDesc;
    }
    public void setWarningDesc(String warningDesc) {
        this.warningDesc = warningDesc;
    }
    public String getWarningReason() {
        return warningReason;
    }
    public void setWarningReason(String warningReason) {
        this.warningReason = warningReason;
    }
    public String getPunishDesc() {
        return punishDesc;
    }
    public void setPunishDesc(String punishDesc) {
        this.punishDesc = punishDesc;
    }
    public Long getCalStartTime() {
        return calStartTime;
    }
    public void setCalStartTime(Long calStartTime) {
        this.calStartTime = calStartTime;
    }
    public Long getCalEndTime() {
        return calEndTime;
    }
    public void setCalEndTime(Long calEndTime) {
        this.calEndTime = calEndTime;
    }
    public List<ContentViewDTO> getWarningContent() {
        return warningContent;
    }
    public void setWarningContent(List<ContentViewDTO> warningContent) {
        this.warningContent = warningContent;
    }
    public CollegeInfoViewDTO getCollegeInfo() {
        return collegeInfo;
    }
    public void setCollegeInfo(CollegeInfoViewDTO collegeInfo) {
        this.collegeInfo = collegeInfo;
    }
    public Integer getIsRead() {
        return isRead;
    }
    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }
    public String getWmPoiName() {
        return wmPoiName;
    }
    public void setWmPoiName(String wmPoiName) {
        this.wmPoiName = wmPoiName;
    }




    @Override
    public String toString() {
        return "OpenViolationDetailViewDTO{" + "id=" + id + "," + "epoiId=" + epoiId + "," + "warningTime=" + warningTime + "," + "warningId=" + warningId + "," + "warningTitle=" + warningTitle + "," + "warningDesc=" + warningDesc + "," + "warningReason=" + warningReason + "," + "punishDesc=" + punishDesc + "," + "calStartTime=" + calStartTime + "," + "calEndTime=" + calEndTime + "," + "warningContent=" + warningContent + "," + "collegeInfo=" + collegeInfo + "," + "isRead=" + isRead + "," + "wmPoiName=" + wmPoiName + "}";
    }
}
