package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiBizDeliveryRuleRangeUpdate;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class RegularHourDeliveryRange {
    @SerializedName("x")
    private String x;
    @SerializedName("y")
    private String y;

    public String getX() {
        return x;
    }
    public void setX(String x) {
        this.x = x;
    }
    public String getY() {
        return y;
    }
    public void setY(String y) {
        this.y = y;
    }




    @Override
    public String toString() {
        return "RegularHourDeliveryRange{" + "x=" + x + "," + "y=" + y + "}";
    }
}
