package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDeliveryRuleChangeQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 门店配送规则变更详情查询
* This file was automatically generated.
*/
public class GroupDeliveryPoiDeliveryRuleChangeQueryResponse {
    @SerializedName("status")
    private Integer status;
    @SerializedName("changeContents")
    private List<ChangeContents> changeContents;
    @SerializedName("createTime")
    private String createTime;
    @SerializedName("updateTime")
    private String updateTime;
    @SerializedName("rejectMessage")
    private String rejectMessage;

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public List<ChangeContents> getChangeContents() {
        return changeContents;
    }
    public void setChangeContents(List<ChangeContents> changeContents) {
        this.changeContents = changeContents;
    }
    public String getCreateTime() {
        return createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    public String getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
    public String getRejectMessage() {
        return rejectMessage;
    }
    public void setRejectMessage(String rejectMessage) {
        this.rejectMessage = rejectMessage;
    }




    @Override
    public String toString() {
        return "GroupDeliveryPoiDeliveryRuleChangeQueryResponse{" + "status=" + status + "," + "changeContents=" + changeContents + "," + "createTime=" + createTime + "," + "updateTime=" + updateTime + "," + "rejectMessage=" + rejectMessage + "}";
    }
}
