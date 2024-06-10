package com.meituan.sdk.model.wmoperNg.special.specialFoodBatchQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class WmOpenProductSpus {
    @SerializedName("mt_spu_id")
    private Long mtSpuId;
    @SerializedName("name")
    private String name;
    @SerializedName("app_food_code")
    private String appFoodCode;
    @SerializedName("picture")
    private String picture;
    @SerializedName("tag_name")
    private String tagName;
    @SerializedName("mt_tag_id")
    private Long mtTagId;
    @SerializedName("description")
    private String description;
    @SerializedName("tag")
    private String tag;
    @SerializedName("skus")
    private List<Skus> skus;
    @SerializedName("propertys")
    private List<Propertys> propertys;
    @SerializedName("setmeals")
    private List<Setmeals> setmeals;
    @SerializedName("spu_type")
    private Long spuType;
    @SerializedName("sequence")
    private Long sequence;
    @SerializedName("ctime")
    private Long ctime;
    @SerializedName("utime")
    private Long utime;
    @SerializedName("sell_status")
    private Long sellStatus;
    @SerializedName("max_num")
    private Long maxNum;

    public Long getMtSpuId() {
        return mtSpuId;
    }
    public void setMtSpuId(Long mtSpuId) {
        this.mtSpuId = mtSpuId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAppFoodCode() {
        return appFoodCode;
    }
    public void setAppFoodCode(String appFoodCode) {
        this.appFoodCode = appFoodCode;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public String getTagName() {
        return tagName;
    }
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
    public Long getMtTagId() {
        return mtTagId;
    }
    public void setMtTagId(Long mtTagId) {
        this.mtTagId = mtTagId;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }
    public List<Skus> getSkus() {
        return skus;
    }
    public void setSkus(List<Skus> skus) {
        this.skus = skus;
    }
    public List<Propertys> getPropertys() {
        return propertys;
    }
    public void setPropertys(List<Propertys> propertys) {
        this.propertys = propertys;
    }
    public List<Setmeals> getSetmeals() {
        return setmeals;
    }
    public void setSetmeals(List<Setmeals> setmeals) {
        this.setmeals = setmeals;
    }
    public Long getSpuType() {
        return spuType;
    }
    public void setSpuType(Long spuType) {
        this.spuType = spuType;
    }
    public Long getSequence() {
        return sequence;
    }
    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }
    public Long getCtime() {
        return ctime;
    }
    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }
    public Long getUtime() {
        return utime;
    }
    public void setUtime(Long utime) {
        this.utime = utime;
    }
    public Long getSellStatus() {
        return sellStatus;
    }
    public void setSellStatus(Long sellStatus) {
        this.sellStatus = sellStatus;
    }
    public Long getMaxNum() {
        return maxNum;
    }
    public void setMaxNum(Long maxNum) {
        this.maxNum = maxNum;
    }




    @Override
    public String toString() {
        return "WmOpenProductSpus{" + "mtSpuId=" + mtSpuId + "," + "name=" + name + "," + "appFoodCode=" + appFoodCode + "," + "picture=" + picture + "," + "tagName=" + tagName + "," + "mtTagId=" + mtTagId + "," + "description=" + description + "," + "tag=" + tag + "," + "skus=" + skus + "," + "propertys=" + propertys + "," + "setmeals=" + setmeals + "," + "spuType=" + spuType + "," + "sequence=" + sequence + "," + "ctime=" + ctime + "," + "utime=" + utime + "," + "sellStatus=" + sellStatus + "," + "maxNum=" + maxNum + "}";
    }
}
