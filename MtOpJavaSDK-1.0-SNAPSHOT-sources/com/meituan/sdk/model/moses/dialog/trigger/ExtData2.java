package com.meituan.sdk.model.moses.dialog.trigger;

import com.google.gson.annotations.SerializedName;

/**
* 扩展字段
* This file was automatically generated.
*/
public class ExtData2 {
    /**
    * 问答类型意图答案的图片列表
    */
    @SerializedName("answerPicList")
    private String answerPicList;

    public String getAnswerPicList() {
        return answerPicList;
    }
    public void setAnswerPicList(String answerPicList) {
        this.answerPicList = answerPicList;
    }




    @Override
    public String toString() {
        return "ExtData2{" + "answerPicList=" + answerPicList + "}";
    }
}
