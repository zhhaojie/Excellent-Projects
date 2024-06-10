package com.meituan.sdk.model.wmoperNg.govern.governViolationScoreRecordQuery;

import com.google.gson.annotations.SerializedName;

/**
* 数据列表
* This file was automatically generated.
*/
public class ViolationScoreRecordDTO {
    /**
    * 变更原因
    */
    @SerializedName("reasonName")
    private String reasonName;
    /**
    * 违规类型
    */
    @SerializedName("violationType")
    private Integer violationType;
    /**
    * 变更分数
    */
    @SerializedName("deltaScore")
    private Integer deltaScore;
    /**
    * 变更前分数
    */
    @SerializedName("fromScore")
    private Integer fromScore;
    /**
    * 变更后分数
    */
    @SerializedName("toScore")
    private String toScore;
    /**
    * 变更时间
    */
    @SerializedName("dateTime")
    private Long dateTime;
    /**
    * 对应违规单id
    */
    @SerializedName("violationId")
    private Long violationId;

    public String getReasonName() {
        return reasonName;
    }
    public void setReasonName(String reasonName) {
        this.reasonName = reasonName;
    }
    public Integer getViolationType() {
        return violationType;
    }
    public void setViolationType(Integer violationType) {
        this.violationType = violationType;
    }
    public Integer getDeltaScore() {
        return deltaScore;
    }
    public void setDeltaScore(Integer deltaScore) {
        this.deltaScore = deltaScore;
    }
    public Integer getFromScore() {
        return fromScore;
    }
    public void setFromScore(Integer fromScore) {
        this.fromScore = fromScore;
    }
    public String getToScore() {
        return toScore;
    }
    public void setToScore(String toScore) {
        this.toScore = toScore;
    }
    public Long getDateTime() {
        return dateTime;
    }
    public void setDateTime(Long dateTime) {
        this.dateTime = dateTime;
    }
    public Long getViolationId() {
        return violationId;
    }
    public void setViolationId(Long violationId) {
        this.violationId = violationId;
    }




    @Override
    public String toString() {
        return "ViolationScoreRecordDTO{" + "reasonName=" + reasonName + "," + "violationType=" + violationType + "," + "deltaScore=" + deltaScore + "," + "fromScore=" + fromScore + "," + "toScore=" + toScore + "," + "dateTime=" + dateTime + "," + "violationId=" + violationId + "}";
    }
}
