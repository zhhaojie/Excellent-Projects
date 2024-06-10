package com.meituan.sdk.model.wmoperNg.foodop.foodInitdata;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 创建或更新菜品（新版）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/foodop/food/initdata",
    businessId = 16,
    apiVersion = "10036",
    apiName = "food_initdata",
    needAuth = true
)
public class FoodInitdataRequest implements MeituanRequest<String> {
    /**
    * 服务商方的菜品id，(三方商品spu_code值， 不同门店可以重复，同一门店内不能重复)，最大长度128
    */
    @NotBlank(message = "appFoodCode不能为空")
    @SerializedName("app_food_code")
    private String appFoodCode;
    /**
    * 菜品名称，最多不超过30个字符
    */
    @NotBlank(message = "name不能为空")
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
    * <p><font style="font-size:14px;line-height:22px" data-size="14">spu售卖属性，spuAttr与skuAttr中的属性数量相同且属性内容相同（mode=2)</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">该字段为JSON String，具体字段如下：</font></p><p></p><table class="ct-table"><tbody><tr><td data-colwidth="180" width="180" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">参数名称，（名称前的“-”，代表层级关系，非参数本身）</font></p></td><td data-colwidth="89" width="89" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">类型</font></p></td><td data-colwidth="260" width="260" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p>示例值</p></td><td data-colwidth="331" width="331" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">描述</font></p></td></tr><tr><td data-colwidth="180" width="180" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">-no</font></p></td><td data-colwidth="89" width="89" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">int</font></p></td><td data-colwidth="260" width="260" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">0</font></p></td><td data-colwidth="331" width="331" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">属性编号；例：温度(1)，口味(2)等</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">no必须从大于等于1开始且no在name相同时候，no必须相同</font></p></td></tr><tr><td data-colwidth="180" width="180" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">-mode</font></p></td><td data-colwidth="89" width="89" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">int</font></p></td><td data-colwidth="260" width="260" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">2</font></p></td><td data-colwidth="331" width="331" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">售卖属性模式，1：普通售卖属性，2：决定价格库存的售卖属性</font></p></td></tr><tr><td data-colwidth="180" width="180" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">-name</font></p></td><td data-colwidth="89" width="89" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">string</font></p></td><td data-colwidth="260" width="260" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">冷热</font></p></td><td data-colwidth="331" width="331" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">名称 example="冷热"</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">name长度不能大于10</font></p></td></tr><tr><td data-colwidth="180" width="180" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">-value</font></p></td><td data-colwidth="89" width="89" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">string</font></p></td><td data-colwidth="260" width="260" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">热</font></p></td><td data-colwidth="331" width="331" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">名称值, example="冷"</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">value长度不能大于10</font></p></td></tr><tr><td data-colwidth="180" width="180" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">-price</font></p></td><td data-colwidth="89" width="89" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">double</font></p></td><td data-colwidth="260" width="260" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">1.11</font></p></td><td data-colwidth="331" width="331" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">属性价格</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">price小数点后最多两位</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">符合要求示例：</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">1.整数</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">2.小数点后一位</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">3.小数点后两位</font></p></td></tr><tr><td data-colwidth="180" width="180" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">-sell_status</font></p></td><td data-colwidth="89" width="89" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">int</font></p></td><td data-colwidth="260" width="260" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">0</font></p></td><td data-colwidth="331" width="331" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">售卖状态</font></p></td></tr><tr><td data-colwidth="180" width="180" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">-value_sequence</font></p></td><td data-colwidth="89" width="89" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">int</font></p></td><td data-colwidth="260" width="260" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">0</font></p></td><td data-colwidth="331" width="331" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><font style="font-size:14px;line-height:22px" data-size="14">属性值排序序号,1开始</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">value_sequence必须从大于等于1开始且value_sequence在name相同时，value_sequence必须不同</font></p></td></tr><tr><td data-colwidth="180" width="180" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">-exclude_attr</font></span></p></td><td data-colwidth="89" width="89" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">list</font></span></p></td><td data-colwidth="260" width="260" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p>"exclude_attr":[{"attr_name":"冷热", attr_values:["冷","热"]},{}]</p></td><td data-colwidth="331" width="331" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p>标识与该属性互斥的属性。</p><p>1、空时为null，表示没有互斥属性。</p><p>2、属性互斥设置时必须是进行双向互斥。若属性值a与属性值b互斥，需在属性a的参数中传互斥属性为b，也需在属性b的参数中传互斥属性为a。</p><p>3、属性互斥设置时需保证至少有一个可售卖的sku，不能所有sku均互斥，如不符合规则将会按spu创建失败处理。</p><p>4、属性互斥设置时需保证单个属性值与其他项下至少一个属性值不互斥，如不符合规则将会按spu创建失败处理。</p><p>5、规格格式举例：</p><p>属性项：属性值（p0:p01）</p><p>属性项：属性值（p1:pv11）</p><p>当p01与pv11互斥时：</p><p>p0属性的exclude_attr: [{"attr_name":"p1", "attr_values":["pv11"]}]</p><p>p1属性的exclude_attr: [{"attr_name":"p0", "attr_values":["p01"]}]</p><p>当与多个属性互斥时：</p><p>某属性的exclude_attr :  [{"attr_name":"p1", "attr_values":["pv11","pv12"]}, {"attr_name":"p2", "attr_values":["pv21","pv22"]}]</p></td></tr><tr><td data-colwidth="180" width="180" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">--attr_name</font></span></p></td><td data-colwidth="89" width="89" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">string</font></span></p></td><td data-colwidth="260" width="260" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><em><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">冷热</font></span></em></p></td><td data-colwidth="331" width="331" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p>互斥属性名称</p></td></tr><tr><td data-colwidth="180" width="180" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">--attr_values</font></span></p></td><td data-colwidth="89" width="89" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">list&lt;string&gt;</font></span></p></td><td data-colwidth="260" width="260" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">["冷","热"]</font></span></p></td><td data-colwidth="331" width="331" style="background-color: rgb(255, 255, 255);vertical-align:top;"><p>互斥属性值</p></td></tr></tbody></table><p></p>
    */
    @SerializedName("spuAttr")
    private String spuAttr;
    /**
    * <p>true：该单品仅在套餐里售卖，不单独售卖</p><p>false：默认值，在套餐和单品都可售</p>
    */
    @SerializedName("onlySellInCombo")
    private Boolean onlySellInCombo;
    /**
    * <p data-diff-id="ct-diff-id-f2b7bee2-5776-46f2-bbfd-f116a8800f30">图文详情URL</p><p data-diff-id="ct-diff-id-bcbb5878-d3da-4e95-a3c5-8a4ed6b6374f">英文逗号分隔不同图片链接</p><p data-diff-id="ct-diff-id-74c39f4d-3269-437a-984c-decc09824f9c">不同图片没有no排序，C端按照逗号分隔后的顺序展示</p>
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
    public String getSpuAttr() {
        return spuAttr;
    }
    public void setSpuAttr(String spuAttr) {
        this.spuAttr = spuAttr;
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
    public MeituanResponse<String> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<String>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "FoodInitdataRequest{" + "appFoodCode=" + appFoodCode + "," + "name=" + name + "," + "description=" + description + "," + "skus=" + skus + "," + "price=" + price + "," + "minOrderCount=" + minOrderCount + "," + "unit=" + unit + "," + "boxNum=" + boxNum + "," + "boxPrice=" + boxPrice + "," + "categoryName=" + categoryName + "," + "isSoldOut=" + isSoldOut + "," + "picture=" + picture + "," + "sequence=" + sequence + "," + "spuAttr=" + spuAttr + "," + "onlySellInCombo=" + onlySellInCombo + "," + "longPictures=" + longPictures + "}";
    }
}
