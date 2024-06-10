package com.meituan.sdk.model.resv2.table.updateTableStatus;

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
* 变更桌位状态
* This file was automatically generated.
*/
@ApiMeta(
    path = "/resv2/table/status/update",
    businessId = 7,
    apiVersion = "10001",
    apiName = "update_table_status",
    needAuth = true
)
public class UpdateTableStatusRequest implements MeituanRequest<String> {
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
        return "UpdateTableStatusRequest{" + "data=" + data + "}";
    }
}
