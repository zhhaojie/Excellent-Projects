package com.meituan.sdk.model.ad.launch.cpmBatchQueryLaunches;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* cpm批量查询投放
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/cpm/batchQueryLaunchInfo",
    businessId = 22,
    apiVersion = "10036",
    apiName = "cpm_batch_query_launches",
    needAuth = true
)
public class CpmBatchQueryLaunchesRequest implements MeituanRequest<CpmBatchQueryLaunchesResponse> {
    /**
    * <p data-diff-id="ct-diff-id-18a89c30-8791-4e9e-a466-65992a40f34d"><span style="color: rgba(0, 0, 0, 0.65)">推广ID列表</span></p>
    */
    @SerializedName("launchIds")
    private List<Integer> launchIds;
    /**
    * <p data-diff-id="ct-diff-id-446bac3f-8113-4cef-bd97-5867f3588fa6"><span style="color: rgba(0, 0, 0, 0.65)">推广状态列表，此参数和launchIds互斥</span></p>
    */
    @SerializedName("launchStatusList")
    private List<Integer> launchStatusList;
    /**
    * <p data-diff-id="ct-diff-id-eaf72e5b-cffd-4fa2-ba9b-c69de1872438"><span style="color: rgba(0, 0, 0, 0.65)">分页请求页码，传launchStatusList时可传。默认查第一页，每页100个</span></p>
    */
    @SerializedName("pageNum")
    private Integer pageNum;

    public List<Integer> getLaunchIds() {
        return launchIds;
    }
    public void setLaunchIds(List<Integer> launchIds) {
        this.launchIds = launchIds;
    }
    public List<Integer> getLaunchStatusList() {
        return launchStatusList;
    }
    public void setLaunchStatusList(List<Integer> launchStatusList) {
        this.launchStatusList = launchStatusList;
    }
    public Integer getPageNum() {
        return pageNum;
    }
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }


    @Override
    public MeituanResponse<CpmBatchQueryLaunchesResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<CpmBatchQueryLaunchesResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CpmBatchQueryLaunchesRequest{" + "launchIds=" + launchIds + "," + "launchStatusList=" + launchStatusList + "," + "pageNum=" + pageNum + "}";
    }
}
