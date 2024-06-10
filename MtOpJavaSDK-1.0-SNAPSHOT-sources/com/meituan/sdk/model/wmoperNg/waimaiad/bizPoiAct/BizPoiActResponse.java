package com.meituan.sdk.model.wmoperNg.waimaiad.bizPoiAct;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 经营分析-商家活动信息
* This file was automatically generated.
*/
public class BizPoiActResponse {
    @NotNull(message = "result不能为空")
    @SerializedName("result")
    private Result result;
    @NotEmpty(message = "poiActList不能为空")
    @SerializedName("poiActList")
    private List<PoiActList> poiActList;

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }
    public List<PoiActList> getPoiActList() {
        return poiActList;
    }
    public void setPoiActList(List<PoiActList> poiActList) {
        this.poiActList = poiActList;
    }




    @Override
    public String toString() {
        return "BizPoiActResponse{" + "result=" + result + "," + "poiActList=" + poiActList + "}";
    }
}
