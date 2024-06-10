package com.meituan.sdk.model.wmoperNg.food.dishComboBatchsave;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p><font style="font-size:14px;line-height:22px" data-size="14">套餐商品图片，商品的图片，包括头图、详情图，仅支持静态图，动图不支持</font></p>
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
    * <p>图片排序</p>
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
