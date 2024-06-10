package com.meituan.sdk.model.ad.launch.cpmBatchUpdateLaunchPower;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-1fbc497d-10a2-4ac4-8566-af39c425d11f">一批不超过50</p>
* This file was automatically generated.
*/
public class BatchOperateRequest {
    /**
    * <p data-diff-id="ct-diff-id-12e69d91-6ceb-48e3-9542-709b5d8c32c0">投放ID</p>
    */
    @NotNull(message = "launchId不能为空")
    @SerializedName("launchId")
    private Integer launchId;
    /**
    * <p data-diff-id="ct-diff-id-585f4e08-9355-4ca9-9366-b249486b170a"><span style="color: rgb(122, 126, 133)">用户操作态，1-有效，5-暂停，9-删除</span></p>
    */
    @NotNull(message = "power不能为空")
    @SerializedName("power")
    private Integer power;

    public Integer getLaunchId() {
        return launchId;
    }
    public void setLaunchId(Integer launchId) {
        this.launchId = launchId;
    }
    public Integer getPower() {
        return power;
    }
    public void setPower(Integer power) {
        this.power = power;
    }




    @Override
    public String toString() {
        return "BatchOperateRequest{" + "launchId=" + launchId + "," + "power=" + power + "}";
    }
}
