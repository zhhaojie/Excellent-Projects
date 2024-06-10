package com.meituan.sdk.model.waimaiNg.decoration.postersCreateForSpuId;

import com.google.gson.annotations.SerializedName;

/**
* 门店装修-新建海报接口(通过spuid)
* This file was automatically generated.
*/
public class PostersCreateForSpuIdResponse {
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
        return "PostersCreateForSpuIdResponse{" + "postId=" + postId + "}";
    }
}
