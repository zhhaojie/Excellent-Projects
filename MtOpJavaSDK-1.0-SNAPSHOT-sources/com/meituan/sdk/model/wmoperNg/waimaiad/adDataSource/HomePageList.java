package com.meituan.sdk.model.wmoperNg.waimaiad.adDataSource;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class HomePageList {
    @NotNull(message = "pos不能为空")
    @SerializedName("pos")
    private Long pos;
    @NotBlank(message = "click不能为空")
    @SerializedName("click")
    private String click;
    @NotBlank(message = "debit不能为空")
    @SerializedName("debit")
    private String debit;
    @NotNull(message = "avgPrice不能为空")
    @SerializedName("avgPrice")
    private Long avgPrice;
    @NotNull(message = "debitPercent不能为空")
    @SerializedName("debitPercent")
    private Double debitPercent;

    public Long getPos() {
        return pos;
    }
    public void setPos(Long pos) {
        this.pos = pos;
    }
    public String getClick() {
        return click;
    }
    public void setClick(String click) {
        this.click = click;
    }
    public String getDebit() {
        return debit;
    }
    public void setDebit(String debit) {
        this.debit = debit;
    }
    public Long getAvgPrice() {
        return avgPrice;
    }
    public void setAvgPrice(Long avgPrice) {
        this.avgPrice = avgPrice;
    }
    public Double getDebitPercent() {
        return debitPercent;
    }
    public void setDebitPercent(Double debitPercent) {
        this.debitPercent = debitPercent;
    }




    @Override
    public String toString() {
        return "HomePageList{" + "pos=" + pos + "," + "click=" + click + "," + "debit=" + debit + "," + "avgPrice=" + avgPrice + "," + "debitPercent=" + debitPercent + "}";
    }
}
