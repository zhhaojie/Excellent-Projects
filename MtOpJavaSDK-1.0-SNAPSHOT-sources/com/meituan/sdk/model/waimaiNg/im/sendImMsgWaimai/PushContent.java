package com.meituan.sdk.model.waimaiNg.im.sendImMsgWaimai;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p>json格式的消息体，不同bizType时，字段不同，解析方式也不同。</p>
* This file was automatically generated.
*/
public class PushContent {
    /**
    * <p>消息id，确保消息唯一性，发送消息时，为三方的消息id，接收消息时，为美团的消息id。</p>
    */
    @NotNull(message = "msgId不能为空")
    @SerializedName("msg_id")
    private Long msgId;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">加密后的消息内容。</font></span></p>
    */
    @NotBlank(message = "msgContent不能为空")
    @SerializedName("msg_content")
    private String msgContent;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">消息类型。</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">bizType为1两方会话时，支持：1文本，2图片，3其他；</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">bizType为4评价匿名群聊时，支持：</font></span>0文本，2图片；</p><p>bizType为5粉丝群聊时，支持：0文本，2图片；</p><p>bizType为6三方群聊时，支持：0文本，2图片。</p>
    */
    @NotNull(message = "msgType不能为空")
    @SerializedName("msg_type")
    private Integer msgType;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">消息发送方  商家：1，用户：2。</font></span></p>
    */
    @NotNull(message = "msgSource不能为空")
    @SerializedName("msg_source")
    private Integer msgSource;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">消息发送时间,10位时间戳。</font></span></p>
    */
    @NotNull(message = "cts不能为空")
    @SerializedName("cts")
    private Long cts;
    /**
    * <p>订单id。bizType为1两方会话时，此项需要。</p>
    */
    @SerializedName("order_id")
    private Long orderId;
    /**
    * <p>用户id。bizType为1两方会话、6三方群聊时，此项需要。</p>
    */
    @SerializedName("open_user_id")
    private Long openUserId;
    /**
    * <p>场景tag，-1时为普通消息，&gt;0时为场景消息：</p><p>9003："用户投诉商家，紧急消息"</p><p>3002："餐品质量投诉"</p><p>3001："餐品错送/少送"</p><p>9001："用户已尝试联系客服的消息"</p><p>2203："补充备注"</p><p>bizType为1两方会话时，此项需要。</p>
    */
    @SerializedName("scene_tag")
    private Integer sceneTag;
    /**
    * <p>场景名称，<font style="font-size:14px;line-height:22px" data-size="14">为空时时普通消息，不为空时是场景消息，取值同sceneTag</font>。bizType为1两方会话时，此项需要。</p>
    */
    @SerializedName("scene_name")
    private String sceneName;
    /**
    * <p>0默认值，1未回复，2回复。bizType为1两方会话时，此项需要。</p>
    */
    @SerializedName("has_reply")
    private Integer hasReply;
    /**
    * <p>评价id。bizType为4评价联系时，此项需要。</p>
    */
    @SerializedName("comment_id")
    private Long commentId;
    /**
    * <p>群id。bizType为4评价匿名群聊、5粉丝群聊、6三方群聊时，此项需要。</p>
    */
    @SerializedName("group_id")
    private Long groupId;
    /**
    * <p>群名称。bizType为5粉丝群聊时，此项需要。</p>
    */
    @SerializedName("group_name")
    private String groupName;
    /**
    * <p>骑手id。bizType为6三方群聊时，此项需要。</p>
    */
    @SerializedName("rider_id")
    private Long riderId;

    public Long getMsgId() {
        return msgId;
    }
    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }
    public String getMsgContent() {
        return msgContent;
    }
    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }
    public Integer getMsgType() {
        return msgType;
    }
    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }
    public Integer getMsgSource() {
        return msgSource;
    }
    public void setMsgSource(Integer msgSource) {
        this.msgSource = msgSource;
    }
    public Long getCts() {
        return cts;
    }
    public void setCts(Long cts) {
        this.cts = cts;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Long getOpenUserId() {
        return openUserId;
    }
    public void setOpenUserId(Long openUserId) {
        this.openUserId = openUserId;
    }
    public Integer getSceneTag() {
        return sceneTag;
    }
    public void setSceneTag(Integer sceneTag) {
        this.sceneTag = sceneTag;
    }
    public String getSceneName() {
        return sceneName;
    }
    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }
    public Integer getHasReply() {
        return hasReply;
    }
    public void setHasReply(Integer hasReply) {
        this.hasReply = hasReply;
    }
    public Long getCommentId() {
        return commentId;
    }
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }
    public Long getGroupId() {
        return groupId;
    }
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public Long getRiderId() {
        return riderId;
    }
    public void setRiderId(Long riderId) {
        this.riderId = riderId;
    }




    @Override
    public String toString() {
        return "PushContent{" + "msgId=" + msgId + "," + "msgContent=" + msgContent + "," + "msgType=" + msgType + "," + "msgSource=" + msgSource + "," + "cts=" + cts + "," + "orderId=" + orderId + "," + "openUserId=" + openUserId + "," + "sceneTag=" + sceneTag + "," + "sceneName=" + sceneName + "," + "hasReply=" + hasReply + "," + "commentId=" + commentId + "," + "groupId=" + groupId + "," + "groupName=" + groupName + "," + "riderId=" + riderId + "}";
    }
}
