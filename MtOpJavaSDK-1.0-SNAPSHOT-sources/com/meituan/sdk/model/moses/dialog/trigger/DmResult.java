package com.meituan.sdk.model.moses.dialog.trigger;

import com.google.gson.annotations.SerializedName;

/**
* 包括意图信息，返回话术信息等，是一个列表
* This file was automatically generated.
*/
public class DmResult {
    /**
    * 意图识别信息
    */
    @SerializedName("tDialogAct")
    private TDialogAct tDialogAct;
    /**
    * 回复类型 。text：普通文本；  list：列表
    */
    @SerializedName("solutionType")
    private String solutionType;
    /**
    * 回复结果。如果为空，表示执行失败了。
    */
    @SerializedName("solution")
    private String solution;
    /**
    * spokenText和solution的值一般是一样的
    */
    @SerializedName("spokenText")
    private String spokenText;
    /**
    * 答案的类型 。默认的类型为空；mosesTab：表示选项卡类型，需要用户选择，此时具体的选项信息在extData.mosesTabAnswer字段的json中
    */
    @SerializedName("answerType")
    private String answerType;
    /**
    * 扩展信息，目前选项卡的答案在该字段的mosesTabAnswer属性中
    */
    @SerializedName("extData")
    private ExtData extData;

    public TDialogAct getTDialogAct() {
        return tDialogAct;
    }
    public void setTDialogAct(TDialogAct tDialogAct) {
        this.tDialogAct = tDialogAct;
    }
    public String getSolutionType() {
        return solutionType;
    }
    public void setSolutionType(String solutionType) {
        this.solutionType = solutionType;
    }
    public String getSolution() {
        return solution;
    }
    public void setSolution(String solution) {
        this.solution = solution;
    }
    public String getSpokenText() {
        return spokenText;
    }
    public void setSpokenText(String spokenText) {
        this.spokenText = spokenText;
    }
    public String getAnswerType() {
        return answerType;
    }
    public void setAnswerType(String answerType) {
        this.answerType = answerType;
    }
    public ExtData getExtData() {
        return extData;
    }
    public void setExtData(ExtData extData) {
        this.extData = extData;
    }




    @Override
    public String toString() {
        return "DmResult{" + "tDialogAct=" + tDialogAct + "," + "solutionType=" + solutionType + "," + "solution=" + solution + "," + "spokenText=" + spokenText + "," + "answerType=" + answerType + "," + "extData=" + extData + "}";
    }
}
