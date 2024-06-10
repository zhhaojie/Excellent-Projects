package com.meituan.sdk.model.waimaiNg.govern.governViolationScoreQuery;

import com.google.gson.annotations.SerializedName;

/**
* 积分信息查询
* This file was automatically generated.
*/
public class GovernViolationScoreQueryResponse {
    /**
    * 门店Id
    */
    @SerializedName("appPoiCode")
    private String appPoiCode;
    /**
    * 一般违规积分
    */
    @SerializedName("normalScore")
    private Integer normalScore;
    /**
    * 严重违规积分
    */
    @SerializedName("criticalScore")
    private Integer criticalScore;

    public String getAppPoiCode() {
        return appPoiCode;
    }
    public void setAppPoiCode(String appPoiCode) {
        this.appPoiCode = appPoiCode;
    }
    public Integer getNormalScore() {
        return normalScore;
    }
    public void setNormalScore(Integer normalScore) {
        this.normalScore = normalScore;
    }
    public Integer getCriticalScore() {
        return criticalScore;
    }
    public void setCriticalScore(Integer criticalScore) {
        this.criticalScore = criticalScore;
    }




    @Override
    public String toString() {
        return "GovernViolationScoreQueryResponse{" + "appPoiCode=" + appPoiCode + "," + "normalScore=" + normalScore + "," + "criticalScore=" + criticalScore + "}";
    }
}
