package com.meituan.sdk.model.waimaiNg.order.zbDispatch;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-677057d7-63cd-4410-adb3-9cfdd2d80c81">使用权益列表</p><p data-diff-id="ct-diff-id-a6b5cc2d-9d0b-4cc9-a42c-7fb201903bef">众包发配送接口查询返回字段rights_detail_List</p>
* This file was automatically generated.
*/
public class RightsDetail {
    /**
    * <p data-diff-id="ct-diff-id-8e794002-cc86-458b-8202-f0b5aaf63bc3">权益token</p>
    */
    @NotBlank(message = "rightDisToken不能为空")
    @SerializedName("rightDisToken")
    private String rightDisToken;
    @NotNull(message = "extMap不能为空")
    @SerializedName("extMap")
    private ExtMap extMap;

    public String getRightDisToken() {
        return rightDisToken;
    }
    public void setRightDisToken(String rightDisToken) {
        this.rightDisToken = rightDisToken;
    }
    public ExtMap getExtMap() {
        return extMap;
    }
    public void setExtMap(ExtMap extMap) {
        this.extMap = extMap;
    }




    @Override
    public String toString() {
        return "RightsDetail{" + "rightDisToken=" + rightDisToken + "," + "extMap=" + extMap + "}";
    }
}
