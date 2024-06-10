package com.meituan.sdk.model.wmoperNg.govern.governViolationQuery;

import com.google.gson.annotations.SerializedName;

/**
* 处罚结果
* This file was automatically generated.
*/
public class ViolationPunishInfoViewDTO {
    /**
    * 处罚描述
    */
    @SerializedName("title")
    private String title;
    /**
    * 处罚内容：处罚时间格式化
    */
    @SerializedName("content")
    private String content;
    /**
    * 处罚类型1:"门店置休" 2:"门店下线" 3:"删除违规商品" 4:"予以警告" 5:"门店降权" 6:"商品停售") 7:"下线所有活动" 8:"关闭到店自取" 9:"列入美团外卖商家黑名单") 10:"删除违规订单销量与评价" 11:"风控规则学习") 12:"扣除违约金" 13:"缩小配送范围" 14:"退还刷单不当得利" 15:"删除虚假销量" 16:"删除虚假评价" 99:"增加违规积分" 100:"预画管控配送范围"
    */
    @SerializedName("type")
    private Integer type;
    /**
    * 处罚开始时间
    */
    @SerializedName("startTime")
    private Long startTime;
    /**
    * 处罚结束时间
    */
    @SerializedName("endTime")
    private Long endTime;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public Long getStartTime() {
        return startTime;
    }
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }
    public Long getEndTime() {
        return endTime;
    }
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }




    @Override
    public String toString() {
        return "ViolationPunishInfoViewDTO{" + "title=" + title + "," + "content=" + content + "," + "type=" + type + "," + "startTime=" + startTime + "," + "endTime=" + endTime + "}";
    }
}
