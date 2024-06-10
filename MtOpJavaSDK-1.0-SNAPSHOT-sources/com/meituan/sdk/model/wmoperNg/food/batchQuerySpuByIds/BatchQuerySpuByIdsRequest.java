package com.meituan.sdk.model.wmoperNg.food.batchQuerySpuByIds;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 美团真实spuid批量查询菜品信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/food/batchQuerySpuByIds",
    businessId = 16,
    apiVersion = "10027",
    apiName = "batch_query_spu_by_ids",
    needAuth = true
)
public class BatchQuerySpuByIdsRequest implements MeituanRequest<List<BatchQuerySpuByIdsResponse>> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">美团真实spuid列表，英文逗号隔开，最多20个</font></span></p>
    */
    @NotBlank(message = "originSpuIds不能为空")
    @SerializedName("origin_spu_ids")
    private String originSpuIds;

    public String getOriginSpuIds() {
        return originSpuIds;
    }
    public void setOriginSpuIds(String originSpuIds) {
        this.originSpuIds = originSpuIds;
    }


    @Override
    public MeituanResponse<List<BatchQuerySpuByIdsResponse>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<BatchQuerySpuByIdsResponse>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "BatchQuerySpuByIdsRequest{" + "originSpuIds=" + originSpuIds + "}";
    }
}
