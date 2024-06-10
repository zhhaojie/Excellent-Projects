package com.meituan.sdk.model.foodmop.shop.queryByPage;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 品牌查询全量门店Id列表（非必接）
* This file was automatically generated.
*/
public class QueryByPageResponse {
    /**
    * 该品牌下配置过线上点门店总数
    */
    @SerializedName("total")
    private Integer total;
    /**
    * 查询起始位置
    */
    @SerializedName("offset")
    private Integer offset;
    /**
    * 查询单页大小
    */
    @SerializedName("limit")
    private Integer limit;
    /**
    * 厂商门店ID列表（批量最大限制500）
    */
    @SerializedName("vendorShopIdList")
    private List<String> vendorShopIdList;

    public Integer getTotal() {
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }
    public Integer getOffset() {
        return offset;
    }
    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    public List<String> getVendorShopIdList() {
        return vendorShopIdList;
    }
    public void setVendorShopIdList(List<String> vendorShopIdList) {
        this.vendorShopIdList = vendorShopIdList;
    }




    @Override
    public String toString() {
        return "QueryByPageResponse{" + "total=" + total + "," + "offset=" + offset + "," + "limit=" + limit + "," + "vendorShopIdList=" + vendorShopIdList + "}";
    }
}
