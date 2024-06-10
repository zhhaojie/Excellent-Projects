package com.meituan.sdk.model.foodmop.shop.tagBind;

import com.google.gson.annotations.SerializedName;

/**
* key(String)：xbk门店id  value(BindFailResult): 失败结果封装
* This file was automatically generated.
*/
public class DataMap {
    /**
    * 失败结果封装
    */
    @SerializedName("BindFailResult")
    private BindFailResult bindFailResult;

    public BindFailResult getBindFailResult() {
        return bindFailResult;
    }
    public void setBindFailResult(BindFailResult bindFailResult) {
        this.bindFailResult = bindFailResult;
    }




    @Override
    public String toString() {
        return "DataMap{" + "bindFailResult=" + bindFailResult + "}";
    }
}
