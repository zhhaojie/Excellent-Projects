package com.meituan.sdk.model.tuangouNg.coupon.couponQueryListByDate;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 门店验券历史
* This file was automatically generated.
*/
@ApiMeta(
    path = "/tuangou/coupon/queryListByDate",
    businessId = 1,
    apiVersion = "10002",
    apiName = "coupon_query_list_by_date",
    needAuth = true
)
public class CouponQueryListByDateRequest implements MeituanRequest<CouponQueryListByDateResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">日期</font></span></p>
    */
    @NotBlank(message = "date不能为空")
    @SerializedName("date")
    private String date;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">查询起始位置，从0开始</font></span></p>
    */
    @NotNull(message = "offset不能为空")
    @SerializedName("offset")
    private Integer offset;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">查询条数</font></span></p>
    */
    @NotNull(message = "limit不能为空")
    @SerializedName("limit")
    private Integer limit;

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public Integer getOffset() {
        return offset;
    }
    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }


    @Override
    public MeituanResponse<CouponQueryListByDateResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<CouponQueryListByDateResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CouponQueryListByDateRequest{" + "date=" + date + "," + "offset=" + offset + "," + "limit=" + limit + "}";
    }
}
