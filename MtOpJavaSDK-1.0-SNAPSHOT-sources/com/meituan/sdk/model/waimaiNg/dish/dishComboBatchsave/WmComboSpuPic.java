package com.meituan.sdk.model.waimaiNg.dish.dishComboBatchsave;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">套餐商品图片，商品的图片，仅支持静态图，动图不支持。总数量不超过5张。</font></span></p>
* This file was automatically generated.
*/
public class WmComboSpuPic {
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">图片URL，URL会在调用上传图片接口后返回</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">长度限制:255</font></p>
    */
    @NotBlank(message = "picLargeUrl不能为空")
    @SerializedName("pic_large_url")
    private String picLargeUrl;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">图片顺序，同一个商品的图片列表应该从1开始，不要重复。</font></span></p>
    */
    @NotNull(message = "sequence不能为空")
    @SerializedName("sequence")
    private Integer sequence;

    public String getPicLargeUrl() {
        return picLargeUrl;
    }
    public void setPicLargeUrl(String picLargeUrl) {
        this.picLargeUrl = picLargeUrl;
    }
    public Integer getSequence() {
        return sequence;
    }
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }




    @Override
    public String toString() {
        return "WmComboSpuPic{" + "picLargeUrl=" + picLargeUrl + "," + "sequence=" + sequence + "}";
    }
}
