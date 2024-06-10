package com.meituan.sdk.model.mlive.goods.queryLiveGoodsInfo;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class LiveRoomGoodsDTO {
    /**
    * 直播id
    */
    @SerializedName("liveId")
    private Long liveId;
    /**
    * 商品类型
    */
    @SerializedName("goodsType")
    private Integer goodsType;
    /**
    * 商品id
    */
    @SerializedName("goodsId")
    private String goodsId;
    /**
    * 商品标题
    */
    @SerializedName("goodsTitle")
    private String goodsTitle;
    /**
    * 序号（直播中当前的序号）
    */
    @SerializedName("rank")
    private Integer rank;
    /**
    * 是否置顶
    */
    @SerializedName("top")
    private Boolean top;

    public Long getLiveId() {
        return liveId;
    }
    public void setLiveId(Long liveId) {
        this.liveId = liveId;
    }
    public Integer getGoodsType() {
        return goodsType;
    }
    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }
    public String getGoodsId() {
        return goodsId;
    }
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }
    public String getGoodsTitle() {
        return goodsTitle;
    }
    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }
    public Integer getRank() {
        return rank;
    }
    public void setRank(Integer rank) {
        this.rank = rank;
    }
    public Boolean getTop() {
        return top;
    }
    public void setTop(Boolean top) {
        this.top = top;
    }




    @Override
    public String toString() {
        return "LiveRoomGoodsDTO{" + "liveId=" + liveId + "," + "goodsType=" + goodsType + "," + "goodsId=" + goodsId + "," + "goodsTitle=" + goodsTitle + "," + "rank=" + rank + "," + "top=" + top + "}";
    }
}
