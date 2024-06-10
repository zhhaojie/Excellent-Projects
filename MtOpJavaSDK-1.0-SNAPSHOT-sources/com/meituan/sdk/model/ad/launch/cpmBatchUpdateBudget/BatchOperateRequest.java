package com.meituan.sdk.model.ad.launch.cpmBatchUpdateBudget;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-5bb36589-5d9b-4048-befc-6b5a32a27ea1">大小不超过50</p>
* This file was automatically generated.
*/
public class BatchOperateRequest {
    /**
    * <p data-diff-id="ct-diff-id-c7c3e4c2-ae5c-427b-ac41-da07ca6b2896">计划ID</p>
    */
    @NotNull(message = "planId不能为空")
    @SerializedName("planId")
    private Integer planId;
    /**
    * <p data-diff-id="ct-diff-id-48240cad-8382-41da-afae-9dcd28cadd39">基础日预算</p>
    */
    @NotNull(message = "dailyBudget不能为空")
    @SerializedName("dailyBudget")
    private Integer dailyBudget;

    public Integer getPlanId() {
        return planId;
    }
    public void setPlanId(Integer planId) {
        this.planId = planId;
    }
    public Integer getDailyBudget() {
        return dailyBudget;
    }
    public void setDailyBudget(Integer dailyBudget) {
        this.dailyBudget = dailyBudget;
    }




    @Override
    public String toString() {
        return "BatchOperateRequest{" + "planId=" + planId + "," + "dailyBudget=" + dailyBudget + "}";
    }
}
