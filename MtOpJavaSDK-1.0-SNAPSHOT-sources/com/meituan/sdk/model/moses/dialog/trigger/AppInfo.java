package com.meituan.sdk.model.moses.dialog.trigger;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* <p>应用信息</p>
* This file was automatically generated.
*/
public class AppInfo {
    /**
    * <p>所配置机器人的key</p>
    */
    @NotBlank(message = "robotKey不能为空")
    @SerializedName("robotKey")
    private String robotKey;

    public String getRobotKey() {
        return robotKey;
    }
    public void setRobotKey(String robotKey) {
        this.robotKey = robotKey;
    }




    @Override
    public String toString() {
        return "AppInfo{" + "robotKey=" + robotKey + "}";
    }
}
