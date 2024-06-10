package com.meituan.sdk.model.wmoperNg.im.queryEnterCouponActivity;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询当前的进群领券活动
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/im/queryEnterCouponActivity",
    businessId = 16,
    apiVersion = "10039",
    apiName = "query_enter_coupon_activity",
    needAuth = true
)
public class QueryEnterCouponActivityRequest implements MeituanRequest<QueryEnterCouponActivityResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">查询游标，首次传0</font></span></p>
    */
    @SerializedName("index")
    private Long index;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">查询个数，大于1</font></span></p>
    */
    @SerializedName("size")
    private Integer size;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">优化券状态 （有效 1 ，无效 -1）</font></span></p>
    */
    @SerializedName("status")
    private String status;

    public Long getIndex() {
        return index;
    }
    public void setIndex(Long index) {
        this.index = index;
    }
    public Integer getSize() {
        return size;
    }
    public void setSize(Integer size) {
        this.size = size;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public MeituanResponse<QueryEnterCouponActivityResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryEnterCouponActivityResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryEnterCouponActivityRequest{" + "index=" + index + "," + "size=" + size + "," + "status=" + status + "}";
    }
}
