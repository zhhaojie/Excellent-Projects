package com.meituan.sdk.model.wmoperNg.order.wmoperngGetOrderDetail;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class Activity {
    @NotNull(message = "actDetailId不能为空")
    @SerializedName("act_detail_id")
    private Long actDetailId;
    @NotNull(message = "reduceFee不能为空")
    @SerializedName("reduce_fee")
    private Double reduceFee;
    @NotNull(message = "mtCharge不能为空")
    @SerializedName("mt_charge")
    private Double mtCharge;
    @NotNull(message = "poiCharge不能为空")
    @SerializedName("poi_charge")
    private Double poiCharge;
    @NotBlank(message = "remark不能为空")
    @SerializedName("remark")
    private String remark;
    @NotNull(message = "type不能为空")
    @SerializedName("type")
    private Long type;

    public Long getActDetailId() {
        return actDetailId;
    }
    public void setActDetailId(Long actDetailId) {
        this.actDetailId = actDetailId;
    }
    public Double getReduceFee() {
        return reduceFee;
    }
    public void setReduceFee(Double reduceFee) {
        this.reduceFee = reduceFee;
    }
    public Double getMtCharge() {
        return mtCharge;
    }
    public void setMtCharge(Double mtCharge) {
        this.mtCharge = mtCharge;
    }
    public Double getPoiCharge() {
        return poiCharge;
    }
    public void setPoiCharge(Double poiCharge) {
        this.poiCharge = poiCharge;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Long getType() {
        return type;
    }
    public void setType(Long type) {
        this.type = type;
    }




    @Override
    public String toString() {
        return "Activity{" + "actDetailId=" + actDetailId + "," + "reduceFee=" + reduceFee + "," + "mtCharge=" + mtCharge + "," + "poiCharge=" + poiCharge + "," + "remark=" + remark + "," + "type=" + type + "}";
    }
}
