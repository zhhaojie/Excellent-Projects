package com.meituan.sdk.model.waimaiNg.poi.getPoiScoreDetail;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 满分项
* This file was automatically generated.
*/
public class ExcellentList {
    /**
    * 文案name
    */
    @SerializedName("contentName")
    private String contentName;
    /**
    * 当前指标描述
    */
    @SerializedName("yourShopText")
    private String yourShopText;
    /**
    * 门店当前指标
    */
    @SerializedName("yourShop")
    private String yourShop;
    /**
    * 分数
    */
    @SerializedName("score")
    private String score;
    @SerializedName("extraFields")
    private List<ExtraFields> extraFields;

    public String getContentName() {
        return contentName;
    }
    public void setContentName(String contentName) {
        this.contentName = contentName;
    }
    public String getYourShopText() {
        return yourShopText;
    }
    public void setYourShopText(String yourShopText) {
        this.yourShopText = yourShopText;
    }
    public String getYourShop() {
        return yourShop;
    }
    public void setYourShop(String yourShop) {
        this.yourShop = yourShop;
    }
    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }
    public List<ExtraFields> getExtraFields() {
        return extraFields;
    }
    public void setExtraFields(List<ExtraFields> extraFields) {
        this.extraFields = extraFields;
    }




    @Override
    public String toString() {
        return "ExcellentList{" + "contentName=" + contentName + "," + "yourShopText=" + yourShopText + "," + "yourShop=" + yourShop + "," + "score=" + score + "," + "extraFields=" + extraFields + "}";
    }
}
