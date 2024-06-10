package com.meituan.sdk.model.resv2.order.queryOrder;

import com.google.gson.annotations.SerializedName;

/**
* 查询订单信息
* This file was automatically generated.
*/
public class QueryOrderResponse {
    /**
    * 预订订单号
    */
    @SerializedName("orderSerializedId")
    private String orderSerializedId;
    /**
    * 状态
    */
    @SerializedName("status")
    private Integer status;
    /**
    * 就餐时间
    */
    @SerializedName("bookingTime")
    private Integer bookingTime;
    /**
    * 就餐人数
    */
    @SerializedName("number")
    private Integer number;
    /**
    * 姓名
    */
    @SerializedName("name")
    private String name;
    /**
    * 性别 10 - 女士 20 - 先生
    */
    @SerializedName("gender")
    private Integer gender;
    /**
    * 手机号 status为10、20、30、80时为空商家接单后提供完整手机号
    */
    @SerializedName("phone")
    private String phone;
    /**
    * 附加要求
    */
    @SerializedName("requirements")
    private Requirements requirements;

    public String getOrderSerializedId() {
        return orderSerializedId;
    }
    public void setOrderSerializedId(String orderSerializedId) {
        this.orderSerializedId = orderSerializedId;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getBookingTime() {
        return bookingTime;
    }
    public void setBookingTime(Integer bookingTime) {
        this.bookingTime = bookingTime;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getGender() {
        return gender;
    }
    public void setGender(Integer gender) {
        this.gender = gender;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Requirements getRequirements() {
        return requirements;
    }
    public void setRequirements(Requirements requirements) {
        this.requirements = requirements;
    }




    @Override
    public String toString() {
        return "QueryOrderResponse{" + "orderSerializedId=" + orderSerializedId + "," + "status=" + status + "," + "bookingTime=" + bookingTime + "," + "number=" + number + "," + "name=" + name + "," + "gender=" + gender + "," + "phone=" + phone + "," + "requirements=" + requirements + "}";
    }
}
