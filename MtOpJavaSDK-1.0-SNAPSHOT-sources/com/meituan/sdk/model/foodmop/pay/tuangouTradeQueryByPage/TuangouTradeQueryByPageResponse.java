package com.meituan.sdk.model.foodmop.pay.tuangouTradeQueryByPage;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 对账分页查询账单信息（非必接）
* This file was automatically generated.
*/
public class TuangouTradeQueryByPageResponse {
    /**
    * 流水数据，查询成功时返回
    */
    @SerializedName("tradeDetailList")
    private List<TradeDetail> tradeDetailList;

    public List<TradeDetail> getTradeDetailList() {
        return tradeDetailList;
    }
    public void setTradeDetailList(List<TradeDetail> tradeDetailList) {
        this.tradeDetailList = tradeDetailList;
    }




    @Override
    public String toString() {
        return "TuangouTradeQueryByPageResponse{" + "tradeDetailList=" + tradeDetailList + "}";
    }
}
