package com.meituan.sdk.model.ad.launch.queryLaunchPremiumlist;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询关键词列表
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/queryLaunchPremiumList",
    businessId = 22,
    apiVersion = "10028",
    apiName = "query_launch_premiumlist",
    needAuth = true
)
public class QueryLaunchPremiumlistRequest implements MeituanRequest<List<LaunchKeywordPremiumDTO>> {
    /**
    * <p data-diff-id="ct-diff-id-d188c5cf-63d1-4c44-8017-3b465e84f2da">关键词综合态</p><p data-diff-id="ct-diff-id-2e95865e-d8c0-4d4f-916a-b00f3eb23350"><em><span style="color: rgb(152, 118, 170)">ONLINE</span></em>(<span style="color: rgb(104, 151, 187)">1</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"推广中"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"推广中"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(104, 151, 187)">1</span>)<span style="color: rgb(204, 120, 50)">,<br></span><em><span style="color: rgb(152, 118, 170)">SUBMITTED</span></em>(<span style="color: rgb(104, 151, 187)">2</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"待审核"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"待审核"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(104, 151, 187)">2</span>)<span style="color: rgb(204, 120, 50)">,<br></span><em><span style="color: rgb(152, 118, 170)">REJECTED</span></em>(<span style="color: rgb(104, 151, 187)">3</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"被驳回"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"被驳回"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(104, 151, 187)">3</span>)<span style="color: rgb(204, 120, 50)">,<br></span><em><span style="color: rgb(152, 118, 170)">LAUNCH_TIMEOUT</span></em>(<span style="color: rgb(104, 151, 187)">4</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"推广已结束"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"推广已结束"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(104, 151, 187)">13</span>)<span style="color: rgb(204, 120, 50)">,<br></span><em><span style="color: rgb(152, 118, 170)">LAUNCH_OFFLINE</span></em>(<span style="color: rgb(104, 151, 187)">5</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"推广已暂停"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"推广已暂停"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(104, 151, 187)">7</span>)<span style="color: rgb(204, 120, 50)">,<br></span><em><span style="color: rgb(152, 118, 170)">LAUNCH_SUBMITTED</span></em>(<span style="color: rgb(104, 151, 187)">6</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"推广待审核"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"推广待审核"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(104, 151, 187)">9</span>)<span style="color: rgb(204, 120, 50)">,<br></span><em><span style="color: rgb(152, 118, 170)">LAUNCH_REJECTED</span></em>(<span style="color: rgb(104, 151, 187)">7</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"推广被驳回"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"推广被驳回"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(104, 151, 187)">4</span>)<span style="color: rgb(204, 120, 50)">,<br></span><em><span style="color: rgb(152, 118, 170)">DELETED</span></em>(<span style="color: rgb(104, 151, 187)">8</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"已删除"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"已删除"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(104, 151, 187)">15</span>)<span style="color: rgb(204, 120, 50)">,<br></span><em><span style="color: rgb(152, 118, 170)">LAUNCH_EDITING</span></em>(<span style="color: rgb(104, 151, 187)">9</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"推广草稿中"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"推广草稿中"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(104, 151, 187)">12</span>)<span style="color: rgb(204, 120, 50)">,<br></span><em><span style="color: rgb(152, 118, 170)">LAUNCH_NOT_STARTED</span></em>(<span style="color: rgb(104, 151, 187)">10</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"待推广"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"待推广"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(104, 151, 187)">5</span>)<span style="color: rgb(204, 120, 50)">,<br></span><em><span style="color: rgb(152, 118, 170)">LAUNCH_EXCEPTION</span></em>(<span style="color: rgb(104, 151, 187)">11</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"推广状态异常"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"推广状态异常"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(104, 151, 187)">10</span>)<span style="color: rgb(204, 120, 50)">,<br></span><em><span style="color: rgb(152, 118, 170)">LAUNCH_INVALID</span></em>(<span style="color: rgb(104, 151, 187)">12</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"已下线"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(106, 135, 89)">"已下线"</span><span style="color: rgb(204, 120, 50)">, </span><span style="color: rgb(104, 151, 187)">16</span>)<span style="color: rgb(204, 120, 50)">,</span></p>
    */
    @SerializedName("status")
    private List<Interger> status;
    /**
    * <p data-diff-id="ct-diff-id-ba8a445f-7243-4b1a-bc78-5966171dcb66">分页页码，默认为1</p>
    */
    @NotNull(message = "pageNum不能为空")
    @SerializedName("pageNum")
    private Integer pageNum;
    /**
    * <p data-diff-id="ct-diff-id-ebf694c3-5046-471b-9014-3a8d33643404">分页数</p>
    */
    @NotNull(message = "pageSize不能为空")
    @SerializedName("pageSize")
    private Integer pageSize;

    public List<Interger> getStatus() {
        return status;
    }
    public void setStatus(List<Interger> status) {
        this.status = status;
    }
    public Integer getPageNum() {
        return pageNum;
    }
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
    public Integer getPageSize() {
        return pageSize;
    }
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    @Override
    public MeituanResponse<List<LaunchKeywordPremiumDTO>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<LaunchKeywordPremiumDTO>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryLaunchPremiumlistRequest{" + "status=" + status + "," + "pageNum=" + pageNum + "," + "pageSize=" + pageSize + "}";
    }
}
