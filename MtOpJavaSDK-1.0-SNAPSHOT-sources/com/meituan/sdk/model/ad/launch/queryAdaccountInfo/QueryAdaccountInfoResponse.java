package com.meituan.sdk.model.ad.launch.queryAdaccountInfo;

import com.google.gson.annotations.SerializedName;

/**
* 查询账号基本信息
* This file was automatically generated.
*/
public class QueryAdaccountInfoResponse {
    /**
    * 商家账号
    */
    @SerializedName("adAccountId")
    private Integer adAccountId;
    /**
    * 登陆名
    */
    @SerializedName("name")
    private String name;
    /**
    * 签约门店
    */
    @SerializedName("shopId")
    private Long shopId;
    /**
    * 业务
    */
    @SerializedName("bu")
    private Integer bu;
    /**
    * 城市
    */
    @SerializedName("city")
    private Integer city;
    /**
    * 门店名称
    */
    @SerializedName("shopName")
    private String shopName;

    public Integer getAdAccountId() {
        return adAccountId;
    }
    public void setAdAccountId(Integer adAccountId) {
        this.adAccountId = adAccountId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getShopId() {
        return shopId;
    }
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }
    public Integer getBu() {
        return bu;
    }
    public void setBu(Integer bu) {
        this.bu = bu;
    }
    public Integer getCity() {
        return city;
    }
    public void setCity(Integer city) {
        this.city = city;
    }
    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }




    @Override
    public String toString() {
        return "QueryAdaccountInfoResponse{" + "adAccountId=" + adAccountId + "," + "name=" + name + "," + "shopId=" + shopId + "," + "bu=" + bu + "," + "city=" + city + "," + "shopName=" + shopName + "}";
    }
}
