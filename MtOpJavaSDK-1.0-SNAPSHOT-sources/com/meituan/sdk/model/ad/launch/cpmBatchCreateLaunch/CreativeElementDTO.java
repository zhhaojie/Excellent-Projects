package com.meituan.sdk.model.ad.launch.cpmBatchCreateLaunch;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-43216e26-714a-464d-95db-c78291f205e0"><span style="color: rgba(0, 0, 0, 0.65)">其余创意元素</span></p>
* This file was automatically generated.
*/
public class CreativeElementDTO {
    /**
    * <p data-diff-id="ct-diff-id-751f530c-a85c-46ac-8439-9e448f255a33"><span style="color: rgba(0, 0, 0, 0.65)">模板ID</span></p>
    */
    @NotNull(message = "templateId不能为空")
    @SerializedName("templateId")
    private Integer templateId;
    /**
    * <p data-diff-id="ct-diff-id-e56bf42f-fe89-4db2-b04f-edd16a66d448"><span style="color: rgba(0, 0, 0, 0.65)">创意主图</span></p>
    */
    @NotBlank(message = "picUrl不能为空")
    @SerializedName("picUrl")
    private String picUrl;
    /**
    * <p data-diff-id="ct-diff-id-ea3820a2-a646-4675-be24-330668880192"><span style="color: rgba(0, 0, 0, 0.65)">创意标题</span></p>
    */
    @NotBlank(message = "title不能为空")
    @SerializedName("title")
    private String title;

    public Integer getTemplateId() {
        return templateId;
    }
    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }
    public String getPicUrl() {
        return picUrl;
    }
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }




    @Override
    public String toString() {
        return "CreativeElementDTO{" + "templateId=" + templateId + "," + "picUrl=" + picUrl + "," + "title=" + title + "}";
    }
}
