package com.meituan.sdk.model.waimaiNg.govern.governViolationScoreRecordQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 积分记录查询
* This file was automatically generated.
*/
public class GovernViolationScoreRecordQueryResponse {
    /**
    * 总数
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
    private List<ViolationScoreRecordDTO> data;

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
    public List<ViolationScoreRecordDTO> getData() {
        return data;
    }
    public void setData(List<ViolationScoreRecordDTO> data) {
        this.data = data;
    }




    @Override
    public String toString() {
        return "GovernViolationScoreRecordQueryResponse{" + "total=" + total + "," + "pageTotal=" + pageTotal + "," + "pageNum=" + pageNum + "," + "data=" + data + "}";
    }
}
