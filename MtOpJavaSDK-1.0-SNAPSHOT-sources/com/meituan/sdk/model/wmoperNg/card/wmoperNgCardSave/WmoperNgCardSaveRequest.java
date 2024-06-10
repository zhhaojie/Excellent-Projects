package com.meituan.sdk.model.wmoperNg.card.wmoperNgCardSave;

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
* 保存安心卡
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/card/save",
    businessId = 16,
    apiVersion = "10000",
    apiName = "wmoper_ng_card_save",
    needAuth = true
)
public class WmoperNgCardSaveRequest implements MeituanRequest<WmoperNgCardSaveResponse> {
    /**
    * <p data-diff-id="ct-diff-id-e676f862-786d-403f-a59d-1510c6e0a6f8"><span style="color: rgba(0, 0, 0, 0.65)">安心卡内容详情：当syncIM=1 或者 syncOpenReceipt=1 或者 syncPost=1 时，安心卡内容详情的人员信息不能为空</span></p>
    */
    @SerializedName("cardDetailList")
    private List<CardDetailVO> cardDetailList;
    /**
    * <p data-diff-id="ct-diff-id-a4e0687e-b57f-47d9-a19f-34bf3aa1e212"><span style="color: rgba(0, 0, 0, 0.65)">温馨话术。举例，我们向您承诺：1、外卖食品安全皆可追踪，请您安心食用。2、疫情期间，建议您选择“无接触配送”服务。3、让我们一起同舟共济，共渡疫情。</span></p>
    */
    @SerializedName("tips")
    private String tips;
    /**
    * <p data-diff-id="ct-diff-id-530e4b6e-2661-42d5-82e1-036b79112c65"><span style="color: rgba(0, 0, 0, 0.65)">是否同步展示在“店铺首页-门店海报”第一位。0不同步，1同步。商家选中此项时，安心卡保存成功后，会在门店海报中显示安心卡信息。当商家有特型海报，默认将安心卡保存成特型海报的第一位</span></p>
    */
    @NotNull(message = "syncPost不能为空")
    @SerializedName("syncPost")
    private Integer syncPost;
    /**
    * <p data-diff-id="ct-diff-id-6499a920-c672-48ee-8be4-acae35beb938"><span style="color: rgba(0, 0, 0, 0.65)">安心卡类型。0普通版，1升级版。当type=1 升级版时，upgradeDetailList为必填，不可为空</span></p>
    */
    @NotNull(message = "type不能为空")
    @SerializedName("type")
    private Integer type;
    /**
    * <p data-diff-id="ct-diff-id-7f951f16-5b6b-4fc7-8ac0-6f6e086a8982"><span style="color: rgba(0, 0, 0, 0.65)">是否通过在线联系自动同步给用户。0不同步，1同步。向商家展示时默认值必须为0&nbsp;。建议商家选中此项时，提示商家只有在美团外卖商家端开通在线联系后才可勾选此项，否则安心卡信息会创建失败</span></p>
    */
    @NotNull(message = "syncIM不能为空")
    @SerializedName("syncIM")
    private Integer syncIM;
    /**
    * <p data-diff-id="ct-diff-id-19053441-337e-4b14-a120-5f36f56c60ba"><span style="color: rgba(0, 0, 0, 0.65)">安心卡升级版的安心保障模块详情。当安心卡类型为普通版（type=0），此字段为[]。当安心卡类型为升级版（type=1），此字段为必填。</span></p>
    */
    @SerializedName("upgradeDetailList")
    private List<UpgradeDetailVO> upgradeDetailList;
    /**
    * <p data-diff-id="ct-diff-id-fbf1dc7b-7d1e-4d16-84a8-6357c4181fb6"><span style="color: rgba(0, 0, 0, 0.65)">是否同步打印小票。0不同步，1同步。服务商后续可根据此字段，判断是否需要将安心卡信息打印在小票中</span></p>
    */
    @NotNull(message = "syncOpenReceipt不能为空")
    @SerializedName("syncOpenReceipt")
    private Integer syncOpenReceipt;
    @SerializedName("testingItemList")
    private List<TestingItemParam> testingItemList;

    public List<CardDetailVO> getCardDetailList() {
        return cardDetailList;
    }
    public void setCardDetailList(List<CardDetailVO> cardDetailList) {
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
    public List<UpgradeDetailVO> getUpgradeDetailList() {
        return upgradeDetailList;
    }
    public void setUpgradeDetailList(List<UpgradeDetailVO> upgradeDetailList) {
        this.upgradeDetailList = upgradeDetailList;
    }
    public Integer getSyncOpenReceipt() {
        return syncOpenReceipt;
    }
    public void setSyncOpenReceipt(Integer syncOpenReceipt) {
        this.syncOpenReceipt = syncOpenReceipt;
    }
    public List<TestingItemParam> getTestingItemList() {
        return testingItemList;
    }
    public void setTestingItemList(List<TestingItemParam> testingItemList) {
        this.testingItemList = testingItemList;
    }


    @Override
    public MeituanResponse<WmoperNgCardSaveResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WmoperNgCardSaveResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "WmoperNgCardSaveRequest{" + "cardDetailList=" + cardDetailList + "," + "tips=" + tips + "," + "syncPost=" + syncPost + "," + "type=" + type + "," + "syncIM=" + syncIM + "," + "upgradeDetailList=" + upgradeDetailList + "," + "syncOpenReceipt=" + syncOpenReceipt + "," + "testingItemList=" + testingItemList + "}";
    }
}
