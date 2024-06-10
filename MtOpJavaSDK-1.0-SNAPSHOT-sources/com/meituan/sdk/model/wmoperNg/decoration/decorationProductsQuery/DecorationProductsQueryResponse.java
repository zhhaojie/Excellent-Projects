package com.meituan.sdk.model.wmoperNg.decoration.decorationProductsQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 商家开放平台商品查询
* This file was automatically generated.
*/
public class DecorationProductsQueryResponse {
    /**
    * 海报id
    */
    @SerializedName("total")
    private Long total;
    @SerializedName("products")
    private List<Products> products;

    public Long getTotal() {
        return total;
    }
    public void setTotal(Long total) {
        this.total = total;
    }
    public List<Products> getProducts() {
        return products;
    }
    public void setProducts(List<Products> products) {
        this.products = products;
    }




    @Override
    public String toString() {
        return "DecorationProductsQueryResponse{" + "total=" + total + "," + "products=" + products + "}";
    }
}
