package com.meituan.sdk.model.waimaiNg.dish.dishUpdateCat;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 新增／更新菜品分类
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/dish/updateCat",
    businessId = 2,
    apiVersion = "10078",
    apiName = "dish_update_cat",
    needAuth = true
)
public class DishUpdateCatRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">原始的菜品分类名称，更新时为必填</font></span></p>
    */
    @SerializedName("oldCatName")
    private String oldCatName;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">菜品排序【数字越小，排名越靠前,不同分类顺序可以相同 】新建时必须</font></span></p>
    */
    @SerializedName("sequence")
    private Integer sequence;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">菜品分类名称</font></span></p>
    */
    @NotBlank(message = "catName不能为空")
    @SerializedName("catName")
    private String catName;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">分类信息。-1：不修改分类信息，0：普通分类；1：必选分类；2：可单独结算分类</font></span></p>
    */
    @SerializedName("categoryMode")
    private Integer categoryMode;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">分组描述，默认空,最多255字，空代表不做任何修改。-1代表清空</font></span></p>
    */
    @SerializedName("categoryDescription")
    private String categoryDescription;
    /**
    * <p>置顶开关。-1：不修改该信息；0：关闭； 1：开启<br></p>
    */
    @SerializedName("topFlag")
    private Integer topFlag;
    /**
    * <p>置顶时间，默认空。-1代表清空。设置分组置顶时段。每个分组可从每周的周一至周日中选择时间，每天最多支持5个时段，时段之间不能有重合，时间跨度不能超过24h。<br></p>
    */
    @SerializedName("timeZone")
    private String timeZone;

    public String getOldCatName() {
        return oldCatName;
    }
    public void setOldCatName(String oldCatName) {
        this.oldCatName = oldCatName;
    }
    public Integer getSequence() {
        return sequence;
    }
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
    public String getCatName() {
        return catName;
    }
    public void setCatName(String catName) {
        this.catName = catName;
    }
    public Integer getCategoryMode() {
        return categoryMode;
    }
    public void setCategoryMode(Integer categoryMode) {
        this.categoryMode = categoryMode;
    }
    public String getCategoryDescription() {
        return categoryDescription;
    }
    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
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
        return "DishUpdateCatRequest{" + "oldCatName=" + oldCatName + "," + "sequence=" + sequence + "," + "catName=" + catName + "," + "categoryMode=" + categoryMode + "," + "categoryDescription=" + categoryDescription + "," + "topFlag=" + topFlag + "," + "timeZone=" + timeZone + "}";
    }
}
