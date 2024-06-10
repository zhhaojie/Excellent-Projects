package com.meituan.sdk.model.foodmop.sku.premiumCreate;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-912b52ec-64ba-47d5-97f5-d96050c25fc9">图片资源</p>
* This file was automatically generated.
*/
public class PictureDTO {
    /**
    * <p data-diff-id="ct-diff-id-dbd6819e-1482-4824-84ed-d7efa72e9a5c">头像</p><p data-diff-id="ct-diff-id-7a9db7d0-5bd6-4260-a59d-1de63f211ffa">比例需为 1:1，尺寸不小于168×168，0.5M以内</p><p data-diff-id="ct-diff-id-cfad318f-1edb-4b73-a336-0232fb3c17a2">主体物建议不超过红色区域，且位置在画面中心，边缘要留白</p><p data-diff-id="ct-diff-id-555b662e-f83a-4edb-877b-6327e63bd5f4"><span class="ct-image"><img alt="" data-origin="http://p0.meituan.net/giraffe/4c34af03c8d1a3493de02cdb1700fbd822655.png" data-small="http://p0.meituan.net/giraffe/4c34af03c8d1a3493de02cdb1700fbd822655.png" data-src="http://p0.meituan.net/giraffe/4c34af03c8d1a3493de02cdb1700fbd822655.png"></span></p>
    */
    @SerializedName("headPictureList")
    private List<String> headPictureList;
    /**
    * <p data-diff-id="ct-diff-id-1cb2919d-b0ce-4973-9290-023e477d29ab">描述图片</p><p data-diff-id="ct-diff-id-581a874b-9615-4d6e-86c3-efabc36e6af9">比例建议为 16:9，尺寸不小于750×416，0.5M以内</p><p data-diff-id="ct-diff-id-dbd9f030-219a-4d90-84ed-f87c2cd10c6a">主体物建议不超过红色区域，且位置在画面中心，上方一定要留白，否则会被Iphone刘海挡住</p><p data-diff-id="ct-diff-id-2c9aa073-171d-42a5-9731-c91f14e9656b"><span class="ct-image"><img alt="" data-origin="http://p0.meituan.net/giraffe/7b881ce57f89e1101d033c7971ab6b7328934.png" data-small="http://p0.meituan.net/giraffe/7b881ce57f89e1101d033c7971ab6b7328934.png" data-src="http://p0.meituan.net/giraffe/7b881ce57f89e1101d033c7971ab6b7328934.png"></span></p>
    */
    @SerializedName("descriptionPictureList")
    private List<String> descriptionPictureList;
    /**
    * <p data-diff-id="ct-diff-id-e5be7b8e-fe09-43b0-81ee-cd788360c76f">背景图片</p>
    */
    @SerializedName("backgroundPictureList")
    private List<String> backgroundPictureList;

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
    public List<String> getBackgroundPictureList() {
        return backgroundPictureList;
    }
    public void setBackgroundPictureList(List<String> backgroundPictureList) {
        this.backgroundPictureList = backgroundPictureList;
    }




    @Override
    public String toString() {
        return "PictureDTO{" + "headPictureList=" + headPictureList + "," + "descriptionPictureList=" + descriptionPictureList + "," + "backgroundPictureList=" + backgroundPictureList + "}";
    }
}
