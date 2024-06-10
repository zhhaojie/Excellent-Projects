package com.meituan.sdk.model.wmoperNg.comment.queryCommentList;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 
* This file was automatically generated.
*/
public class QueryCommentListResponse {
    @NotBlank(message = "result不能为空")
    @SerializedName("result")
    private String result;
    /**
    * 评价ID
    */
    @NotNull(message = "commentId不能为空")
    @SerializedName("comment_id")
    private Long commentId;
    /**
    * 用户首次评价的内容
    */
    @NotBlank(message = "commentContent不能为空")
    @SerializedName("comment_content")
    private String commentContent;
    /**
    * 口味评分
    */
    @NotNull(message = "orderCommentScore不能为空")
    @SerializedName("order_comment_score")
    private Integer orderCommentScore;
    /**
    * 商家评分(星级评分)
    */
    @NotNull(message = "foodCommentScore不能为空")
    @SerializedName("food_comment_score")
    private Integer foodCommentScore;
    /**
    * 配送评价分数
    */
    @NotNull(message = "deliveryCommentScore不能为空")
    @SerializedName("delivery_comment_score")
    private Integer deliveryCommentScore;
    /**
    * 追评内容
    */
    @NotBlank(message = "addComment不能为空")
    @SerializedName("add_comment")
    private String addComment;
    /**
    * 用户追评时间
    */
    @NotBlank(message = "addCommentTime不能为空")
    @SerializedName("add_comment_time")
    private String addCommentTime;
    /**
    * 包装评价分数
    */
    @NotNull(message = "packingScore不能为空")
    @SerializedName("packing_score")
    private Integer packingScore;
    /**
    * 用户首次评价的时间
    */
    @NotBlank(message = "commentTime不能为空")
    @SerializedName("comment_time")
    private String commentTime;
    /**
    * 评价标签
    */
    @NotBlank(message = "commentLables不能为空")
    @SerializedName("comment_lables")
    private String commentLables;
    /**
    * 配送时间。单位为分钟
    */
    @NotNull(message = "shipTime不能为空")
    @SerializedName("ship_time")
    private Integer shipTime;
    /**
    * 用户提交的评价图片，多个图片url以英文逗号隔开。
    */
    @NotBlank(message = "commentPictures不能为空")
    @SerializedName("comment_pictures")
    private String commentPictures;
    /**
    * 用户点赞的菜品
    */
    @NotBlank(message = "praiseFoodList不能为空")
    @SerializedName("praise_food_list")
    private String praiseFoodList;
    /**
    * 用户点踩的菜品
    */
    @NotBlank(message = "criticFoodList不能为空")
    @SerializedName("critic_food_list")
    private String criticFoodList;
    /**
    * 商家回复该评价的状态。0未回复，1已回复
    */
    @NotNull(message = "replyStatus不能为空")
    @SerializedName("reply_status")
    private Integer replyStatus;
    @NotEmpty(message = "commentOrderDetail不能为空")
    @SerializedName("comment_order_detail")
    private List<CommentOrderDetail> commentOrderDetail;
    /**
    * 商家回复内容
    */
    @NotBlank(message = "eReplyContent不能为空")
    @SerializedName("e_reply_content")
    private String eReplyContent;
    /**
    * 商家回复时间(精确到天)
    */
    @NotBlank(message = "eReplyTime不能为空")
    @SerializedName("e_reply_time")
    private String eReplyTime;
    @NotNull(message = "commentType不能为空")
    @SerializedName("comment_type")
    private Integer commentType;
    @NotNull(message = "valid不能为空")
    @SerializedName("valid")
    private Integer valid;
    @SerializedName("user_id")
    private Long userId;
    /**
    * 未超时/超时0分钟=空字符串， 超时(0,10)分钟=超时10分钟内送达， 超时超过10分钟=超时10分钟以上送达(“原ship_time字段已废弃”)
    */
    @SerializedName("over_delivery_time_desc")
    private String overDeliveryTimeDesc;

    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    public Long getCommentId() {
        return commentId;
    }
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }
    public String getCommentContent() {
        return commentContent;
    }
    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }
    public Integer getOrderCommentScore() {
        return orderCommentScore;
    }
    public void setOrderCommentScore(Integer orderCommentScore) {
        this.orderCommentScore = orderCommentScore;
    }
    public Integer getFoodCommentScore() {
        return foodCommentScore;
    }
    public void setFoodCommentScore(Integer foodCommentScore) {
        this.foodCommentScore = foodCommentScore;
    }
    public Integer getDeliveryCommentScore() {
        return deliveryCommentScore;
    }
    public void setDeliveryCommentScore(Integer deliveryCommentScore) {
        this.deliveryCommentScore = deliveryCommentScore;
    }
    public String getAddComment() {
        return addComment;
    }
    public void setAddComment(String addComment) {
        this.addComment = addComment;
    }
    public String getAddCommentTime() {
        return addCommentTime;
    }
    public void setAddCommentTime(String addCommentTime) {
        this.addCommentTime = addCommentTime;
    }
    public Integer getPackingScore() {
        return packingScore;
    }
    public void setPackingScore(Integer packingScore) {
        this.packingScore = packingScore;
    }
    public String getCommentTime() {
        return commentTime;
    }
    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }
    public String getCommentLables() {
        return commentLables;
    }
    public void setCommentLables(String commentLables) {
        this.commentLables = commentLables;
    }
    public Integer getShipTime() {
        return shipTime;
    }
    public void setShipTime(Integer shipTime) {
        this.shipTime = shipTime;
    }
    public String getCommentPictures() {
        return commentPictures;
    }
    public void setCommentPictures(String commentPictures) {
        this.commentPictures = commentPictures;
    }
    public String getPraiseFoodList() {
        return praiseFoodList;
    }
    public void setPraiseFoodList(String praiseFoodList) {
        this.praiseFoodList = praiseFoodList;
    }
    public String getCriticFoodList() {
        return criticFoodList;
    }
    public void setCriticFoodList(String criticFoodList) {
        this.criticFoodList = criticFoodList;
    }
    public Integer getReplyStatus() {
        return replyStatus;
    }
    public void setReplyStatus(Integer replyStatus) {
        this.replyStatus = replyStatus;
    }
    public List<CommentOrderDetail> getCommentOrderDetail() {
        return commentOrderDetail;
    }
    public void setCommentOrderDetail(List<CommentOrderDetail> commentOrderDetail) {
        this.commentOrderDetail = commentOrderDetail;
    }
    public String getEReplyContent() {
        return eReplyContent;
    }
    public void setEReplyContent(String eReplyContent) {
        this.eReplyContent = eReplyContent;
    }
    public String getEReplyTime() {
        return eReplyTime;
    }
    public void setEReplyTime(String eReplyTime) {
        this.eReplyTime = eReplyTime;
    }
    public Integer getCommentType() {
        return commentType;
    }
    public void setCommentType(Integer commentType) {
        this.commentType = commentType;
    }
    public Integer getValid() {
        return valid;
    }
    public void setValid(Integer valid) {
        this.valid = valid;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getOverDeliveryTimeDesc() {
        return overDeliveryTimeDesc;
    }
    public void setOverDeliveryTimeDesc(String overDeliveryTimeDesc) {
        this.overDeliveryTimeDesc = overDeliveryTimeDesc;
    }




    @Override
    public String toString() {
        return "QueryCommentListResponse{" + "result=" + result + "," + "commentId=" + commentId + "," + "commentContent=" + commentContent + "," + "orderCommentScore=" + orderCommentScore + "," + "foodCommentScore=" + foodCommentScore + "," + "deliveryCommentScore=" + deliveryCommentScore + "," + "addComment=" + addComment + "," + "addCommentTime=" + addCommentTime + "," + "packingScore=" + packingScore + "," + "commentTime=" + commentTime + "," + "commentLables=" + commentLables + "," + "shipTime=" + shipTime + "," + "commentPictures=" + commentPictures + "," + "praiseFoodList=" + praiseFoodList + "," + "criticFoodList=" + criticFoodList + "," + "replyStatus=" + replyStatus + "," + "commentOrderDetail=" + commentOrderDetail + "," + "eReplyContent=" + eReplyContent + "," + "eReplyTime=" + eReplyTime + "," + "commentType=" + commentType + "," + "valid=" + valid + "," + "userId=" + userId + "," + "overDeliveryTimeDesc=" + overDeliveryTimeDesc + "}";
    }
}
