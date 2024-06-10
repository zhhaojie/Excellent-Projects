package com.meituan.sdk.model.ad.launch.cpmBatchQueryLaunches;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* cpm批量查询投放
* This file was automatically generated.
*/
public class CpmBatchQueryLaunchesResponse {
    /**
    * 当前页码
    */
    @SerializedName("pageNum")
    private Integer pageNum;
    /**
    * 是否有下一页
    */
    @SerializedName("haveNextPage")
    private Boolean haveNextPage;
    /**
    * 查询结果，T为泛型
    */
    @SerializedName("data")
    private List<T> data;

    public Integer getPageNum() {
        return pageNum;
    }
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
    public Boolean getHaveNextPage() {
        return haveNextPage;
    }
    public void setHaveNextPage(Boolean haveNextPage) {
        this.haveNextPage = haveNextPage;
    }
    public List<T> getData() {
        return data;
    }
    public void setData(List<T> data) {
        this.data = data;
    }




    @Override
    public String toString() {
        return "CpmBatchQueryLaunchesResponse{" + "pageNum=" + pageNum + "," + "haveNextPage=" + haveNextPage + "," + "data=" + data + "}";
    }
}
