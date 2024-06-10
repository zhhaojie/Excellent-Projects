package com.meituan.sdk.model.foodmop.shop.tagPush;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-97a819fb-dd20-46c6-906b-123ec6cbc4e2">标签code 【size &lt;= 20】</p>
* This file was automatically generated.
*/
public class Tag {
    /**
    * <p data-diff-id="ct-diff-id-e63e1392-10c6-4704-abc6-6d33dd618d40">标签Code</p>
    */
    @NotBlank(message = "tagCode不能为空")
    @SerializedName("tagCode")
    private String tagCode;
    /**
    * <p data-diff-id="ct-diff-id-2483fde9-56e1-47b0-8306-6541723ac0f0">标签名称</p>
    */
    @NotBlank(message = "tagName不能为空")
    @SerializedName("tagName")
    private String tagName;
    /**
    * <p data-diff-id="ct-diff-id-5799fe44-d896-412b-b8a6-eeca1c27cded">1：新增</p><p data-diff-id="ct-diff-id-faf99418-ed08-416c-88e0-f5ddb8a7c984">2：修改</p><p data-diff-id="ct-diff-id-0827474d-79a4-4fe0-b021-ee3b9a281678">3：删除</p>
    */
    @NotNull(message = "action不能为空")
    @SerializedName("action")
    private Integer action;

    public String getTagCode() {
        return tagCode;
    }
    public void setTagCode(String tagCode) {
        this.tagCode = tagCode;
    }
    public String getTagName() {
        return tagName;
    }
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
    public Integer getAction() {
        return action;
    }
    public void setAction(Integer action) {
        this.action = action;
    }




    @Override
    public String toString() {
        return "Tag{" + "tagCode=" + tagCode + "," + "tagName=" + tagName + "," + "action=" + action + "}";
    }
}
