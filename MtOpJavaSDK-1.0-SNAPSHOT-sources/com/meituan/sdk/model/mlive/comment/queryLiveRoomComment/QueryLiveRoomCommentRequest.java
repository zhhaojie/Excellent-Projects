package com.meituan.sdk.model.mlive.comment.queryLiveRoomComment;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询直播间用户评论
* This file was automatically generated.
*/
@ApiMeta(
    path = "/mlive/comment/query",
    businessId = 50,
    apiVersion = "10006",
    apiName = "query_live_room_comment",
    needAuth = true
)
public class QueryLiveRoomCommentRequest implements MeituanRequest<List<LiveRoomCommentDTO>> {
    /**
    * <p data-diff-id="ct-diff-id-b94154f6-f6a6-4be0-b7d6-de4e00b06830">查询游标，偏移量（该字段已废弃，请通过pageNum字段进行分页查询）</p>
    */
    @SerializedName("cursor")
    private Long cursor;
    /**
    * <p data-diff-id="ct-diff-id-bc8bc920-4126-4190-beca-32788c4564ac">消息条数限制，最大200</p>
    */
    @SerializedName("limit")
    private Long limit;
    /**
    * <p data-diff-id="ct-diff-id-923ece43-8eb3-49d6-96dd-b7a73abdc4ef">请求开始时间，yyyy-MM-dd HH:mm:ss 格式</p>
    */
    @SerializedName("startTime")
    private String startTime;
    /**
    * <p data-diff-id="ct-diff-id-e7760f80-d42c-4869-b114-55c275e5dc5d">请求结束时间，yyyy-MM-dd HH:mm:ss 格式</p>
    */
    @SerializedName("endTime")
    private String endTime;
    /**
    * <p data-diff-id="ct-diff-id-36f5d92f-484e-4a52-93f3-81ee909d4c2e">直播场次id</p>
    */
    @SerializedName("liveId")
    private Long liveId;
    /**
    * <p data-diff-id="ct-diff-id-677177d2-6aee-4868-a62d-6e98a7d527a6"><span style="color: rgba(0, 0, 0, 0.65)">页码</span><span style="color: ">，时间区间内的页数，从1开始，</span><span style="color: rgba(0, 0, 0, 0.87)">最大限制30页</span></p>
    */
    @SerializedName("pageNum")
    private Integer pageNum;

    public Long getCursor() {
        return cursor;
    }
    public void setCursor(Long cursor) {
        this.cursor = cursor;
    }
    public Long getLimit() {
        return limit;
    }
    public void setLimit(Long limit) {
        this.limit = limit;
    }
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
    public Long getLiveId() {
        return liveId;
    }
    public void setLiveId(Long liveId) {
        this.liveId = liveId;
    }
    public Integer getPageNum() {
        return pageNum;
    }
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }


    @Override
    public MeituanResponse<List<LiveRoomCommentDTO>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<LiveRoomCommentDTO>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryLiveRoomCommentRequest{" + "cursor=" + cursor + "," + "limit=" + limit + "," + "startTime=" + startTime + "," + "endTime=" + endTime + "," + "liveId=" + liveId + "," + "pageNum=" + pageNum + "}";
    }
}
