package com.meituan.sdk.model.design.image.imageTagsFoodScene;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 图像标签识别
* This file was automatically generated.
*/
public class ImageTagsFoodSceneResponse {
    /**
    * 菜品标签
    */
    @SerializedName("tags")
    private List<Tags> tags;

    public List<Tags> getTags() {
        return tags;
    }
    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }




    @Override
    public String toString() {
        return "ImageTagsFoodSceneResponse{" + "tags=" + tags + "}";
    }
}
