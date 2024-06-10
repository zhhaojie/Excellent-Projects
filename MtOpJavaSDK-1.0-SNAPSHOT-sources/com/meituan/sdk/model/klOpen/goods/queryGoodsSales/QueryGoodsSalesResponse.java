package com.meituan.sdk.model.klOpen.goods.queryGoodsSales;

import com.google.gson.annotations.SerializedName;

/**
* 查询sku售卖信息
* This file was automatically generated.
*/
public class QueryGoodsSalesResponse {
    @SerializedName("total")
    private String total;
    @SerializedName("list")
    private String list;

    public String getTotal() {
        return total;
    }
    public void setTotal(String total) {
        this.total = total;
    }
    public String getList() {
        return list;
    }
    public void setList(String list) {
        this.list = list;
    }




    @Override
    public String toString() {
        return "QueryGoodsSalesResponse{" + "total=" + total + "," + "list=" + list + "}";
    }
}
