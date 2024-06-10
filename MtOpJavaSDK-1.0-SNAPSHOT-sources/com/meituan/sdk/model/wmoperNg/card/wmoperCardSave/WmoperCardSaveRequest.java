package com.meituan.sdk.model.wmoperNg.card.wmoperCardSave;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;
import javax.validation.constraints.NotEmpty;

/**
* 非接单安心卡
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/card/save",
    businessId = 16,
    apiVersion = "10000",
    apiName = "wmoper_card_save",
    needAuth = true
)
public class WmoperCardSaveRequest implements MeituanRequest<WmoperCardSaveResponse> {
    /**
    * 安心卡内容详情：当syncIM=1 或者 syncOpenReceipt=1 或者 syncPost=1 时，安心卡内容详情的人员信息不能为空
    */
    @NotEmpty(message = "cardDetailList不能为空")
    @SerializedName("cardDetailList")
    private List<CardDetailList> cardDetailList;
    /**
    * 温馨话术。举例，我们向您承诺：1、外卖食品安全皆可追踪，请您安心食用。2、疫情期间，建议您选择“无接触配送”服务。3、让我们一起同舟共济，共渡疫情。
    */
    @SerializedName("tips")
    private String tips;
    /**
    * 是否同步展示在“店铺首页-门店海报”第一位。0不同步，1同步。商家选中此项时，安心卡保存成功后，会在门店海报中显示安心卡信息。当商家有特型海报，默认将安心卡保存成特型海报的第一位
    */
    @NotNull(message = "syncPost不能为空")
    @SerializedName("syncPost")
    private Integer syncPost;
    /**
    * 安心卡类型。0普通版，1升级版。当type=1 升级版时，upgradeDetailList为必填，不可为空
    */
    @NotNull(message = "type不能为空")
    @SerializedName("type")
    private Integer type;
    /**
    * 是否通过在线联系自动同步给用户。0不同步，1同步。向商家展示时默认值必须为0 。建议商家选中此项时，提示商家只有在美团外卖商家端开通在线联系后才可勾选此项，否则安心卡信息会创建失败
    */
    @NotNull(message = "syncIM不能为空")
    @SerializedName("syncIM")
    private Integer syncIM;
    /**
    * 安心卡升级版的安心保障模块详情。当安心卡类型为普通版（type=0），此字段为[]。当安心卡类型为升级版（type=1），此字段为必填。
    */
    @NotEmpty(message = "upgradeDetailList不能为空")
    @SerializedName("upgradeDetailList")
    private List<UpgradeDetailList> upgradeDetailList;
    /**
    * 是否同步打印小票。0不同步，1同步。服务商后续可根据此字段，判断是否需要将安心卡信息打印在小票中
    */
    @NotNull(message = "syncOpenReceipt不能为空")
    @SerializedName("syncOpenReceipt")
    private Integer syncOpenReceipt;
    /**
    * 核酸信息。此字段会根据安心卡的具体策略，按区域开放给门店使用。
    */
    @SerializedName("testingItemList")
    private List<TestingItemList> testingItemList;

    public List<CardDetailList> getCardDetailList() {
        return cardDetailList;
    }
    public void setCardDetailList(List<CardDetailList> cardDetailList) {
        this.cardDetailList = cardDetailList;
    }
    public String getTips() {
        return tips;
    }
    public void setTips(String tips) {
        this.tips = tips;
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
    public List<UpgradeDetailList> getUpgradeDetailList() {
        return upgradeDetailList;
    }
    public void setUpgradeDetailList(List<UpgradeDetailList> upgradeDetailList) {
        this.upgradeDetailList = upgradeDetailList;
    }
    public Integer getSyncOpenReceipt() {
        return syncOpenReceipt;
    }
    public void setSyncOpenReceipt(Integer syncOpenReceipt) {
        this.syncOpenReceipt = syncOpenReceipt;
    }
    public List<TestingItemList> getTestingItemList() {
        return testingItemList;
    }
    public void setTestingItemList(List<TestingItemList> testingItemList) {
        this.testingItemList = testingItemList;
    }


    @Override
    public MeituanResponse<WmoperCardSaveResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WmoperCardSaveResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "WmoperCardSaveRequest{" + "cardDetailList=" + cardDetailList + "," + "tips=" + tips + "," + "syncPost=" + syncPost + "," + "type=" + type + "," + "syncIM=" + syncIM + "," + "upgradeDetailList=" + upgradeDetailList + "," + "syncOpenReceipt=" + syncOpenReceipt + "," + "testingItemList=" + testingItemList + "}";
    }
}
