package com.meituan.sdk.model.ad.launch.cpmQueryCommonInfo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* cpm查询常用信息
* This file was automatically generated.
*/
public class CpmQueryCommonInfoResponse {
    /**
    * 预算信息
    */
    @SerializedName("budgetInfo")
    private BudgetInfo budgetInfo;
    /**
    * 人群包列表
    */
    @SerializedName("audienceDTOs")
    private List<AudienceInfo> audienceDTOs;
    /**
    * 模板信息
    */
    @SerializedName("templateInfoList")
    private List<TemplateInfo> templateInfoList;
    /**
    * LBS距离信息
    */
    @SerializedName("distanceInfo")
    private DistanceInfo distanceInfo;

    public BudgetInfo getBudgetInfo() {
        return budgetInfo;
    }
    public void setBudgetInfo(BudgetInfo budgetInfo) {
        this.budgetInfo = budgetInfo;
    }
    public List<AudienceInfo> getAudienceDTOs() {
        return audienceDTOs;
    }
    public void setAudienceDTOs(List<AudienceInfo> audienceDTOs) {
        this.audienceDTOs = audienceDTOs;
    }
    public List<TemplateInfo> getTemplateInfoList() {
        return templateInfoList;
    }
    public void setTemplateInfoList(List<TemplateInfo> templateInfoList) {
        this.templateInfoList = templateInfoList;
    }
    public DistanceInfo getDistanceInfo() {
        return distanceInfo;
    }
    public void setDistanceInfo(DistanceInfo distanceInfo) {
        this.distanceInfo = distanceInfo;
    }




    @Override
    public String toString() {
        return "CpmQueryCommonInfoResponse{" + "budgetInfo=" + budgetInfo + "," + "audienceDTOs=" + audienceDTOs + "," + "templateInfoList=" + templateInfoList + "," + "distanceInfo=" + distanceInfo + "}";
    }
}
