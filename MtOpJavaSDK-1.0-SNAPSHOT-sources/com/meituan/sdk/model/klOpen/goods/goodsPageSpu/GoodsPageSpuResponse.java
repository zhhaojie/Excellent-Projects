package com.meituan.sdk.model.klOpen.goods.goodsPageSpu;

import com.google.gson.annotations.SerializedName;

/**
* 分页查询spu
* This file was automatically generated.
*/
public class GoodsPageSpuResponse {
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
        return "GoodsPageSpuResponse{" + "maxId=" + maxId + "," + "list=" + list + "}";
    }
}
