package com.meituan.sdk.model.waimaiNg.dish.dishBatchUpload;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 批量上传／更新菜品
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/dish/batchUpload",
    businessId = 2,
    apiVersion = "10100",
    apiName = "dish_batch_upload",
    needAuth = true
)
public class DishBatchUploadRequest implements MeituanRequest<String> {
    /**
    * ERP门店id 最大长度100
    */
    @SerializedName("ePoiId")
    private String ePoiId;
    /**
    * <p>菜品列表json字符串， 参考dish说明</p>
    */
    @NotBlank(message = "dishes不能为空")
    @SerializedName("dishes")
    private String dishes;
    /**
    * 为true时会将没有传进来的sku删除
    */
    @SerializedName("skuOverwrite")
    private Boolean skuOverwrite;

    public String getEPoiId() {
        return ePoiId;
    }
    public void setEPoiId(String ePoiId) {
        this.ePoiId = ePoiId;
    }
    public String getDishes() {
        return dishes;
    }
    public void setDishes(String dishes) {
        this.dishes = dishes;
    }
    public Boolean getSkuOverwrite() {
        return skuOverwrite;
    }
    public void setSkuOverwrite(Boolean skuOverwrite) {
        this.skuOverwrite = skuOverwrite;
    }


    @Override
    public MeituanResponse<String> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<String>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "DishBatchUploadRequest{" + "ePoiId=" + ePoiId + "," + "dishes=" + dishes + "," + "skuOverwrite=" + skuOverwrite + "}";
    }
}
