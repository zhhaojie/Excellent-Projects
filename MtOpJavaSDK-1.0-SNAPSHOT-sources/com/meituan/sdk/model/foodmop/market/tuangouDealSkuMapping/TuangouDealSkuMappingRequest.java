package com.meituan.sdk.model.foodmop.market.tuangouDealSkuMapping;

import com.meituan.sdk.annotations.ApiMeta;
import java.lang.Void;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 团购券菜品关系同步（使用团券兑换功能-必接）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/market/tuangou/deal/sku/mapping",
    businessId = 51,
    apiVersion = "10001",
    apiName = "tuangou_deal_sku_mapping",
    needAuth = true
)
public class TuangouDealSkuMappingRequest implements MeituanRequest<Void> {
    /**
    * <p data-diff-id="ct-diff-id-3ca8951d-8109-40cd-8c93-0aa943b0a72a">团购券id</p>
    */
    @NotNull(message = "dealId不能为空")
    @SerializedName("dealId")
    private Integer dealId;
    /**
    * <p data-diff-id="ct-diff-id-eb041ddc-325e-443f-acc1-532bb423ea0b">团购券映射类型，单品or套餐</p><ul data-diff-id="ct-diff-id-ab44fad1-734f-4d1b-91d1-42953d79585e"><li data-list-item-diff-id="ct-list-item-diff-id-606fe536-05a7-448c-877b-97b3df1dde2e"><p data-diff-id="ct-diff-id-e2aa62a5-e0dc-4068-ab2b-3a9efe8da783">10：团购映射单品</p></li></ul><ul data-diff-id="ct-diff-id-f3975db7-15f6-49b2-a936-10a56522cbb3"><li data-list-item-diff-id="ct-list-item-diff-id-ba0edfca-697b-4c44-ba62-15ac68707059"><p data-diff-id="ct-diff-id-7a30dd19-41a3-480d-8440-9b3dc992f9fd">20：团购套餐</p></li></ul><p data-diff-id="ct-diff-id-ef35cc5e-6ee0-4f0e-85d7-541d89a3b8d4">特殊说明：</p><ul data-diff-id="ct-diff-id-692d33c9-d03c-41e3-b464-838b44001ca8"><li data-list-item-diff-id="ct-list-item-diff-id-e93620a4-7387-4444-bf5e-38569341f4c5"><p data-diff-id="ct-diff-id-faf8251d-718a-4607-a179-712d6f4bed61">团购券只兑换单sku，映射类型为单品</p></li><li data-list-item-diff-id="ct-list-item-diff-id-dc353470-bd7f-4c95-afc1-86ea2627abad"><p data-diff-id="ct-diff-id-89e5d7a8-0b86-4c38-8c55-4950a5589128">团购券兑换属于同一spu下多个sku中的一个，映射类型为套餐</p></li><li data-list-item-diff-id="ct-list-item-diff-id-fdd5a798-554b-4cb0-a95b-1fe553864f9c"><p data-diff-id="ct-diff-id-f1045a84-5bb2-4257-bf5e-333e6d540566">团购券兑换单分组、多分组套餐，映射类型为套餐</p></li></ul>
    */
    @NotNull(message = "mappingType不能为空")
    @SerializedName("mappingType")
    private Integer mappingType;
    /**
    * <p data-diff-id="ct-diff-id-42908de5-e2a6-43b9-a47c-980d88b3851b">厂商的skuid，mappingType为10-单品时非空</p>
    */
    @SerializedName("vendorSkuId")
    private String vendorSkuId;
    /**
    * <p data-diff-id="ct-diff-id-0dd8cb32-4f34-4033-8888-7e3fb8649f26">业务类型：</p><ul data-diff-id="ct-diff-id-2f2064fc-73a4-4d33-92e9-ca1ecff9d484"><li data-list-item-diff-id="ct-list-item-diff-id-c6661a47-9fee-41ee-a9c7-1d2c7c9dfa63"><p data-diff-id="ct-diff-id-356e3b20-52f8-45a8-98e6-0ba4b91535d2">10：点餐</p></li></ul>
    */
    @NotNull(message = "bizcode不能为空")
    @SerializedName("bizcode")
    private Integer bizcode;
    /**
    * <p data-diff-id="ct-diff-id-2a881b3e-f350-44fc-b7d2-5daf5e8a9de8">映射关系作用的维度</p><p data-diff-id="ct-diff-id-d14296ec-3412-4533-bb5b-760628d496a5">10：门店</p><p data-diff-id="ct-diff-id-31dc849c-82b9-4faf-91a8-b9ad33cf3824">20：品牌</p>
    */
    @NotNull(message = "dimension不能为空")
    @SerializedName("dimension")
    private Integer dimension;
    /**
    * <p data-diff-id="ct-diff-id-aed3d545-4bae-4f86-a817-4b2baea7b105">商家门店id，dimension为10时必填</p>
    */
    @SerializedName("vendorShopId")
    private String vendorShopId;
    /**
    * <p data-diff-id="ct-diff-id-7e26540c-186c-4d0a-aecd-cbbf13e0bf13">套餐分组列表，mappingType为20-套餐时非空</p>
    */
    @SerializedName("combo")
    private Combo combo;

    public Integer getDealId() {
        return dealId;
    }
    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }
    public Integer getMappingType() {
        return mappingType;
    }
    public void setMappingType(Integer mappingType) {
        this.mappingType = mappingType;
    }
    public String getVendorSkuId() {
        return vendorSkuId;
    }
    public void setVendorSkuId(String vendorSkuId) {
        this.vendorSkuId = vendorSkuId;
    }
    public Integer getBizcode() {
        return bizcode;
    }
    public void setBizcode(Integer bizcode) {
        this.bizcode = bizcode;
    }
    public Integer getDimension() {
        return dimension;
    }
    public void setDimension(Integer dimension) {
        this.dimension = dimension;
    }
    public String getVendorShopId() {
        return vendorShopId;
    }
    public void setVendorShopId(String vendorShopId) {
        this.vendorShopId = vendorShopId;
    }
    public Combo getCombo() {
        return combo;
    }
    public void setCombo(Combo combo) {
        this.combo = combo;
    }


    @Override
    public MeituanResponse<Void> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<Void>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "TuangouDealSkuMappingRequest{" + "dealId=" + dealId + "," + "mappingType=" + mappingType + "," + "vendorSkuId=" + vendorSkuId + "," + "bizcode=" + bizcode + "," + "dimension=" + dimension + "," + "vendorShopId=" + vendorShopId + "," + "combo=" + combo + "}";
    }
}
