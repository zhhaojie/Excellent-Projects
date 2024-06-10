package com.meituan.sdk.model.wmoperNg.food.wmoperFoodQueryFoodcatList;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class Data {
    /**
    * APP方门店id
    */
    @SerializedName("epoiId")
    private String epoiId;
    /**
    * 品类名称
    */
    @SerializedName("name")
    private String name;
    /**
    * 菜品分类排序
    */
    @SerializedName("sequence")
    private Integer sequence;
    /**
    * 分类描述
    */
    @SerializedName("category_description")
    private String categoryDescription;
    /**
    * 分组信息。0-普通分类；1-必选分类；2-可单独结算分类
    */
    @SerializedName("category_mode")
    private Integer categoryMode;
    /**
    * 置顶开关，0 关闭； 1 开启
    */
    @SerializedName("top_flag")
    private Integer topFlag;
    /**
    * 置顶时间段
    */
    @SerializedName("time_zone")
    private String timeZone;
    /**
    * 分类创建时间
    */
    @SerializedName("ctime")
    private Integer ctime;
    /**
    * 分类更新时间
    */
    @SerializedName("utime")
    private Integer utime;

    public String getEpoiId() {
        return epoiId;
    }
    public void setEpoiId(String epoiId) {
        this.epoiId = epoiId;
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
    public Integer getTopFlag() {
        return topFlag;
    }
    public void setTopFlag(Integer topFlag) {
        this.topFlag = topFlag;
    }
    public String getTimeZone() {
        return timeZone;
    }
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
    public Integer getCtime() {
        return ctime;
    }
    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }
    public Integer getUtime() {
        return utime;
    }
    public void setUtime(Integer utime) {
        this.utime = utime;
    }




    @Override
    public String toString() {
        return "Data{" + "epoiId=" + epoiId + "," + "name=" + name + "," + "sequence=" + sequence + "," + "categoryDescription=" + categoryDescription + "," + "categoryMode=" + categoryMode + "," + "topFlag=" + topFlag + "," + "timeZone=" + timeZone + "," + "ctime=" + ctime + "," + "utime=" + utime + "}";
    }
}
