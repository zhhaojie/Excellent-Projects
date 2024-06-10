package com.meituan.sdk.model.waimaiNg.card.saveCard;

import com.google.gson.annotations.SerializedName;

/**
* 保存安心卡
* This file was automatically generated.
*/
public class SaveCardResponse {
    /**
    * 保存成功的安心卡id
    */
    @SerializedName("cardId")
    private Integer cardId;
    /**
    * 安心卡详细信息url
    */
    @SerializedName("landPage")
    private String landPage;

    public Integer getCardId() {
        return cardId;
    }
    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }
    public String getLandPage() {
        return landPage;
    }
    public void setLandPage(String landPage) {
        this.landPage = landPage;
    }




    @Override
    public String toString() {
        return "SaveCardResponse{" + "cardId=" + cardId + "," + "landPage=" + landPage + "}";
    }
}
