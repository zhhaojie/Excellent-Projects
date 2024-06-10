package com.meituan.sdk.model.waimaiNg.special.specialFoodBatchQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 批量查询商品
* This file was automatically generated.
*/
public class SpecialFoodBatchQueryResponse {
    @NotNull(message = "total不能为空")
    @SerializedName("total")
    private Long total;
    @NotEmpty(message = "wmOpenProductSpus不能为空")
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
