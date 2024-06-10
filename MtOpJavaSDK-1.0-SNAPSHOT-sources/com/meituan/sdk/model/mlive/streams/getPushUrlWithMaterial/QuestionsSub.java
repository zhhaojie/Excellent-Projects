package com.meituan.sdk.model.mlive.streams.getPushUrlWithMaterial;

import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-5ae01d73-16a8-45d1-a2f5-e70b5a273538">商品讲解预设的问题&amp;回答</p><p data-diff-id="ct-diff-id-533af1d8-a696-4998-a93b-0f09cbe43f4d">generateType=2时，可不传；其它情况，必传</p>
* This file was automatically generated.
*/
public class QuestionsSub {
    /**
    * <p data-diff-id="ct-diff-id-9debc78c-bbef-4c02-b5f7-58eeff59834a">商品问题</p><p data-diff-id="ct-diff-id-0a1b832f-a50a-47ef-979c-747e1011aaf0">questions非空时，必传</p>
    */
    @SerializedName("question")
    private String question;
    /**
    * <p data-diff-id="ct-diff-id-cf3fa859-e9e1-48c6-9640-2778ece69f36">商品回答</p><p data-diff-id="ct-diff-id-17a0e965-39f4-4b99-b1c2-fd78c9ab5e11">questions非空时，必传</p>
    */
    @SerializedName("answer")
    private String answer;

    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }




    @Override
    public String toString() {
        return "QuestionsSub{" + "question=" + question + "," + "answer=" + answer + "}";
    }
}
