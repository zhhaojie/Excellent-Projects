package com.meituan.sdk.model.jmcard.cards.createOrUpdate;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;
import javax.validation.constraints.NotEmpty;

/**
* 创建/更新会员卡模板数据
* This file was automatically generated.
*/
@ApiMeta(
    path = "/jmcard/cards/create-or-update",
    businessId = 15,
    apiVersion = "10001",
    apiName = "create_or_update",
    needAuth = true
)
public class CreateOrUpdateRequest implements MeituanRequest<CreateOrUpdateResponse> {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">会员卡基础信息</font></span></p>
    */
    @NotNull(message = "cardBaseInfo不能为空")
    @SerializedName("cardBaseInfo")
    private CardBaseInfo cardBaseInfo;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">卡模板信息，可传多个</font></span></p>
    */
    @NotEmpty(message = "cardTemplateList不能为空")
    @SerializedName("cardTemplateList")
    private List<CardTemplate> cardTemplateList;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">默认卡模板key。每个卡模板都应该有一个key，需要指定一个卡模板为默认卡模板；该key必须能定位到一张卡模板，否则报错</font></span></p>
    */
    @NotBlank(message = "defaultTemplateKey不能为空")
    @SerializedName("defaultTemplateKey")
    private String defaultTemplateKey;

    public CardBaseInfo getCardBaseInfo() {
        return cardBaseInfo;
    }
    public void setCardBaseInfo(CardBaseInfo cardBaseInfo) {
        this.cardBaseInfo = cardBaseInfo;
    }
    public List<CardTemplate> getCardTemplateList() {
        return cardTemplateList;
    }
    public void setCardTemplateList(List<CardTemplate> cardTemplateList) {
        this.cardTemplateList = cardTemplateList;
    }
    public String getDefaultTemplateKey() {
        return defaultTemplateKey;
    }
    public void setDefaultTemplateKey(String defaultTemplateKey) {
        this.defaultTemplateKey = defaultTemplateKey;
    }


    @Override
    public MeituanResponse<CreateOrUpdateResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<CreateOrUpdateResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CreateOrUpdateRequest{" + "cardBaseInfo=" + cardBaseInfo + "," + "cardTemplateList=" + cardTemplateList + "," + "defaultTemplateKey=" + defaultTemplateKey + "}";
    }
}
