package com.meituan.sdk.model.wmoperNg.foodop.foodCatUpdate;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 创建或更新菜品分类
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/foodop/foodCat/update",
    businessId = 16,
    apiVersion = "10011",
    apiName = "food_cat_update",
    needAuth = true
)
public class FoodCatUpdateRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:13px;line-height:21px" data-size="13">原始的菜品分类名称，更新时必须</font></span></p>
    */
    @SerializedName("category_name_origin")
    private String categoryNameOrigin;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:13px;line-height:21px" data-size="13">新建的菜品分类名称</font></span></p>
    */
    @NotBlank(message = "categoryName不能为空")
    @SerializedName("category_name")
    private String categoryName;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:13px;line-height:21px" data-size="13">菜品分类排序，数字越小，排名越靠前，新建时必须</font></span></p>
    */
    @SerializedName("sequence")
    private Integer sequence;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">分组描述，默认空。最多255字，空代表不做任何修改。-1代表清空</font></span></p>
    */
    @SerializedName("category_description")
    private String categoryDescription;
    /**
    * <p>分组信息。-1：不修改分类信息，0：普通分类；1：必选分类；2：可单独结算分类</p>
    */
    @SerializedName("category_mode")
    private Integer categoryMode;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">置顶开关。1-不修改该信息；0 关闭； 1 开启</font></span></p>
    */
    @SerializedName("top_flag")
    private Integer topFlag;
    /**
    * <p>置顶时间，默认空。-1代表清空。<span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">设置分组置顶时段，每个分组可从每周的周一至周日中选择时间，每天最多支持5个时段，时段之间不能有重合，时间跨度不能超过24h。</font></span></p>
    */
    @SerializedName("time_zone")
    private String timeZone;

    public String getCategoryNameOrigin() {
        return categoryNameOrigin;
    }
    public void setCategoryNameOrigin(String categoryNameOrigin) {
        this.categoryNameOrigin = categoryNameOrigin;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
        return "FoodCatUpdateRequest{" + "categoryNameOrigin=" + categoryNameOrigin + "," + "categoryName=" + categoryName + "," + "sequence=" + sequence + "," + "categoryDescription=" + categoryDescription + "," + "categoryMode=" + categoryMode + "," + "topFlag=" + topFlag + "," + "timeZone=" + timeZone + "}";
    }
}
