package com.meituan.sdk.model.wmoperNg.order.wmoperngQueryOrderDetail;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 菜品信息 List类型
* This file was automatically generated.
*/
public class Detail {
    /**
    * 菜品规格名称
    */
    @SerializedName("spec")
    private String spec;
    @SerializedName("mtSpuId")
    private Long mtSpuId;
    /**
    * 单位
    */
    @SerializedName("unit")
    private String unit;
    /**
    * 商品单价
    */
    @SerializedName("price")
    private Double price;
    /**
    * 菜品属性
    */
    @SerializedName("foodProperty")
    private String foodProperty;
    /**
    * 菜品code
    */
    @SerializedName("appFoodCode")
    private String appFoodCode;
    @SerializedName("tagName")
    private String tagName;
    /**
    * sku编码
    */
    @SerializedName("skuId")
    private String skuId;
    /**
    * 餐盒数量
    */
    @SerializedName("boxNum")
    private Double boxNum;
    /**
    * 商品数量
    */
    @SerializedName("quantity")
    private Double quantity;
    @SerializedName("mtTagId")
    private Long mtTagId;
    @SerializedName("mtSkuId")
    private Long mtSkuId;
    /**
    * 餐盒价格
    */
    @SerializedName("boxPrice")
    private Double boxPrice;
    /**
    * 菜品名称
    */
    @SerializedName("foodName")
    private String foodName;
    /**
    * 订单记录的商品行id，对于相同sku商品可用于标识区分，单订单下唯一
    */
    @SerializedName("detailId")
    private Long detailId;
    /**
    * 详情参见7.3.1的sub_detail_list
    */
    @SerializedName("subDetailList")
    private List<SubDetailList> subDetailList;
    /**
    * 套餐商品详情(如果订单含有新版套餐，且品牌不支持新版套餐子商品subDetailList，则仍使用本字段兼容返回套餐详情)(示例为新版套餐返回，旧版套餐不包含规格、数量信息)
    */
    @SerializedName("detailExtra")
    private Json detailExtra;

    public String getSpec() {
        return spec;
    }
    public void setSpec(String spec) {
        this.spec = spec;
    }
    public Long getMtSpuId() {
        return mtSpuId;
    }
    public void setMtSpuId(Long mtSpuId) {
        this.mtSpuId = mtSpuId;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getFoodProperty() {
        return foodProperty;
    }
    public void setFoodProperty(String foodProperty) {
        this.foodProperty = foodProperty;
    }
    public String getAppFoodCode() {
        return appFoodCode;
    }
    public void setAppFoodCode(String appFoodCode) {
        this.appFoodCode = appFoodCode;
    }
    public String getTagName() {
        return tagName;
    }
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
    public String getSkuId() {
        return skuId;
    }
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
    public Double getBoxNum() {
        return boxNum;
    }
    public void setBoxNum(Double boxNum) {
        this.boxNum = boxNum;
    }
    public Double getQuantity() {
        return quantity;
    }
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
    public Long getMtTagId() {
        return mtTagId;
    }
    public void setMtTagId(Long mtTagId) {
        this.mtTagId = mtTagId;
    }
    public Long getMtSkuId() {
        return mtSkuId;
    }
    public void setMtSkuId(Long mtSkuId) {
        this.mtSkuId = mtSkuId;
    }
    public Double getBoxPrice() {
        return boxPrice;
    }
    public void setBoxPrice(Double boxPrice) {
        this.boxPrice = boxPrice;
    }
    public String getFoodName() {
        return foodName;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public Long getDetailId() {
        return detailId;
    }
    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }
    public List<SubDetailList> getSubDetailList() {
        return subDetailList;
    }
    public void setSubDetailList(List<SubDetailList> subDetailList) {
        this.subDetailList = subDetailList;
    }
    public Json getDetailExtra() {
        return detailExtra;
    }
    public void setDetailExtra(Json detailExtra) {
        this.detailExtra = detailExtra;
    }




    @Override
    public String toString() {
        return "Detail{" + "spec=" + spec + "," + "mtSpuId=" + mtSpuId + "," + "unit=" + unit + "," + "price=" + price + "," + "foodProperty=" + foodProperty + "," + "appFoodCode=" + appFoodCode + "," + "tagName=" + tagName + "," + "skuId=" + skuId + "," + "boxNum=" + boxNum + "," + "quantity=" + quantity + "," + "mtTagId=" + mtTagId + "," + "mtSkuId=" + mtSkuId + "," + "boxPrice=" + boxPrice + "," + "foodName=" + foodName + "," + "detailId=" + detailId + "," + "subDetailList=" + subDetailList + "," + "detailExtra=" + detailExtra + "}";
    }
}
