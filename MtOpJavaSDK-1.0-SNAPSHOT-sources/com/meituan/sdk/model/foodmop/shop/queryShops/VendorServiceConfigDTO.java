package com.meituan.sdk.model.foodmop.shop.queryShops;

import com.google.gson.annotations.SerializedName;

/**
* 服务配置
* This file was automatically generated.
*/
public class VendorServiceConfigDTO {
    /**
    * 门店营业状态，参数值：  10-营业  20-歇业
    */
    @SerializedName("mopBizServiceStatus")
    private String mopBizServiceStatus;
    /**
    * 营业时间配置 （json格式的字符串），参数值范例：  {\"2022-03-30\":[{\"startTime\":\"00:00\",\"endTime\":\"00:06\"}]
    */
    @SerializedName("mopBusinessHour")
    private String mopBusinessHour;

    public String getMopBizServiceStatus() {
        return mopBizServiceStatus;
    }
    public void setMopBizServiceStatus(String mopBizServiceStatus) {
        this.mopBizServiceStatus = mopBizServiceStatus;
    }
    public String getMopBusinessHour() {
        return mopBusinessHour;
    }
    public void setMopBusinessHour(String mopBusinessHour) {
        this.mopBusinessHour = mopBusinessHour;
    }




    @Override
    public String toString() {
        return "VendorServiceConfigDTO{" + "mopBizServiceStatus=" + mopBizServiceStatus + "," + "mopBusinessHour=" + mopBusinessHour + "}";
    }
}
