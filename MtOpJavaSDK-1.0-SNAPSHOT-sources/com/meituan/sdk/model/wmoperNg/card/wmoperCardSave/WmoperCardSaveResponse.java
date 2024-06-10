package com.meituan.sdk.model.wmoperNg.card.wmoperCardSave;

import com.google.gson.annotations.SerializedName;

/**
* 非接单安心卡
* This file was automatically generated.
*/
public class WmoperCardSaveResponse {
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
        return "WmoperCardSaveResponse{" + "cardId=" + cardId + "," + "landPage=" + landPage + "}";
    }
}
