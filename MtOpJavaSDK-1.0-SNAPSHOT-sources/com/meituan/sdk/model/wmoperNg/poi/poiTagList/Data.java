package com.meituan.sdk.model.wmoperNg.poi.poiTagList;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class Data {
    /**
    * 品类ID
    */
    @SerializedName("id")
    private Integer id;
    /**
    * 品类名称
    */
    @SerializedName("name")
    private String name;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }




    @Override
    public String toString() {
        return "Data{" + "id=" + id + "," + "name=" + name + "}";
    }
}
