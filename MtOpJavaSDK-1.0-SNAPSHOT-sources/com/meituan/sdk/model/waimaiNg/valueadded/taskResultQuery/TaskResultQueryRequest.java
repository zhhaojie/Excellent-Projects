package com.meituan.sdk.model.waimaiNg.valueadded.taskResultQuery;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询任务结果
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/valueadded/async/taskResultQuery",
    businessId = 2,
    apiVersion = "10012",
    apiName = "task_result_query",
    needAuth = true
)
public class TaskResultQueryRequest implements MeituanRequest<List<TaskResultQueryResponse>> {
    /**
    * <p>枚举</p><p style="text-align: start;">2 根据系统标签获取用户列表</p><p style="text-align: start;">3 根据自定以标签获取用户列表</p><p style="text-align: start;">4 建券并发券</p><p style="text-align: start;">5 手机号发劵</p>
    */
    @SerializedName("taskType")
    private Integer taskType;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">任务请求id。</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">支持手机号发券生成的任务id。</font></span></p>
    */
    @SerializedName("queryId")
    private String queryId;

    public Integer getTaskType() {
        return taskType;
    }
    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }
    public String getQueryId() {
        return queryId;
    }
    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }


    @Override
    public MeituanResponse<List<TaskResultQueryResponse>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<TaskResultQueryResponse>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "TaskResultQueryRequest{" + "taskType=" + taskType + "," + "queryId=" + queryId + "}";
    }
}
