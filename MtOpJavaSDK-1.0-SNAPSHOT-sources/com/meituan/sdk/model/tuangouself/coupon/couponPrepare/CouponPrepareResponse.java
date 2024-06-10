package com.meituan.sdk.model.tuangouself.coupon.couponPrepare;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class CouponPrepareResponse {
    /**
    * 券码
    */
    @SerializedName("code")
    private String code;
    /**
    * 项目ID
    */
    @SerializedName("dealId")
    private Long dealId;
    /**
    * 项目类型，0套餐，1代金券
    */
    @SerializedName("dealType")
    private Integer dealType;
    /**
    * deal对应的菜品信息
    */
    @SerializedName("menuInfo")
    private List<DealMenu> menuInfo;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Long getDealId() {
        return dealId;
    }
    public void setDealId(Long dealId) {
        this.dealId = dealId;
    }
    public Integer getDealType() {
        return dealType;
    }
    public void setDealType(Integer dealType) {
        this.dealType = dealType;
    }
    public List<DealMenu> getMenuInfo() {
        return menuInfo;
    }
    public void setMenuInfo(List<DealMenu> menuInfo) {
        this.menuInfo = menuInfo;
    }




    @Override
    public String toString() {
        return "CouponPrepareResponse{" + "code=" + code + "," + "dealId=" + dealId + "," + "dealType=" + dealType + "," + "menuInfo=" + menuInfo + "}";
    }
}
