package com.meituan.sdk.model.waimaiNg.im.createGroup;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 创建群接口
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/im/createGroup",
    businessId = 2,
    apiVersion = "10017",
    apiName = "create_group",
    needAuth = true
)
public class CreateGroupRequest implements MeituanRequest<CreateGroupResponse> {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">群聊类型，评价联系：1</font></span></p>
    */
    @NotNull(message = "groupType不能为空")
    @SerializedName("group_type")
    private Integer groupType;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">评价联系需要的参数，group_type为1时的必填参数，</font></span></p>
    */
    @SerializedName("comment_id")
    private Long commentId;

    public Integer getGroupType() {
        return groupType;
    }
    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }
    public Long getCommentId() {
        return commentId;
    }
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }


    @Override
    public MeituanResponse<CreateGroupResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<CreateGroupResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CreateGroupRequest{" + "groupType=" + groupType + "," + "commentId=" + commentId + "}";
    }
}
