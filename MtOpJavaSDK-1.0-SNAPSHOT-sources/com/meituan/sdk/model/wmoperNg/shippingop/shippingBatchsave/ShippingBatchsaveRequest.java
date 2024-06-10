package com.meituan.sdk.model.wmoperNg.shippingop.shippingBatchsave;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;
import javax.validation.constraints.NotEmpty;

/**
* 批量创建/更新配送范围（自配）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/shippingop/batchsave",
    businessId = 16,
    apiVersion = "10001",
    apiName = "shipping_batchsave",
    needAuth = true
)
public class ShippingBatchsaveRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">配送范围集合的json数据，处理逻辑：</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">1）如果配送范围原来不存在就新增；</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">2）如app_shipping_code存在就更新；</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">3）如原来存在的app_shipping_code，而这次没提交，就删除范围都为多边形，不支持圆形</font></span></p>
    */
    @NotEmpty(message = "shippingData不能为空")
    @SerializedName("shipping_data")
    private List<ShippingData> shippingData;

    public List<ShippingData> getShippingData() {
        return shippingData;
    }
    public void setShippingData(List<ShippingData> shippingData) {
        this.shippingData = shippingData;
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
        return "ShippingBatchsaveRequest{" + "shippingData=" + shippingData + "}";
    }
}
