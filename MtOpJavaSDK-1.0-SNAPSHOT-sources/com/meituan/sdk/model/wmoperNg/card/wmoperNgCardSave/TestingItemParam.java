package com.meituan.sdk.model.wmoperNg.card.wmoperNgCardSave;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class TestingItemParam {
    /**
    * <p data-diff-id="ct-diff-id-bf8561f8-d5db-4034-ac08-42cd5315fe45">安心保障上传图片url</p>
    */
    @SerializedName("url")
    private String url;
    /**
    * <p data-diff-id="ct-diff-id-7fabc2c7-da6b-41d0-854b-65fe3257a46b">核酸检测日0点时间戳</p>
    */
    @SerializedName("testingTime")
    private Integer testingTime;
    /**
    * <p data-diff-id="ct-diff-id-3ba39172-8bd6-43f6-8a12-4bbfc58e6bef">描述</p>
    */
    @SerializedName("desc")
    private String desc;

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public Integer getTestingTime() {
        return testingTime;
    }
    public void setTestingTime(Integer testingTime) {
        this.testingTime = testingTime;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }




    @Override
    public String toString() {
        return "TestingItemParam{" + "url=" + url + "," + "testingTime=" + testingTime + "," + "desc=" + desc + "}";
    }
}
