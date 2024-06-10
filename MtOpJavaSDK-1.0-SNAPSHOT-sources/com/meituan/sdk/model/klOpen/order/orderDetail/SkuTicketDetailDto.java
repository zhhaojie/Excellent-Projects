package com.meituan.sdk.model.klOpen.order.orderDetail;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class SkuTicketDetailDto {
    @SerializedName("ticketName")
    private String ticketName;
    @SerializedName("ticketUrlList")
    private List<String> ticketUrlList;

    public String getTicketName() {
        return ticketName;
    }
    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }
    public List<String> getTicketUrlList() {
        return ticketUrlList;
    }
    public void setTicketUrlList(List<String> ticketUrlList) {
        this.ticketUrlList = ticketUrlList;
    }




    @Override
    public String toString() {
        return "SkuTicketDetailDto{" + "ticketName=" + ticketName + "," + "ticketUrlList=" + ticketUrlList + "}";
    }
}
