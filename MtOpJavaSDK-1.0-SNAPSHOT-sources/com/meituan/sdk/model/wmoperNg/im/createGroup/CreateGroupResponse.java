package com.meituan.sdk.model.wmoperNg.im.createGroup;

import com.google.gson.annotations.SerializedName;

/**
* 创建群接口
* This file was automatically generated.
*/
public class CreateGroupResponse {
    /**
    * 群id
    */
    @SerializedName("group_id")
    private Long groupId;
    /**
    * 创建时间
    */
    @SerializedName("ctime")
    private Long ctime;
    /**
    * 群聊状态
    */
    @SerializedName("state")
    private Integer state;
    /**
    * 关闭类型
    */
    @SerializedName("close_type")
    private String closeType;
    /**
    * 是否是新群
    */
    @SerializedName("new_group")
    private String newGroup;

    public Long getGroupId() {
        return groupId;
    }
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
    public Long getCtime() {
        return ctime;
    }
    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }
    public Integer getState() {
        return state;
    }
    public void setState(Integer state) {
        this.state = state;
    }
    public String getCloseType() {
        return closeType;
    }
    public void setCloseType(String closeType) {
        this.closeType = closeType;
    }
    public String getNewGroup() {
        return newGroup;
    }
    public void setNewGroup(String newGroup) {
        this.newGroup = newGroup;
    }




    @Override
    public String toString() {
        return "CreateGroupResponse{" + "groupId=" + groupId + "," + "ctime=" + ctime + "," + "state=" + state + "," + "closeType=" + closeType + "," + "newGroup=" + newGroup + "}";
    }
}
