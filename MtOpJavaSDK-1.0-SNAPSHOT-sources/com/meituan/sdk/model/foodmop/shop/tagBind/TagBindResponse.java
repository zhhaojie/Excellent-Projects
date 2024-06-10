package com.meituan.sdk.model.foodmop.shop.tagBind;

import com.google.gson.annotations.SerializedName;

/**
* 品牌门店打标签
* This file was automatically generated.
*/
public class TagBindResponse {
    /**
    * key(String)：xbk门店id  value(BindFailResult): 失败结果封装
    */
    @SerializedName("map")
    private DataMap map;

    public DataMap getMap() {
        return map;
    }
    public void setMap(DataMap map) {
        this.map = map;
    }




    @Override
    public String toString() {
        return "TagBindResponse{" + "map=" + map + "}";
    }
}
