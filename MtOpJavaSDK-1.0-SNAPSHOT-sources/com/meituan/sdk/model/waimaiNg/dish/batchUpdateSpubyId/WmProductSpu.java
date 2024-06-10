package com.meituan.sdk.model.waimaiNg.dish.batchUpdateSpubyId;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class WmProductSpu {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">商品真实id</font></span></p>
    */
    @NotNull(message = "originSpuId不能为空")
    @SerializedName("origin_spu_id")
    private Long originSpuId;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">商品描述</font></span></p>
    */
    @NotBlank(message = "spuDesc不能为空")
    @SerializedName("spu_desc")
    private String spuDesc;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">商品图片（图片id/URL）</font></span></p>
    */
    @NotBlank(message = "spuPicture不能为空")
    @SerializedName("spu_picture")
    private String spuPicture;
    /**
    * <p>商品图片多图（图片id/URL），英文逗号隔开，最多5张。</p><p style="text-align: start;">注意：</p><p style="text-align: start;">1、如果spu_picture和spu_pictures都有值，则以spu_picture为第一张，spu_pictures从第二张开始生效；</p><p style="text-align: start;">2、如果仅spu_picture有值，则商品只有一张图片；</p><p style="text-align: start;">3、如果仅spu_pictures有值，则商品图片为spu_pictures生效；</p><p style="text-align: start;">4、如果2个字段都没有值，则商品无图。</p>
    */
    @NotBlank(message = "spuPictures不能为空")
    @SerializedName("spu_pictures")
    private String spuPictures;
    /**
    * <p data-diff-id="ct-diff-id-d2ada2a7-da0e-4789-b55a-8802491cc5f7">图文详情URL</p><p data-diff-id="ct-diff-id-a3edad46-f844-4c90-987f-adb320f2d79b">英文逗号分隔不同图片链接</p><p data-diff-id="ct-diff-id-5540e510-ee2c-44ad-8542-172286e08bb5">不同图片没有no排序，C端按照逗号分隔后的顺序展示</p>
    */
    @SerializedName("spu_longPictures")
    private String spuLongPictures;

    public Long getOriginSpuId() {
        return originSpuId;
    }
    public void setOriginSpuId(Long originSpuId) {
        this.originSpuId = originSpuId;
    }
    public String getSpuDesc() {
        return spuDesc;
    }
    public void setSpuDesc(String spuDesc) {
        this.spuDesc = spuDesc;
    }
    public String getSpuPicture() {
        return spuPicture;
    }
    public void setSpuPicture(String spuPicture) {
        this.spuPicture = spuPicture;
    }
    public String getSpuPictures() {
        return spuPictures;
    }
    public void setSpuPictures(String spuPictures) {
        this.spuPictures = spuPictures;
    }
    public String getSpuLongPictures() {
        return spuLongPictures;
    }
    public void setSpuLongPictures(String spuLongPictures) {
        this.spuLongPictures = spuLongPictures;
    }




    @Override
    public String toString() {
        return "WmProductSpu{" + "originSpuId=" + originSpuId + "," + "spuDesc=" + spuDesc + "," + "spuPicture=" + spuPicture + "," + "spuPictures=" + spuPictures + "," + "spuLongPictures=" + spuLongPictures + "}";
    }
}
