package com.meituan.sdk.model.wmoperNg.waimaiad.adDataSource;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 获取不同位置的效果数据
* This file was automatically generated.
*/
public class AdDataSourceResponse {
    @NotNull(message = "result不能为空")
    @SerializedName("result")
    private Result result;
    @NotEmpty(message = "homePageList不能为空")
    @SerializedName("homePageList")
    private List<HomePageList> homePageList;
    @NotEmpty(message = "channelPageList不能为空")
    @SerializedName("channelPageList")
    private List<ChannelPageList> channelPageList;
    @NotEmpty(message = "searchPageList不能为空")
    @SerializedName("searchPageList")
    private List<SearchPageList> searchPageList;

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }
    public List<HomePageList> getHomePageList() {
        return homePageList;
    }
    public void setHomePageList(List<HomePageList> homePageList) {
        this.homePageList = homePageList;
    }
    public List<ChannelPageList> getChannelPageList() {
        return channelPageList;
    }
    public void setChannelPageList(List<ChannelPageList> channelPageList) {
        this.channelPageList = channelPageList;
    }
    public List<SearchPageList> getSearchPageList() {
        return searchPageList;
    }
    public void setSearchPageList(List<SearchPageList> searchPageList) {
        this.searchPageList = searchPageList;
    }




    @Override
    public String toString() {
        return "AdDataSourceResponse{" + "result=" + result + "," + "homePageList=" + homePageList + "," + "channelPageList=" + channelPageList + "," + "searchPageList=" + searchPageList + "}";
    }
}
