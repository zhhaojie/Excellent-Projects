package com.meituan.sdk.model.wmoperNg.waimaiad.bizPoiTrade;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 经营分析-商家交易信息
* This file was automatically generated.
*/
public class BizPoiTradeResponse {
    @NotNull(message = "result不能为空")
    @SerializedName("result")
    private Result result;
    @NotNull(message = "poiTrade不能为空")
    @SerializedName("poiTrade")
    private PoiTrade poiTrade;

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }
    public PoiTrade getPoiTrade() {
        return poiTrade;
    }
    public void setPoiTrade(PoiTrade poiTrade) {
        this.poiTrade = poiTrade;
    }




    @Override
    public String toString() {
        return "BizPoiTradeResponse{" + "result=" + result + "," + "poiTrade=" + poiTrade + "}";
    }
}
