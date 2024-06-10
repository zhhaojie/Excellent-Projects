package com.meituan.sdk.model.foodmop.sku.create;

import com.google.gson.annotations.SerializedName;

/**
* 创建或更新商品（必接）
* This file was automatically generated.
*/
public class CreateResponse {
    /**
    * key：vendorSpuId value：同步结果，成功返回 “成功”，失败则返回相应的异常信息
    */
    @SerializedName("map")
    private Map map;

    public Map getMap() {
        return map;
    }
    public void setMap(Map map) {
        this.map = map;
    }




    @Override
    public String toString() {
        return "CreateResponse{" + "map=" + map + "}";
    }
}
