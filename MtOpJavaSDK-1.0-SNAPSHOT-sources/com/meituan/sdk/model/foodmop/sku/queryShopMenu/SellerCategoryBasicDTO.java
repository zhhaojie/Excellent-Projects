package com.meituan.sdk.model.foodmop.sku.queryShopMenu;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 前台类目基本信息
* This file was automatically generated.
*/
public class SellerCategoryBasicDTO {
    /**
    * 前台类目 id，即类目编码
    */
    @NotBlank(message = "vendorSellerCategoryId不能为空")
    @SerializedName("vendorSellerCategoryId")
    private String vendorSellerCategoryId;
    /**
    * 类目名称
    */
    @NotBlank(message = "categoryName不能为空")
    @SerializedName("categoryName")
    private String categoryName;
    /**
    * 类目排序 rank > 0
    */
    @NotNull(message = "rank不能为空")
    @SerializedName("rank")
    private Integer rank;
    /**
    * 类目层级 1：一级类目 2：二级类目
    */
    @NotNull(message = "level不能为空")
    @SerializedName("level")
    private Integer level;
    /**
    * 类目类型 10：普通类目 30：餐具类目 品牌默认 10 
    */
    @NotNull(message = "type不能为空")
    @SerializedName("type")
    private Integer type;
    /**
    * 永久置顶开关  false：关闭  true：开启
    */
    @NotNull(message = "top不能为空")
    @SerializedName("top")
    private Boolean top;
    /**
    * 分时置顶时间
    */
    @SerializedName("topTime")
    private List<TimeDTO> topTime;
    /**
    * 分时展示时间
    */
    @SerializedName("showTime")
    private List<TimeDTO> showTime;
    /**
    * 类目描述
    */
    @SerializedName("description")
    private String description;
    /**
    * 配料标签，该字段未实际投入使用
    */
    @SerializedName("tagList")
    private List<Integer> tagList;
    /**
    * 父类目 id
    */
    @SerializedName("parentVendorSellerCategoryId")
    private String parentVendorSellerCategoryId;
    /**
    * 类目是否在页面隐藏
    */
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
