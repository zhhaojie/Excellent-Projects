package com.meituan.sdk.model.wmoperNg.food.dishComboBatchsave;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotEmpty;

/**
* <p>该接口只支持套餐全量更新，每次都是全量覆盖。</p>
* This file was automatically generated.
*/
public class ComboSpu {
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">第三方商品SPUcode</font></p>
    */
    @NotBlank(message = "appFoodCode不能为空")
    @SerializedName("app_food_code")
    private String appFoodCode;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">商品名称</font></p>
    */
    @NotBlank(message = "name不能为空")
    @SerializedName("name")
    private String name;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">商品排序，</font><span style="color: rgb(0, 0, 0)"><font style="font-size:14px;line-height:22px" data-size="14">不需要则传0</font></span></p>
    */
    @SerializedName("sequence")
    private Integer sequence;
    /**
    * <p style="text-align: start;" data-diff-id="ct-diff-id-a6a2855e-d524-497a-a795-fa2ac8d029d1">商品售卖时间</p><p data-diff-id="ct-diff-id-b0afb852-4dae-4e0d-a9ca-a0480ca5a3dd">如果所有时间都可售卖传-</p><p data-diff-id="ct-diff-id-0b41c6b3-3174-4e76-904d-c3e3789f6123">如果需要分时售卖，支持周一到周日配置。</p>
    */
    @NotBlank(message = "shippingTime不能为空")
    @SerializedName("shippingTime")
    private String shippingTime;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">商品绑定的视频id，视频需要已经上传至美团</font></p>
    */
    @SerializedName("wmProductVideoId")
    private String wmProductVideoId;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">标签列表,用,分隔。招牌=1，单点不送=32</font></p>
    */
    @SerializedName("labels")
    private String labels;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">套餐商品图片，商品的图片，包括头图、详情图，仅支持静态图，动图不支持</font></p>
    */
    @NotEmpty(message = "picList不能为空")
    @SerializedName("picList")
    private List<WmComboSpuPic> picList;
    /**
    * <p>套餐商品属性只有份量。</p><p></p><p>长度限制 1</p>
    */
    @NotEmpty(message = "spuAttrList不能为空")
    @SerializedName("spuAttrList")
    private List<WmComboSpuSalesAttr> spuAttrList;
    /**
    * <p>套餐商品的skuList的size必须为1，即只有一个元素</p>
    */
    @NotEmpty(message = "skuList不能为空")
    @SerializedName("skuList")
    private List<WmComboSku> skuList;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">套餐商品所在分组</font></p>
    */
    @NotBlank(message = "tagName不能为空")
    @SerializedName("tagName")
    private String tagName;
    /**
    * <p data-diff-id="ct-diff-id-69895aa2-8c7e-41f5-8a11-c7a57d522b92">图文详情URL</p><p data-diff-id="ct-diff-id-d5cb8e28-0309-496f-95d7-219130f415bf">英文逗号分隔不同图片链接</p><p data-diff-id="ct-diff-id-3fb31635-b9d7-4057-a46d-df951edd4d0f">不同图片没有no排序，C端按照逗号分隔后的顺序展示</p>
    */
    @SerializedName("longPictures")
    private String longPictures;

    public String getAppFoodCode() {
        return appFoodCode;
    }
    public void setAppFoodCode(String appFoodCode) {
        this.appFoodCode = appFoodCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getSequence() {
        return sequence;
    }
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
    public String getShippingTime() {
        return shippingTime;
    }
    public void setShippingTime(String shippingTime) {
        this.shippingTime = shippingTime;
    }
    public String getWmProductVideoId() {
        return wmProductVideoId;
    }
    public void setWmProductVideoId(String wmProductVideoId) {
        this.wmProductVideoId = wmProductVideoId;
    }
    public String getLabels() {
        return labels;
    }
    public void setLabels(String labels) {
        this.labels = labels;
    }
    public List<WmComboSpuPic> getPicList() {
        return picList;
    }
    public void setPicList(List<WmComboSpuPic> picList) {
        this.picList = picList;
    }
    public List<WmComboSpuSalesAttr> getSpuAttrList() {
        return spuAttrList;
    }
    public void setSpuAttrList(List<WmComboSpuSalesAttr> spuAttrList) {
        this.spuAttrList = spuAttrList;
    }
    public List<WmComboSku> getSkuList() {
        return skuList;
    }
    public void setSkuList(List<WmComboSku> skuList) {
        this.skuList = skuList;
    }
    public String getTagName() {
        return tagName;
    }
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
    public String getLongPictures() {
        return longPictures;
    }
    public void setLongPictures(String longPictures) {
        this.longPictures = longPictures;
    }




    @Override
    public String toString() {
        return "ComboSpu{" + "appFoodCode=" + appFoodCode + "," + "name=" + name + "," + "sequence=" + sequence + "," + "shippingTime=" + shippingTime + "," + "wmProductVideoId=" + wmProductVideoId + "," + "labels=" + labels + "," + "picList=" + picList + "," + "spuAttrList=" + spuAttrList + "," + "skuList=" + skuList + "," + "tagName=" + tagName + "," + "longPictures=" + longPictures + "}";
    }
}
