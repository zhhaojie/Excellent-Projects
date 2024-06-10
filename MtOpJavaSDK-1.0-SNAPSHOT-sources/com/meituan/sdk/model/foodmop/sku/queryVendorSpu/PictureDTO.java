package com.meituan.sdk.model.foodmop.sku.queryVendorSpu;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class PictureDTO {
    /**
    * 头图
    */
    @SerializedName("headPictureList")
    private List<String> headPictureList;
    /**
    * 描述图片
    */
    @SerializedName("descriptionPictureList")
    private List<String> descriptionPictureList;
    /**
    * 背景图片
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
