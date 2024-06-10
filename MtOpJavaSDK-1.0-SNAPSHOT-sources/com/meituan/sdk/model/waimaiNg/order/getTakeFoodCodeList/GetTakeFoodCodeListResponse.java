package com.meituan.sdk.model.waimaiNg.order.getTakeFoodCodeList;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 获取取餐码标签
* This file was automatically generated.
*/
public class GetTakeFoodCodeListResponse {
    /**
    * 取餐码标签列表
    */
    @SerializedName("takeFoodCodeList")
    private List<TakeFoodCodeList> takeFoodCodeList;

    public List<TakeFoodCodeList> getTakeFoodCodeList() {
        return takeFoodCodeList;
    }
    public void setTakeFoodCodeList(List<TakeFoodCodeList> takeFoodCodeList) {
        this.takeFoodCodeList = takeFoodCodeList;
    }




    @Override
    public String toString() {
        return "GetTakeFoodCodeListResponse{" + "takeFoodCodeList=" + takeFoodCodeList + "}";
    }
}
