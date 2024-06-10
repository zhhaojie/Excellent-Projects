package com.meituan.sdk.model.waimaiNg.im.getAutoSendConfigInfo;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class AutoSendConfigInfo {
    /**
    * 自动回复类型   （这些类型后续可能还会扩展，接口同步自动更新 ）  1- 售后自动回复  7 - 忙碌状态自动回复  9 - 顾客催单场景自动回复  10 - 骑手取餐后补充备注场景自动回复  11 - 顾客补充备注（美配）场景自动回复  12 - 顾客二次强调备注  13 - 顾客要求退款  14 - 顾客要求修改地址  15 - 顾客咨询优惠信息  16 - 顾客咨询发票信息  17 - 顾客闲聊  18 - 邀请评价顾客评价自动回复  19 - 顾客咨询营业时间  20 - 顾客咨询店铺位置  21 - 顾客投诉食物中毒、异物  22 - 顾客反馈餐品少送  24 - 无人机咨询  25 - 顾客咨询不同时间能否配送  26 - 顾客咨询能否赠送赠品  27 - 顾客反馈食品安全问题
    */
    @SerializedName("type")
    private Integer type;
    /**
    * 开关状态 0关闭 1开启
    */
    @SerializedName("status")
    private Integer status;
    /**
    * 场景名称  如 售后自动回复 同type中的备注
    */
    @SerializedName("sceneName")
    private String sceneName;
    /**
    * 回复内容
    */
    @SerializedName("content")
    private String content;

    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getSceneName() {
        return sceneName;
    }
    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }




    @Override
    public String toString() {
        return "AutoSendConfigInfo{" + "type=" + type + "," + "status=" + status + "," + "sceneName=" + sceneName + "," + "content=" + content + "}";
    }
}
