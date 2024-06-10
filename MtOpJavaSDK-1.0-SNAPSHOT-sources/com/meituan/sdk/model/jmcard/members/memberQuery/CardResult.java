package com.meituan.sdk.model.jmcard.members.memberQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class CardResult {
    /**
    * 表单内容列表
    */
    @SerializedName("formItemList")
    private List<FormItem> formItemList;
    /**
    * 用户领卡时间
    */
    @SerializedName("receiveTime")
    private Long receiveTime;
    /**
    * 用户卡过期时间
    */
    @SerializedName("expireTime")
    private Long expireTime;
    /**
    * 卡号
    */
    @SerializedName("cardNumber")
    private String cardNumber;

    public List<FormItem> getFormItemList() {
        return formItemList;
    }
    public void setFormItemList(List<FormItem> formItemList) {
        this.formItemList = formItemList;
    }
    public Long getReceiveTime() {
        return receiveTime;
    }
    public void setReceiveTime(Long receiveTime) {
        this.receiveTime = receiveTime;
    }
    public Long getExpireTime() {
        return expireTime;
    }
    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }




    @Override
    public String toString() {
        return "CardResult{" + "formItemList=" + formItemList + "," + "receiveTime=" + receiveTime + "," + "expireTime=" + expireTime + "," + "cardNumber=" + cardNumber + "}";
    }
}
