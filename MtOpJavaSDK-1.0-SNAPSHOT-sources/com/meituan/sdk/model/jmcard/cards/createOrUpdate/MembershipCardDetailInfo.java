package com.meituan.sdk.model.jmcard.cards.createOrUpdate;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotEmpty;

/**
* <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">卡模板栏位信息</font></span></p>
* This file was automatically generated.
*/
public class MembershipCardDetailInfo {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">默认中心栏位配置，中心栏位+列表栏位数量小于等于3</font></span></p><p><span class="ct-image" style="width: 451.18px"><img alt="image.png" data-origin="" data-small="" data-src="https://img.meituan.net/gwdoc/edf3802e03791a51179f36de9d834e3f461135.png" data-width="451.18" data-height="600"></span><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">​</font></span></p>
    */
    @NotEmpty(message = "defaultBaseDetailList不能为空")
    @SerializedName("defaultBaseDetailList")
    private List<DefaultMainEntrance> defaultBaseDetailList;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">必须为空list</font></span></p>
    */
    @NotEmpty(message = "newBaseDetailList不能为空")
    @SerializedName("newBaseDetailList")
    private List<NewDetailStruct> newBaseDetailList;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">默认列表栏位，</font></span>默认列表栏位可选类型：</p><p style="text-align: start;">"MEMBER_RIGHTS"：会员权益</p><p style="text-align: start;">"CAN_USE_POI"：适用门店</p><p style="text-align: start;"></p>
    */
    @NotEmpty(message = "defaultListDetailList不能为空")
    @SerializedName("defaultListDetailList")
    private List<String> defaultListDetailList;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">必须为空list</font></span></p>
    */
    @NotEmpty(message = "newListDetailList不能为空")
    @SerializedName("newListDetailList")
    private List<NewDetailStruct> newListDetailList;

    public List<DefaultMainEntrance> getDefaultBaseDetailList() {
        return defaultBaseDetailList;
    }
    public void setDefaultBaseDetailList(List<DefaultMainEntrance> defaultBaseDetailList) {
        this.defaultBaseDetailList = defaultBaseDetailList;
    }
    public List<NewDetailStruct> getNewBaseDetailList() {
        return newBaseDetailList;
    }
    public void setNewBaseDetailList(List<NewDetailStruct> newBaseDetailList) {
        this.newBaseDetailList = newBaseDetailList;
    }
    public List<String> getDefaultListDetailList() {
        return defaultListDetailList;
    }
    public void setDefaultListDetailList(List<String> defaultListDetailList) {
        this.defaultListDetailList = defaultListDetailList;
    }
    public List<NewDetailStruct> getNewListDetailList() {
        return newListDetailList;
    }
    public void setNewListDetailList(List<NewDetailStruct> newListDetailList) {
        this.newListDetailList = newListDetailList;
    }




    @Override
    public String toString() {
        return "MembershipCardDetailInfo{" + "defaultBaseDetailList=" + defaultBaseDetailList + "," + "newBaseDetailList=" + newBaseDetailList + "," + "defaultListDetailList=" + defaultListDetailList + "," + "newListDetailList=" + newListDetailList + "}";
    }
}
