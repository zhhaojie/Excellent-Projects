package com.meituan.sdk.model.foodmop.shop.tagPush;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;
import javax.validation.constraints.NotEmpty;

/**
* 品牌门店标签推送
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/shop/tag/push",
    businessId = 51,
    apiVersion = "10005",
    apiName = "tag_push",
    needAuth = true
)
public class TagPushRequest implements MeituanRequest<List<String>> {
    /**
    * <p data-diff-id="ct-diff-id-6e27f927-e995-43db-a2aa-cdf6faaa4988">请求流水号，唯一</p>
    */
    @NotBlank(message = "requestId不能为空")
    @SerializedName("requestId")
    private String requestId;
    /**
    * <p data-diff-id="ct-diff-id-97a819fb-dd20-46c6-906b-123ec6cbc4e2">标签code 【size &lt;= 20】</p>
    */
    @NotEmpty(message = "tagList不能为空")
    @SerializedName("tagList")
    private List<Tag> tagList;

    public String getRequestId() {
        return requestId;
    }
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
    public List<Tag> getTagList() {
        return tagList;
    }
    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }


    @Override
    public MeituanResponse<List<String>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<String>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "TagPushRequest{" + "requestId=" + requestId + "," + "tagList=" + tagList + "}";
    }
}
