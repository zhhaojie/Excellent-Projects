package com.meituan.sdk.model.wmoperNg.govern.governViolationScoreRecordQuery;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 积分记录查询
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/govern/violation/score/record/query",
    businessId = 16,
    apiVersion = "10001",
    apiName = "govern_violation_score_record_query",
    needAuth = true
)
public class GovernViolationScoreRecordQueryRequest implements MeituanRequest<GovernViolationScoreRecordQueryResponse> {
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">页数，从1开始</font></p>
    */
    @SerializedName("pageNum")
    private Integer pageNum;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">页大小，最多20</font></p>
    */
    @SerializedName("pageSize")
    private Integer pageSize;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">违规类型</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">1-一般违规</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">51-严重违规</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">0-同时包含一般和严重违规</font></p>
    */
    @SerializedName("violationType")
    private Integer violationType;

    public Integer getPageNum() {
        return pageNum;
    }
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
    public Integer getPageSize() {
        return pageSize;
    }
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
    public Integer getViolationType() {
        return violationType;
    }
    public void setViolationType(Integer violationType) {
        this.violationType = violationType;
    }


    @Override
    public MeituanResponse<GovernViolationScoreRecordQueryResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GovernViolationScoreRecordQueryResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GovernViolationScoreRecordQueryRequest{" + "pageNum=" + pageNum + "," + "pageSize=" + pageSize + "," + "violationType=" + violationType + "}";
    }
}
