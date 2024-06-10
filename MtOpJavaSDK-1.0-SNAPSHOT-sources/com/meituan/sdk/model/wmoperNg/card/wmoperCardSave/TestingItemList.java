package com.meituan.sdk.model.wmoperNg.card.wmoperCardSave;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* 核酸信息。此字段会根据安心卡的具体策略，按区域开放给门店使用。
* This file was automatically generated.
*/
public class TestingItemList {
    /**
    * 核酸信息图片url
    */
    @NotBlank(message = "url不能为空")
    @SerializedName("url")
    private String url;

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }




    @Override
    public String toString() {
        return "TestingItemList{" + "url=" + url + "}";
    }
}
