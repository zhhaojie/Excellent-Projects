package com.meituan.sdk.model.waimaiNg.comment.queryCommentList;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询门店评价信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/comment/queryCommentList",
    businessId = 2,
    apiVersion = "10016",
    apiName = "query_comment_list",
    needAuth = false
)
public class QueryCommentListRequest implements MeituanRequest<List<CommentInfo>> {
    @SerializedName("data")
    private String data;

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }


    @Override
    public MeituanResponse<List<CommentInfo>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<CommentInfo>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this.data);
    }


    @Override
    public String toString() {
        return "QueryCommentListRequest{" + "data=" + data + "}";
    }
}
