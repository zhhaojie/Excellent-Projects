package com.meituan.sdk.model.foodmop.shop.statusUpdate;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class OperateResulst {
    /**
    * 操作是否成功
    */
    @SerializedName("success")
    private Boolean success;
    /**
    * 失败原因  在线状态不合法:vendorBizOpen未设置或者不在枚举值范围内；   门店类型不合法:没有传shopType标识，或者没有shopType场景的情况下shopType不为默认值 10；   门店请求存在重复: 请求中有重复的门店；    门店没有绑定品牌:请求的门店没有在美团绑定到对应品牌下；
    */
    @SerializedName("failMsg")
    private String failMsg;

    public Boolean getSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }
    public String getFailMsg() {
        return failMsg;
    }
    public void setFailMsg(String failMsg) {
        this.failMsg = failMsg;
    }




    @Override
    public String toString() {
        return "OperateResulst{" + "success=" + success + "," + "failMsg=" + failMsg + "}";
    }
}
