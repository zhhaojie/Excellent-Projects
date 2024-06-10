package com.meituan.sdk.model.ad.launch.cpmBatchCreateLaunch;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* <p data-diff-id="ct-diff-id-e05524e4-b762-4f89-acc2-724e608ee669"><span style="color: rgba(0, 0, 0, 0.65)">批量参数</span></p>
* This file was automatically generated.
*/
public class BatchCreateCpmLaunchParam {
    /**
    * <p data-diff-id="ct-diff-id-adf9ed6c-f2ca-4a05-8404-6d09a1d842e4"><span style="color: rgba(0, 0, 0, 0.65)">出价</span></p>
    */
    @NotNull(message = "bidPrice不能为空")
    @SerializedName("bidPrice")
    private Double bidPrice;
    /**
    * <p data-diff-id="ct-diff-id-acbfc766-51fb-41e5-ae4e-b7584549003e"><span style="color: rgba(0, 0, 0, 0.65)">出价模式</span></p>
    */
    @NotNull(message = "priceMode不能为空")
    @SerializedName("priceMode")
    private Integer priceMode;
    /**
    * <p data-diff-id="ct-diff-id-2864ed4c-c6f7-40d5-bea1-af8f5075d9ea"><span style="color: rgba(0, 0, 0, 0.65)">点击出价上浮比例</span></p>
    */
    @SerializedName("floatRatio")
    private Integer floatRatio;
    /**
    * <p data-diff-id="ct-diff-id-83bd4d55-2a79-4709-90c1-8e3288247e7e"><span style="color: rgba(0, 0, 0, 0.65)">落地页链接</span></p>
    */
    @NotBlank(message = "landingUrl不能为空")
    @SerializedName("landingUrl")
    private String landingUrl;
    /**
    * <p data-diff-id="ct-diff-id-85105672-971d-4cfe-82d2-ccb964ef117b"><span style="color: rgba(0, 0, 0, 0.65)">创意头像</span></p>
    */
    @NotBlank(message = "avatarUrl不能为空")
    @SerializedName("avatarUrl")
    private String avatarUrl;
    /**
    * <p data-diff-id="ct-diff-id-1c8d7f7a-663a-40f4-8e41-91087fa07610"><span style="color: rgba(0, 0, 0, 0.65)">创意昵称</span></p>
    */
    @NotBlank(message = "brandName不能为空")
    @SerializedName("brandName")
    private String brandName;
    /**
    * <p data-diff-id="ct-diff-id-43216e26-714a-464d-95db-c78291f205e0"><span style="color: rgba(0, 0, 0, 0.65)">其余创意元素</span></p>
    */
    @NotEmpty(message = "elements不能为空")
    @SerializedName("elements")
    private List<CreativeElementDTO> elements;

    public Double getBidPrice() {
        return bidPrice;
    }
    public void setBidPrice(Double bidPrice) {
        this.bidPrice = bidPrice;
    }
    public Integer getPriceMode() {
        return priceMode;
    }
    public void setPriceMode(Integer priceMode) {
        this.priceMode = priceMode;
    }
    public Integer getFloatRatio() {
        return floatRatio;
    }
    public void setFloatRatio(Integer floatRatio) {
        this.floatRatio = floatRatio;
    }
    public String getLandingUrl() {
        return landingUrl;
    }
    public void setLandingUrl(String landingUrl) {
        this.landingUrl = landingUrl;
    }
    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public List<CreativeElementDTO> getElements() {
        return elements;
    }
    public void setElements(List<CreativeElementDTO> elements) {
        this.elements = elements;
    }




    @Override
    public String toString() {
        return "BatchCreateCpmLaunchParam{" + "bidPrice=" + bidPrice + "," + "priceMode=" + priceMode + "," + "floatRatio=" + floatRatio + "," + "landingUrl=" + landingUrl + "," + "avatarUrl=" + avatarUrl + "," + "brandName=" + brandName + "," + "elements=" + elements + "}";
    }
}
