package com.meituan.sdk.model.klOpen.goods.goodsPageSku;

import com.google.gson.annotations.SerializedName;

/**
* 分页查询sku
* This file was automatically generated.
*/
public class GoodsPageSkuResponse {
    @SerializedName("maxId")
    private String maxId;
    @SerializedName("list")
    private String list;

    public String getMaxId() {
        return maxId;
    }
    public void setMaxId(String maxId) {
        this.maxId = maxId;
    }
    public String getList() {
        return list;
    }
    public void setList(String list) {
        this.list = list;
    }




    @Override
    public String toString() {
        return "GoodsPageSkuResponse{" + "maxId=" + maxId + "," + "list=" + list + "}";
    }
}
