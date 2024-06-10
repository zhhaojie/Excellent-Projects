package com.meituan.sdk.model.wmoperNg.waimaiad.adDataHistory;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 广告历史数据，区分到天
* This file was automatically generated.
*/
public class AdDataHistoryResponse {
    @NotNull(message = "result不能为空")
    @SerializedName("result")
    private Result result;
    @NotEmpty(message = "adDataInfoList不能为空")
    @SerializedName("adDataInfoList")
    private List<AdDataInfoList> adDataInfoList;
    @NotBlank(message = "show不能为空")
    @SerializedName("show")
    private String show;
    @NotBlank(message = "click不能为空")
    @SerializedName("click")
    private String click;
    @NotBlank(message = "debit不能为空")
    @SerializedName("debit")
    private String debit;

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }
    public List<AdDataInfoList> getAdDataInfoList() {
        return adDataInfoList;
    }
    public void setAdDataInfoList(List<AdDataInfoList> adDataInfoList) {
        this.adDataInfoList = adDataInfoList;
    }
    public String getShow() {
        return show;
    }
    public void setShow(String show) {
        this.show = show;
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




    @Override
    public String toString() {
        return "AdDataHistoryResponse{" + "result=" + result + "," + "adDataInfoList=" + adDataInfoList + "," + "show=" + show + "," + "click=" + click + "," + "debit=" + debit + "}";
    }
}
