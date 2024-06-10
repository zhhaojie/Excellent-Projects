package com.meituan.sdk.model.wmoperNg.decoration.decorationQueryPoster;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 海报详情
* This file was automatically generated.
*/
public class WmAppPostVos {
    /**
    * 海报id
    */
    @SerializedName("posterId")
    private Long posterId;
    /**
    * 图片地址
    */
    @SerializedName("sourcePicUrl")
    private String sourcePicUrl;
    /**
    * 商品信息
    */
    @SerializedName("wmAppPostFoodVos")
    private List<WmAppPostFoodVos> wmAppPostFoodVos;
    /**
    * 展示顺序
    */
    @SerializedName("sequence")
    private Integer sequence;
    /**
    * 审核状态 0：免审 1：审核中 2： 审核通过 3：审核驳回
    */
    @SerializedName("verifyStatus")
    private Integer verifyStatus;
    /**
    * 驳回原因
    */
    @SerializedName("rejectReason")
    private String rejectReason;
    /**
    * 是否在c端展示
    */
    @SerializedName("valid")
    private Integer valid;
    /**
    * 海报生效开始日期,默认-1(格式：都是秒)：
    */
    @SerializedName("display_start_day")
    private Integer displayStartDay;
    /**
    * 海报生效结束日期,默认-1(格式：都是秒)：
    */
    @SerializedName("display_end_day")
    private Integer displayEndDay;
    /**
    * 海报生效开始时间,默认-1(格式：0至246060-1)
    */
    @SerializedName("display_stime")
    private Integer displayStime;
    /**
    * 海报生效结束时间,默认-1(格式：0至246060-1)
    */
    @SerializedName("display_etime")
    private Integer displayEtime;
    /**
    * 展示周期 海报投放周几,传入1，2，以此类推，默认[1,2,3,4,5,6,7]
    */
    @SerializedName("display_weeks")
    private String displayWeeks;

    public Long getPosterId() {
        return posterId;
    }
    public void setPosterId(Long posterId) {
        this.posterId = posterId;
    }
    public String getSourcePicUrl() {
        return sourcePicUrl;
    }
    public void setSourcePicUrl(String sourcePicUrl) {
        this.sourcePicUrl = sourcePicUrl;
    }
    public List<WmAppPostFoodVos> getWmAppPostFoodVos() {
        return wmAppPostFoodVos;
    }
    public void setWmAppPostFoodVos(List<WmAppPostFoodVos> wmAppPostFoodVos) {
        this.wmAppPostFoodVos = wmAppPostFoodVos;
    }
    public Integer getSequence() {
        return sequence;
    }
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
    public Integer getVerifyStatus() {
        return verifyStatus;
    }
    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }
    public String getRejectReason() {
        return rejectReason;
    }
    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }
    public Integer getValid() {
        return valid;
    }
    public void setValid(Integer valid) {
        this.valid = valid;
    }
    public Integer getDisplayStartDay() {
        return displayStartDay;
    }
    public void setDisplayStartDay(Integer displayStartDay) {
        this.displayStartDay = displayStartDay;
    }
    public Integer getDisplayEndDay() {
        return displayEndDay;
    }
    public void setDisplayEndDay(Integer displayEndDay) {
        this.displayEndDay = displayEndDay;
    }
    public Integer getDisplayStime() {
        return displayStime;
    }
    public void setDisplayStime(Integer displayStime) {
        this.displayStime = displayStime;
    }
    public Integer getDisplayEtime() {
        return displayEtime;
    }
    public void setDisplayEtime(Integer displayEtime) {
        this.displayEtime = displayEtime;
    }
    public String getDisplayWeeks() {
        return displayWeeks;
    }
    public void setDisplayWeeks(String displayWeeks) {
        this.displayWeeks = displayWeeks;
    }




    @Override
    public String toString() {
        return "WmAppPostVos{" + "posterId=" + posterId + "," + "sourcePicUrl=" + sourcePicUrl + "," + "wmAppPostFoodVos=" + wmAppPostFoodVos + "," + "sequence=" + sequence + "," + "verifyStatus=" + verifyStatus + "," + "rejectReason=" + rejectReason + "," + "valid=" + valid + "," + "displayStartDay=" + displayStartDay + "," + "displayEndDay=" + displayEndDay + "," + "displayStime=" + displayStime + "," + "displayEtime=" + displayEtime + "," + "displayWeeks=" + displayWeeks + "}";
    }
}
