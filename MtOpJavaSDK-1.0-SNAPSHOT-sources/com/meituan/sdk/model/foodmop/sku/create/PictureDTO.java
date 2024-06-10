package com.meituan.sdk.model.foodmop.sku.create;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class PictureDTO {
    /**
    * <p data-diff-id="ct-diff-id-39f24ea2-db20-42e0-a163-c86d5a43cebd">头像</p><p data-diff-id="ct-diff-id-453b510a-1cf7-4f5d-afec-c1f89aa299ae">比例需为 1:1，尺寸不小于168×168，0.5M以内</p><p data-diff-id="ct-diff-id-3bd72ab2-e281-4383-93bf-4ac9f7f9200d">主体物建议不超过红色区域，且位置在画面中心，边缘要留白</p><p data-diff-id="ct-diff-id-3330c681-7a87-4453-891c-48dc9382daf1"><span class="ct-image"><img alt="" data-origin="http://p0.meituan.net/giraffe/4c34af03c8d1a3493de02cdb1700fbd822655.png" data-small="http://p0.meituan.net/giraffe/4c34af03c8d1a3493de02cdb1700fbd822655.png" data-src="http://p0.meituan.net/giraffe/4c34af03c8d1a3493de02cdb1700fbd822655.png"></span></p>
    */
    @SerializedName("headPictureList")
    private List<String> headPictureList;
    /**
    * <p data-diff-id="ct-diff-id-fd8096e3-efab-49b2-9b79-faa606f8fd2d">描述图片</p><p data-diff-id="ct-diff-id-9790e770-859a-44b5-b9c0-710fbb21ea8a">比例建议为 16:9，尺寸不小于750×416，0.5M以内</p><p data-diff-id="ct-diff-id-435bd4f0-f3a8-4668-8f9d-0c428185d5ad">主体物建议不超过红色区域，且位置在画面中心，上方一定要留白，否则会被Iphone刘海挡住</p><p data-diff-id="ct-diff-id-ae52d469-d323-40e1-a7ff-dcb49a26fc6d"><span class="ct-image"><img alt="" data-origin="http://p0.meituan.net/giraffe/7b881ce57f89e1101d033c7971ab6b7328934.png" data-small="http://p0.meituan.net/giraffe/7b881ce57f89e1101d033c7971ab6b7328934.png" data-src="http://p0.meituan.net/giraffe/7b881ce57f89e1101d033c7971ab6b7328934.png"></span></p>
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
