package com.meituan.sdk.model.wmoperNg.im.setAutoSendConfigInfo;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class ImTypeSwitchStatusParam {
    /**
    * <p>自动回复类型 </p><p style="text-align: start;"><span style="color: rgb(245, 35, 45)">（这些类型后续可能还会扩展，接口同步自动更新 ）</span></p><p style="text-align: start;"><strong><span style="color: rgb(0, 0, 0)">0 - 操作所有的开关</span></strong></p><p style="text-align: start;">1 - 售后自动回复</p><p style="text-align: start;">7 - 忙碌状态自动回复</p><p style="text-align: start;">9 - 顾客催单场景自动回复</p><p style="text-align: start;">10 - 骑手取餐后补充备注场景自动回复</p><p style="text-align: start;">11 - 顾客补充备注（美配）场景自动回复</p><p style="text-align: start;">12 - 顾客二次强调备注</p><p style="text-align: start;">13 - 顾客要求退款</p><p style="text-align: start;">14 - 顾客要求修改地址</p><p style="text-align: start;">15 - 顾客咨询优惠信息</p><p style="text-align: start;">16 - 顾客咨询发票信息</p><p style="text-align: start;">17 - 顾客闲聊</p><p style="text-align: start;">18 - 邀请评价顾客评价自动回复</p><p style="text-align: start;">19 - 顾客咨询营业时间</p><p style="text-align: start;">20 - 顾客咨询店铺位置</p><p style="text-align: start;">2<span style="color: rgb(0, 0, 0)">1 - 顾客投诉食物中毒、异物</span></p><p style="text-align: start;"><span style="color: rgb(0, 0, 0)">22 - 顾客反馈餐品少送</span></p><p style="text-align: start;"><span style="color: rgb(0, 0, 0)">24 - 无人机咨询</span></p><p style="text-align: start;"><span style="color: rgb(0, 0, 0)">25 - 顾客咨询不同时间能否配送</span></p><p style="text-align: start;"><span style="color: rgb(0, 0, 0)">26 - 顾客咨询能否赠送赠品</span></p><p style="text-align: start;"><span style="color: rgb(0, 0, 0)">27 - 顾客反馈食品安全问题</span></p>
    */
    @SerializedName("type")
    private Integer type;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">开关状态 0关闭 1开启</font></span></p>
    */
    @SerializedName("switchStatus")
    private Integer switchStatus;

    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public Integer getSwitchStatus() {
        return switchStatus;
    }
    public void setSwitchStatus(Integer switchStatus) {
        this.switchStatus = switchStatus;
    }




    @Override
    public String toString() {
        return "ImTypeSwitchStatusParam{" + "type=" + type + "," + "switchStatus=" + switchStatus + "}";
    }
}
