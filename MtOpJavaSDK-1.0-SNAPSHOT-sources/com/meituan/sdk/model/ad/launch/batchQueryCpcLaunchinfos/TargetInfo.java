package com.meituan.sdk.model.ad.launch.batchQueryCpcLaunchinfos;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class TargetInfo {
    /**
    * 定向id
    */
    @SerializedName("targetId")
    private Integer targetId;
    /**
    * 出价
    */
    @SerializedName("bidPrice")
    private Integer bidPrice;
    /**
    * 1点评，2美团
    */
    @SerializedName("platform")
    private Integer platform;
    /**
    * 词包
    */
    @SerializedName("keyword")
    private String keyword;

    public Integer getTargetId() {
        return targetId;
    }
    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }
    public Integer getBidPrice() {
        return bidPrice;
    }
    public void setBidPrice(Integer bidPrice) {
        this.bidPrice = bidPrice;
    }
    public Integer getPlatform() {
        return platform;
    }
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }
    public String getKeyword() {
        return keyword;
    }
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }




    @Override
    public String toString() {
        return "TargetInfo{" + "targetId=" + targetId + "," + "bidPrice=" + bidPrice + "," + "platform=" + platform + "," + "keyword=" + keyword + "}";
    }
}
