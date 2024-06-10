package com.meituan.sdk.model.waimaiNg.act.actDiscountList;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 批量查询折扣商品
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/act/discount/list",
    businessId = 2,
    apiVersion = "10003",
    apiName = "act_discount_list",
    needAuth = true
)
public class ActDiscountListRequest implements MeituanRequest<List<DiscountInfo>> {
    /**
    * <p>分页偏移</p>
    */
    @NotNull(message = "offset不能为空")
    @SerializedName("offset")
    private Integer offset;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:13px;line-height:21px" data-size="13">分页查询，每页查询的数量不大于200</font></span></p>
    */
    @NotNull(message = "limit不能为空")
    @SerializedName("limit")
    private Integer limit;

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
    public MeituanResponse<List<DiscountInfo>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<DiscountInfo>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "ActDiscountListRequest{" + "offset=" + offset + "," + "limit=" + limit + "}";
    }
}
