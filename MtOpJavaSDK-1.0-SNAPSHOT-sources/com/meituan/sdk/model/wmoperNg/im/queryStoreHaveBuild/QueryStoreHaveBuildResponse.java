package com.meituan.sdk.model.wmoperNg.im.queryStoreHaveBuild;

import com.google.gson.annotations.SerializedName;

/**
* 查询门店是否有建群资格
* This file was automatically generated.
*/
public class QueryStoreHaveBuildResponse {
    /**
    * 是否有建群能力  0 - 没有  1 - 有
    */
    @SerializedName("status")
    private Boolean status;

    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }




    @Override
    public String toString() {
        return "QueryStoreHaveBuildResponse{" + "status=" + status + "}";
    }
}
