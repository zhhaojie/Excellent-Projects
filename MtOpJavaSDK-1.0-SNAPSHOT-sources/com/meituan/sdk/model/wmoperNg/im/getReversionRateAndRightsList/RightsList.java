package com.meituan.sdk.model.wmoperNg.im.getReversionRateAndRightsList;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class RightsList {
    @NotNull(message = "code不能为空")
    @SerializedName("code")
    private Long code;
    @NotBlank(message = "name不能为空")
    @SerializedName("name")
    private String name;

    public Long getCode() {
        return code;
    }
    public void setCode(Long code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }




    @Override
    public String toString() {
        return "RightsList{" + "code=" + code + "," + "name=" + name + "}";
    }
}
