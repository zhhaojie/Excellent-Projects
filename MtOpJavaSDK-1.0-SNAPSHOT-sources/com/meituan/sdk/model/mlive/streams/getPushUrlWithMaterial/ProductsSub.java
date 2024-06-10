package com.meituan.sdk.model.mlive.streams.getPushUrlWithMaterial;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-4f631e9a-567a-475a-8f03-b03bad4976ac"><span style="color: rgb(51, 51, 51)">必传，商品列表</span></p>
* This file was automatically generated.
*/
public class ProductsSub {
    /**
    * <p data-diff-id="ct-diff-id-5ae01d73-16a8-45d1-a2f5-e70b5a273538">商品讲解预设的问题&amp;回答</p><p data-diff-id="ct-diff-id-533af1d8-a696-4998-a93b-0f09cbe43f4d">generateType=2时，可不传；其它情况，必传</p>
    */
    @SerializedName("questions")
    private List<QuestionsSub> questions;
    /**
    * <p data-diff-id="ct-diff-id-78e5b8cf-87b5-4b48-8d2f-3032aff56a53">商品名称，必传</p>
    */
    @SerializedName("productName")
    private String productName;
    /**
    * <p data-diff-id="ct-diff-id-b9ef5cae-a239-4662-98f6-c2d4312bb08b">商品讲解台词内容，必传</p>
    */
    @SerializedName("content")
    private String content;

    public List<QuestionsSub> getQuestions() {
        return questions;
    }
    public void setQuestions(List<QuestionsSub> questions) {
        this.questions = questions;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }




    @Override
    public String toString() {
        return "ProductsSub{" + "questions=" + questions + "," + "productName=" + productName + "," + "content=" + content + "}";
    }
}
