package com.meituan.sdk.model.waimaiNg.govern.governAppealDetailQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 申诉详情查询
* This file was automatically generated.
*/
public class GovernAppealDetailQueryResponse {
    /**
    * 申诉单id
    */
    @SerializedName("id")
    private Integer id;
    /**
    * 门店id
    */
    @SerializedName("appPoiCode")
    private String appPoiCode;
    /**
    * 0,"不支持申诉",10,"可申诉",20,"申诉中",30,"申诉成功",40,"申诉失败",50,"逾期未申诉",60,"已确认违规"
    */
    @SerializedName("status")
    private Integer status;
    /**
    * 处理结果文案
    */
    @SerializedName("description")
    private String description;
    /**
    * 商家申请文字材料
    */
    @SerializedName("content")
    private String content;
    /**
    * 申诉媒体材料
    */
    @SerializedName("mediaList")
    private List<AppealMediaDTO> mediaList;
    /**
    * 违规单id
    */
    @SerializedName("violationDetailId")
    private Long violationDetailId;
    /**
    * 申诉时间
    */
    @SerializedName("ctime")
    private Long ctime;
    /**
    * 最后处理时间
    */
    @SerializedName("utime")
    private Long utime;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getAppPoiCode() {
        return appPoiCode;
    }
    public void setAppPoiCode(String appPoiCode) {
        this.appPoiCode = appPoiCode;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public List<AppealMediaDTO> getMediaList() {
        return mediaList;
    }
    public void setMediaList(List<AppealMediaDTO> mediaList) {
        this.mediaList = mediaList;
    }
    public Long getViolationDetailId() {
        return violationDetailId;
    }
    public void setViolationDetailId(Long violationDetailId) {
        this.violationDetailId = violationDetailId;
    }
    public Long getCtime() {
        return ctime;
    }
    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }
    public Long getUtime() {
        return utime;
    }
    public void setUtime(Long utime) {
        this.utime = utime;
    }




    @Override
    public String toString() {
        return "GovernAppealDetailQueryResponse{" + "id=" + id + "," + "appPoiCode=" + appPoiCode + "," + "status=" + status + "," + "description=" + description + "," + "content=" + content + "," + "mediaList=" + mediaList + "," + "violationDetailId=" + violationDetailId + "," + "ctime=" + ctime + "," + "utime=" + utime + "}";
    }
}
