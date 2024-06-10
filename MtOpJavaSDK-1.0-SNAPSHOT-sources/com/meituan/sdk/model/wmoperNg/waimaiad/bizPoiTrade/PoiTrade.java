package com.meituan.sdk.model.wmoperNg.waimaiad.bizPoiTrade;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class PoiTrade {
    @NotNull(message = "originalPrice不能为空")
    @SerializedName("originalPrice")
    private Long originalPrice;
    @NotNull(message = "actualPrice不能为空")
    @SerializedName("actualPrice")
    private Long actualPrice;
    @NotNull(message = "ordNum不能为空")
    @SerializedName("ordNum")
    private Long ordNum;
    @NotNull(message = "receiveOrdNum不能为空")
    @SerializedName("receiveOrdNum")
    private Long receiveOrdNum;
    @NotNull(message = "dt不能为空")
    @SerializedName("dt")
    private Long dt;

    public Long getOriginalPrice() {
        return originalPrice;
    }
    public void setOriginalPrice(Long originalPrice) {
        this.originalPrice = originalPrice;
    }
    public Long getActualPrice() {
        return actualPrice;
    }
    public void setActualPrice(Long actualPrice) {
        this.actualPrice = actualPrice;
    }
    public Long getOrdNum() {
        return ordNum;
    }
    public void setOrdNum(Long ordNum) {
        this.ordNum = ordNum;
    }
    public Long getReceiveOrdNum() {
        return receiveOrdNum;
    }
    public void setReceiveOrdNum(Long receiveOrdNum) {
        this.receiveOrdNum = receiveOrdNum;
    }
    public Long getDt() {
        return dt;
    }
    public void setDt(Long dt) {
        this.dt = dt;
    }




    @Override
    public String toString() {
        return "PoiTrade{" + "originalPrice=" + originalPrice + "," + "actualPrice=" + actualPrice + "," + "ordNum=" + ordNum + "," + "receiveOrdNum=" + receiveOrdNum + "," + "dt=" + dt + "}";
    }
}
