package com.meituan.sdk.model.foodmop.sku.saleattrCreate;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-14d30010-8d4f-4064-8873-cb594a2d792f">图片资源</p>
* This file was automatically generated.
*/
public class PictureDTO {
    /**
    * <p data-diff-id="ct-diff-id-26c4e4c1-e361-4c6e-845b-de05d7e71aeb">头像</p><p data-diff-id="ct-diff-id-b65cec1d-4891-41e3-a257-b443a3ba26e5">比例需为 1:1，尺寸不小于168×168，0.5M以内</p><p data-diff-id="ct-diff-id-2e5047ca-b0e2-407a-92ca-1407e50be1a2">主体物建议不超过红色区域，且位置在画面中心，边缘要留白</p><p data-diff-id="ct-diff-id-f192dbf0-40de-47ef-96de-3bf9b5e09737"><span class="ct-image"><img alt="" data-origin="http://p0.meituan.net/giraffe/4c34af03c8d1a3493de02cdb1700fbd822655.png" data-small="http://p0.meituan.net/giraffe/4c34af03c8d1a3493de02cdb1700fbd822655.png" data-src="http://p0.meituan.net/giraffe/4c34af03c8d1a3493de02cdb1700fbd822655.png"></span></p>
    */
    @SerializedName("headPictureList")
    private List<String> headPictureList;
    /**
    * <p data-diff-id="ct-diff-id-a4fbf7a6-8629-42dd-96f5-f7a449dd1114">描述图片</p><p data-diff-id="ct-diff-id-29b44d90-4ebc-490b-8a8a-fb588c2d85bb">比例建议为 16:9，尺寸不小于750×416，0.5M以内</p><p data-diff-id="ct-diff-id-948af748-ddc6-4512-abe2-c93fe80382a3">主体物建议不超过红色区域，且位置在画面中心，上方一定要留白，否则会被Iphone刘海挡住</p><p data-diff-id="ct-diff-id-f081105c-feca-4232-ac8d-952b082795e8"><span class="ct-image"><img alt="" data-origin="http://p0.meituan.net/giraffe/7b881ce57f89e1101d033c7971ab6b7328934.png" data-small="http://p0.meituan.net/giraffe/7b881ce57f89e1101d033c7971ab6b7328934.png" data-src="http://p0.meituan.net/giraffe/7b881ce57f89e1101d033c7971ab6b7328934.png"></span></p>
    */
    @SerializedName("descriptionPictureList")
    private List<String> descriptionPictureList;

    public List<String> getHeadPictureList() {
        return headPictureList;
    }
    public void setHeadPictureList(List<String> headPictureList) {
        this.headPictureList = headPictureList;
    }
    public List<String> getDescriptionPictureList() {
        return descriptionPictureList;
    }
    public void setDescriptionPictureList(List<String> descriptionPictureList) {
        this.descriptionPictureList = descriptionPictureList;
    }




    @Override
    public String toString() {
        return "PictureDTO{" + "headPictureList=" + headPictureList + "," + "descriptionPictureList=" + descriptionPictureList + "}";
    }
}
