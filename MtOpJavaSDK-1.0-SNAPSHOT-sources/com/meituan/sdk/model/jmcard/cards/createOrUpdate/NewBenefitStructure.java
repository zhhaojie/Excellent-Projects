package com.meituan.sdk.model.jmcard.cards.createOrUpdate;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">新增会员权益</font></span></p>
* This file was automatically generated.
*/
public class NewBenefitStructure {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">新增权益标题，限制16个字符</font></span></p>
    */
    @NotBlank(message = "title不能为空")
    @SerializedName("title")
    private String title;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">新增权益内容，限制512个字符</font></span></p>
    */
    @NotBlank(message = "content不能为空")
    @SerializedName("content")
    private String content;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }




    @Override
    public String toString() {
        return "NewBenefitStructure{" + "title=" + title + "," + "content=" + content + "}";
    }
}
