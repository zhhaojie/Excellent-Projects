package com.meituan.sdk.model.wmoperNg.food.dishComboSave;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* <p>套餐sku信息。套餐商品的skuList的size必须为1，即只有一个元素</p>
* This file was automatically generated.
*/
public class WmComboSku {
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">第三方规格code。长度限制128</font></p>
    */
    @NotBlank(message = "skuId不能为空")
    @SerializedName("sku_id")
    private String skuId;
    /**
    * <p>sku价格。单位元/两位小数，对于套餐商品下的sku，代表其基础价。</p><p>限制：</p><p>1.基础价需小于等于5000；<br>2.基础价需小于等于原商品原价之和最低值，最低值=【固定搭配】分组下单品价格*份数+【自由选配】分组下最低价单品n价格之和，n取值为m选n的n。</p>
    */
    @NotNull(message = "price不能为空")
    @SerializedName("price")
    private Double price;
    /**
    * <p>售卖状态。0-恢复售卖，1-暂停售卖，默认0。需要与spuattr里的sell_status一致</p>
    */
    @SerializedName("sell_status")
    private Integer sellStatus;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">库存。-1代表不限库存，超卖传0</font></p>
    */
    @NotNull(message = "stock不能为空")
    @SerializedName("stock")
    private Integer stock;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">打包盒个数</font></p>
    */
    @NotNull(message = "ladderNum不能为空")
    @SerializedName("ladder_num")
    private Integer ladderNum;
    /**
    * <p>打包费。打包费最小为0，单位为元，保留两位小数。</p>
    */
    @NotNull(message = "ladderPrice不能为空")
    @SerializedName("ladder_price")
    private Double ladderPrice;
    /**
    * <p>sku销售属性。即套餐sku对应的skuAttr。</p>
    */
    @NotEmpty(message = "skuAttrList不能为空")
    @SerializedName("skuAttrList")
    private List<WmComboSkuSalesAttr> skuAttrList;
    /**
    * <p>分组可选套餐的分组信息。当套餐为可选分组套餐时，需要传入。当套餐为固定搭配套餐时，不传入。固定搭配套餐分组数量不能超过5个。</p>
    */
    @SerializedName("comboGroupList")
    private List<WmComboGroup> comboGroupList;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">固定搭配套餐的单品关联信息。</font>固定搭配套餐必须传入，可选分组套餐不传入</p>
    */
    @SerializedName("combineSkuRelList")
    private List<WmCombineSkuRel> combineSkuRelList;

    public String getSkuId() {
        return skuId;
    }
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Integer getSellStatus() {
        return sellStatus;
    }
    public void setSellStatus(Integer sellStatus) {
        this.sellStatus = sellStatus;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public Integer getLadderNum() {
        return ladderNum;
    }
    public void setLadderNum(Integer ladderNum) {
        this.ladderNum = ladderNum;
    }
    public Double getLadderPrice() {
        return ladderPrice;
    }
    public void setLadderPrice(Double ladderPrice) {
        this.ladderPrice = ladderPrice;
    }
    public List<WmComboSkuSalesAttr> getSkuAttrList() {
        return skuAttrList;
    }
    public void setSkuAttrList(List<WmComboSkuSalesAttr> skuAttrList) {
        this.skuAttrList = skuAttrList;
    }
    public List<WmComboGroup> getComboGroupList() {
        return comboGroupList;
    }
    public void setComboGroupList(List<WmComboGroup> comboGroupList) {
        this.comboGroupList = comboGroupList;
    }
    public List<WmCombineSkuRel> getCombineSkuRelList() {
        return combineSkuRelList;
    }
    public void setCombineSkuRelList(List<WmCombineSkuRel> combineSkuRelList) {
        this.combineSkuRelList = combineSkuRelList;
    }




    @Override
    public String toString() {
        return "WmComboSku{" + "skuId=" + skuId + "," + "price=" + price + "," + "sellStatus=" + sellStatus + "," + "stock=" + stock + "," + "ladderNum=" + ladderNum + "," + "ladderPrice=" + ladderPrice + "," + "skuAttrList=" + skuAttrList + "," + "comboGroupList=" + comboGroupList + "," + "combineSkuRelList=" + combineSkuRelList + "}";
    }
}
