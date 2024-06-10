package com.meituan.sdk.model.waimaiNg.decoration.postersCreateForSpuId;

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
* 门店装修-新建海报接口(通过spuid)
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/decoration/postersCreateForSpuId",
    businessId = 2,
    apiVersion = "10002",
    apiName = "posters_create_for_spu_id",
    needAuth = true
)
public class PostersCreateForSpuIdRequest implements MeituanRequest<PostersCreateForSpuIdResponse> {
    /**
    * <p style="text-align: start;">海报绑定商品列表,逗号表达式,如'1,2,3'</p><p style="text-align: start;">注：商品必须通过开放平台创建</p>
    */
    @NotBlank(message = "spuIds不能为空")
    @SerializedName("spuIds")
    private String spuIds;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">图片code</font></span></p>
    */
    @NotBlank(message = "picCode不能为空")
    @SerializedName("picCode")
    private String picCode;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">海报生效开始日期,默认-1(格式：都是秒)</font></span></p>
    */
    @NotNull(message = "displayStartDay不能为空")
    @SerializedName("displayStartDay")
    private Integer displayStartDay;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">海报生效结束日期,默认-1(格式：都是秒)</font></span></p>
    */
    @NotNull(message = "displayEndDay不能为空")
    @SerializedName("displayEndDay")
    private Integer displayEndDay;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">展示周期 海报投放周几,传入1，2，以此类推，默认[1,2,3,4,5,6,7]</font></span></p>
    */
    @NotBlank(message = "displayWeeks不能为空")
    @SerializedName("displayWeeks")
    private String displayWeeks;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">海报生效开始时间,默认-1(格式：0至24*60*60-1)</font></span></p>
    */
    @NotBlank(message = "displayStime不能为空")
    @SerializedName("displayStime")
    private String displayStime;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">海报生效结束时间,默认-1(格式：0至24*60*60-1)</font></span></p>
    */
    @NotBlank(message = "displayEtime不能为空")
    @SerializedName("displayEtime")
    private String displayEtime;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">是否审核通过后立即使用</font></span></p>
    */
    @NotNull(message = "validStatus不能为空")
    @SerializedName("validStatus")
    private Integer validStatus;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">海报展示顺序,默认0</font></span></p>
    */
    @NotNull(message = "sequence不能为空")
    @SerializedName("sequence")
    private Integer sequence;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">海报id（新建的时候postid是0 ,只有修改的时候是不为空）</font></span></p>
    */
    @NotNull(message = "postId不能为空")
    @SerializedName("postId")
    private Integer postId;

    public String getSpuIds() {
        return spuIds;
    }
    public void setSpuIds(String spuIds) {
        this.spuIds = spuIds;
    }
    public String getPicCode() {
        return picCode;
    }
    public void setPicCode(String picCode) {
        this.picCode = picCode;
    }
    public Integer getDisplayStartDay() {
        return displayStartDay;
    }
    public void setDisplayStartDay(Integer displayStartDay) {
        this.displayStartDay = displayStartDay;
    }
    public Integer getDisplayEndDay() {
        return displayEndDay;
    }
    public void setDisplayEndDay(Integer displayEndDay) {
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
    public Integer getValidStatus() {
        return validStatus;
    }
    public void setValidStatus(Integer validStatus) {
        this.validStatus = validStatus;
    }
    public Integer getSequence() {
        return sequence;
    }
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
    public Integer getPostId() {
        return postId;
    }
    public void setPostId(Integer postId) {
        this.postId = postId;
    }


    @Override
    public MeituanResponse<PostersCreateForSpuIdResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<PostersCreateForSpuIdResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "PostersCreateForSpuIdRequest{" + "spuIds=" + spuIds + "," + "picCode=" + picCode + "," + "displayStartDay=" + displayStartDay + "," + "displayEndDay=" + displayEndDay + "," + "displayWeeks=" + displayWeeks + "," + "displayStime=" + displayStime + "," + "displayEtime=" + displayEtime + "," + "validStatus=" + validStatus + "," + "sequence=" + sequence + "," + "postId=" + postId + "}";
    }
}
