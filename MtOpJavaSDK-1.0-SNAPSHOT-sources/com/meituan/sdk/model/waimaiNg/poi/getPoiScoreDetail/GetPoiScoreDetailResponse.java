package com.meituan.sdk.model.waimaiNg.poi.getPoiScoreDetail;

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
    private Integer totalScore;
    /**
    * 待提升项
    */
    @SerializedName("repairList")
    private List<RepairList> repairList;
    /**
    * 满分项
    */
    @SerializedName("excellentList")
    private List<ExcellentList> excellentList;

    public Integer getTotalScore() {
        return totalScore;
    }
    public void setTotalScore(Integer totalScore) {
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
