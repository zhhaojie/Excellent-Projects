package com.meituan.sdk.model.wmoperNg.waimaiad.poiAdEffectdata;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 营业分析-查询流量曝光与入店数据
* This file was automatically generated.
*/
public class PoiAdEffectdataResponse {
    @SerializedName("result")
    private Result result;
    @SerializedName("data")
    private List<Item> data;

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }
    public List<Item> getData() {
        return data;
    }
    public void setData(List<Item> data) {
        this.data = data;
    }




    @Override
    public String toString() {
        return "PoiAdEffectdataResponse{" + "result=" + result + "," + "data=" + data + "}";
    }
}
