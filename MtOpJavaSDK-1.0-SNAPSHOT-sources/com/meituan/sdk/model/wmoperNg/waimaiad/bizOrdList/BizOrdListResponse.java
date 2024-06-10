package com.meituan.sdk.model.wmoperNg.waimaiad.bizOrdList;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 经营分析-订单列表
* This file was automatically generated.
*/
public class BizOrdListResponse {
    @NotNull(message = "result不能为空")
    @SerializedName("result")
    private Result result;
    @NotNull(message = "count不能为空")
    @SerializedName("count")
    private Long count;
    @NotEmpty(message = "ordList不能为空")
    @SerializedName("ordList")
    private List<OrdList> ordList;

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
    public List<OrdList> getOrdList() {
        return ordList;
    }
    public void setOrdList(List<OrdList> ordList) {
        this.ordList = ordList;
    }




    @Override
    public String toString() {
        return "BizOrdListResponse{" + "result=" + result + "," + "count=" + count + "," + "ordList=" + ordList + "}";
    }
}
