package com.meituan.sdk.model.tuangouNg.coupon.couponPrepare;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class DealMenu {
    /**
    * 字段内容
    */
    @SerializedName("content")
    private String content;
    /**
    * 数量/规格
    */
    @SerializedName("specification")
    private String specification;
    /**
    * 单价
    */
    @SerializedName("price")
    private String price;
    /**
    * 小计
    */
    @SerializedName("total")
    private String total;
    /**
    * 区别表头和行：0表示表头，128表示行
    */
    @SerializedName("type")
    private String type;

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getSpecification() {
        return specification;
    }
    public void setSpecification(String specification) {
        this.specification = specification;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getTotal() {
        return total;
    }
    public void setTotal(String total) {
        this.total = total;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }




    @Override
    public String toString() {
        return "DealMenu{" + "content=" + content + "," + "specification=" + specification + "," + "price=" + price + "," + "total=" + total + "," + "type=" + type + "}";
    }
}
