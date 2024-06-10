package com.meituan.sdk.model.moses.dialog.trigger;

import com.google.gson.annotations.SerializedName;

/**
* 意图识别信息
* This file was automatically generated.
*/
public class TDialogAct {
    /**
    * 意图类型。intentClarify：意图澄清；  faqTask：问答类型的意图；  normalTask：正常Task
    */
    @SerializedName("act")
    private String act;

    public String getAct() {
        return act;
    }
    public void setAct(String act) {
        this.act = act;
    }




    @Override
    public String toString() {
        return "TDialogAct{" + "act=" + act + "}";
    }
}
