package com.meituan.sdk.model.foodmop.shop.statusUpdate;

import com.google.gson.annotations.SerializedName;

/**
* Key：vendorShopId（品牌门店Id） Value：OperateResulst（数据校验结果）
* This file was automatically generated.
*/
public class DataMap {
    @SerializedName("OperateResulst")
    private OperateResulst operateResulst;

    public OperateResulst getOperateResulst() {
        return operateResulst;
    }
    public void setOperateResulst(OperateResulst operateResulst) {
        this.operateResulst = operateResulst;
    }




    @Override
    public String toString() {
        return "DataMap{" + "operateResulst=" + operateResulst + "}";
    }
}
