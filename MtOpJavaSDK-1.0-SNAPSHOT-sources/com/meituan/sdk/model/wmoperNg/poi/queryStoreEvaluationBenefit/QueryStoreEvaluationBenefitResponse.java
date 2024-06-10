package com.meituan.sdk.model.wmoperNg.poi.queryStoreEvaluationBenefit;

import com.google.gson.annotations.SerializedName;

/**
* 查询门店实时评价权益
* This file was automatically generated.
*/
public class QueryStoreEvaluationBenefitResponse {
    /**
    * 门店实时评价权益, true: 可以  false: 不可以
    */
    @SerializedName("commentRealTime")
    private Boolean commentRealTime;

    public Boolean getCommentRealTime() {
        return commentRealTime;
    }
    public void setCommentRealTime(Boolean commentRealTime) {
        this.commentRealTime = commentRealTime;
    }




    @Override
    public String toString() {
        return "QueryStoreEvaluationBenefitResponse{" + "commentRealTime=" + commentRealTime + "}";
    }
}
