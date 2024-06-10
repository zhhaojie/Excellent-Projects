package com.meituan.sdk.model.moses.dialog.trigger;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 摩西机器人会话接口
* This file was automatically generated.
*/
public class TriggerResponse {
    /**
    * 版本
    */
    @SerializedName("version")
    private String version;
    /**
    * 请求query
    */
    @SerializedName("query")
    private String query;
    /**
    * 请求Id
    */
    @SerializedName("requestId")
    private String requestId;
    /**
    * 包括意图信息，返回话术信息等，是一个列表
    */
    @SerializedName("dmResult")
    private List<DmResult> dmResult;
    /**
    * 上报数据节点
    */
    @SerializedName("reportData")
    private ReportData reportData;
    /**
    * 扩展字段
    */
    @SerializedName("extData")
    private ExtData2 extData;
    /**
    * NLU识别结果
    */
    @SerializedName("nluResult")
    private NluResult nluResult;

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }
    public String getRequestId() {
        return requestId;
    }
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
    public List<DmResult> getDmResult() {
        return dmResult;
    }
    public void setDmResult(List<DmResult> dmResult) {
        this.dmResult = dmResult;
    }
    public ReportData getReportData() {
        return reportData;
    }
    public void setReportData(ReportData reportData) {
        this.reportData = reportData;
    }
    public ExtData2 getExtData() {
        return extData;
    }
    public void setExtData(ExtData2 extData) {
        this.extData = extData;
    }
    public NluResult getNluResult() {
        return nluResult;
    }
    public void setNluResult(NluResult nluResult) {
        this.nluResult = nluResult;
    }




    @Override
    public String toString() {
        return "TriggerResponse{" + "version=" + version + "," + "query=" + query + "," + "requestId=" + requestId + "," + "dmResult=" + dmResult + "," + "reportData=" + reportData + "," + "extData=" + extData + "," + "nluResult=" + nluResult + "}";
    }
}
