package com.meituan.sdk.model.ad.launch.cpmBatchUpdateBid;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-e917bf7d-510a-4fa0-98d8-3f2ca248f621">一批不超过50</p>
* This file was automatically generated.
*/
public class BatchOperateRequest {
    /**
    * <p data-diff-id="ct-diff-id-bcca3773-f2b9-4a62-a0a8-fc61d36f6def">投放ID</p>
    */
    @NotNull(message = "launchId不能为空")
    @SerializedName("launchId")
    private Integer launchId;
    /**
    * <p data-diff-id="ct-diff-id-59f6f745-4b62-42b0-99b2-a62de5cef126">出价模式，当前只支持2-千次曝光出价，4-ocpx点击出价</p>
    */
    @NotNull(message = "priceMode不能为空")
    @SerializedName("priceMode")
    private Integer priceMode;
    /**
    * <p data-diff-id="ct-diff-id-ffbb1585-2954-4b56-8bb4-22dae1a80f1c">出价，千次曝光出价时为整数，点击出价时保留两位小数</p>
    */
    @NotNull(message = "bid不能为空")
    @SerializedName("bid")
    private Double bid;
    /**
    * <p data-diff-id="ct-diff-id-82ea3386-7c4d-4633-9b81-b5ba3be6b719">点击出价时，须在(0,100)范围内</p>
    */
    @SerializedName("floatRatio")
    private Integer floatRatio;

    public Integer getLaunchId() {
        return launchId;
    }
    public void setLaunchId(Integer launchId) {
        this.launchId = launchId;
    }
    public Integer getPriceMode() {
        return priceMode;
    }
    public void setPriceMode(Integer priceMode) {
        this.priceMode = priceMode;
    }
    public Double getBid() {
        return bid;
    }
    public void setBid(Double bid) {
        this.bid = bid;
    }
    public Integer getFloatRatio() {
        return floatRatio;
    }
    public void setFloatRatio(Integer floatRatio) {
        this.floatRatio = floatRatio;
    }




    @Override
    public String toString() {
        return "BatchOperateRequest{" + "launchId=" + launchId + "," + "priceMode=" + priceMode + "," + "bid=" + bid + "," + "floatRatio=" + floatRatio + "}";
    }
}
