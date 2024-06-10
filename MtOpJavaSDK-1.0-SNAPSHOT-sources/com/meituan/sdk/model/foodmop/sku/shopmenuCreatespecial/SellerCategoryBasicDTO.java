package com.meituan.sdk.model.foodmop.sku.shopmenuCreatespecial;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-7dc275cf-05b6-4b32-89a5-e0a191a8c316">前台类目基本信息</p>
* This file was automatically generated.
*/
public class SellerCategoryBasicDTO {
    /**
    * <p data-diff-id="ct-diff-id-7c705d60-5e22-449f-a940-c526f406f6ba">前台类目 id，即类目编码</p>
    */
    @NotBlank(message = "vendorSellerCategoryId不能为空")
    @SerializedName("vendorSellerCategoryId")
    private String vendorSellerCategoryId;
    /**
    * <p data-diff-id="ct-diff-id-f910c6a6-b72e-4188-b90b-51062211fc8c">类目名称</p>
    */
    @NotBlank(message = "categoryName不能为空")
    @SerializedName("categoryName")
    private String categoryName;
    /**
    * <p data-diff-id="ct-diff-id-111dc8f0-3d36-465c-971a-7b1fa8b9b41e">类目排序</p><p data-diff-id="ct-diff-id-372a6f79-404f-4bb0-8696-61ebab0474ce">rank &gt; 0</p>
    */
    @NotNull(message = "rank不能为空")
    @SerializedName("rank")
    private Integer rank;
    /**
    * <p data-diff-id="ct-diff-id-53d16907-6097-44f3-a3b1-573a699584ed">类目层级</p><ul data-diff-id="ct-diff-id-a6fb8051-e11b-4635-954f-9c1c29c5ecf1"><li data-list-item-diff-id="ct-list-item-diff-id-db6e1b4c-92ca-45f6-84a1-ced0a4d3f360"><p data-diff-id="ct-diff-id-70d29a67-7789-44d2-9372-665d05ce1e3b">1：一级类目</p></li><li data-list-item-diff-id="ct-list-item-diff-id-1fb447eb-8a09-4439-bb56-727059e4bed3"><p data-diff-id="ct-diff-id-fcff8080-6c87-4f32-b229-5c2ebb1ab1cd">2：二级类目</p></li></ul>
    */
    @NotNull(message = "level不能为空")
    @SerializedName("level")
    private Integer level;
    /**
    * <p data-diff-id="ct-diff-id-ca33df4c-5a0c-464b-8b68-1822cf9dd9e1">类目类型</p><ul data-diff-id="ct-diff-id-aa753193-911f-4572-9af7-dd1a5968de42"><li data-list-item-diff-id="ct-list-item-diff-id-9a1e2b8c-a2f1-41c4-8370-dfcdc54c7462"><p data-diff-id="ct-diff-id-7c737592-8f3a-40cd-baef-2fb09a320536">10：普通类目</p></li><li data-list-item-diff-id="ct-list-item-diff-id-b393cab3-fdb7-428d-941d-494d3063e7e1"><p data-diff-id="ct-diff-id-a91807ad-063d-479b-ab3b-4d4913cf228d">30：餐具类目</p></li></ul><p data-diff-id="ct-diff-id-56495026-cf29-466e-bb9e-927c60956c0b">品牌默认填 10 即可</p><p data-diff-id="ct-diff-id-0e2a12fe-e2a9-4577-9b49-4e530408f4b2">不为空</p><p data-diff-id="ct-diff-id-6dc65863-ca54-445a-8d60-f83e71623882">餐具类目只能放餐具商品</p><p data-diff-id="ct-diff-id-9eb24a4c-7d22-4d93-b83c-eb5ad343d999">餐具类目只能有一个</p><p data-diff-id="ct-diff-id-be86cf80-acf0-41ed-9421-3c9fd4a86479">餐具类目只能为一级类目</p>
    */
    @NotNull(message = "type不能为空")
    @SerializedName("type")
    private Integer type;
    /**
    * <p data-diff-id="ct-diff-id-1a378804-502a-4618-a226-065eb097ea71">永久置顶开关</p><ul data-diff-id="ct-diff-id-fb667d7b-466a-4683-bb00-f1d6032ba621"><li data-list-item-diff-id="ct-list-item-diff-id-61b42d16-984e-4550-918b-9ac5207e54c7"><p data-diff-id="ct-diff-id-6c35adbf-9544-47b4-9887-3ebe8cbf629c">false：关闭</p></li><li data-list-item-diff-id="ct-list-item-diff-id-bcd279bc-2fb9-447d-9312-c21df5412eea"><p data-diff-id="ct-diff-id-e9cc1598-aed8-45f9-9db1-0b9273aeed10">true：开启</p></li></ul><p data-diff-id="ct-diff-id-d221ed45-577a-45ff-aaf9-911d41685bc9">top 是永久置顶，topTime是分时置顶，两个可以单独配置</p><p data-diff-id="ct-diff-id-db638a27-ca94-4327-ba22-a29601b01ea6">top 优先级高，top = true 时即永久置顶，top = false 是根据 topTime 判定类目是否置顶</p>
    */
    @NotNull(message = "top不能为空")
    @SerializedName("top")
    private Boolean top;
    /**
    * <p data-diff-id="ct-diff-id-60339b06-4212-4a61-bcf6-7d261fd4779f">分时置顶时间</p>
    */
    @SerializedName("topTime")
    private List<TimeDTO> topTime;
    /**
    * <p data-diff-id="ct-diff-id-9e02e39d-cbf4-432a-9022-9392d21bde83">分时展示时间</p>
    */
    @SerializedName("showTime")
    private List<TimeDTO> showTime;
    /**
    * <p data-diff-id="ct-diff-id-19ac20f9-83c8-44d5-83fc-b0c402691d08">类目描述</p>
    */
    @SerializedName("description")
    private String description;
    /**
    * <p data-diff-id="ct-diff-id-07f78533-b2ef-4927-9b69-8533795ac4a7">类目标签</p><ul data-diff-id="ct-diff-id-16e76a4b-f88a-4318-ad34-76f3eaf8c881"><li data-list-item-diff-id="ct-list-item-diff-id-41cacb2d-a34c-42ae-b3ee-38efc9ef7b51"><p data-diff-id="ct-diff-id-c9eef005-266f-4b7a-a3d4-706d464f5d10">RECOMMEND(-95, "本周推荐"),</p></li><li data-list-item-diff-id="ct-list-item-diff-id-7ac367de-d667-476e-bdaf-0ab508b46071"><p data-diff-id="ct-diff-id-09fb61f4-5ac2-40b3-827b-a73692b394fb">SPECIAL_OFFER(-94, "本店特供")</p></li></ul><p data-diff-id="ct-diff-id-639f6bb7-b1ff-428a-bdc6-6dec9bb10275">星巴克品牌定制，其他品牌不填</p>
    */
    @SerializedName("tagList")
    private List<Integer> tagList;
    /**
    * <p data-diff-id="ct-diff-id-0d6d6975-61a7-4e51-9d86-d8db9e6cf4d1">父类目 id</p><p data-diff-id="ct-diff-id-7a5ef658-29e9-42a0-be75-8c616a5000c3">level == 2 时必填</p><p data-diff-id="ct-diff-id-227cf4a8-d1a2-4ad2-8c5c-3e542e4c2481">parentVendorSellerCategoryId != vendorSellerCategoryId，parentVendorSellerCategoryId 必须存在于一级类目 id 中，一级类目没有父类目 id</p>
    */
    @SerializedName("parentVendorSellerCategoryId")
    private String parentVendorSellerCategoryId;
    @NotNull(message = "hide不能为空")
    @SerializedName("hide")
    private Boolean hide;

    public String getVendorSellerCategoryId() {
        return vendorSellerCategoryId;
    }
    public void setVendorSellerCategoryId(String vendorSellerCategoryId) {
        this.vendorSellerCategoryId = vendorSellerCategoryId;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public Integer getRank() {
        return rank;
    }
    public void setRank(Integer rank) {
        this.rank = rank;
    }
    public Integer getLevel() {
        return level;
    }
    public void setLevel(Integer level) {
        this.level = level;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public Boolean getTop() {
        return top;
    }
    public void setTop(Boolean top) {
        this.top = top;
    }
    public List<TimeDTO> getTopTime() {
        return topTime;
    }
    public void setTopTime(List<TimeDTO> topTime) {
        this.topTime = topTime;
    }
    public List<TimeDTO> getShowTime() {
        return showTime;
    }
    public void setShowTime(List<TimeDTO> showTime) {
        this.showTime = showTime;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Integer> getTagList() {
        return tagList;
    }
    public void setTagList(List<Integer> tagList) {
        this.tagList = tagList;
    }
    public String getParentVendorSellerCategoryId() {
        return parentVendorSellerCategoryId;
    }
    public void setParentVendorSellerCategoryId(String parentVendorSellerCategoryId) {
        this.parentVendorSellerCategoryId = parentVendorSellerCategoryId;
    }
    public Boolean getHide() {
        return hide;
    }
    public void setHide(Boolean hide) {
        this.hide = hide;
    }




    @Override
    public String toString() {
        return "SellerCategoryBasicDTO{" + "vendorSellerCategoryId=" + vendorSellerCategoryId + "," + "categoryName=" + categoryName + "," + "rank=" + rank + "," + "level=" + level + "," + "type=" + type + "," + "top=" + top + "," + "topTime=" + topTime + "," + "showTime=" + showTime + "," + "description=" + description + "," + "tagList=" + tagList + "," + "parentVendorSellerCategoryId=" + parentVendorSellerCategoryId + "," + "hide=" + hide + "}";
    }
}
