package com.meituan.sdk.model.resv2.table.tableStatusPush;

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
* ERB桌态状态变更推送
* This file was automatically generated.
*/
@ApiMeta(
    path = "/resv2/table/status/erbpush",
    businessId = 7,
    apiVersion = "10000",
    apiName = "table_status_push",
    needAuth = true
)
public class TableStatusPushRequest implements MeituanRequest<String> {
    @NotEmpty(message = "data不能为空")
    @SerializedName("data")
    private List<Data> data;

    public List<Data> getData() {
        return data;
    }
    public void setData(List<Data> data) {
        this.data = data;
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
        return "TableStatusPushRequest{" + "data=" + data + "}";
    }
}
