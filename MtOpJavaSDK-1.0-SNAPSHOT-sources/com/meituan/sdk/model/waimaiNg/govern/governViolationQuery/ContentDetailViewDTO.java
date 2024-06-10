package com.meituan.sdk.model.waimaiNg.govern.governViolationQuery;

import com.google.gson.annotations.SerializedName;

/**
* 事实依据
* This file was automatically generated.
*/
public class ContentDetailViewDTO {
    /**
    * 表明事实依据id
    */
    @SerializedName("id")
    private String id;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }




    @Override
    public String toString() {
        return "ContentDetailViewDTO{" + "id=" + id + "}";
    }
}
