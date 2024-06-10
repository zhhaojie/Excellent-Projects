package com.meituan.sdk.model.wmoperNg.poi.getPoiExtendInfo;

import com.google.gson.annotations.SerializedName;

/**
* 查询门店二维码
* This file was automatically generated.
*/
public class GetPoiExtendInfoResponse {
    /**
    * 门店点菜页的H5链接
    */
    @SerializedName("h5LinkUrl")
    private String h5LinkUrl;
    /**
    * 用来生产二维码的门店点菜页链接（如要二维码需要业务自己生成）
    */
    @SerializedName("qrCodeUrl")
    private String qrCodeUrl;
    /**
    * 	 门店小程序二维码图片url
    */
    @SerializedName("miniProgramUrl")
    private String miniProgramUrl;

    public String getH5LinkUrl() {
        return h5LinkUrl;
    }
    public void setH5LinkUrl(String h5LinkUrl) {
        this.h5LinkUrl = h5LinkUrl;
    }
    public String getQrCodeUrl() {
        return qrCodeUrl;
    }
    public void setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl;
    }
    public String getMiniProgramUrl() {
        return miniProgramUrl;
    }
    public void setMiniProgramUrl(String miniProgramUrl) {
        this.miniProgramUrl = miniProgramUrl;
    }




    @Override
    public String toString() {
        return "GetPoiExtendInfoResponse{" + "h5LinkUrl=" + h5LinkUrl + "," + "qrCodeUrl=" + qrCodeUrl + "," + "miniProgramUrl=" + miniProgramUrl + "}";
    }
}
