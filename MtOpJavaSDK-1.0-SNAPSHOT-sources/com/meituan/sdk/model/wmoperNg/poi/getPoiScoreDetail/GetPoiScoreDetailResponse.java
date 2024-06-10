package com.meituan.sdk.model.wmoperNg.poi.getPoiScoreDetail;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 查询店铺分数据
* This file was automatically generated.
*/
public class GetPoiScoreDetailResponse {
    /**
    * 店铺总分数
    */
    @SerializedName("totalScore")
    private String totalScore;
    /**
    * 待提升项
    */
    @SerializedName("repairList")
    private List<RepairList> repairList;
    @SerializedName("excellentList")
    private List<ExcellentList> excellentList;

    public String getTotalScore() {
        return totalScore;
    }
    public void setTotalScore(String totalScore) {
        this.totalScore = totalScore;
    }
    public List<RepairList> getRepairList() {
        return repairList;
    }
    public void setRepairList(List<RepairList> repairList) {
        this.repairList = repairList;
    }
    public List<ExcellentList> getExcellentList() {
        return excellentList;
    }
    public void setExcellentList(List<ExcellentList> excellentList) {
        this.excellentList = excellentList;
    }




    @Override
    public String toString() {
        return "GetPoiScoreDetailResponse{" + "totalScore=" + totalScore + "," + "repairList=" + repairList + "," + "excellentList=" + excellentList + "}";
    }
}
