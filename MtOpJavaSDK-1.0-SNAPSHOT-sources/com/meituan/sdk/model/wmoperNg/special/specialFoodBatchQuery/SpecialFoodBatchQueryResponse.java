package com.meituan.sdk.model.wmoperNg.special.specialFoodBatchQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 批量查询商品(拼好饭)
* This file was automatically generated.
*/
public class SpecialFoodBatchQueryResponse {
    @SerializedName("total")
    private Long total;
    @SerializedName("wmOpenProductSpus")
    private List<WmOpenProductSpus> wmOpenProductSpus;

    public Long getTotal() {
        return total;
    }
    public void setTotal(Long total) {
        this.total = total;
    }
    public List<WmOpenProductSpus> getWmOpenProductSpus() {
        return wmOpenProductSpus;
    }
    public void setWmOpenProductSpus(List<WmOpenProductSpus> wmOpenProductSpus) {
        this.wmOpenProductSpus = wmOpenProductSpus;
    }




    @Override
    public String toString() {
        return "SpecialFoodBatchQueryResponse{" + "total=" + total + "," + "wmOpenProductSpus=" + wmOpenProductSpus + "}";
    }
}
