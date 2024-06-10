package com.meituan.sdk.model.wmoperNg.card.wmoperNgCardQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 安心卡查询
* This file was automatically generated.
*/
public class WmoperNgCardQueryResponse {
    @SerializedName("app_id")
    private Long appId;
    /**
    * 安心卡id
    */
    @SerializedName("cardId")
    private Integer cardId;
    /**
    * ERP门店id
    */
    @SerializedName("epoiId")
    private String epoiId;
    /**
    * 外卖门店名
    */
    @SerializedName("wmPoiName")
    private String wmPoiName;
    /**
    * 商家是否已签署协议。0未签署，1已签署。如果商家未签署协议， 需先让商家在美团外卖商家端中签署协议后才可使用安心卡功能。签署路径：进入“美团外卖商家端-门店运营-外卖安心卡”后，同意协议即可
    */
    @SerializedName("protocolStatus")
    private Integer protocolStatus;
    /**
    * 安心卡落地页url
    */
    @SerializedName("landPageUrl")
    private String landPageUrl;
    /**
    * 是否同步打印小票。0不同步，1同步。当syncOpenReceipt\u003d1， 需将cardDetailList随小票打印
    */
    @SerializedName("syncOpenReceipt")
    private Integer syncOpenReceipt;
    /**
    * 审核状态。0正常，1被配置下线，2审核失败。当auditStatus\u003d1或2时， 商家安心卡将会下线，相应的门店海报、在线联系自动同步给用户、随小票打印、C端安心卡标签也会失效。
    */
    @SerializedName("auditStatus")
    private Integer auditStatus;
    /**
    * 温馨话术。文案举例：“我们向您承诺：1、外卖食品安全皆可追踪，请您安心食用。2、疫情期间，建议您选择“无接触配送”服务。3、让我们一起同舟共济，共渡疫情。”
    */
    @SerializedName("tips")
    private String tips;
    /**
    * 商家生成的安心卡上填写的时间，单位秒
    */
    @SerializedName("cardTime")
    private Integer cardTime;
    /**
    * 是否同步展示在“店铺首页-门店海报”第一位。0不同步，1同步
    */
    @SerializedName("syncPost")
    private Integer syncPost;
    /**
    * 安心卡类型。0普通版，1升级版
    */
    @SerializedName("type")
    private Integer type;
    /**
    * 是否通过在线联系自动同步给用户。0不同步，1同步
    */
    @SerializedName("syncIM")
    private Integer syncIM;
    /**
    * 商家生成安心卡的时间
    */
    @SerializedName("ctime")
    private Long ctime;
    @SerializedName("upgradeDetailList")
    private List<UpdateDetailVOList> upgradeDetailList;
    /**
    * 安心卡内容详情。当syncOpenReceipt\u003d1，即把安心卡信息同步打印小票时， 必须将此信息随小票打印
    */
    @SerializedName("cardDetailList")
    private List<CardDetailList> cardDetailList;
    /**
    * 核酸信息。此字段会根据安心卡的具体策略，按区域开放给门店使用。
    */
    @SerializedName("testingItemList")
    private List<TestingItemList> testingItemList;
    /**
    * 审核文案。若审核失败或被封禁会传该文案
    */
    @SerializedName("auditTip")
    private String auditTip;

    public Long getAppId() {
        return appId;
    }
    public void setAppId(Long appId) {
        this.appId = appId;
    }
    public Integer getCardId() {
        return cardId;
    }
    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }
    public String getEpoiId() {
        return epoiId;
    }
    public void setEpoiId(String epoiId) {
        this.epoiId = epoiId;
    }
    public String getWmPoiName() {
        return wmPoiName;
    }
    public void setWmPoiName(String wmPoiName) {
        this.wmPoiName = wmPoiName;
    }
    public Integer getProtocolStatus() {
        return protocolStatus;
    }
    public void setProtocolStatus(Integer protocolStatus) {
        this.protocolStatus = protocolStatus;
    }
    public String getLandPageUrl() {
        return landPageUrl;
    }
    public void setLandPageUrl(String landPageUrl) {
        this.landPageUrl = landPageUrl;
    }
    public Integer getSyncOpenReceipt() {
        return syncOpenReceipt;
    }
    public void setSyncOpenReceipt(Integer syncOpenReceipt) {
        this.syncOpenReceipt = syncOpenReceipt;
    }
    public Integer getAuditStatus() {
        return auditStatus;
    }
    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }
    public String getTips() {
        return tips;
    }
    public void setTips(String tips) {
        this.tips = tips;
    }
    public Integer getCardTime() {
        return cardTime;
    }
    public void setCardTime(Integer cardTime) {
        this.cardTime = cardTime;
    }
    public Integer getSyncPost() {
        return syncPost;
    }
    public void setSyncPost(Integer syncPost) {
        this.syncPost = syncPost;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public Integer getSyncIM() {
        return syncIM;
    }
    public void setSyncIM(Integer syncIM) {
        this.syncIM = syncIM;
    }
    public Long getCtime() {
        return ctime;
    }
    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }
    public List<UpdateDetailVOList> getUpgradeDetailList() {
        return upgradeDetailList;
    }
    public void setUpgradeDetailList(List<UpdateDetailVOList> upgradeDetailList) {
        this.upgradeDetailList = upgradeDetailList;
    }
    public List<CardDetailList> getCardDetailList() {
        return cardDetailList;
    }
    public void setCardDetailList(List<CardDetailList> cardDetailList) {
        this.cardDetailList = cardDetailList;
    }
    public List<TestingItemList> getTestingItemList() {
        return testingItemList;
    }
    public void setTestingItemList(List<TestingItemList> testingItemList) {
        this.testingItemList = testingItemList;
    }
    public String getAuditTip() {
        return auditTip;
    }
    public void setAuditTip(String auditTip) {
        this.auditTip = auditTip;
    }




    @Override
    public String toString() {
        return "WmoperNgCardQueryResponse{" + "appId=" + appId + "," + "cardId=" + cardId + "," + "epoiId=" + epoiId + "," + "wmPoiName=" + wmPoiName + "," + "protocolStatus=" + protocolStatus + "," + "landPageUrl=" + landPageUrl + "," + "syncOpenReceipt=" + syncOpenReceipt + "," + "auditStatus=" + auditStatus + "," + "tips=" + tips + "," + "cardTime=" + cardTime + "," + "syncPost=" + syncPost + "," + "type=" + type + "," + "syncIM=" + syncIM + "," + "ctime=" + ctime + "," + "upgradeDetailList=" + upgradeDetailList + "," + "cardDetailList=" + cardDetailList + "," + "testingItemList=" + testingItemList + "," + "auditTip=" + auditTip + "}";
    }
}
