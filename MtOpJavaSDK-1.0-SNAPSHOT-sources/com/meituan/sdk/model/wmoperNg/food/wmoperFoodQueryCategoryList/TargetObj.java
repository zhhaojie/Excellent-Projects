package com.meituan.sdk.model.wmoperNg.food.wmoperFoodQueryCategoryList;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class TargetObj {
    /**
    * 分类名称
    */
    @SerializedName("name")
    private String name;
    /**
    * 对应类目模板ID
    */
    @SerializedName("template_id")
    private Long templateId;
    /**
    * 对应类目id
    */
    @SerializedName("category_id")
    private Long categoryId;
    /**
    * 对应类目父id
    */
    @SerializedName("parentId")
    private Long parentId;
    /**
    * 子节点，结构相同
    */
    @SerializedName("child")
    private List<TargetObj> child;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getTemplateId() {
        return templateId;
    }
    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }
    public Long getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
    public Long getParentId() {
        return parentId;
    }
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
    public List<TargetObj> getChild() {
        return child;
    }
    public void setChild(List<TargetObj> child) {
        this.child = child;
    }




    @Override
    public String toString() {
        return "TargetObj{" + "name=" + name + "," + "templateId=" + templateId + "," + "categoryId=" + categoryId + "," + "parentId=" + parentId + "," + "child=" + child + "}";
    }
}
