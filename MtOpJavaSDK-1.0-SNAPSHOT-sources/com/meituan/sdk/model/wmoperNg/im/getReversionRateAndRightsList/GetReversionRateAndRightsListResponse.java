package com.meituan.sdk.model.wmoperNg.im.getReversionRateAndRightsList;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 回复率及权益查询
* This file was automatically generated.
*/
public class GetReversionRateAndRightsListResponse {
    @NotNull(message = "benefitStatus不能为空")
    @SerializedName("benefitStatus")
    private Long benefitStatus;
    @NotBlank(message = "reversionRate不能为空")
    @SerializedName("reversionRate")
    private String reversionRate;
    @NotBlank(message = "targetReversionRate不能为空")
    @SerializedName("targetReversionRate")
    private String targetReversionRate;
    @NotNull(message = "urgentBenefitStatus不能为空")
    @SerializedName("urgentBenefitStatus")
    private Long urgentBenefitStatus;
    @NotBlank(message = "urgentReversionRate不能为空")
    @SerializedName("urgentReversionRate")
    private String urgentReversionRate;
    @NotBlank(message = "urgentTargetReversionRate不能为空")
    @SerializedName("urgentTargetReversionRate")
    private String urgentTargetReversionRate;
    @NotEmpty(message = "rightsList不能为空")
    @SerializedName("rightsList")
    private List<RightsList> rightsList;
    @NotEmpty(message = "tempRightsList不能为空")
    @SerializedName("tempRightsList")
    private List<RightsList> tempRightsList;

    public Long getBenefitStatus() {
        return benefitStatus;
    }
    public void setBenefitStatus(Long benefitStatus) {
        this.benefitStatus = benefitStatus;
    }
    public String getReversionRate() {
        return reversionRate;
    }
    public void setReversionRate(String reversionRate) {
        this.reversionRate = reversionRate;
    }
    public String getTargetReversionRate() {
        return targetReversionRate;
    }
    public void setTargetReversionRate(String targetReversionRate) {
        this.targetReversionRate = targetReversionRate;
    }
    public Long getUrgentBenefitStatus() {
        return urgentBenefitStatus;
    }
    public void setUrgentBenefitStatus(Long urgentBenefitStatus) {
        this.urgentBenefitStatus = urgentBenefitStatus;
    }
    public String getUrgentReversionRate() {
        return urgentReversionRate;
    }
    public void setUrgentReversionRate(String urgentReversionRate) {
        this.urgentReversionRate = urgentReversionRate;
    }
    public String getUrgentTargetReversionRate() {
        return urgentTargetReversionRate;
    }
    public void setUrgentTargetReversionRate(String urgentTargetReversionRate) {
        this.urgentTargetReversionRate = urgentTargetReversionRate;
    }
    public List<RightsList> getRightsList() {
        return rightsList;
    }
    public void setRightsList(List<RightsList> rightsList) {
        this.rightsList = rightsList;
    }
    public List<RightsList> getTempRightsList() {
        return tempRightsList;
    }
    public void setTempRightsList(List<RightsList> tempRightsList) {
        this.tempRightsList = tempRightsList;
    }




    @Override
    public String toString() {
        return "GetReversionRateAndRightsListResponse{" + "benefitStatus=" + benefitStatus + "," + "reversionRate=" + reversionRate + "," + "targetReversionRate=" + targetReversionRate + "," + "urgentBenefitStatus=" + urgentBenefitStatus + "," + "urgentReversionRate=" + urgentReversionRate + "," + "urgentTargetReversionRate=" + urgentTargetReversionRate + "," + "rightsList=" + rightsList + "," + "tempRightsList=" + tempRightsList + "}";
    }
}
