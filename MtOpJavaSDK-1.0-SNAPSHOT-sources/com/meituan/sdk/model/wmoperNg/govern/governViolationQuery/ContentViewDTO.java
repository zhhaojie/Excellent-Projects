package com.meituan.sdk.model.wmoperNg.govern.governViolationQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 违规事实依据  返回的数量有限，50以上会被截断，需要查询更多通过分页查询违规事实依据接口
* This file was automatically generated.
*/
public class ContentViewDTO {
    /**
    * 事实依据类型1 订单，2 商品，3 太平洋工单， 4 售后工单
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
