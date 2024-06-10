package com.meituan.sdk.model.design.ocr.recognizeMenu;

import com.google.gson.annotations.SerializedName;

/**
* 菜单OCR识别 识别并结构化输出菜单图片中的菜名、价格和单位。
* This file was automatically generated.
*/
public class RecognizeMenuResponse {
    /**
    * 菜名数目
    */
    @SerializedName("nDishNum")
    private Integer nDishNum;
    /**
    * 菜单识别结果
    */
    @SerializedName("menus")
    private String menus;

    public Integer getNDishNum() {
        return nDishNum;
    }
    public void setNDishNum(Integer nDishNum) {
        this.nDishNum = nDishNum;
    }
    public String getMenus() {
        return menus;
    }
    public void setMenus(String menus) {
        this.menus = menus;
    }




    @Override
    public String toString() {
        return "RecognizeMenuResponse{" + "nDishNum=" + nDishNum + "," + "menus=" + menus + "}";
    }
}
