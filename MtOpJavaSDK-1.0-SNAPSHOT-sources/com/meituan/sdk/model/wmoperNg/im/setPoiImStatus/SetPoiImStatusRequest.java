package com.meituan.sdk.model.wmoperNg.im.setPoiImStatus;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 设置门店IM状态
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/im/setPoiIMStatus",
    businessId = 16,
    apiVersion = "10008",
    apiName = "set_poi_im_status",
    needAuth = false
)
public class SetPoiImStatusRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">IM状态</font></span></p><p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">0 关闭 1 开启</font></span></p>
    */
    @NotNull(message = "imStatus不能为空")
    @SerializedName("imStatus")
    private Integer imStatus;

    public Integer getImStatus() {
        return imStatus;
    }
    public void setImStatus(Integer imStatus) {
        this.imStatus = imStatus;
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
        return "SetPoiImStatusRequest{" + "imStatus=" + imStatus + "}";
    }
}
