package com.meituan.sdk.model.ad.launch.cpmBatchCreateLaunch;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-105c8617-6531-4fa0-b4ee-6f5e33d204af"><span style="color: rgba(0, 0, 0, 0.65)">投放日期，只填一个时段，暂不开放多时段</span></p>
* This file was automatically generated.
*/
public class CpmTimeIntervalDTO {
    /**
    * <p data-diff-id="ct-diff-id-4ca908d2-db19-4775-892c-0b209bb2bff8">投放开始日期，格式"YYYY-MM-DD"</p>
    */
    @NotBlank(message = "beginDate不能为空")
    @SerializedName("beginDate")
    private String beginDate;
    /**
    * <p data-diff-id="ct-diff-id-319d38ee-0733-4ba1-8926-33530ec685d4">投放结束日期，格式"YYYY-MM-DD"，不填默认为"2099-12-31"</p>
    */
    @SerializedName("endDate")
    private String endDate;

    public String getBeginDate() {
        return beginDate;
    }
    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }




    @Override
    public String toString() {
        return "CpmTimeIntervalDTO{" + "beginDate=" + beginDate + "," + "endDate=" + endDate + "}";
    }
}
