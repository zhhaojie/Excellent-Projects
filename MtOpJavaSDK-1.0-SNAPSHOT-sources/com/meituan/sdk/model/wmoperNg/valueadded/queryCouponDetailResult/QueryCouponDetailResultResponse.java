package com.meituan.sdk.model.wmoperNg.valueadded.queryCouponDetailResult;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotEmpty;

/**
* 根据发券任务ID查询发券活动效果明细
* This file was automatically generated.
*/
public class QueryCouponDetailResultResponse {
    @NotEmpty(message = "used不能为空")
    @SerializedName("used")
    private List<Long> used;
    @NotEmpty(message = "unUsed不能为空")
    @SerializedName("unUsed")
    private List<Long> unUsed;
    @NotEmpty(message = "expire不能为空")
    @SerializedName("expire")
    private List<Long> expire;

    public List<Long> getUsed() {
        return used;
    }
    public void setUsed(List<Long> used) {
        this.used = used;
    }
    public List<Long> getUnUsed() {
        return unUsed;
    }
    public void setUnUsed(List<Long> unUsed) {
        this.unUsed = unUsed;
    }
    public List<Long> getExpire() {
        return expire;
    }
    public void setExpire(List<Long> expire) {
        this.expire = expire;
    }




    @Override
    public String toString() {
        return "QueryCouponDetailResultResponse{" + "used=" + used + "," + "unUsed=" + unUsed + "," + "expire=" + expire + "}";
    }
}
