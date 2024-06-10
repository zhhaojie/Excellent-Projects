package com.meituan.sdk.model.waimaiNg.govern.governWarningListQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 预警事实依据
* This file was automatically generated.
*/
public class ContentViewDTO {
    /**
    * 事实依据类型
    */
    @SerializedName("type")
    private Integer type;
    /**
    * 总数
    */
    @SerializedName("total")
    private Integer total;
    /**
    * 事实依据
    */
    @SerializedName("contentList")
    private List<ContentDetailViewDTO> contentList;

    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public Integer getTotal() {
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }
    public List<ContentDetailViewDTO> getContentList() {
        return contentList;
    }
    public void setContentList(List<ContentDetailViewDTO> contentList) {
        this.contentList = contentList;
    }




    @Override
    public String toString() {
        return "ContentViewDTO{" + "type=" + type + "," + "total=" + total + "," + "contentList=" + contentList + "}";
    }
}
