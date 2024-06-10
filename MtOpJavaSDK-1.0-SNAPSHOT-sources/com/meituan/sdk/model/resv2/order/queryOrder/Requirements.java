package com.meituan.sdk.model.resv2.order.queryOrder;

import com.google.gson.annotations.SerializedName;

/**
* 附加要求
* This file was automatically generated.
*/
public class Requirements {
    /**
    * 桌台类型
    */
    @SerializedName("tableType")
    private Integer tableType;
    /**
    * 桌台类型名称
    */
    @SerializedName("tableTypeName")
    private String tableTypeName;
    /**
    * 备注
    */
    @SerializedName("remark")
    private String remark;

    public Integer getTableType() {
        return tableType;
    }
    public void setTableType(Integer tableType) {
        this.tableType = tableType;
    }
    public String getTableTypeName() {
        return tableTypeName;
    }
    public void setTableTypeName(String tableTypeName) {
        this.tableTypeName = tableTypeName;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }




    @Override
    public String toString() {
        return "Requirements{" + "tableType=" + tableType + "," + "tableTypeName=" + tableTypeName + "," + "remark=" + remark + "}";
    }
}
