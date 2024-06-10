package com.meituan.sdk.model.ad.launch.cpmQueryBidInfo;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-62d8b0cd-be66-4f65-a567-ec455400f04f"><span style="color: rgba(0, 0, 0, 0.65)">批量参数</span></p>
* This file was automatically generated.
*/
public class BatchCreateCpmLaunchParam {
    /**
    * <p data-diff-id="ct-diff-id-d60ddbcf-74c1-4d6d-9288-075a570e4a44">出价模式</p>
    */
    @NotNull(message = "priceMode不能为空")
    @SerializedName("priceMode")
    private Integer priceMode;

    public Integer getPriceMode() {
        return priceMode;
    }
    public void setPriceMode(Integer priceMode) {
        this.priceMode = priceMode;
    }




    @Override
    public String toString() {
        return "BatchCreateCpmLaunchParam{" + "priceMode=" + priceMode + "}";
    }
}
