package com.meituan.sdk.model.wmoperNg.waimaiad.adDmpQueryCrowdBid;

import com.google.gson.annotations.SerializedName;

/**
* 出价信息
* This file was automatically generated.
*/
public class ADOrientInfo {
    /**
    * 人群包id
    */
    @SerializedName("crowdPackId")
    private Long crowdPackId;
    /**
    * 出价
    */
    @SerializedName("price")
    private Integer price;
    /**
    * 人群包标签
    */
    @SerializedName("topicCrowdCN")
    private String topicCrowdCN;
    /**
    * 人群包名称
    */
    @SerializedName("topicCrowdName")
    private String topicCrowdName;

    public Long getCrowdPackId() {
        return crowdPackId;
    }
    public void setCrowdPackId(Long crowdPackId) {
        this.crowdPackId = crowdPackId;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public String getTopicCrowdCN() {
        return topicCrowdCN;
    }
    public void setTopicCrowdCN(String topicCrowdCN) {
        this.topicCrowdCN = topicCrowdCN;
    }
    public String getTopicCrowdName() {
        return topicCrowdName;
    }
    public void setTopicCrowdName(String topicCrowdName) {
        this.topicCrowdName = topicCrowdName;
    }




    @Override
    public String toString() {
        return "ADOrientInfo{" + "crowdPackId=" + crowdPackId + "," + "price=" + price + "," + "topicCrowdCN=" + topicCrowdCN + "," + "topicCrowdName=" + topicCrowdName + "}";
    }
}
