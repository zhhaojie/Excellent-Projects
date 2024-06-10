package com.meituan.sdk.model.tuangouNg.coupon.couponQuerySetMealList;

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
* 门店套餐映射
* This file was automatically generated.
*/
@ApiMeta(
    path = "/tuangou/coupon/querySetMealList",
    businessId = 1,
    apiVersion = "10009",
    apiName = "coupon_query_set_meal_list",
    needAuth = true
)
public class CouponQuerySetMealListRequest implements MeituanRequest<List<DealInfo>> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">套餐状态，可选的值为：</font></span></p><table class="ct-table"><tbody><tr><th data-colwidth="102" width="102" style="background-color: rgb(249, 250, 251);color: rgba(0, 0, 0, 0.87);vertical-align:inherit;text-align:inherit;"><p><strong>状态值</strong></p></th><th data-colwidth="444" width="444" style="background-color: rgb(249, 250, 251);color: rgba(0, 0, 0, 0.87);vertical-align:inherit;text-align:inherit;"><p><strong>套餐状态dealStatus含义</strong></p></th></tr><tr><td data-colwidth="102" width="102" style="text-align:inherit;"><p>-1</p></td><td data-colwidth="444" width="444" style="text-align:inherit;"><p>全部状态（含以下所有）</p></td></tr><tr><td data-colwidth="102" width="102" style="text-align:inherit;"><p>0</p></td><td data-colwidth="444" width="444" style="text-align:inherit;"><p>结束售卖</p></td></tr><tr><td data-colwidth="102" width="102" style="text-align:inherit;"><p>1</p></td><td data-colwidth="444" width="444" style="text-align:inherit;"><p>正在售卖</p></td></tr><tr><td data-colwidth="102" width="102" style="text-align:inherit;"><p>2</p></td><td data-colwidth="444" width="444" style="text-align:inherit;"><p>隐藏单，前台通过POI列表及deal列表都不可见，但是通过收藏或url可以直接访问并购买</p></td></tr><tr><td data-colwidth="102" width="102" style="text-align:inherit;"><p>4</p></td><td data-colwidth="444" width="444" style="text-align:inherit;"><p>未开始售卖</p></td></tr><tr><td data-colwidth="102" width="102" style="text-align:inherit;"><p>5</p></td><td data-colwidth="444" width="444" style="text-align:inherit;"><p>不可购买</p></td></tr></tbody></table><p></p>
    */
    @NotNull(message = "dealStatus不能为空")
    @SerializedName("dealStatus")
    private Integer dealStatus;

    public Integer getDealStatus() {
        return dealStatus;
    }
    public void setDealStatus(Integer dealStatus) {
        this.dealStatus = dealStatus;
    }


    @Override
    public MeituanResponse<List<DealInfo>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<DealInfo>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CouponQuerySetMealListRequest{" + "dealStatus=" + dealStatus + "}";
    }
}
