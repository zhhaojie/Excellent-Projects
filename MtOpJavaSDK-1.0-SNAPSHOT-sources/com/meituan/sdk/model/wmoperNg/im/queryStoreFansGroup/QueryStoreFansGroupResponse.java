package com.meituan.sdk.model.wmoperNg.im.queryStoreFansGroup;

import com.google.gson.annotations.SerializedName;

/**
* 查询门店的粉丝群
* This file was automatically generated.
*/
public class QueryStoreFansGroupResponse {
    /**
    * 大象群ID 偏移
    */
    @SerializedName("groupId")
    private Long groupId;
    /**
    * 群名称
    */
    @SerializedName("groupName")
    private String groupName;
    /**
    * 粉丝群序号
    */
    @SerializedName("groupIndex")
    private Integer groupIndex;
    /**
    * 群聊人数
    */
    @SerializedName("memberCount")
    private Integer memberCount;
    /**
    * 群公告
    */
    @SerializedName("groupAnnounce")
    private String groupAnnounce;
    /**
    * 入群导语
    */
    @SerializedName("groupIntro")
    private String groupIntro;
    /**
    * 群入口开关 0-开启 1-关闭
    */
    @SerializedName("groupEntrance")
    private Integer groupEntrance;
    /**
    * 群状态 1-正常 2-关闭
    */
    @SerializedName("status")
    private Integer status;

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
    public Integer getGroupIndex() {
        return groupIndex;
    }
    public void setGroupIndex(Integer groupIndex) {
        this.groupIndex = groupIndex;
    }
    public Integer getMemberCount() {
        return memberCount;
    }
    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }
    public String getGroupAnnounce() {
        return groupAnnounce;
    }
    public void setGroupAnnounce(String groupAnnounce) {
        this.groupAnnounce = groupAnnounce;
    }
    public String getGroupIntro() {
        return groupIntro;
    }
    public void setGroupIntro(String groupIntro) {
        this.groupIntro = groupIntro;
    }
    public Integer getGroupEntrance() {
        return groupEntrance;
    }
    public void setGroupEntrance(Integer groupEntrance) {
        this.groupEntrance = groupEntrance;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }




    @Override
    public String toString() {
        return "QueryStoreFansGroupResponse{" + "groupId=" + groupId + "," + "groupName=" + groupName + "," + "groupIndex=" + groupIndex + "," + "memberCount=" + memberCount + "," + "groupAnnounce=" + groupAnnounce + "," + "groupIntro=" + groupIntro + "," + "groupEntrance=" + groupEntrance + "," + "status=" + status + "}";
    }
}
