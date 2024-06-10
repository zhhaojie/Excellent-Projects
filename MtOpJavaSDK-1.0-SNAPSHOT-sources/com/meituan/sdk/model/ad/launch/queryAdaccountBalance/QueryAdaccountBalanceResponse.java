package com.meituan.sdk.model.ad.launch.queryAdaccountBalance;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 查询账号余额
* This file was automatically generated.
*/
public class QueryAdaccountBalanceResponse {
    /**
    * 账号总余额
    */
    @SerializedName("balance")
    private String balance;
    /**
    * 各个资金池明细
    */
    @SerializedName("productAccountInfoList")
    private List<ProductAccountInfo> productAccountInfoList;

    public String getBalance() {
        return balance;
    }
    public void setBalance(String balance) {
        this.balance = balance;
    }
    public List<ProductAccountInfo> getProductAccountInfoList() {
        return productAccountInfoList;
    }
    public void setProductAccountInfoList(List<ProductAccountInfo> productAccountInfoList) {
        this.productAccountInfoList = productAccountInfoList;
    }




    @Override
    public String toString() {
        return "QueryAdaccountBalanceResponse{" + "balance=" + balance + "," + "productAccountInfoList=" + productAccountInfoList + "}";
    }
}
