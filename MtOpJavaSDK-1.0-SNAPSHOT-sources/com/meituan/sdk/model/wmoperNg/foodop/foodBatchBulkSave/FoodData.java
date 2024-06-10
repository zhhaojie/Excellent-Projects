package com.meituan.sdk.model.wmoperNg.foodop.foodBatchBulkSave;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">菜品集合的</font></span><span style="color: #f5222d"><font style="font-size:14px;line-height:22px" data-size="14">json</font></span><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">数据，</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">处理逻辑：</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">1）如果菜品原来不存在就新增；</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">2）如app_food_code存在就更新；</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">3）picture 可以是调用</font></span>上传菜品图片接口<span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">后返回的图片ID,</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">也可以是url地址,推荐使用图片ID的形式。</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">如果skus传递box_num、box_price以skus为准,</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">未传递box_num、box_price以上级参数为准</font></span></p>
* This file was automatically generated.
*/
public class FoodData {
    /**
    * 服务商方的菜品id，(三方商品spu_code值， 不同门店可以重复，同一门店内不能重复)，最大长度128
    */
    @NotBlank(message = "appFoodCode不能为空")
    @SerializedName("app_food_code")
    private String appFoodCode;
    /**
    * 菜品名称，最多不超过30个字符
    */
    @SerializedName("name")
    private String name;
    /**
    * 菜品描述，最多不超过255个字符
    */
    @SerializedName("description")
    private String description;
    /**
    * 服务商方的菜品skus，代表菜品下的多个sku信息，使用json格式传递参数。如果skus传递box_num、box_price以skus为准，未传递box_num、box_price以上级参数为准。如果skus未传，会重置菜品的skus信息
    */
    @SerializedName("skus")
    private List<Skus> skus;
    /**
    * 菜品价格，不能为负数
    */
    @SerializedName("price")
    private Float price;
    /**
    * 最小购买量，最小为1
    */
    @SerializedName("min_order_count")
    private Integer minOrderCount;
    /**
    * 单位
    */
    @SerializedName("unit")
    private String unit;
    /**
    * 打包盒数量
    */
    @SerializedName("box_num")
    private Float boxNum;
    /**
    * 打包盒价格，不能为负数
    */
    @SerializedName("box_price")
    private Float boxPrice;
    /**
    * 菜品分类
    */
    @SerializedName("category_name")
    private String categoryName;
    /**
    * 菜品上下架状态，0表上架，1表下架
    */
    @SerializedName("is_sold_out")
    private Integer isSoldOut;
    /**
    * 菜品图片id（注意：①此处的图片id由步骤1上传图片获得②更新菜品图片时必须更新图片URL），只支持jpg格式，图片需要小于1600*1200
    */
    @SerializedName("picture")
    private String picture;
    /**
    * 当前分类下的排序序号
    */
    @SerializedName("sequence")
    private Integer sequence;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">true：该单品仅在套餐里售卖，不单独售卖</font></p><p>false：默认值，在套餐和单品都可售</p>
    */
    @SerializedName("onlySellInCombo")
    private Boolean onlySellInCombo;
    /**
    * <p data-diff-id="ct-diff-id-d6321850-b223-40ca-b31d-8c8ff8cf1312">图文详情URL</p><ol data-diff-id="ct-diff-id-b3651e48-29aa-46f0-a4e6-6286736bf1e6"><li data-list-item-diff-id="ct-list-item-diff-id-c62fe06e-2366-4c75-b383-19933116f69f"><p data-diff-id="ct-diff-id-00da2751-5a08-444a-931d-1d762c44a13e">英文逗号分隔不同图片链接</p></li><li data-list-item-diff-id="ct-list-item-diff-id-d265dd24-2193-474f-a8ca-be940bd0d636"><p data-diff-id="ct-diff-id-0315a68f-644a-4e17-bc8d-969abc6f06ed">不同图片没有no排序，C端按照逗号分隔后的顺序展示</p></li></ol>
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Skus> getSkus() {
        return skus;
    }
    public void setSkus(List<Skus> skus) {
        this.skus = skus;
    }
    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public Integer getMinOrderCount() {
        return minOrderCount;
    }
    public void setMinOrderCount(Integer minOrderCount) {
        this.minOrderCount = minOrderCount;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public Float getBoxNum() {
        return boxNum;
    }
    public void setBoxNum(Float boxNum) {
        this.boxNum = boxNum;
    }
    public Float getBoxPrice() {
        return boxPrice;
    }
    public void setBoxPrice(Float boxPrice) {
        this.boxPrice = boxPrice;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public Integer getIsSoldOut() {
        return isSoldOut;
    }
    public void setIsSoldOut(Integer isSoldOut) {
        this.isSoldOut = isSoldOut;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public Integer getSequence() {
        return sequence;
    }
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
    public Boolean getOnlySellInCombo() {
        return onlySellInCombo;
    }
    public void setOnlySellInCombo(Boolean onlySellInCombo) {
        this.onlySellInCombo = onlySellInCombo;
    }
    public String getLongPictures() {
        return longPictures;
    }
    public void setLongPictures(String longPictures) {
        this.longPictures = longPictures;
    }




    @Override
    public String toString() {
        return "FoodData{" + "appFoodCode=" + appFoodCode + "," + "name=" + name + "," + "description=" + description + "," + "skus=" + skus + "," + "price=" + price + "," + "minOrderCount=" + minOrderCount + "," + "unit=" + unit + "," + "boxNum=" + boxNum + "," + "boxPrice=" + boxPrice + "," + "categoryName=" + categoryName + "," + "isSoldOut=" + isSoldOut + "," + "picture=" + picture + "," + "sequence=" + sequence + "," + "onlySellInCombo=" + onlySellInCombo + "," + "longPictures=" + longPictures + "}";
    }
}
