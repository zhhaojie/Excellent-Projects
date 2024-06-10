package com.meituan.sdk.model.wmoperNg.waimaiad.bizOrdCount;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 经营分析-订单数
* This file was automatically generated.
*/
public class BizOrdCountResponse {
    @NotNull(message = "result不能为空")
    @SerializedName("result")
    private Result result;
    @NotNull(message = "count不能为空")
    @SerializedName("count")
    private Long count;

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }
    public Long getCount() {
        return count;
    }
    public void setCount(Long count) {
        this.count = count;
    }




    @Override
    public String toString() {
        return "BizOrdCountResponse{" + "result=" + result + "," + "count=" + count + "}";
    }
}
