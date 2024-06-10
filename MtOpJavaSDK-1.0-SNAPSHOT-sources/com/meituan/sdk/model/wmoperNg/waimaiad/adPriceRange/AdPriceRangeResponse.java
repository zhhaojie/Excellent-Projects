package com.meituan.sdk.model.wmoperNg.waimaiad.adPriceRange;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 获取广告不同类型价格范围
* This file was automatically generated.
*/
public class AdPriceRangeResponse {
    @NotNull(message = "result不能为空")
    @SerializedName("result")
    private Result result;
    @NotNull(message = "min不能为空")
    @SerializedName("min")
    private Long min;
    @NotNull(message = "max不能为空")
    @SerializedName("max")
    private Long max;

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }
    public Long getMin() {
        return min;
    }
    public void setMin(Long min) {
        this.min = min;
    }
    public Long getMax() {
        return max;
    }
    public void setMax(Long max) {
        this.max = max;
    }




    @Override
    public String toString() {
        return "AdPriceRangeResponse{" + "result=" + result + "," + "min=" + min + "," + "max=" + max + "}";
    }
}
