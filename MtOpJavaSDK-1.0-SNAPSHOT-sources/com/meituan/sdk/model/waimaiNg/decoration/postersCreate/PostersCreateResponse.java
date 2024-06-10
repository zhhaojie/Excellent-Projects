package com.meituan.sdk.model.waimaiNg.decoration.postersCreate;

import com.google.gson.annotations.SerializedName;

/**
* 商家开放平台创建海报
* This file was automatically generated.
*/
public class PostersCreateResponse {
    /**
    * 海报id
    */
    @SerializedName("post_id")
    private Long postId;

    public Long getPostId() {
        return postId;
    }
    public void setPostId(Long postId) {
        this.postId = postId;
    }




    @Override
    public String toString() {
        return "PostersCreateResponse{" + "postId=" + postId + "}";
    }
}
