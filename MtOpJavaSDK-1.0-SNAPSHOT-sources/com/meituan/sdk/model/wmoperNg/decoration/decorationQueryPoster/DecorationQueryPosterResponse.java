package com.meituan.sdk.model.wmoperNg.decoration.decorationQueryPoster;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 商家开放平台海报查询
* This file was automatically generated.
*/
public class DecorationQueryPosterResponse {
    /**
    * 页面
    */
    @SerializedName("pageNum")
    private Integer pageNum;
    /**
    * 每页展示数
    */
    @SerializedName("pageSize")
    private Integer pageSize;
    /**
    * 总数
    */
    @SerializedName("count")
    private Integer count;
    /**
    * 海报详情
    */
    @SerializedName("wmAppPostVos")
    private List<WmAppPostVos> wmAppPostVos;

    public Integer getPageNum() {
        return pageNum;
    }
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
    public Integer getPageSize() {
        return pageSize;
    }
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
    public List<WmAppPostVos> getWmAppPostVos() {
        return wmAppPostVos;
    }
    public void setWmAppPostVos(List<WmAppPostVos> wmAppPostVos) {
        this.wmAppPostVos = wmAppPostVos;
    }




    @Override
    public String toString() {
        return "DecorationQueryPosterResponse{" + "pageNum=" + pageNum + "," + "pageSize=" + pageSize + "," + "count=" + count + "," + "wmAppPostVos=" + wmAppPostVos + "}";
    }
}
