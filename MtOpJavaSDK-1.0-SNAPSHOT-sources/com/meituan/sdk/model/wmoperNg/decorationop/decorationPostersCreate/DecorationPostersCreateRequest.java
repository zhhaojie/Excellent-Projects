package com.meituan.sdk.model.wmoperNg.decorationop.decorationPostersCreate;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 商家开放平台创建海报
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/decorationop/postersCreate",
    businessId = 16,
    apiVersion = "10000",
    apiName = "decoration_posters_create",
    needAuth = true
)
public class DecorationPostersCreateRequest implements MeituanRequest<DecorationPostersCreateResponse> {
    /**
    * <p>海报绑定商品列表,逗号表达式,如'1,2,3' ，</p><p>注：<span style="color: #f5222d">商品必须通过开放平台创建，商品来源可参考门店装修-商品查询</span></p>
    */
    @NotBlank(message = "appFoodCodes不能为空")
    @SerializedName("app_food_codes")
    private String appFoodCodes;
    /**
    * <p>图片code，服务商可通过上传无水印照片获取</p>
    */
    @NotBlank(message = "picCode不能为空")
    @SerializedName("pic_code")
    private String picCode;
    /**
    * <p>海报生效开始日期,默认-1(格式：都是秒)</p>
    */
    @NotNull(message = "displayStartDay不能为空")
    @SerializedName("display_start_day")
    private Long displayStartDay;
    /**
    * <p>海报生效结束日期,默认-1(格式：都是秒)</p>
    */
    @NotNull(message = "displayEndDay不能为空")
    @SerializedName("display_end_day")
    private Long displayEndDay;
    /**
    * <p>展示周期 海报投放周几,传入1，2，以此类推，默认[1,2,3,4,5,6,7]	</p>
    */
    @NotBlank(message = "displayWeeks不能为空")
    @SerializedName("display_weeks")
    private String displayWeeks;
    /**
    * <p>海报生效开始时间,默认-1(格式：0至24*60*60-1)</p>
    */
    @NotBlank(message = "displayStime不能为空")
    @SerializedName("display_stime")
    private String displayStime;
    /**
    * <p>海报生效结束时间,默认-1(格式：0至24*60*60-1)</p>
    */
    @NotBlank(message = "displayEtime不能为空")
    @SerializedName("display_etime")
    private String displayEtime;
    /**
    * <p>是否审核通过后立即使用 1:是;0:否</p>
    */
    @NotBlank(message = "validStatus不能为空")
    @SerializedName("valid_status")
    private String validStatus;
    /**
    * <p>海报展示顺序,默认0</p>
    */
    @NotNull(message = "sequence不能为空")
    @SerializedName("sequence")
    private Integer sequence;
    /**
    * <p>海报id（新建的时候postid是0 ,只有修改的时候是不为空</p>
    */
    @NotNull(message = "postId不能为空")
    @SerializedName("post_id")
    private Long postId;

    public String getAppFoodCodes() {
        return appFoodCodes;
    }
    public void setAppFoodCodes(String appFoodCodes) {
        this.appFoodCodes = appFoodCodes;
    }
    public String getPicCode() {
        return picCode;
    }
    public void setPicCode(String picCode) {
        this.picCode = picCode;
    }
    public Long getDisplayStartDay() {
        return displayStartDay;
    }
    public void setDisplayStartDay(Long displayStartDay) {
        this.displayStartDay = displayStartDay;
    }
    public Long getDisplayEndDay() {
        return displayEndDay;
    }
    public void setDisplayEndDay(Long displayEndDay) {
        this.displayEndDay = displayEndDay;
    }
    public String getDisplayWeeks() {
        return displayWeeks;
    }
    public void setDisplayWeeks(String displayWeeks) {
        this.displayWeeks = displayWeeks;
    }
    public String getDisplayStime() {
        return displayStime;
    }
    public void setDisplayStime(String displayStime) {
        this.displayStime = displayStime;
    }
    public String getDisplayEtime() {
        return displayEtime;
    }
    public void setDisplayEtime(String displayEtime) {
        this.displayEtime = displayEtime;
    }
    public String getValidStatus() {
        return validStatus;
    }
    public void setValidStatus(String validStatus) {
        this.validStatus = validStatus;
    }
    public Integer getSequence() {
        return sequence;
    }
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
    public Long getPostId() {
        return postId;
    }
    public void setPostId(Long postId) {
        this.postId = postId;
    }


    @Override
    public MeituanResponse<DecorationPostersCreateResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<DecorationPostersCreateResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "DecorationPostersCreateRequest{" + "appFoodCodes=" + appFoodCodes + "," + "picCode=" + picCode + "," + "displayStartDay=" + displayStartDay + "," + "displayEndDay=" + displayEndDay + "," + "displayWeeks=" + displayWeeks + "," + "displayStime=" + displayStime + "," + "displayEtime=" + displayEtime + "," + "validStatus=" + validStatus + "," + "sequence=" + sequence + "," + "postId=" + postId + "}";
    }
}
