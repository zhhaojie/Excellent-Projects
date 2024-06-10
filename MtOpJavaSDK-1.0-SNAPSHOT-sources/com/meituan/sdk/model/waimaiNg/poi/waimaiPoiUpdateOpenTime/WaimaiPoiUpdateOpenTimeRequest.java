package com.meituan.sdk.model.waimaiNg.poi.waimaiPoiUpdateOpenTime;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 修改门店营业时间
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/poi/updateOpenTime",
    businessId = 2,
    apiVersion = "10015",
    apiName = "waimai_poi_update_open_time",
    needAuth = true
)
public class WaimaiPoiUpdateOpenTimeRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">营业时间时间段，且支持多个时间段。</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">如果一天多个时段，可以用逗号隔开，</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">比如：01:00-02:00,03:00-04:00,06:00-08:00，</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">时间段的数量不限</font></span></p><p>不能修改具体哪天是否营业</p>
    */
    @NotBlank(message = "openTime不能为空")
    @SerializedName("openTime")
    private String openTime;

    public String getOpenTime() {
        return openTime;
    }
    public void setOpenTime(String openTime) {
        this.openTime = openTime;
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
        return "WaimaiPoiUpdateOpenTimeRequest{" + "openTime=" + openTime + "}";
    }
}
