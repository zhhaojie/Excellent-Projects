package com.meituan.sdk.model.tuangouNg.coupon.msSuperConsume;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 提供开放平台的验券接口，聚合商品数据信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/tuangou/ng/coupon/msconsume",
    businessId = 1,
    apiVersion = "10007",
    apiName = "ms_super_consume",
    needAuth = true
)
public class MsSuperConsumeRequest implements MeituanRequest<MsSuperConsumeResponse> {
    /**
    * <p data-diff-id="ct-diff-id-58a3751e-e3b0-41af-a150-9ffa7e596ba8">券码</p>
    */
    @SerializedName("code")
    private String code;
    /**
    * <p data-diff-id="ct-diff-id-50551c34-8082-4615-b5ff-7f19e742de0f">核销张数（支持该券码关联的订单下其他券码一起核销，核销本张券码传1）</p>
    */
    @SerializedName("num")
    private Integer num;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Integer getNum() {
        return num;
    }
    public void setNum(Integer num) {
        this.num = num;
    }


    @Override
    public MeituanResponse<MsSuperConsumeResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<MsSuperConsumeResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "MsSuperConsumeRequest{" + "code=" + code + "," + "num=" + num + "}";
    }
}
