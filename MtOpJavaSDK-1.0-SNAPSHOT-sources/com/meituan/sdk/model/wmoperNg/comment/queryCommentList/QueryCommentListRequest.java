package com.meituan.sdk.model.wmoperNg.comment.queryCommentList;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询门店评价信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/comment/queryCommentList",
    businessId = 16,
    apiVersion = "10013",
    apiName = "query_comment_list",
    needAuth = false
)
public class QueryCommentListRequest implements MeituanRequest<List<QueryCommentListResponse>> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">查询评价起始时间</font></span></p>
    */
    @NotBlank(message = "startTime不能为空")
    @SerializedName("startTime")
    private String startTime;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">查询评价结束时间</font></span></p>
    */
    @NotBlank(message = "endTime不能为空")
    @SerializedName("endTime")
    private String endTime;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">查询起始位置</font></span></p>
    */
    @NotNull(message = "offset不能为空")
    @SerializedName("offset")
    private Integer offset;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">查询条数</font></span></p>
    */
    @NotNull(message = "limit不能为空")
    @SerializedName("limit")
    private Integer limit;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">商家回复状态。取值范围：-1全部，0未回复，1已回复</font></span></p>
    */
    @SerializedName("replyStatus")
    private Integer replyStatus;
    /**
    * <p data-diff-id="ct-diff-id-f8860cdc-37b6-4753-9fa2-fd8c1b8ff8a6">业务标识</p><p data-diff-id="ct-diff-id-8a5fff56-a568-4685-8ea6-86756b82ad9c">传“biz~1002~Waimai~18”只返回外卖评价，不传或者传其他返回所有</p><p data-diff-id="ct-diff-id-e3774892-61f7-4caf-89d3-7e50e33650d2">传biz~2004~PinhaofanBAPI~35只返回拼好饭评价</p><p data-diff-id="ct-diff-id-51b8ecd2-ce02-4e60-a6d8-e0f0aff67a98"></p>
    */
    @SerializedName("bizKey")
    private String bizKey;

    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    public Integer getOffset() {
        return offset;
    }
    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    public Integer getReplyStatus() {
        return replyStatus;
    }
    public void setReplyStatus(Integer replyStatus) {
        this.replyStatus = replyStatus;
    }
    public String getBizKey() {
        return bizKey;
    }
    public void setBizKey(String bizKey) {
        this.bizKey = bizKey;
    }


    @Override
    public MeituanResponse<List<QueryCommentListResponse>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<QueryCommentListResponse>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryCommentListRequest{" + "startTime=" + startTime + "," + "endTime=" + endTime + "," + "offset=" + offset + "," + "limit=" + limit + "," + "replyStatus=" + replyStatus + "," + "bizKey=" + bizKey + "}";
    }
}
