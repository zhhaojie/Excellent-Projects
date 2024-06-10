package com.meituan.sdk.model.wmoperNg.waimaiad.peerAdBidprice;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 竞价推广-附近商家平均出价
* This file was automatically generated.
*/
public class PeerAdBidpriceResponse {
    @NotNull(message = "result不能为空")
    @SerializedName("result")
    private Result result;
    @NotBlank(message = "averagePrice不能为空")
    @SerializedName("averagePrice")
    private String averagePrice;

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }
    public String getAveragePrice() {
        return averagePrice;
    }
    public void setAveragePrice(String averagePrice) {
        this.averagePrice = averagePrice;
    }




    @Override
    public String toString() {
        return "PeerAdBidpriceResponse{" + "result=" + result + "," + "averagePrice=" + averagePrice + "}";
    }
}
