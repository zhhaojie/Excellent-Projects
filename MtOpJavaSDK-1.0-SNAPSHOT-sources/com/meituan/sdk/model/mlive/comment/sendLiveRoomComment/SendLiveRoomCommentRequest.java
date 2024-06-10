package com.meituan.sdk.model.mlive.comment.sendLiveRoomComment;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 发送直播间评论
* This file was automatically generated.
*/
@ApiMeta(
    path = "/mlive/comment/send",
    businessId = 50,
    apiVersion = "10007",
    apiName = "send_live_room_comment",
    needAuth = true
)
public class SendLiveRoomCommentRequest implements MeituanRequest<Boolean> {
    /**
    * <p data-diff-id="ct-diff-id-77d7b1b6-23d5-423a-b7d9-042d82a6b48c">数字人形象id</p>
    */
    @SerializedName("digitalImageId")
    private String digitalImageId;
    /**
    * <p data-diff-id="ct-diff-id-8d0cbba9-7b56-4e2d-8ec1-cc017b7a4054">直播评论DTO</p>
    */
    @SerializedName("liveRoomCommentDTO")
    private LiveRoomCommentDTO liveRoomCommentDTO;
    /**
    * <p data-diff-id="ct-diff-id-abe59782-fa05-47a5-b119-db2c84d1960d">回复评论的id，非必传</p>
    */
    @SerializedName("followCommentId")
    private String followCommentId;
    /**
    * <p data-diff-id="ct-diff-id-19efd590-cc3a-4f3f-8ef1-f74c16c7e837">直播id</p>
    */
    @SerializedName("liveId")
    private Long liveId;
    /**
    * <p data-diff-id="ct-diff-id-f6a5fb02-c5cd-4e0b-b886-15e1433b770a">幂等id</p>
    */
    @SerializedName("uniqueId")
    private String uniqueId;
    /**
    * <p data-diff-id="ct-diff-id-24b40372-257a-4b8c-b2bb-076c1af043c9">链接别名，若无，使用uuid即可</p>
    */
    @SerializedName("alias")
    private String alias;

    public String getDigitalImageId() {
        return digitalImageId;
    }
    public void setDigitalImageId(String digitalImageId) {
        this.digitalImageId = digitalImageId;
    }
    public LiveRoomCommentDTO getLiveRoomCommentDTO() {
        return liveRoomCommentDTO;
    }
    public void setLiveRoomCommentDTO(LiveRoomCommentDTO liveRoomCommentDTO) {
        this.liveRoomCommentDTO = liveRoomCommentDTO;
    }
    public String getFollowCommentId() {
        return followCommentId;
    }
    public void setFollowCommentId(String followCommentId) {
        this.followCommentId = followCommentId;
    }
    public Long getLiveId() {
        return liveId;
    }
    public void setLiveId(Long liveId) {
        this.liveId = liveId;
    }
    public String getUniqueId() {
        return uniqueId;
    }
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }
    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }


    @Override
    public MeituanResponse<Boolean> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<Boolean>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "SendLiveRoomCommentRequest{" + "digitalImageId=" + digitalImageId + "," + "liveRoomCommentDTO=" + liveRoomCommentDTO + "," + "followCommentId=" + followCommentId + "," + "liveId=" + liveId + "," + "uniqueId=" + uniqueId + "," + "alias=" + alias + "}";
    }
}
