package com.meituan.sdk.model.waimaiNg.dish.queryCategoryList;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 
* This file was automatically generated.
*/
public class Category {
    @NotNull(message = "categoryId不能为空")
    @SerializedName("categoryId")
    private Long categoryId;
    @NotNull(message = "templateId不能为空")
    @SerializedName("templateId")
    private Long templateId;
    /**
    * 分类名称
    */
    @SerializedName("name")
    private String name;
    /**
    * 对应类目父id
    */
    @SerializedName("parentId")
    private Long parentId;
    @NotEmpty(message = "child不能为空")
    @SerializedName("child")
    private List<Category> child;

    public Long getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
    public Long getTemplateId() {
        return templateId;
    }
    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getParentId() {
        return parentId;
    }
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
    public List<Category> getChild() {
        return child;
    }
    public void setChild(List<Category> child) {
        this.child = child;
    }




    @Override
    public String toString() {
        return "Category{" + "categoryId=" + categoryId + "," + "templateId=" + templateId + "," + "name=" + name + "," + "parentId=" + parentId + "," + "child=" + child + "}";
    }
}
