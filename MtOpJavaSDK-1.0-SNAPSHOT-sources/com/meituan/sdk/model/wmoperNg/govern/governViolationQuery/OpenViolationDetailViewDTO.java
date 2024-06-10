package com.meituan.sdk.model.wmoperNg.govern.governViolationQuery;

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
    @SerializedName("wmPoiId")
    private Long wmPoiId;
    /**
    * 处罚时间，unix时间戳
    */
    @SerializedName("punishTime")
    private Integer punishTime;
    /**
    * 违规规则id
    */
    @SerializedName("violationId")
    private Integer violationId;
    /**
    * 规则标题
    */
    @SerializedName("violationTitle")
    private String violationTitle;
    /**
    * 平台规则描述
    */
    @SerializedName("violationDesc")
    private String violationDesc;
    /**
    * 违规原因
    */
    @SerializedName("violationReason")
    private String violationReason;
    /**
    * 违规开始时间，unix时间戳
    */
    @SerializedName("violationStartTime")
    private Long violationStartTime;
    /**
    * 违规结束时间，unix时间戳
    */
    @SerializedName("violationEndTime")
    private Long violationEndTime;
    /**
    * 违规事实依据  返回的数量有限，50以上会被截断，需要查询更多通过分页查询违规事实依据接口
    */
    @SerializedName("violationContent")
    private List<ContentViewDTO> violationContent;
    /**
    * 处罚结果
    */
    @SerializedName("punishInfo")
    private List<ViolationPunishInfoViewDTO> punishInfo;
    /**
    * 规则跳转链接
    */
    @SerializedName("collegeInfo")
    private CollegeInfoViewDTO collegeInfo;
    /**
    * 申诉开始时间
    */
    @SerializedName("appealStartTime")
    private Integer appealStartTime;
    /**
    * 申诉开始时间
    */
    @SerializedName("appealEndTime")
    private Integer appealEndTime;
    /**
    * 阅读状态(是否在商家端查看)
    */
    @SerializedName("isRead")
    private Integer isRead;
    /**
    * 申诉状态0,"不支持申诉",10,"可申诉",20,"申诉中",30,"申诉成功",40,"申诉失败",50,"逾期未申诉",60,"已确认违规"  20,"申诉中",30,"申诉成功",40,"申诉失败"  
    */
    @SerializedName("appealStatus")
    private Integer appealStatus;
    /**
    * 门店名称
    */
    @SerializedName("wmPoiName")
    private String wmPoiName;
    /**
    * 违规分描述
    */
    @SerializedName("scorePunishDesc")
    private String scorePunishDesc;
    /**
    * 规则二级类型0: "无法识别" 1: "一般违规" 51: "严重违规" 101: "积分节点一般违规" 102: "积分节点严重违规"
    */
    @SerializedName("ruleSubType")
    private Integer ruleSubType;
    /**
    * 违规单状态10:"待处罚,初始状态" 30:"处罚完成" 40:"处罚失败" 50:"罚单撤回"
    */
    @SerializedName("status")
    private Integer status;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getWmPoiId() {
        return wmPoiId;
    }
    public void setWmPoiId(Long wmPoiId) {
        this.wmPoiId = wmPoiId;
    }
    public Integer getPunishTime() {
        return punishTime;
    }
    public void setPunishTime(Integer punishTime) {
        this.punishTime = punishTime;
    }
    public Integer getViolationId() {
        return violationId;
    }
    public void setViolationId(Integer violationId) {
        this.violationId = violationId;
    }
    public String getViolationTitle() {
        return violationTitle;
    }
    public void setViolationTitle(String violationTitle) {
        this.violationTitle = violationTitle;
    }
    public String getViolationDesc() {
        return violationDesc;
    }
    public void setViolationDesc(String violationDesc) {
        this.violationDesc = violationDesc;
    }
    public String getViolationReason() {
        return violationReason;
    }
    public void setViolationReason(String violationReason) {
        this.violationReason = violationReason;
    }
    public Long getViolationStartTime() {
        return violationStartTime;
    }
    public void setViolationStartTime(Long violationStartTime) {
        this.violationStartTime = violationStartTime;
    }
    public Long getViolationEndTime() {
        return violationEndTime;
    }
    public void setViolationEndTime(Long violationEndTime) {
        this.violationEndTime = violationEndTime;
    }
    public List<ContentViewDTO> getViolationContent() {
        return violationContent;
    }
    public void setViolationContent(List<ContentViewDTO> violationContent) {
        this.violationContent = violationContent;
    }
    public List<ViolationPunishInfoViewDTO> getPunishInfo() {
        return punishInfo;
    }
    public void setPunishInfo(List<ViolationPunishInfoViewDTO> punishInfo) {
        this.punishInfo = punishInfo;
    }
    public CollegeInfoViewDTO getCollegeInfo() {
        return collegeInfo;
    }
    public void setCollegeInfo(CollegeInfoViewDTO collegeInfo) {
        this.collegeInfo = collegeInfo;
    }
    public Integer getAppealStartTime() {
        return appealStartTime;
    }
    public void setAppealStartTime(Integer appealStartTime) {
        this.appealStartTime = appealStartTime;
    }
    public Integer getAppealEndTime() {
        return appealEndTime;
    }
    public void setAppealEndTime(Integer appealEndTime) {
        this.appealEndTime = appealEndTime;
    }
    public Integer getIsRead() {
        return isRead;
    }
    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }
    public Integer getAppealStatus() {
        return appealStatus;
    }
    public void setAppealStatus(Integer appealStatus) {
        this.appealStatus = appealStatus;
    }
    public String getWmPoiName() {
        return wmPoiName;
    }
    public void setWmPoiName(String wmPoiName) {
        this.wmPoiName = wmPoiName;
    }
    public String getScorePunishDesc() {
        return scorePunishDesc;
    }
    public void setScorePunishDesc(String scorePunishDesc) {
        this.scorePunishDesc = scorePunishDesc;
    }
    public Integer getRuleSubType() {
        return ruleSubType;
    }
    public void setRuleSubType(Integer ruleSubType) {
        this.ruleSubType = ruleSubType;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }




    @Override
    public String toString() {
        return "OpenViolationDetailViewDTO{" + "id=" + id + "," + "wmPoiId=" + wmPoiId + "," + "punishTime=" + punishTime + "," + "violationId=" + violationId + "," + "violationTitle=" + violationTitle + "," + "violationDesc=" + violationDesc + "," + "violationReason=" + violationReason + "," + "violationStartTime=" + violationStartTime + "," + "violationEndTime=" + violationEndTime + "," + "violationContent=" + violationContent + "," + "punishInfo=" + punishInfo + "," + "collegeInfo=" + collegeInfo + "," + "appealStartTime=" + appealStartTime + "," + "appealEndTime=" + appealEndTime + "," + "isRead=" + isRead + "," + "appealStatus=" + appealStatus + "," + "wmPoiName=" + wmPoiName + "," + "scorePunishDesc=" + scorePunishDesc + "," + "ruleSubType=" + ruleSubType + "," + "status=" + status + "}";
    }
}
