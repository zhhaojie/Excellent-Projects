package com.meituan.sdk.model.waimaiNg.govern.governViolationQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 违规列表查询
* This file was automatically generated.
*/
public class GovernViolationQueryResponse {
    /**
    * 违规列表总数
    */
    @SerializedName("total")
    private Integer total;
    /**
    * 总页数
    */
    @SerializedName("pageTotal")
    private Integer pageTotal;
    /**
    * 当前页
    */
    @SerializedName("pageNum")
    private Integer pageNum;
    /**
    * 数据列表
    */
    @SerializedName("data")
    private List<OpenViolationDetailViewDTO> data;

    public Integer getTotal() {
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }
    public Integer getPageTotal() {
        return pageTotal;
    }
    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }
    public Integer getPageNum() {
        return pageNum;
    }
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
    public List<OpenViolationDetailViewDTO> getData() {
        return data;
    }
    public void setData(List<OpenViolationDetailViewDTO> data) {
        this.data = data;
    }




    @Override
    public String toString() {
        return "GovernViolationQueryResponse{" + "total=" + total + "," + "pageTotal=" + pageTotal + "," + "pageNum=" + pageNum + "," + "data=" + data + "}";
    }
}
