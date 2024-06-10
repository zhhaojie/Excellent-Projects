package com.meituan.sdk.model.moses.dialog.trigger;

import com.google.gson.annotations.SerializedName;

/**
* 扩展信息，目前选项卡的答案在该字段的mosesTabAnswer属性中
* This file was automatically generated.
*/
public class ExtData {
    /**
    * 选项卡的答案
    */
    @SerializedName("mosesTabAnswer")
    private String mosesTabAnswer;

    public String getMosesTabAnswer() {
        return mosesTabAnswer;
    }
    public void setMosesTabAnswer(String mosesTabAnswer) {
        this.mosesTabAnswer = mosesTabAnswer;
    }




    @Override
    public String toString() {
        return "ExtData{" + "mosesTabAnswer=" + mosesTabAnswer + "}";
    }
}
