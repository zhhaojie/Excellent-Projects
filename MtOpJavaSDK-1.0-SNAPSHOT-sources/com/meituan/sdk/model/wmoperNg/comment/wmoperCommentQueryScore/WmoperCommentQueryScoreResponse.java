package com.meituan.sdk.model.wmoperNg.comment.wmoperCommentQueryScore;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* 获取门店评分
* This file was automatically generated.
*/
public class WmoperCommentQueryScoreResponse {
    /**
    * 服务商门店id
    */
    @NotBlank(message = "epoiId不能为空")
    @SerializedName("epoiId")
    private String epoiId;
    /**
    * 餐品评分
    */
    @SerializedName("avgPoiScore")
    private Double avgPoiScore;
    /**
    * 口味评分
    */
    @SerializedName("avgTasteScore")
    private Double avgTasteScore;
    /**
    * 包装评分
    */
    @SerializedName("avgPackingScore")
    private Double avgPackingScore;
    /**
    * 配送评分
    */
    @SerializedName("avgDeliveryScore")
    private Double avgDeliveryScore;
    /**
    * 配送满意度。在0~100之间，返回参数中没有%
    */
    @SerializedName("deliverySatisfaction")
    private Integer deliverySatisfaction;

    public String getEpoiId() {
        return epoiId;
    }
    public void setEpoiId(String epoiId) {
        this.epoiId = epoiId;
    }
    public Double getAvgPoiScore() {
        return avgPoiScore;
    }
    public void setAvgPoiScore(Double avgPoiScore) {
        this.avgPoiScore = avgPoiScore;
    }
    public Double getAvgTasteScore() {
        return avgTasteScore;
    }
    public void setAvgTasteScore(Double avgTasteScore) {
        this.avgTasteScore = avgTasteScore;
    }
    public Double getAvgPackingScore() {
        return avgPackingScore;
    }
    public void setAvgPackingScore(Double avgPackingScore) {
        this.avgPackingScore = avgPackingScore;
    }
    public Double getAvgDeliveryScore() {
        return avgDeliveryScore;
    }
    public void setAvgDeliveryScore(Double avgDeliveryScore) {
        this.avgDeliveryScore = avgDeliveryScore;
    }
    public Integer getDeliverySatisfaction() {
        return deliverySatisfaction;
    }
    public void setDeliverySatisfaction(Integer deliverySatisfaction) {
        this.deliverySatisfaction = deliverySatisfaction;
    }




    @Override
    public String toString() {
        return "WmoperCommentQueryScoreResponse{" + "epoiId=" + epoiId + "," + "avgPoiScore=" + avgPoiScore + "," + "avgTasteScore=" + avgTasteScore + "," + "avgPackingScore=" + avgPackingScore + "," + "avgDeliveryScore=" + avgDeliveryScore + "," + "deliverySatisfaction=" + deliverySatisfaction + "}";
    }
}
