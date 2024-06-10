package com.meituan.sdk.model.waimaiNg.special.specialFoodBatchQuery;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 
* This file was automatically generated.
*/
public class WmOpenProductSpus {
    @NotNull(message = "mtSpuId不能为空")
    @SerializedName("mt_spu_id")
    private Long mtSpuId;
    @NotBlank(message = "name不能为空")
    @SerializedName("name")
    private String name;
    @NotBlank(message = "appFoodCode不能为空")
    @SerializedName("app_food_code")
    private String appFoodCode;
    @NotBlank(message = "picture不能为空")
    @SerializedName("picture")
    private String picture;
    @NotBlank(message = "tagName不能为空")
    @SerializedName("tag_name")
    private String tagName;
    @NotNull(message = "mtTagId不能为空")
    @SerializedName("mt_tag_id")
    private Long mtTagId;
    @NotBlank(message = "description不能为空")
    @SerializedName("description")
    private String description;
    @NotBlank(message = "tag不能为空")
    @SerializedName("tag")
    private String tag;
    @NotEmpty(message = "skus不能为空")
    @SerializedName("skus")
    private List<Skus> skus;
    @NotEmpty(message = "propertys不能为空")
    @SerializedName("propertys")
    private List<Propertys> propertys;
    @NotEmpty(message = "setmeals不能为空")
    @SerializedName("setmeals")
    private List<Setmeals> setmeals;
    @NotNull(message = "spuType不能为空")
    @SerializedName("spu_type")
    private Long spuType;
    @NotNull(message = "sequence不能为空")
    @SerializedName("sequence")
    private Long sequence;
    @NotNull(message = "ctime不能为空")
    @SerializedName("ctime")
    private Long ctime;
    @NotNull(message = "utime不能为空")
    @SerializedName("utime")
    private Long utime;
    @NotNull(message = "sellStatus不能为空")
    @SerializedName("sell_status")
    private Long sellStatus;
    @NotNull(message = "maxNum不能为空")
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
