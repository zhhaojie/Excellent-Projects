package com.meituan.sdk.model.waimaiNg.dish.dishQueryListByEdishCodes;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* 根据eDishCode批量查询外卖菜品信息
* This file was automatically generated.
*/
public class DishQueryListByEdishCodesResponse {
    @NotBlank(message = "msg不能为空")
    @SerializedName("msg")
    private String msg;
    /**
    * 数据
    */
    @SerializedName("list")
    private List<ListEx> list;
    /**
    * 查询结果标识，0全部查询成功、1全部查询失败、2部分查询成功
    */
    @SerializedName("status")
    private Integer status;

    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public List<ListEx> getList() {
        return list;
    }
    public void setList(List<ListEx> list) {
        this.list = list;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }




    @Override
    public String toString() {
        return "DishQueryListByEdishCodesResponse{" + "msg=" + msg + "," + "list=" + list + "," + "status=" + status + "}";
    }
}
