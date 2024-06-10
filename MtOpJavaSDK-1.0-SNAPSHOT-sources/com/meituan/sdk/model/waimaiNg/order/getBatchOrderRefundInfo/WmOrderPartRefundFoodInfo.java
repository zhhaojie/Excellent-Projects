package com.meituan.sdk.model.waimaiNg.order.getBatchOrderRefundInfo;

import com.google.gson.annotations.SerializedName;

/**
* 退款商品信息（仅部分退款有该字段）
* This file was automatically generated.
*/
public class WmOrderPartRefundFoodInfo {
    /**
    * 订单记录的商品行id，对于相同sku的商品可用于标识，单订单下唯一
    */
    @SerializedName("detail_id")
    private Long detailId;
    /**
    * APP方菜品id，最大长度128，不同门店可以重复，同一门店内不能重复
    */
    @SerializedName("app_food_code")
    private String appFoodCode;
    /**
    * 退款菜品名称
    */
    @SerializedName("food_name")
    private String foodName;
    /**
    * sku码
    */
    @SerializedName("sku_id")
    private String skuId;
    /**
    * 单位
    */
    @SerializedName("spec")
    private String spec;
    /**
    * 商品价格
    */
    @SerializedName("food_price")
    private Double foodPrice;
    /**
    * 商品数量
    */
    @SerializedName("count")
    private Integer count;
    /**
    * 打包盒数量
    */
    @SerializedName("box_num")
    private Double boxNum;
    /**
    * 打包盒价格
    */
    @SerializedName("box_price")
    private Double boxPrice;
    /**
    * 菜品原价，单位元
    */
    @SerializedName("origin_food_price")
    private Double originFoodPrice;
    /**
    * 退款价格，单位元
    */
    @SerializedName("refund_price")
    private Double refundPrice;
    /**
    * 订单数据状态标记。当订单中部分字段的数据因内部交互异常或网络等原因延迟生成（超时），导致开发者当前获取的订单数据不完整，此时平台对订单数据缺失情况进行标记。如不完整，建议尝试重新查询。注意，平台仅对部分模块的数据完整性进行监察标记（参考incmp_modules字段）。参考值：  -1：有数据降级  0：无数据降级
    */
    @SerializedName("incmp_code")
    private Integer incmpCode;
    /**
    * 0：订单商品详情  1：订单优惠信息  2：商品优惠详情  3：订单用户会员信息  4：订单维度的商家对账信息  5：订单维度的商家对账信息(元)  6：订单收货人地址  7：订单配送方式  8：开放平台用户id  9：部分退款商品信息  10：退货退款物流信息  11：部分订单基本信息(包括订单优惠信息、订单商品详情、门店信息等)  12：sku信息  13：spu信息  14：商品信息(可能是sku或spu等商品相关信息获取时降级)
    */
    @SerializedName("incmp_modules")
    private Integer incmpModules;

    public Long getDetailId() {
        return detailId;
    }
    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }
    public String getAppFoodCode() {
        return appFoodCode;
    }
    public void setAppFoodCode(String appFoodCode) {
        this.appFoodCode = appFoodCode;
    }
    public String getFoodName() {
        return foodName;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public String getSkuId() {
        return skuId;
    }
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
    public String getSpec() {
        return spec;
    }
    public void setSpec(String spec) {
        this.spec = spec;
    }
    public Double getFoodPrice() {
        return foodPrice;
    }
    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
    public Double getBoxNum() {
        return boxNum;
    }
    public void setBoxNum(Double boxNum) {
        this.boxNum = boxNum;
    }
    public Double getBoxPrice() {
        return boxPrice;
    }
    public void setBoxPrice(Double boxPrice) {
        this.boxPrice = boxPrice;
    }
    public Double getOriginFoodPrice() {
        return originFoodPrice;
    }
    public void setOriginFoodPrice(Double originFoodPrice) {
        this.originFoodPrice = originFoodPrice;
    }
    public Double getRefundPrice() {
        return refundPrice;
    }
    public void setRefundPrice(Double refundPrice) {
        this.refundPrice = refundPrice;
    }
    public Integer getIncmpCode() {
        return incmpCode;
    }
    public void setIncmpCode(Integer incmpCode) {
        this.incmpCode = incmpCode;
    }
    public Integer getIncmpModules() {
        return incmpModules;
    }
    public void setIncmpModules(Integer incmpModules) {
        this.incmpModules = incmpModules;
    }




    @Override
    public String toString() {
        return "WmOrderPartRefundFoodInfo{" + "detailId=" + detailId + "," + "appFoodCode=" + appFoodCode + "," + "foodName=" + foodName + "," + "skuId=" + skuId + "," + "spec=" + spec + "," + "foodPrice=" + foodPrice + "," + "count=" + count + "," + "boxNum=" + boxNum + "," + "boxPrice=" + boxPrice + "," + "originFoodPrice=" + originFoodPrice + "," + "refundPrice=" + refundPrice + "," + "incmpCode=" + incmpCode + "," + "incmpModules=" + incmpModules + "}";
    }
}
