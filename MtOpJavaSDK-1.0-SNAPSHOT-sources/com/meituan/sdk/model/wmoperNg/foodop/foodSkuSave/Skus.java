package com.meituan.sdk.model.wmoperNg.foodop.foodSkuSave;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* 服务商方的菜品skus，代表菜品下的多个sku信息，使用json格式传递参数。如果skus传递box_num、box_price以skus为准，未传递box_num、box_price以上级参数为准。如果skus未传，会重置菜品的skus信息
* This file was automatically generated.
*/
public class Skus {
    /**
    * sku唯一标识
    */
    @NotBlank(message = "skuId不能为空")
    @SerializedName("sku_id")
    private String skuId;
    /**
    * sku的规格
    */
    @NotBlank(message = "spec不能为空")
    @SerializedName("spec")
    private String spec;
    /**
    * upc码
    */
    @SerializedName("upc")
    private String upc;
    /**
    * sku的价格，不能为负数，不能超过10个字
    */
    @NotBlank(message = "price不能为空")
    @SerializedName("price")
    private String price;
    /**
    * sku的库存数量，不能为负数，也不能为小数，传'*'表示表示库存无限
    */
    @NotBlank(message = "stock不能为空")
    @SerializedName("stock")
    private String stock;
    /**
    * 规格排序
    */
    @SerializedName("sku_sequence")
    private Integer skuSequence;
    /**
    * sku起售时间，要保证不同时间段之间不存在交集
    */
    @SerializedName("available_times")
    private AvailableTimes availableTimes;
    /**
    * 料位码
    */
    @SerializedName("locationCode")
    private String locationCode;
    /**
    * 打包盒数量
    */
    @SerializedName("box_num")
    private String boxNum;
    /**
    * 打包盒价格，不能为负数
    */
    @SerializedName("box_price")
    private String boxPrice;
    /**
    * 每M个商品需N元包装费，本字段代表M个商品。不可为0。如传“ladder_num”和“ladder_price”，则代表商家使用了阶梯价格，“box_num”和“box_price”中的内容不生效
    */
    @SerializedName("ladder_num")
    private String ladderNum;
    /**
    * 每M个商品需N元包装费，本字段代表N元。如传“ladder_num”和“ladder_price”，则代表商家使用了阶梯价格，“box_num”和“box_price”中的内容不生效
    */
    @SerializedName("ladder_price")
    private String ladderPrice;
    /**
    * 填写详细的份量数字。1.填数量(对应weight_unit中 1，2)。2.无需再填数量(对应weight_unit中3)。用法：① 0表示清空 weight，weight_unit。② -1和null 表示不更新weight，weight_unit。③ 其他正常设置weight，weight_unit
    */
    @SerializedName("weight")
    private Long weight;
    /**
    * 份量单位。1.克、千克、两、斤、磅、盎司、毫升、升、寸、厘米。2.个、串、枚、粒、 块、只、副、卷、片、贯、碗、杯、袋、瓶、盒、包、锅、罐、扎。3.1人份、2人份、3人份、4人份、5人份、6人份、7人份、8人份、9人份、10人份
    */
    @SerializedName("weight_unit")
    private String weightUnit;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">售卖属性<br>spuAttr与skuAttr中的属性数量相同且属性内容相同（mode=2)</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">该字段为JSON String，具体字段如下：</font></p><table class="ct-table" data-bordercolor="#cccccc"><tbody><tr><th data-colwidth="68" width="68"><p>字段</p></th><th data-colwidth="68" width="68"><p>类型</p></th><th data-colwidth="225" width="225"><p>描述</p></th><th data-colwidth="225" width="225"><p>示例值</p></th></tr><tr><td data-colwidth="68" width="68"><p><font style="font-size:14px;line-height:22px" data-size="14">skuId</font></p></td><td data-colwidth="68" width="68"><p>string</p></td><td data-colwidth="225" width="225"><p><font style="font-size:14px;line-height:22px" data-size="14">sku唯一标识</font></p></td><td data-colwidth="225" width="225"><p>10000</p></td></tr><tr><td data-colwidth="68" width="68"><p><font style="font-size:14px;line-height:22px" data-size="14">no</font></p></td><td data-colwidth="68" width="68"><p>int</p></td><td data-colwidth="225" width="225"><p><font style="font-size:14px;line-height:22px" data-size="14">属性编号</font></p></td><td data-colwidth="225" width="225"><p>1</p></td></tr><tr><td data-colwidth="68" width="68"><p><font style="font-size:14px;line-height:22px" data-size="14">name</font></p></td><td data-colwidth="68" width="68"><p>string</p></td><td data-colwidth="225" width="225"><p><font style="font-size:14px;line-height:22px" data-size="14">属性名称，长度不能大于10</font></p></td><td data-colwidth="225" width="225"><p><font style="font-size:14px;line-height:22px" data-size="14">冷热</font></p></td></tr><tr><td data-colwidth="68" width="68"><p><font style="font-size:14px;line-height:22px" data-size="14">value</font></p></td><td data-colwidth="68" width="68"><p>string</p></td><td data-colwidth="225" width="225"><p><font style="font-size:14px;line-height:22px" data-size="14">属性值, 长度不能大于10</font></p></td><td data-colwidth="225" width="225"><p>冷</p></td></tr></tbody></table><p></p>
    */
    @SerializedName("skuAttr")
    private String skuAttr;

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
    public String getUpc() {
        return upc;
    }
    public void setUpc(String upc) {
        this.upc = upc;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getStock() {
        return stock;
    }
    public void setStock(String stock) {
        this.stock = stock;
    }
    public Integer getSkuSequence() {
        return skuSequence;
    }
    public void setSkuSequence(Integer skuSequence) {
        this.skuSequence = skuSequence;
    }
    public AvailableTimes getAvailableTimes() {
        return availableTimes;
    }
    public void setAvailableTimes(AvailableTimes availableTimes) {
        this.availableTimes = availableTimes;
    }
    public String getLocationCode() {
        return locationCode;
    }
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }
    public String getBoxNum() {
        return boxNum;
    }
    public void setBoxNum(String boxNum) {
        this.boxNum = boxNum;
    }
    public String getBoxPrice() {
        return boxPrice;
    }
    public void setBoxPrice(String boxPrice) {
        this.boxPrice = boxPrice;
    }
    public String getLadderNum() {
        return ladderNum;
    }
    public void setLadderNum(String ladderNum) {
        this.ladderNum = ladderNum;
    }
    public String getLadderPrice() {
        return ladderPrice;
    }
    public void setLadderPrice(String ladderPrice) {
        this.ladderPrice = ladderPrice;
    }
    public Long getWeight() {
        return weight;
    }
    public void setWeight(Long weight) {
        this.weight = weight;
    }
    public String getWeightUnit() {
        return weightUnit;
    }
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }
    public String getSkuAttr() {
        return skuAttr;
    }
    public void setSkuAttr(String skuAttr) {
        this.skuAttr = skuAttr;
    }




    @Override
    public String toString() {
        return "Skus{" + "skuId=" + skuId + "," + "spec=" + spec + "," + "upc=" + upc + "," + "price=" + price + "," + "stock=" + stock + "," + "skuSequence=" + skuSequence + "," + "availableTimes=" + availableTimes + "," + "locationCode=" + locationCode + "," + "boxNum=" + boxNum + "," + "boxPrice=" + boxPrice + "," + "ladderNum=" + ladderNum + "," + "ladderPrice=" + ladderPrice + "," + "weight=" + weight + "," + "weightUnit=" + weightUnit + "," + "skuAttr=" + skuAttr + "}";
    }
}
