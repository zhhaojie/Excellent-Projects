package com.meituan.sdk.model.wmoperNg.food.wmoperFoodBatchQueryFoodDna;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 批量查询商品DNA
* This file was automatically generated.
*/
public class WmoperFoodBatchQueryFoodDnaResponse {
    /**
    * 商品DNA信息
    */
    @SerializedName("data")
    private List<DNAData> data;

    public List<DNAData> getData() {
        return data;
    }
    public void setData(List<DNAData> data) {
        this.data = data;
    }




    @Override
    public String toString() {
        return "WmoperFoodBatchQueryFoodDnaResponse{" + "data=" + data + "}";
    }
}
