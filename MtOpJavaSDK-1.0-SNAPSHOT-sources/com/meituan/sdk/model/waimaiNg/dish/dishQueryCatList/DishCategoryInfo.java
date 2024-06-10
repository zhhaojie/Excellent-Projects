package com.meituan.sdk.model.waimaiNg.dish.dishQueryCatList;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class DishCategoryInfo {
    /**
    * 分类描述
    */
    @SerializedName("categoryDescription")
    private String categoryDescription;
    /**
    * 分组信息。0-普通分类；1-必选分类；2-可单独结算分类
    */
    @SerializedName("categoryMode")
    private Integer categoryMode;
    /**
    * ERP门店id 最大长度100
    */
    @SerializedName("ePoiId")
    private String ePoiId;
    /**
    * 菜品分类名称
    */
    @SerializedName("name")
    private String name;
    /**
    * 分类顺序,排序由小到大
    */
    @SerializedName("sequence")
    private Integer sequence;
    /**
    * 置顶时间段
    */
    @SerializedName("timeZone")
    private String timeZone;
    /**
    * 置顶开关，0 关闭； 1 开启
    */
    @SerializedName("topFlag")
    private Integer topFlag;

    public String getCategoryDescription() {
        return categoryDescription;
    }
    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }
    public Integer getCategoryMode() {
        return categoryMode;
    }
    public void setCategoryMode(Integer categoryMode) {
        this.categoryMode = categoryMode;
    }
    public String getEPoiId() {
        return ePoiId;
    }
    public void setEPoiId(String ePoiId) {
        this.ePoiId = ePoiId;
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
    public String getTimeZone() {
        return timeZone;
    }
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
    public Integer getTopFlag() {
        return topFlag;
    }
    public void setTopFlag(Integer topFlag) {
        this.topFlag = topFlag;
    }




    @Override
    public String toString() {
        return "DishCategoryInfo{" + "categoryDescription=" + categoryDescription + "," + "categoryMode=" + categoryMode + "," + "ePoiId=" + ePoiId + "," + "name=" + name + "," + "sequence=" + sequence + "," + "timeZone=" + timeZone + "," + "topFlag=" + topFlag + "}";
    }
}
