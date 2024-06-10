package com.meituan.sdk.model.design.image.mattingPredict;

import com.google.gson.annotations.SerializedName;

/**
* 智能抠图服务 可指定对菜品或商品进行智能抠图，并返回指定物品结果图片
* This file was automatically generated.
*/
public class MattingPredictResponse {
    /**
    * 1:菜品抠图  2:商品抠图
    */
    @SerializedName("type")
    private Integer type;
    /**
    * 图片二进制 Base64编码
    */
    @SerializedName("content")
    private String content;

    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }




    @Override
    public String toString() {
        return "MattingPredictResponse{" + "type=" + type + "," + "content=" + content + "}";
    }
}
