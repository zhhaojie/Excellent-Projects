package com.meituan.sdk.model.waimaiNg.im.getReversionRateAndRightsList;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 回复率及权益查询
* This file was automatically generated.
*/
public class GetReversionRateAndRightsListResponse {
    /**
    * 是否获得5分钟回复率达标权益， 0-未达标 1-达标
    */
    @SerializedName("benefitStatus")
    private Integer benefitStatus;
    /**
    * IM5分钟回复率
    */
    @SerializedName("reversionRate")
    private String reversionRate;
    /**
    * IM5分钟目标回复率
    */
    @SerializedName("targetReversionRate")
    private Integer targetReversionRate;
    /**
    * 紧急消息1分钟回复率， 0-未达标 1-达标
    */
    @SerializedName("urgentBenefitStatus")
    private Integer urgentBenefitStatus;
    /**
    * 是否获得紧急消息1分钟回复率达标权益
    */
    @SerializedName("urgentReversionRate")
    private String urgentReversionRate;
    /**
    * IM紧急消息目标回复率
    */
    @SerializedName("urgentTargetReversionRate")
    private String urgentTargetReversionRate;
    /**
    * 门店权益列表  此次只有1，3，5，6  RIGHTS_UNKNOWN(-1, "未知权益", 1), RIGHTS_COMMENT_CONTACT(1, "评价联系", 1), RIGHTS_HONOR_TAG(2, "荣誉标签", 1), RIGHTS_COMMENT_UPDATE(3, "评价实时更新", 1), RIGHTS_IMPROVE_SCORE(4, "提升店铺评分", 2), RIGHTS_COMMENT_INVITE(5, "邀请顾客评价", 2), RIGHTS_BLOCK_LIST(6, "屏蔽恶意顾客", 2), RIGHTS_POSTER(7, "免费门店海报", 2), RIGHTS_PHONE_RETURN_VISIT(8, "电话回访顾客", 3), RIGHTS_SEND_COUPON(9, "发送优惠券", 3);
    */
    @SerializedName("rightsList")
    private List<Rights> rightsList;
    /**
    * 门店临时权益列表，同rightsList
    */
    @SerializedName("tempRightsList")
    private List<Rights> tempRightsList;

    public Integer getBenefitStatus() {
        return benefitStatus;
    }
    public void setBenefitStatus(Integer benefitStatus) {
        this.benefitStatus = benefitStatus;
    }
    public String getReversionRate() {
        return reversionRate;
    }
    public void setReversionRate(String reversionRate) {
        this.reversionRate = reversionRate;
    }
    public Integer getTargetReversionRate() {
        return targetReversionRate;
    }
    public void setTargetReversionRate(Integer targetReversionRate) {
        this.targetReversionRate = targetReversionRate;
    }
    public Integer getUrgentBenefitStatus() {
        return urgentBenefitStatus;
    }
    public void setUrgentBenefitStatus(Integer urgentBenefitStatus) {
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
    public List<Rights> getRightsList() {
        return rightsList;
    }
    public void setRightsList(List<Rights> rightsList) {
        this.rightsList = rightsList;
    }
    public List<Rights> getTempRightsList() {
        return tempRightsList;
    }
    public void setTempRightsList(List<Rights> tempRightsList) {
        this.tempRightsList = tempRightsList;
    }




    @Override
    public String toString() {
        return "GetReversionRateAndRightsListResponse{" + "benefitStatus=" + benefitStatus + "," + "reversionRate=" + reversionRate + "," + "targetReversionRate=" + targetReversionRate + "," + "urgentBenefitStatus=" + urgentBenefitStatus + "," + "urgentReversionRate=" + urgentReversionRate + "," + "urgentTargetReversionRate=" + urgentTargetReversionRate + "," + "rightsList=" + rightsList + "," + "tempRightsList=" + tempRightsList + "}";
    }
}
