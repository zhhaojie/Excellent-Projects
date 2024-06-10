package com.meituan.sdk.model.waimaiNg.decoration.productsQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 商家开放平台商品查询
* This file was automatically generated.
*/
public class ProductsQueryResponse {
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
        return "ProductsQueryResponse{" + "total=" + total + "," + "products=" + products + "}";
    }
}
