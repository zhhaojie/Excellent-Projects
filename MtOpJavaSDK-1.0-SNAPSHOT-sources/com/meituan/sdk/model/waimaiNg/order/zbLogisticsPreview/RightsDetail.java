package com.meituan.sdk.model.waimaiNg.order.zbLogisticsPreview;

import com.google.gson.annotations.SerializedName;

/**
* 跑腿溢价权益列表 请求参数recommendRights传true返回
* This file was automatically generated.
*/
public class RightsDetail {
    /**
    * 权益token
    */
    @SerializedName("rightDisToken")
    private String rightDisToken;
    @SerializedName("extMap")
    private ExtMap extMap;

    public String getRightDisToken() {
        return rightDisToken;
    }
    public void setRightDisToken(String rightDisToken) {
        this.rightDisToken = rightDisToken;
    }
    public ExtMap getExtMap() {
        return extMap;
    }
    public void setExtMap(ExtMap extMap) {
        this.extMap = extMap;
    }




    @Override
    public String toString() {
        return "RightsDetail{" + "rightDisToken=" + rightDisToken + "," + "extMap=" + extMap + "}";
    }
}
