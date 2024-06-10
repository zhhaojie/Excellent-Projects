package com.meituan.sdk.model.waimaiNg.im.createFansGroup;

import com.google.gson.annotations.SerializedName;

/**
* 创建粉丝群
* This file was automatically generated.
*/
public class CreateFansGroupResponse {
    /**
    * 大象群ID  偏移
    */
    @SerializedName("groupId")
    private Long groupId;
    /**
    * 群名称
    */
    @SerializedName("groupName")
    private String groupName;

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




    @Override
    public String toString() {
        return "CreateFansGroupResponse{" + "groupId=" + groupId + "," + "groupName=" + groupName + "}";
    }
}
