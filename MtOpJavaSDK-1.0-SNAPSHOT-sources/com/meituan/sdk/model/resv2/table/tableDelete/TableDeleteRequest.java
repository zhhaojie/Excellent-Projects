package com.meituan.sdk.model.resv2.table.tableDelete;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 删除桌位
* This file was automatically generated.
*/
@ApiMeta(
    path = "/resv2/table/delete",
    businessId = 7,
    apiVersion = "10003",
    apiName = "table_delete",
    needAuth = true
)
public class TableDeleteRequest implements MeituanRequest<String> {
    /**
    * <p data-diff-id="ct-diff-id-fdbff035-4952-4245-ab99-819ecfd202d8">桌位的tableId</p>
    */
    @NotBlank(message = "tableId不能为空")
    @SerializedName("tableId")
    private String tableId;

    public String getTableId() {
        return tableId;
    }
    public void setTableId(String tableId) {
        this.tableId = tableId;
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
        return "TableDeleteRequest{" + "tableId=" + tableId + "}";
    }
}
